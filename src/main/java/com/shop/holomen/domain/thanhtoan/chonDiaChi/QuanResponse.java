package com.shop.holomen.domain.thanhtoan.chonDiaChi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

public class QuanResponse {
    @JsonProperty
    List<QuanJSON> quanJSONS;

    public QuanResponse(List<QuanJSON> quanJSONS) {
        this.quanJSONS = quanJSONS;
    }

    public static QuanResponse parseToQuanJSON(List<String> quans) {
        List<QuanJSON> quanJSONS = quans.stream().map(QuanJSON::new).collect(Collectors.toList());
        return new QuanResponse(quanJSONS);
    }
}
