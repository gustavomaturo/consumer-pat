package br.com.alelo.consumer.consumerpat.core.dto.v1.request;

import br.com.alelo.consumer.consumerpat.core.enumeration.CardType;
import lombok.*;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CardV1RequestDto {

    private String card;
    private BigDecimal balance;
    private CardType type;
}
