package com.example.currency_exchange.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.currency_exchange.model.CurrencyExchange;

public interface CurrencyRespository extends JpaRepository<CurrencyExchange, Long>{
List<CurrencyExchange>findByFromAndTo(String from,String to);
}
