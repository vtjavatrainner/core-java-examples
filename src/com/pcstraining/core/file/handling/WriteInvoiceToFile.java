package com.pcstraining.core.file.handling;

import com.pcstraining.core.project.one.Invoice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class WriteInvoiceToFile {
    public static void main(String[] args) throws IOException {
        //Create Invoice object
        LocalDate invoiceDate = LocalDate.now();
        LocalDate invoiceMaturityDate = invoiceDate.plusDays(50);
        Invoice invoice = new Invoice("b1", "s1", "b1s1_invoice_1", 10000,
                invoiceDate, invoiceMaturityDate, "tech books");
        // take a file name
        String fileName = "invoice.data";
        // write to the file
        ObjectOutputStream objectOutputStream = null;
        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeObject(invoice);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(objectOutputStream != null) {
                objectOutputStream.close();
            }
        }
    }
}
