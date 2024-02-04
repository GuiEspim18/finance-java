package com.financeApi.principal;

import com.financeApi.model.GlobalQuote;
import com.financeApi.model.Response;
import com.financeApi.services.ConsumeApiService;
import com.financeApi.services.ConvertService;
import com.financeApi.utils.auth.Auth;
import com.financeApi.utils.consolePrint.Console;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.RecordComponent;
import java.text.MessageFormat;
import java.util.Objects;
import java.util.Scanner;

public class Principal {

    final static private String KEY = "&apikey=" + Auth.getKey();
    final static private String URL = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE";
    static private String symbol = "&symbol=";
    final static private Scanner scanner = new Scanner(System.in);

    public static void show() {
        showMenu();
    }

    private static void showMenu() {
        try {
            Console.title("Finance");
            System.out.print("Tap an action name: ");
            symbol += scanner.nextLine().toUpperCase();
            var result = ConsumeApiService.get(URL + symbol + KEY);
            GlobalQuote globalQuote = ConvertService.convert(result, Response.class).globalQuote();
            showResult(globalQuote);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    private static void showResult(GlobalQuote result) throws InvocationTargetException, IllegalAccessException {
        RecordComponent[] fields = result.getClass().getRecordComponents();
        Console.title(result.symbol());
        for (RecordComponent field : fields) {
            if (!Objects.equals(field.getName(), "symbol")) {
                var getData = field.getAccessor().invoke(result);
                String message = MessageFormat.format("{0}: {1}", field.getName(), getData);
                System.out.println(message);
                Console.divide();
            }
        }
    }


}
