package com.rabobank.pojo.xml;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "records")
public class Records {

    private List records;

    public List getRecords() {
        return records;
    }

    @XmlAnyElement(lax = true)
    public void setRecords(final List records) {
        this.records = records;
    }
}
