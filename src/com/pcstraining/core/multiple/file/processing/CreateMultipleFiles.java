package com.pcstraining.core.multiple.file.processing;

import java.io.*;

public class CreateMultipleFiles {
    public static void main(String[] args) {
        String data = "Rohit,Virat,Shami";
        for (int i = 0; i < 1000; i++) {
            String fileName = "input/data_" + i;
            System.out.println("fileName " + fileName);
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(data);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
