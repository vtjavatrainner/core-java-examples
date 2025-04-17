package com.pcstraining.core.java8.multithreading.file.processing;

public class FileProcessor {

    public int countNoOfWordsInString(String fileContent){
        String[] words = fileContent.split(",");
//        for(String word : words) {
//            System.out.println(word);
//        }
        return words.length;
    }
}
