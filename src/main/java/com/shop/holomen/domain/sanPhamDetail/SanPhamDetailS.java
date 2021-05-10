package com.shop.holomen.domain.sanPhamDetail;

import java.util.List;

public class SanPhamDetailS {
    List<SanPhamDetail> values;

    public SanPhamDetailS() {
    }

    public SanPhamDetailS(List<SanPhamDetail> values) {
        this.values = values;
    }

    public List<SanPhamDetail> getValues() {
        return values;
    }

    public void setValues(List<SanPhamDetail> values) {
        this.values = values;
    }
}
