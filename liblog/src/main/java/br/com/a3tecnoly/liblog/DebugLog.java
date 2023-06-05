package br.com.a3tecnoly.liblog;

import android.util.Log;

public final class DebugLog {

    public static void print(String message) {
        Log.d("DebugLog", message);
    }
}
