package services.dashboard.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.dashboard.api.entities.Sale;
import services.dashboard.api.repositories.SaleRepository;

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
