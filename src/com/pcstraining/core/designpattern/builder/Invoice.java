package com.pcstraining.core.designpattern.builder;

import java.time.LocalDate;

public class Invoice {

    private final String buyerParty;
    private final String supplierParty;
    private final String invoiceNumber;
    private final int invoiceAmt;
    private final LocalDate invoiceDate;
    private final LocalDate maturityDate;
    private final String description;

    private Invoice(String buyerParty, String supplierParty, String invoiceNumber, int invoiceAmt, LocalDate invoiceDate, LocalDate maturityDate, String description) {
        this.buyerParty = buyerParty;
        this.supplierParty = supplierParty;
        this.invoiceNumber = invoiceNumber;
        this.invoiceAmt = invoiceAmt;
        this.invoiceDate = invoiceDate;
        this.maturityDate = maturityDate;
        this.description = description;
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

    public static class Builder{
        private String buyerParty;
        private String supplierParty;
        private String invoiceNumber;
        private int invoiceAmt;
        private LocalDate invoiceDate;
        private LocalDate maturityDate;
        private String description;

        public static Builder getInstance(){
            return new Builder();
        }

        public Builder setBuyerParty(String buyerParty) {
            this.buyerParty = buyerParty;
            return this;
        }

        public Builder setSupplierParty(String supplierParty){
            this.supplierParty = supplierParty;
            return this;
        }

        public Builder setInvoiceNumber(String invoiceNumber){
            this.invoiceNumber = invoiceNumber;
            return this;
        }

        public Builder setInvoiceAmt(int invoiceAmt){
            this.invoiceAmt = invoiceAmt;
            return this;
        }

        public Builder setInvoiceDate(LocalDate invoiceDate){
            this.invoiceDate = invoiceDate;
            return this;
        }

        public Builder setMaturityDate(LocalDate maturityDate){
            this.maturityDate = maturityDate;
            return this;
        }

        public Builder setDescription(String description){
            this.description = description;
            return this;
        }

        public Invoice build(){
            return new Invoice(this.buyerParty, this.supplierParty, this.invoiceNumber, this.invoiceAmt,
                    this.invoiceDate, this.maturityDate, this.description);
        }
    }
}
