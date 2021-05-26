package com.shop.holomen.domain.thanhtoan;

public class KhachHang {
    String ten;
    String sdt;
    String diaChi;
    String phiShip;
    String tongTien;

    public KhachHang(String ten, String sdt, String diaChi, String phiShip, String tongTien) {
        this.ten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.phiShip = phiShip;
        this.tongTien = tongTien;
    }

    public KhachHang() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
