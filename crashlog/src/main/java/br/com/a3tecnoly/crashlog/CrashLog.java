package br.com.a3tecnoly.crashlog;

import android.util.Log;

public final class CrashLog {

    public static void print(String message) {
        Log.d("CrashLog", message);
    }
}
