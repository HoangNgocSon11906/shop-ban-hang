package com.shop.holomen.domain.sanPhamDetail;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class GiaThuong {
    BigDecimal value;

    public GiaThuong() {
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String formattedValue() {
        NumberFormat currency = NumberFormat.getNumberInstance();
        return currency.format(value.intValue());
    }
}
