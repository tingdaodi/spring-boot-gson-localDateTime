package com.example.localdatatimedemo.configuration;

import com.example.localdatatimedemo.converter.LocalDateJsonConverter;
import com.example.localdatatimedemo.converter.LocalDateTimeJsonConverter;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Description TODO
 *
 * @author Roye.L
 * @date 2019/4/8 23:11
 * @since 1.0
 *
 */
@Configuration
public class GsonHttpMessageConverterConfiguration {

    @Bean
    public Gson gson() {
        Gson g = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
//                .registerTypeAdapterFactory()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeJsonConverter())
                .registerTypeAdapter(LocalDate.class, new LocalDateJsonConverter())
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        return g;
    }

    @Bean
    public GsonHttpMessageConverter gsonHttpMessageConverter() {
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        Gson g = gson();
        converter.setGson(g);
        return converter;
    }

}


/*
new JsonSerializer<LocalDateTime>() {
@Override
public JsonElement serialize(LocalDateTime src, Type type, JsonSerializationContext jsonSerializationContext) {
        if (null == src) {
        return jsonSerializationContext.serialize(null);
        }
        return jsonSerializationContext.serialize(src.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
        }*/
