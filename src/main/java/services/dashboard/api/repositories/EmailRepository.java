package services.dashboard.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import services.dashboard.api.entities.EmailSubscription;

@Repository
public interface EmailRepository extends JpaRepository<EmailSubscription, Long> {
}
