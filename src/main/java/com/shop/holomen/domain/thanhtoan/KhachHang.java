package com.shop.holomen.domain.thanhtoan;

public class KhachHang {
    Integer khachId;
    Integer OrderId;
    String hoVaten;
    String sdt;
    String diaChi;
    String phiShip;
    String tongTien;

    public KhachHang(Integer khachId, String hoVaten, String sdt, String diaChi, String phiShip, String tongTien) {
        this.khachId = khachId;
        this.hoVaten = hoVaten;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.phiShip = phiShip;
        this.tongTien = tongTien;
    }

    public Integer getKhachId() {
        return khachId;
    }

    public void setKhachId(Integer khachId) {
        this.khachId = khachId;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
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

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer orderId) {
        OrderId = orderId;
    }
}
