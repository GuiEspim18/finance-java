package com.financeApi;

import com.financeApi.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FinanceApiApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Principal.show();
//		String key = Auth.getKey();
//		String symbol = "AAPL";
//		String url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + symbol + "&apikey=" + key;

 	}

}
