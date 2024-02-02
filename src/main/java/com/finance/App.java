package com.finance;

import io.github.cdimascio.dotenv.Dotenv;

public class App {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        final String KEY = dotenv.get("KEY");

        System.out.print(KEY);
    }
}
