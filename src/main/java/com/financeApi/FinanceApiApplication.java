package com.financeApi;

import com.financeApi.utils.auth.Auth;
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
		final String KEY = Auth.getKey();
		System.out.println(KEY);
	}

}
