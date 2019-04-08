package com.example.localdatatimedemo.configuration;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/**
 * Description TODO
 *
 * @author Roye.L
 * @date 2019/4/9 0:04
 * @since 1.0
 */
public class ChungeAdapter implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return null;
    }
}
