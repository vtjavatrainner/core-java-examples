package com.pcstraining.core.designpattern.builder;

import java.time.LocalDate;

public class BuilderTest {
    public static void main(String[] args) {
        Invoice.Builder builder = Invoice.Builder.getInstance();

        Invoice invoice = builder.setBuyerParty("buyer")
                .setSupplierParty("supplier")
                .setInvoiceAmt(100)
                .setInvoiceNumber("123")
                .setInvoiceDate(LocalDate.of(2025, 4, 23))
                .setMaturityDate(LocalDate.of(2025, 5, 15))
                .setDescription("anything")
                .build();

        System.out.println(invoice);
    }
}
