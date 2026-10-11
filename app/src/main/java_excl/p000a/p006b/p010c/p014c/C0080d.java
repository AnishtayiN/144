package p000a.p006b.p010c.p014c;

/* renamed from: a.b.c.c.d */
/* loaded from: classes.dex */
public class C0080d extends C0084h {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: IOException -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0083, blocks: (B:7:0x000e, B:18:0x0051, B:24:0x0065, B:47:0x0082, B:52:0x007f, B:9:0x0016, B:11:0x003b, B:13:0x0044, B:16:0x004b, B:20:0x0055, B:23:0x0062, B:34:0x0074, B:37:0x0071, B:33:0x006c, B:22:0x005e, B:29:0x006a, B:43:0x0076, B:49:0x007a), top: B:6:0x000e, inners: #2, #4, #7 }] */
    @Override // p000a.p006b.p010c.p014c.C0084h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface mo341a(android.content.Context r4, android.os.CancellationSignal r5, p000a.p006b.p010c.p018e.C0093b.f[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            a.b.c.e.b$f r6 = r3.m356a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f497a     // Catch: java.io.IOException -> L83
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: java.io.IOException -> L83
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            r6.<init>()     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            java.lang.String r7 = "/proc/self/fd/"
            r6.append(r7)     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            int r7 = r5.getFd()     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            r6.append(r7)     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            java.lang.String r6 = r6.toString()     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            android.system.StructStat r7 = android.system.Os.stat(r6)     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            int r7 = r7.st_mode     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            boolean r7 = android.system.OsConstants.S_ISREG(r7)     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            if (r7 == 0) goto L41
            java.io.File r7 = new java.io.File     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            r7.<init>(r6)     // Catch: android.system.ErrnoException -> L41 java.lang.Throwable -> L75
            goto L42
        L41:
            r7 = r1
        L42:
            if (r7 == 0) goto L55
            boolean r6 = r7.canRead()     // Catch: java.lang.Throwable -> L75
            if (r6 != 0) goto L4b
            goto L55
        L4b:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r7)     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L54
            r5.close()     // Catch: java.io.IOException -> L83
        L54:
            return r4
        L55:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L75
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L75
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L75
            android.graphics.Typeface r4 = super.m357a(r4, r6)     // Catch: java.lang.Throwable -> L69
            r6.close()     // Catch: java.lang.Throwable -> L75
            r5.close()     // Catch: java.io.IOException -> L83
            return r4
        L69:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L6b
        L6b:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L75
        L74:
            throw r7     // Catch: java.lang.Throwable -> L75
        L75:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L77
        L77:
            r6 = move-exception
            if (r5 == 0) goto L82
            r5.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L83
        L82:
            throw r6     // Catch: java.io.IOException -> L83
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p014c.C0080d.mo341a(android.content.Context, android.os.CancellationSignal, a.b.c.e.b$f[], int):android.graphics.Typeface");
    }
}
