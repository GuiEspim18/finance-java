package com.financeApi.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Response(
        @JsonAlias("Global Quote") GlobalQuote globalQuote
) {
}
