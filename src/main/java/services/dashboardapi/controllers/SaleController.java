package services.dashboardapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.dashboardapi.entities.Sale;
import services.dashboardapi.repositories.SaleRepository;

import java.util.List;

@Controller
public class SaleController {
    SaleRepository saleRepository;

    @Autowired
    public SaleController(
            SaleRepository saleRepository
    ) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> getDaylySales() {
        return this.saleRepository.findAll();
    }
}
