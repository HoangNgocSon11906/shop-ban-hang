package com.shop.holomen.domain.thanhtoan;

import java.text.NumberFormat;

public class KhachHang {
    Integer khachId;
    String status;
    Integer orderId;
    String hoVaten;
    String sdt;
    String diaChi;
    String phiShip;
    String tongTien;
    String ngayMua;

    public KhachHang(Integer khachId, String status, Integer orderId, String hoVaten, String sdt, String diaChi, String phiShip, String tongTien, String ngayMua) {
        this.khachId = khachId;
        this.status = status;
        this.orderId = orderId;
        this.hoVaten = hoVaten;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.phiShip = phiShip;
        this.tongTien = tongTien;
        this.ngayMua = ngayMua;
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
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }
    public String formattedValuePhiShip() {
        int giaSPInt = Integer.parseInt(phiShip);
        NumberFormat currency = NumberFormat.getNumberInstance();
        return currency.format(giaSPInt);
    }

    public String formattedValueTongTien() {
        int giaSPInt = Integer.parseInt(tongTien);
        NumberFormat currency = NumberFormat.getNumberInstance();
        return currency.format(giaSPInt);
    }
    public String formattedValueThanhTien() {
        int thanhTien = Integer.parseInt(tongTien)+Integer.parseInt(phiShip);
        NumberFormat currency = NumberFormat.getNumberInstance();
        return currency.format(thanhTien);
    }
}
