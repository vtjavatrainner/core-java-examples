package com.pcstraining.core.project.one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateInput {
    public static void main(String[] args) throws ParseException {
        System.out.println("Please enter invoice date in 'dd-MM-yyyy' format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date invoiceDate = simpleDateFormat.parse("24-03-2025");
        System.out.println("User entered invoiceDate is " + invoiceDate);
        LocalDate invoiceLocalDate = LocalDate.ofInstant(invoiceDate.toInstant(), ZoneId.systemDefault());
        System.out.println("User entered invoiceLocalDate is " + invoiceLocalDate);
    }
}
