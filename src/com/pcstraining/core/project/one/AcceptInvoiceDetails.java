package com.pcstraining.core.project.one;

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
        do {
            userWantToContinue = false;
            System.out.println("Please enter buyer name");
            String buyerName = scanner.nextLine();
            System.out.println("User entered buyerName is " + buyerName);

            System.out.println("Please enter supplier name");
            String supplierName = scanner.nextLine();
            System.out.println("User entered supplier name is " + supplierName);

            System.out.println("Please enter invoice number");
            String invoiceNumber = scanner.nextLine();
            System.out.println("User entered invoiceNumber is " + invoiceNumber);

            System.out.println("Please enter invoice amount");
            String invoiceAmtString = scanner.nextLine();
            int invoiceAmt = Integer.parseInt(invoiceAmtString);
            System.out.println("User entered invoiceAmt is " + invoiceAmt);

            System.out.println("Please enter invoice date in 'dd-MM-yyyy' format");
            String invoiceDateString = scanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date invoiceDate = simpleDateFormat.parse(invoiceDateString);
            LocalDate invoiceLocalDate = LocalDate.ofInstant(invoiceDate.toInstant(), ZoneId.systemDefault());
            System.out.println("User entered invoiceLocalDate is " + invoiceLocalDate);

            System.out.println("Please enter invoice maturity date in 'dd-MM-yyyy' format");
            String invoiceMatDateString = scanner.nextLine();
            Date invoiceMatDate = simpleDateFormat.parse(invoiceMatDateString);
            LocalDate invoiceMatLocalDate = LocalDate.ofInstant(invoiceMatDate.toInstant(), ZoneId.systemDefault());
            System.out.println("User entered invoiceMatLocalDate is " + invoiceMatLocalDate);

            System.out.println("Please enter invoice description");
            String invoiceDesc = scanner.nextLine();
            System.out.println("User entered invoiceDesc is " + invoiceDesc);


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
        Collections.sort(invoiceList,
                Comparator.comparingInt(Invoice::getInvoiceAmt));
        System.out.println("Invoices sorted by amount "+ invoiceList);
    }
}
