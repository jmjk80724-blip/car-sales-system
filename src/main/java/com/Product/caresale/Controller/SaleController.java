package com.Product.caresale.Controller;

import com.Product.caresale.model.Sale;
import com.Product.caresale.service.SaleSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    SaleSevice saleSevice;

    @PostMapping
    public Sale addSale(@RequestBody Sale sale) {
        return saleSevice.saveSales(sale);
    }
    @GetMapping
    public List<Sale> getAllSales() {
        return saleSevice.getAllSales();
    }

}
