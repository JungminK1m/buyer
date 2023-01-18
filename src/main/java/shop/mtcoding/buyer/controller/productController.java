package shop.mtcoding.buyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class productController {

    @GetMapping({ "/", "product" })
    public String home() {
        return "product/list";
    }
}
