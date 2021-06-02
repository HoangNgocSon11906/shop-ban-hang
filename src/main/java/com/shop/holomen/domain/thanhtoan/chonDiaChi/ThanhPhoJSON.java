package com.shop.holomen.domain.thanhtoan.chonDiaChi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThanhPhoJSON {
    @JsonProperty
    String thanhPho;

    public ThanhPhoJSON(String thanhPho) {
        this.thanhPho = thanhPho;
    }
}
