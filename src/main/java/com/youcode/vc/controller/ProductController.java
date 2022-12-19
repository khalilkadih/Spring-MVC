package com.youcode.vc.controller;

import com.youcode.vc.entity.Product;
import com.youcode.vc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public  String products(Model model ,
                            @RequestParam(name="page",defaultValue = "0") int page ,
                            @RequestParam(name = "size",defaultValue = "5") int size,
                            @RequestParam(name="keyword",defaultValue = "") String keyword
    ){
        // if you want to show all product
        Page<Product> Pageproducts  = productRepository.findAll(PageRequest.of(page,size));
        //Page<Product> Pageproducts  = productRepository.findProductByProductName(keyword,PageRequest.of(page,size));
        model.addAttribute("products",Pageproducts.getContent());
        model.addAttribute("pages",new int[Pageproducts.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",keyword);
        return "products";
    }


    @GetMapping("/delete")
    public String delete(Long id ,String keyword, int page){
        productRepository.deleteById(id);
        return "redirect:/products?page="+page+"&keyword="+keyword;
    }

    @GetMapping("/")
    public String home(){
        productRepository.findAll();
        return "redirect:/products";
    }

    @GetMapping("/addProduct")
    public String addProduct(Model model){
        model.addAttribute("products",new Product());
        return "addProduct";
    }
    @PostMapping("/save")
    public String save(Model model, Product product){
        productRepository.save(product);
        return "addProduct";
    }
    @GetMapping("/listofproducts")
    public String listOfProduct(Model model){
        List<Product> productList= productRepository.findAll();
        model.addAttribute("listofproduit",productList);
        return "listOfProduct";
    }
}
