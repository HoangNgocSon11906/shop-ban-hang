package com.shop.holomen.domain.thanhtoan.chonDiaChi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

public class ThanhPhoResponse {
    @JsonProperty
    List<ThanhPhoJSON> thanhPhoJSONS;

    public ThanhPhoResponse(List<ThanhPhoJSON> thanhPhoJSONS) {
        this.thanhPhoJSONS = thanhPhoJSONS;
    }

    public static ThanhPhoResponse parseToThanhPhoJSSON(List<String> thanhPhos) {
        List<ThanhPhoJSON> thanhPhoJSONS = thanhPhos.stream().map(ThanhPhoJSON::new).collect(Collectors.toList());
        return new ThanhPhoResponse(thanhPhoJSONS);
    }
}
