package com.github.hugovallada.springboottestingprimer.collaborators;

import java.math.BigDecimal;

public class PricingService {
    private final Collaborator collaborator;

    public PricingService(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public BigDecimal calculatePrice(String productName) {
        if (collaborator.isCurrentInStockOfCompetitor(productName)) {
            collaborator.notify(productName);
            return new BigDecimal("99.99");
        }
        return new BigDecimal("149.99");
    }
}
