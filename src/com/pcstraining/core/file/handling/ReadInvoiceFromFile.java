package com.pcstraining.core.file.handling;

import com.pcstraining.core.project.one.Invoice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadInvoiceFromFile {
    public static void main(String[] args) {
        String fileName = "invoice.data";// /users/project_one/data/invoice/...
                                        //  /project_one/data/
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            Invoice invoice = (Invoice) object;
            System.out.println("Invoice read from file is " + invoice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
