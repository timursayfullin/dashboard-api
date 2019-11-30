package services.dashboardapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.dashboardapi.entities.EmailSubscription;
import services.dashboardapi.repositories.EmailRepository;

import java.util.List;

@Controller
public class EmailController {
    EmailRepository emailRepository;

    @Autowired
    public EmailController(
            EmailRepository emailRepository
    ) {
        this.emailRepository = emailRepository;
    }

    public List<EmailSubscription> getSubscriptions() {

        return emailRepository.findAll();
    }
}
