package com.financeApi.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertService {

    private final static ObjectMapper MAPPER = new ObjectMapper();

    public static <T> T convert(String json, Class<T> providedClass) {
        try {
            return MAPPER.readValue(json, providedClass);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
