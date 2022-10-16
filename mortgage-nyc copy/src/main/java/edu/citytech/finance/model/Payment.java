package edu.citytech.finance.model;

import java.util.Date;

public class Payment implements Comparable<Payment> {
    private int paymentNumber;
    private Date paymentDate;
    private double beginningBalance;
    private double scheduledPayment;
    private double extraPayment;
    private double totalPayment;
    private double principal;
    private double interest;
    private double endingBalance;
    private double cumulativeInterest;

    public Payment(int paymentNumber, Date paymentDate, double beginningBalance,
                   double scheduledPayment, double extraPayment, double totalPayment,
                   double principal, double interest, double endingBalance, double cumulativeInterest) {
        this.paymentNumber = paymentNumber;
        this.paymentDate = paymentDate;
        this.beginningBalance = beginningBalance;
        this.scheduledPayment = scheduledPayment;
        this.extraPayment = extraPayment;
        this.totalPayment = totalPayment;
        this.principal = principal;
        this.interest = interest;
        this.endingBalance = endingBalance;
        this.cumulativeInterest = cumulativeInterest;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public double getBeginningBalance() {
        return beginningBalance;
    }

    public double getScheduledPayment() {
        return scheduledPayment;
    }

    public double getExtraPayment() {
        return extraPayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getInterest() {
        return interest;
    }

    public double getEndingBalance() {
        return endingBalance;
    }

    public double getCumulativeInterest() {
        return cumulativeInterest;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentNumber=" + paymentNumber +
                ", paymentDate=" + paymentDate +
                ", beginningBalance=" + beginningBalance +
                ", scheduledPayment=" + scheduledPayment +
                ", extraPayment=" + extraPayment +
                ", totalPayment=" + totalPayment +
                ", principal=" + principal +
                ", interest=" + interest +
                ", endingBalance=" + endingBalance +
                ", cumulativeInterest=" + cumulativeInterest +
                '}';
    }

    @Override
    public int compareTo(Payment o) {
        return 0;
    }
}
