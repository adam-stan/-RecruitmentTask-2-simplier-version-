package recruitment2.dto;

import lombok.Builder;
import lombok.Getter;
import recruitment2.model.Rates;

@Getter
@Builder
public class Dto {
    private double amount;
    private String base;
    private String date;
    private Rates rates;
    private double currency;
}
