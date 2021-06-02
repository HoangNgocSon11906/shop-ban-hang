package com.shop.holomen.domain.thanhtoan;

import java.util.List;

public interface ThanhToanRepository {
    void insertThanhToan(FormThanhToan formThanhToan);
    FormThanhToan findBy(String khachId);
    List<String> findThanhPho(String maTinh);
    List<String> findQuan(String maQuan);
    List<String> findTinh();
}
