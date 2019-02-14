package com.example.shahi.kamon.Serial_No;

/**
 * Created by shahi on 24/01/2019.
 */

public class Serial {
    private int invoiceNo;
    private int invoiceDate;
    private String custName;
    private String PayMethod;
    private int invoiceDiscount;
    private int residual;
    private int payments;
    private int invoiceNet;
    private String desciption;
    private String Type;

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public int getInvoiceDate() {
        return invoiceDate;
    }

    public String getCustName() {
        return custName;
    }

    public String getPayMethod() {
        return PayMethod;
    }

    public int getInvoiceDiscount() {
        return invoiceDiscount;
    }

    public int getResidual() {
        return residual;
    }

    public int getPayments() {
        return payments;
    }

    public int getInvoiceNet() {
        return invoiceNet;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getType() {
        return Type;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    private boolean isDelivered;

}
