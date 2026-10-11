
package com.anishtayin.pkg144;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class CrashLogProvider extends ContentProvider {
    @Override
    public boolean onCreate() {
        try {
            final Context ctx = getContext();
            final java.lang.Thread.UncaughtExceptionHandler prev = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(java.lang.Thread t, final java.lang.Throwable e) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("=== CRASH ").append(new java.util.Date()).append(" thread=").append(t.getName()).append("\n");
                    java.io.StringWriter sw = new java.io.StringWriter();
                    e.printStackTrace(new java.io.PrintWriter(sw));
                    sb.append(sw.toString());
                    java.lang.Throwable c = e.getCause();
                    while (c != null) {
                        sb.append("CAUSE:\n");
                        sw = new java.io.StringWriter();
                        c.printStackTrace(new java.io.PrintWriter(sw));
                        sb.append(sw.toString());
                        c = c.getCause();
                    }
                    sb.append("=== END\n");
                    final String text = sb.toString();
                    try { android.util.Log.e("144CRASH", text); } catch (Throwable ignored) {}
                    // 1) save to public Downloads via MediaStore (no permission needed API 29+)
                    try {
                        if (android.os.Build.VERSION.SDK_INT >= 29) {
                            android.content.ContentValues cv = new android.content.ContentValues();
                            cv.put(android.provider.MediaStore.Downloads.DISPLAY_NAME,
                                   "144crash-" + System.currentTimeMillis() + ".txt");
                            cv.put(android.provider.MediaStore.Downloads.MIME_TYPE, "text/plain");
                            Uri uri = ctx.getContentResolver().insert(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, cv);
                            if (uri != null) {
                                java.io.OutputStream os = ctx.getContentResolver().openOutputStream(uri);
                                os.write(text.getBytes("UTF-8"));
                                os.close();
                            }
                        }
                    } catch (Throwable ignored) {}
                    // 2) also try legacy paths
                    try {
                        java.io.File d = new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Download");
                        if (d.canWrite()) {
                            java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(new java.io.File(d, "144crash.txt"), true));
                            pw.println(text);
                            pw.close();
                        }
                    } catch (Throwable ignored) {}
                    try {
                        java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.FileWriter(new java.io.File(ctx.getFilesDir(), "144crash.txt"), true));
                        pw.println(text);
                        pw.close();
                    } catch (Throwable ignored) {}
                    // 3) toast on screen so user SEES the error class
                    try {
                        android.os.Handler h = new android.os.Handler(android.os.Looper.getMainLooper());
                        h.post(new Runnable() {
                            public void run() {
                                try {
                                    String msg = e.getClass().getName() + "\n" + String.valueOf(e.getMessage());
                                    if (msg.length() > 300) msg = msg.substring(0, 300);
                                    android.widget.Toast.makeText(ctx, msg, android.widget.Toast.LENGTH_LONG).show();
                                } catch (Throwable ignored) {}
                            }
                        });
                        try { java.lang.Thread.sleep(1500); } catch (InterruptedException ignored) {}
                    } catch (Throwable ignored) {}
                    if (prev != null) prev.uncaughtException(t, e);
                }
            });
        } catch (Throwable ignored) { }
        return true;
    }

    @Override public Cursor query(Uri uri, String[] p, String s, String[] a, String o) { return null; }
    @Override public String getType(Uri uri) { return null; }
    @Override public Uri insert(Uri uri, ContentValues v) { return null; }
    @Override public int delete(Uri uri, String s, String[] a) { return 0; }
    @Override public int update(Uri uri, ContentValues v, String s, String[] a) { return 0; }
}
