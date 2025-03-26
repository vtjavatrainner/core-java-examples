package com.pcstraining.core.project.one;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable{
    private final String buyerParty;
    private final String supplierParty;
    private final String invoiceNumber;
    private final int invoiceAmt;
    private final LocalDate invoiceDate;
    private final LocalDate maturityDate;
    private final String description;

    public Invoice(String buyerParty, String supplierParty, String invoiceNumber, int invoiceAmt,
                   LocalDate invoiceDate, LocalDate maturityDate, String description) {
        this.buyerParty = buyerParty;
        this.supplierParty = supplierParty;
        this.invoiceNumber = invoiceNumber;
        this.invoiceAmt = invoiceAmt;
        this.invoiceDate = invoiceDate;
        this.maturityDate = maturityDate;
        this.description = description;
    }

    public String getBuyerParty() {
        return buyerParty;
    }

    public String getSupplierParty() {
        return supplierParty;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getInvoiceAmt() {
        return invoiceAmt;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "buyerParty='" + buyerParty + '\'' +
                ", supplierParty='" + supplierParty + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", invoiceAmt=" + invoiceAmt +
                ", invoiceDate=" + invoiceDate +
                ", maturityDate=" + maturityDate +
                ", description='" + description + '\'' +
                '}';
    }
}
