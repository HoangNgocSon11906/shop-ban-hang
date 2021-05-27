package com.shop.holomen.domain.thanhtoan;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class FormThanhToan {

    List<SanPham> sanPhams = new ArrayList<>();

    KhachHang khachHang;

    @JsonCreator
    public FormThanhToan(List<SanPham> sanPhams, KhachHang khachHang) {
        this.sanPhams = sanPhams;
        this.khachHang = khachHang;
    }

    public List<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(List<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}