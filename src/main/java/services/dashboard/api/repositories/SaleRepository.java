package services.dashboard.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import services.dashboard.api.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long> {
}
