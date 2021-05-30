package com.shop.holomen.application.admin;

import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.ThanhToanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThanhToanService {

    @Autowired
    ThanhToanRepository thanhToanRepository;

    public void insertThanhToan(FormThanhToan formThanhToan) {
        thanhToanRepository.insertThanhToan(formThanhToan);
    }
}
