package com.shop.holomen.presentation.thanhToan;

import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HoanThanhThanhToanRestConTroller {
    @RequestMapping(value = "/hoanThanh")
    public ResponseEntity<?> thanhToan(@RequestBody FormThanhToan formThanhToan) {

        return ResponseEntity.ok("result");
    }
}
