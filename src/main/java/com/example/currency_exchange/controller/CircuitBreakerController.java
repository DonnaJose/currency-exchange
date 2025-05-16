// package com.example.currency_exchange.controller;


// import org.slf4j.LoggerFactory;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

// import io.github.resilience4j.bulkhead.annotation.Bulkhead;
// import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
// import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
// import io.github.resilience4j.retry.annotation.Retry;
// import org.slf4j.Logger;

// @RestController
// public class CircuitBreakerController {
// private Logger logger= LoggerFactory.getLogger(CircuitBreakerController.class);

// @GetMapping("/sample-api")
// //@Retry(name = "sample-api", fallbackMethod = "hardcodedResponse" )
// @CircuitBreaker(name = "sample-api", fallbackMethod = "hardcodedResponse" )
// public String sampleAPI(){
//     //make a call to dummy API
//     logger.info("Sample api");
//     ResponseEntity<String> getEntity=new RestTemplate().getForEntity("http://localhost:7777/dummy-inavlid-url", String.class);
//      return getEntity.getBody();
// }

// @GetMapping("/sample-api-rate-limiter")
// @RateLimiter(name="default", fallbackMethod = "hardcodedResponse")
// @Bulkhead (name = "default")
// public String sampleAPIForRateLimiter(){
//     //make a call to dummy API
//     return "sample rateLimiter";
// }

// private String hardcodedResponse(Exception ex){
//     return "FallBackMethode-response";
// }
// }
