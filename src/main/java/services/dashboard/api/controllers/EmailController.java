package services.dashboard.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.dashboard.api.entities.EmailSubscription;
import services.dashboard.api.repositories.EmailRepository;

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
