package com.shop.holomen.application.admin;

import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.ThanhToanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanhToanService {

    @Autowired
    ThanhToanRepository thanhToanRepository;

    public void insertThanhToan(FormThanhToan formThanhToan) {
        thanhToanRepository.insertThanhToan(formThanhToan);
    }

    public FormThanhToan findBy(String khachId) {
        return thanhToanRepository.findBy(khachId);
    }

    public List<String> findThanhPho(String maTinh) {
        return thanhToanRepository.findThanhPho(maTinh);
    }

    public List<String> findQuan(String maquan) {
        return thanhToanRepository.findQuan(maquan);
    }

    public List<String> findTinh() {
        return thanhToanRepository.findTinh();
    }
}
