package com.cancikrikci.app.finance.entity;

import org.springframework.stereotype.Component;

public enum FinancialRecordType {
    income("income"),
    expense("expense");

    private final String m_value;

    FinancialRecordType(String value)
    {
        m_value = value;
    }

    public String getValue()
    {
        return m_value;
    }

    public static FinancialRecordType fromValue(String value)
    {
        for (FinancialRecordType type : FinancialRecordType.values()) {
            if (type.getValue().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException();
    }
}
