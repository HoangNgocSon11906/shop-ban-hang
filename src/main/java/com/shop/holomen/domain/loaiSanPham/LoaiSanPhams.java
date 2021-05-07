package com.shop.holomen.domain.loaiSanPham;

import java.util.List;

public class LoaiSanPhams {
    List<LoaiSanPham> values;

    public LoaiSanPhams(List<LoaiSanPham> values) {
        this.values = values;
    }

    public List<LoaiSanPham> getValues() {
        return values;
    }

    public void setValues(List<LoaiSanPham> values) {
        this.values = values;
    }
}
