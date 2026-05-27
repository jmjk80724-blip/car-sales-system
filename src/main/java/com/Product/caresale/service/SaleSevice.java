package com.Product.caresale.service;

import com.Product.caresale.model.Sale;
import com.Product.caresale.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleSevice {
    @Autowired
    SaleRepository saleRepository;

    public Sale saveSales(Sale sale) {
        return saleRepository.save(sale);
    }
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }
}
