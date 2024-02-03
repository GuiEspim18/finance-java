package com.financeApi.utils.auth;

import io.github.cdimascio.dotenv.Dotenv;

public class Auth {

    public static String getKey () {
        final Dotenv DOTENV = Dotenv.configure().load();
        return DOTENV.get("KEY");
    }

}
