package com.github.hugovallada.springboottestingprimer.collaborator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.github.hugovallada.springboottestingprimer.collaborators.Collaborator;
import com.github.hugovallada.springboottestingprimer.collaborators.PricingService;

@ExtendWith(MockitoExtension.class)
class PricingServiceTest {
    @Mock
    private Collaborator collaborator;

    @Test
    void shouldReturnLessThan100WhenTheProductIsInStockWithCompetitor() {
        when(collaborator.isCurrentInStockOfCompetitor("AirPods")).thenReturn(true);
        PricingService sut = new PricingService(collaborator);
        assertThat(sut.calculatePrice("AirPods")).isEqualTo(new BigDecimal("99.99"));
        verify(collaborator).notify("AirPods");
    }
}
