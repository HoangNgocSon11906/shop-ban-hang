package com.shop.holomen.presentation.thanhToan;

import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThanhToanController {

    @RequestMapping(value = "/checkout")
    public String show() {
        return "thanhToan/thanhToan";
    }

    @RequestMapping(value = "/hoanThanh")
        public String hoanThanh() {

        return "aa";
        }
}
