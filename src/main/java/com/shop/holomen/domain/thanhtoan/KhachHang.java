package com.shop.holomen.domain.thanhtoan;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KhachHang {

    String hoVaten;
    String sdt;
    String diaChi;
    String phiShip;
    String tongTien;

    public KhachHang(String ten, String sdt, String diaChi, String phiShip, String tongTien) {
        this.hoVaten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.phiShip = phiShip;
        this.tongTien = tongTien;
    }

    public KhachHang() {
    }

    public String getTen() {
        return hoVaten;
    }
    public void setTen(String ten) {
        this.hoVaten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhiShip() {
        return phiShip;
    }

    public void setPhiShip(String phiShip) {
        this.phiShip = phiShip;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }
}
