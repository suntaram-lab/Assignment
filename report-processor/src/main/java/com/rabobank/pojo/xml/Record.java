package com.rabobank.pojo.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "record")
public class Record {
    private long reference;
    private String accountNumber;
    private String description;
    private String startBalance;
    private String mutation;
    private String endBalance;

    public long getReference() {
        return reference;
    }

    @XmlAttribute(name = "reference")
    public void setReference(final long reference) {
        this.reference = reference;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @XmlElement(name = "accountNumber")
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement(name = "description")
    public void setDescription(final String description) {
        this.description = description;
    }

    public String getStartBalance() {
        return startBalance;
    }

    @XmlElement(name = "startBalance")
    public void setStartBalance(final String startBalance) {
        this.startBalance = startBalance;
    }

    public String getMutation() {
        return mutation;
    }

    @XmlElement(name = "mutation")
    public void setMutation(final String mutation) {
        this.mutation = mutation;
    }

    public String getEndBalance() {
        return endBalance;
    }

    @XmlElement(name = "endBalance")
    public void setEndBalance(final String endBalance) {
        this.endBalance = endBalance;
    }
}
