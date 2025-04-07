package com.pcstraining.core.multiple.file.processing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileProcessing {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //list files in this path
        //read the file content - Rohit,Virat,Shami
        //split the content by ','
        //print the number of names in file
        Instant start = Instant.now();

        String folderPath = "D:\\Personal\\Trainning\\git_hub_repo\\core-java-examples\\input";
        Path filesPath = Paths.get(folderPath);
        List<Path> filePaths = Files.list(filesPath).toList();
        for (Path path : filePaths) {
            String data = Files.readString(path);
            System.out.println("fileName " + path + " data " + data);
            //processData(data);
            executorService.submit(() -> processData(data));
        }
        executorService.awaitTermination(20, TimeUnit.SECONDS);

        Instant end = Instant.now();

        long processingTime = Duration.between(start, end).toSeconds();
        System.out.println("processingTime " + processingTime);

        executorService.shutdown();

    }

    public static void processData(String data) {
        String[] names = data.split(",");
        System.out.println("count is " + names.length + " in thread "+ Thread.currentThread().getName());
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
