package shop.mtcoding.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.ProductRepository;

@Controller
public class productController {

    @Autowired // 이런것을 DI 라고 함. new 안하고 ioc에 띄워놓고 autowired로 들고와서 편함
    private ProductRepository productRepository; // 기본 생성자를 만들어서 준 거임!

    @GetMapping({ "/", "product" }) // request로 해서 들고가지 않음
    public String findAll(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);
        return "product/list";
    }

    @GetMapping("/product/{id}")
    public String findById(@PathVariable int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    @PostMapping("/product/{id}/purchase")
    public String updateById(@PathVariable int id, int purchase, Model model) {
        int result = productRepository.updateById(id, purchase);
        if (result == 1) {
            return "redirect:/findById";
        } else {
            return "redirect:/findAll";
        }
    }
}
