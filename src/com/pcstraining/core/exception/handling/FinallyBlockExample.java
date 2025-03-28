package com.pcstraining.core.exception.handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FinallyBlockExample {
    public static void main(String[] args) throws IOException {
        String name = "Virat";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("name.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("closing output streams");
            assert fileOutputStream != null;
            fileOutputStream.close();
            assert objectOutputStream != null;
            objectOutputStream.close();
        }

    }
}
