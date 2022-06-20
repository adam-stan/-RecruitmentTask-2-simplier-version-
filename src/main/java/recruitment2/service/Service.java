package recruitment2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;
import recruitment2.dto.Dto;
import recruitment2.model.RatesMainDto;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String URL = "https://www.frankfurter.app/";

    public Dto getCurrency(String date, String currency) {
        RatesMainDto ratesMainDto = restTemplate.getForObject(URL + date + "?to=" + currency, RatesMainDto.class);

        return Dto.builder()
                .amount(ratesMainDto.getAmount())
                .base(ratesMainDto.getBase())
                .date(ratesMainDto.getDate())
                .rates(ratesMainDto.getRates())
                .build();
    }
}
