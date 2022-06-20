package recruitment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import recruitment2.dto.Dto;
import recruitment2.service.Service;

@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/rates")
    public Dto getRates(@RequestParam (required = false) String date, @RequestParam (required = false) String currency) {
        return service.getCurrency("2017-05-03", "USD");
    }
}
