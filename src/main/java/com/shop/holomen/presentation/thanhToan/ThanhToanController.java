package com.shop.holomen.presentation.thanhToan;

import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.SanPham;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ThanhToanController {

    @RequestMapping(value = "/checkout")
    public String show() {
        return "thanhToan/thanhToan";
    }

    @ResponseBody
    @RequestMapping(value = "/hoanThanh")
    public String hoanThanh(@RequestBody FormThanhToan formThanhToan) {
        return "";
    }
}
