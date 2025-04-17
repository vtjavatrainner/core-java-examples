package com.pcstraining.core.java8.multithreading.file.processing;

import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleFileProcessingTest {
    public static void main(String[] args) {
        String folderPath = "D:\\Personal\\Trainning\\git_hub_repo\\core-java-examples\\input";
        //String folderPath = "D:\\Personal\\Trainning\\git_hub_repo\\input";
        //1. Get file names from the folder path
        //2. Write a code read file content and calculate number of words
        //3. Then execute step2 in parallel

        FileService fileService = new FileService();
        FileProcessor fileProcessor = new FileProcessor();
        Instant start = Instant.now();
        int totalNoOfWordsInFile = fileService.getFilesFromTheFolderPath(folderPath)
                .parallelStream()
                .map(fileService::readContentsOfFile)
                .map(fileProcessor::countNoOfWordsInString)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("totalNoOfWordsInFile :- " + totalNoOfWordsInFile);

        Instant end = Instant.now();
        long processingTime = Duration.between(start, end).toMillis();
        System.out.println("processingTime " + processingTime);
    }

}
