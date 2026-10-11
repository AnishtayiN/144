
package com.anishtayin.pkg144;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class CrashLogProvider extends ContentProvider {
    static java.io.File logFile;

    @Override
    public boolean onCreate() {
        try {
            logFile = new java.io.File(getContext().getFilesDir(), "144crash.txt");
            final java.lang.Thread.UncaughtExceptionHandler prev = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
                    try {
                        java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(logFile, true));
                        pw.println("=== CRASH " + new java.util.Date() + " thread=" + t.getName());
                        e.printStackTrace(pw);
                        java.lang.Throwable c = e.getCause();
                        while (c != null) { pw.println("CAUSE:"); c.printStackTrace(pw); c = c.getCause(); }
                        pw.println("=== END\n");
                        pw.close();
                    } catch (Throwable ignored) { }
                    try {
                        android.util.Log.e("144CRASH", "CRASH in " + t.getName(), e);
                    } catch (Throwable ignored) { }
                    if (prev != null) prev.uncaughtException(t, e);
                }
            });
            // startup marker so we know provider ran
            try {
                java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(logFile, true));
                pw.println("=== provider installed " + new java.util.Date());
                pw.close();
            } catch (Throwable ignored) { }
        } catch (Throwable ignored) { }
        return true;
    }

    @Override public Cursor query(Uri uri, String[] p, String s, String[] a, String o) { return null; }
    @Override public String getType(Uri uri) { return null; }
    @Override public Uri insert(Uri uri, ContentValues v) { return null; }
    @Override public int delete(Uri uri, String s, String[] a) { return 0; }
    @Override public int update(Uri uri, ContentValues v, String s, String[] a) { return 0; }
}
