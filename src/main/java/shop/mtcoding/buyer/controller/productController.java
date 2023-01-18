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

    @Autowired
    private ProductRepository productRepository;

    @GetMapping({ "/", "product" })
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
