package com.rabobank.pojo;

import java.math.BigDecimal;

public class MonthlyReport {
    private long reference;
    private String accountNumber;
    private String Description;
    private BigDecimal startBalance;
    private BigDecimal mutation;
    private BigDecimal endBalance;
    private String reason;
    public long getReference() {
        return reference;
    }

    public void setReference(final long reference) {
        this.reference = reference;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(final String description) {
        Description = description;
    }

    public BigDecimal getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(final BigDecimal startBalance) {
        this.startBalance = startBalance;
    }

    public BigDecimal getMutation() {
        return mutation;
    }

    public void setMutation(final BigDecimal mutation) {
        this.mutation = mutation;
    }

    public BigDecimal getEndBalance() {
        return endBalance;
    }

    public void setEndBalance(final BigDecimal endBalance) {
        this.endBalance = endBalance;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }
}
