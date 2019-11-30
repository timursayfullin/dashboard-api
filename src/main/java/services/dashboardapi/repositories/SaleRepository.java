package services.dashboardapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.dashboardapi.entities.Sale;

import java.util.List;

public interface SaleRepository  extends JpaRepository<Sale, Long> {
}
