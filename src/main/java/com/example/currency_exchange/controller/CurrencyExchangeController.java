package com.example.currency_exchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.currency_exchange.model.CurrencyExchange;
import com.example.currency_exchange.repository.CurrencyRespository;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyRespository currencyRespository;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from,
                                                  @PathVariable String to) {
       
       // CurrencyExchange currencyExchange = new CurrencyExchange(10001L, from, to, 
       // BigDecimal.valueOf(67.00), 
       // environment.getProperty("local.server.port"));
       
       // List<CurrencyExchange> currencyExchange=currencyRespository.findAll();

        List<CurrencyExchange> currencyExchange=currencyRespository.findByFromAndTo(from,to);
        currencyExchange.get(0).setEnvironment(environment.getProperty("local.server.port"));
        return currencyExchange.get(0);    
                

    }

    @GetMapping("/test")

public String test(){
    return "test";
}
}
