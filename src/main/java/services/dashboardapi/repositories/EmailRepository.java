package services.dashboardapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import services.dashboardapi.entities.EmailSubscription;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<EmailSubscription, Long> {
}
