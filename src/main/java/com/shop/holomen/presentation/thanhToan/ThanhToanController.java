package com.shop.holomen.presentation.thanhToan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThanhToanController {

    @RequestMapping(value = "/checkout")
    public String show() {


        return "thanhToan/thanhToan";
    }
}
