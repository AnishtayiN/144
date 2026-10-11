package p000a.p006b.p010c.p020g;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: a.b.c.g.g */
/* loaded from: classes.dex */
public class C0102g<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f554a;

    /* renamed from: b */
    public int f555b;

    /* renamed from: c */
    public int f556c;

    /* renamed from: d */
    public int f557d;

    /* renamed from: e */
    public int f558e;

    /* renamed from: f */
    public int f559f;

    /* renamed from: g */
    public int f560g;

    public C0102g(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f556c = i;
        this.f554a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: a */
    public final V m405a(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f554a.get(k);
            if (v != null) {
                this.f559f++;
                return v;
            }
            this.f560g++;
            return null;
        }
    }

    /* renamed from: a */
    public final V m406a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f557d++;
            this.f555b++;
            put = this.f554a.put(k, v);
            if (put != null) {
                this.f555b--;
            }
        }
        m407a(this.f556c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m407a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f555b     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.f554a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f555b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f555b     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.f554a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f554a     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<K, V> r0 = r2.f554a     // Catch: java.lang.Throwable -> L69
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f555b     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.f555b = r0     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f558e     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.f558e = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L6d
        L6c:
            throw r3
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p020g.C0102g.m407a(int):void");
    }

    public final synchronized String toString() {
        int i;
        i = this.f559f + this.f560g;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f556c), Integer.valueOf(this.f559f), Integer.valueOf(this.f560g), Integer.valueOf(i != 0 ? (this.f559f * 100) / i : 0));
    }
}
