package com.financeApi.principal;

import com.financeApi.model.GlobalQuote;
import com.financeApi.model.Response;
import com.financeApi.services.ConsumeApiService;
import com.financeApi.services.ConvertService;
import com.financeApi.utils.auth.Auth;
import com.financeApi.utils.consolePrint.Console;

import java.util.Scanner;

public class Principal {

    final static private String KEY = "&apikey="+ Auth.getKey();
    final static private String URL = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE";
    static private  String symbol = "&symbol=";
    final static private Scanner scanner = new Scanner(System.in);

    public static void show() {
        showMenu();
    }

    private static void showMenu () {
        Console.title("Finance");
        System.out.print("Tap an action name: ");
        symbol += scanner.nextLine().toUpperCase();
        var result = ConsumeApiService.get(URL + symbol + KEY);
        GlobalQuote globalQuote = ConvertService.convert(result, Response.class).globalQuote();
    }


    private static void showResult(GlobalQuote result) {

    }



}
