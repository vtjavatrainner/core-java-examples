package com.pcstraining.core.exception.handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EnhancedTryBlock {

    public static void main(String[] args) {
        String name = "Virat";
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("name.dat"))) {
            objectOutputStream.writeObject(name);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
