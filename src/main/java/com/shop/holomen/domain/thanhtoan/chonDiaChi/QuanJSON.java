package com.shop.holomen.domain.thanhtoan.chonDiaChi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuanJSON {
    @JsonProperty
    String quan;

    public QuanJSON(String quan) {
        this.quan = quan;
    }
}
