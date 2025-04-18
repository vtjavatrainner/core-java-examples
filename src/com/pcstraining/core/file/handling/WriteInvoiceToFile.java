package com.pcstraining.core.file.handling;

import com.pcstraining.core.project.one.Invoice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class WriteInvoiceToFile {
    public static void main(String[] args) {
        //Create Invoice object
        LocalDate invoiceDate = LocalDate.now();
        LocalDate invoiceMaturityDate = invoiceDate.plusDays(50);
        Invoice invoice = new Invoice("b1", "s1", "b1s1_invoice_1", 10000,
                invoiceDate, invoiceMaturityDate, "tech books");
        // take a file name
        String fileName = "invoice.data";
        // write to the file
        try{
            FileOutputStream fileOutputStream = null;
            fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(invoice);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
