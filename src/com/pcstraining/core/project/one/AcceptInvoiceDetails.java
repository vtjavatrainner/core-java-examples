package com.pcstraining.core.project.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class AcceptInvoiceDetails {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        boolean userWantToContinue;
        List<Invoice> invoiceList = new ArrayList<>();
        //read from invoiceList.data and see if there are any existing invoices present
        // add new invoices to existing list
        List<Invoice> invoicesFromFile = readInvoiceListFromFile();
        invoiceList.addAll(invoicesFromFile);

        do {
            userWantToContinue = false;
            System.out.println("Please enter buyer name");
            String buyerName = scanner.nextLine();

            System.out.println("Please enter supplier name");
            String supplierName = scanner.nextLine();

            System.out.println("Please enter invoice number");
            String invoiceNumber = scanner.nextLine();

            System.out.println("Please enter invoice amount");
            String invoiceAmtString = scanner.nextLine();
            int invoiceAmt = Integer.parseInt(invoiceAmtString);

            System.out.println("Please enter invoice date in 'dd-MM-yyyy' format");
            String invoiceDateString = scanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date invoiceDate = simpleDateFormat.parse(invoiceDateString);
            LocalDate invoiceLocalDate = LocalDate.ofInstant(invoiceDate.toInstant(), ZoneId.systemDefault());

            System.out.println("Please enter invoice maturity date in 'dd-MM-yyyy' format");
            String invoiceMatDateString = scanner.nextLine();
            Date invoiceMatDate = simpleDateFormat.parse(invoiceMatDateString);
            LocalDate invoiceMatLocalDate = LocalDate.ofInstant(invoiceMatDate.toInstant(), ZoneId.systemDefault());

            System.out.println("Please enter invoice description");
            String invoiceDesc = scanner.nextLine();


            Invoice invoice = new Invoice(buyerName, supplierName, invoiceNumber, invoiceAmt,
                    invoiceLocalDate, invoiceMatLocalDate, invoiceDesc);
            invoiceList.add(invoice);


            System.out.println("Do you want to add new invoice (press y for Yes/ n for No) :");
            String userInput = scanner.nextLine();//y
            if(userInput.equalsIgnoreCase("y")){
                userWantToContinue = true;
            }

        }while(userWantToContinue);
        System.out.println("All invoices entered by the user " + invoiceList);

        writeInvoiceListToAFile(invoiceList);
    }

    public static void writeInvoiceListToAFile(List<Invoice> invoiceList){
        String fileName = "invoiceList.data";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(invoiceList);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<Invoice> readInvoiceListFromFile(){
        String fileName = "invoiceList.data";
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<Invoice> invoicesFromFile = (List) object;
            return invoicesFromFile;
        }catch (Exception e){
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
