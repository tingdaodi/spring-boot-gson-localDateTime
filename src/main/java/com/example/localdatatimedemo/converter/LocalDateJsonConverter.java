package com.example.localdatatimedemo.converter;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description TODO
 *
 * @author Roye.L
 * @date 2019/4/8 23:03
 * @since 1.0
 */
public class LocalDateJsonConverter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate> {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public LocalDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return LocalDate.parse(jsonElement.getAsString(), dateTimeFormatter);
    }

    @Override
    public JsonElement serialize(LocalDate dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(dateTime.format(dateTimeFormatter));
    }
}
