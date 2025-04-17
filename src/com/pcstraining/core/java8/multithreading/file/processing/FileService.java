package com.pcstraining.core.java8.multithreading.file.processing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileService {
    public List<Path> getFilesFromTheFolderPath(String folderPath) {
        try {
            Path path = Paths.get(folderPath);
            return Files.list(path).toList();
        } catch (IOException e) {
            System.out.println("Exception occurred while listing files " + e);
        }
        return Collections.emptyList();
    }

    public String readContentsOfFile(Path filePath) {
        try {
            return Files.readString(filePath);
        } catch (IOException e) {
            System.out.println("Exception occurred while reading file" + e);
        }
        return "";
    }
}
