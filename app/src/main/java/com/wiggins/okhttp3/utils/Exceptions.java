package com.wiggins.okhttp3.utils;

public class Exceptions {
    public static void illegalArgument(String msg, Object... params) {
        throw new IllegalArgumentException(String.format(msg, params));
    }
}
