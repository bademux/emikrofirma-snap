package com.github.bademux.emk.utils;

import lombok.experimental.UtilityClass;

import java.util.Base64;

@UtilityClass
public class Base64Utils {

    public static final Base64.Encoder ENCODER = Base64.getEncoder();

    public static String encodeToString(byte[] data) {
        return data != null ? ENCODER.encodeToString(data) : null;
    }

}
