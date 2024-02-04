package com.financeApi.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.financeApi.utils.interfaces.IConverterService;

public class ConvertService implements IConverterService {

    private final static ObjectMapper MAPPER = new ObjectMapper();

    public static <T> T convert(String json, Class<T> providedClass) {
        try {
            return MAPPER.readValue(json, providedClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
