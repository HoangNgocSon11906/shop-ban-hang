package com.shop.holomen.presentation.sanPham;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AoThunController {
    @RequestMapping(value = "/1421", method = RequestMethod.GET)
    public String sale() {
        return "sanPham/aothun";
    }
}
