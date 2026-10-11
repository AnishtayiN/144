package p000a.p006b.p010c.p018e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p012b.p013c.AbstractC0076h;
import p000a.p006b.p010c.p014c.C0079c;
import p000a.p006b.p010c.p018e.C0094c;
import p000a.p006b.p010c.p020g.C0102g;
import p000a.p006b.p010c.p020g.C0104i;

/* renamed from: a.b.c.e.b */
/* loaded from: classes.dex */
public class C0093b {

    /* renamed from: a */
    public static final C0102g<String, Typeface> f483a = new C0102g<>(16);

    /* renamed from: b */
    public static final C0094c f484b = new C0094c("fonts", 10, 10000);

    /* renamed from: c */
    public static final Object f485c = new Object();

    /* renamed from: d */
    public static final C0104i<String, ArrayList<C0094c.d<g>>> f486d = new C0104i<>();

    /* renamed from: e */
    public static final Comparator<byte[]> f487e = new d();

    /* renamed from: a.b.c.e.b$a */
    public static class a implements Callable<g> {

        /* renamed from: a */
        public final /* synthetic */ Context f488a;

        /* renamed from: b */
        public final /* synthetic */ C0092a f489b;

        /* renamed from: c */
        public final /* synthetic */ int f490c;

        /* renamed from: d */
        public final /* synthetic */ String f491d;

        public a(Context context, C0092a c0092a, int i, String str) {
            this.f488a = context;
            this.f489b = c0092a;
            this.f490c = i;
            this.f491d = str;
        }

        @Override // java.util.concurrent.Callable
        public g call() {
            g m366a = C0093b.m366a(this.f488a, this.f489b, this.f490c);
            Typeface typeface = m366a.f502a;
            if (typeface != null) {
                C0093b.f483a.m406a(this.f491d, typeface);
            }
            return m366a;
        }
    }

    /* renamed from: a.b.c.e.b$b */
    public static class b implements C0094c.d<g> {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0076h f492a;

        /* renamed from: b */
        public final /* synthetic */ Handler f493b;

        public b(AbstractC0076h abstractC0076h, Handler handler) {
            this.f492a = abstractC0076h;
            this.f493b = handler;
        }

        @Override // p000a.p006b.p010c.p018e.C0094c.d
        /* renamed from: a */
        public void mo369a(g gVar) {
            g gVar2 = gVar;
            if (gVar2 == null) {
                this.f492a.m329a(1, this.f493b);
                return;
            }
            int i = gVar2.f503b;
            if (i == 0) {
                this.f492a.m331a(gVar2.f502a, this.f493b);
            } else {
                this.f492a.m329a(i, this.f493b);
            }
        }
    }

    /* renamed from: a.b.c.e.b$c */
    public static class c implements C0094c.d<g> {

        /* renamed from: a */
        public final /* synthetic */ String f494a;

        public c(String str) {
            this.f494a = str;
        }

        @Override // p000a.p006b.p010c.p018e.C0094c.d
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo369a(g gVar) {
            synchronized (C0093b.f485c) {
                ArrayList<C0094c.d<g>> arrayList = C0093b.f486d.get(this.f494a);
                if (arrayList == null) {
                    return;
                }
                C0093b.f486d.remove(this.f494a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).mo369a(gVar);
                }
            }
        }
    }

    /* renamed from: a.b.c.e.b$d */
    public static class d implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    if (bArr3[i3] != bArr4[i3]) {
                        i = bArr3[i3];
                        i2 = bArr4[i3];
                    }
                }
                return 0;
            }
            i = bArr3.length;
            i2 = bArr4.length;
            return i - i2;
        }
    }

    /* renamed from: a.b.c.e.b$e */
    public static class e {

        /* renamed from: a */
        public final int f495a;

        /* renamed from: b */
        public final f[] f496b;

        public e(int i, f[] fVarArr) {
            this.f495a = i;
            this.f496b = fVarArr;
        }
    }

    /* renamed from: a.b.c.e.b$f */
    public static class f {

        /* renamed from: a */
        public final Uri f497a;

        /* renamed from: b */
        public final int f498b;

        /* renamed from: c */
        public final int f499c;

        /* renamed from: d */
        public final boolean f500d;

        /* renamed from: e */
        public final int f501e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri == null) {
                throw new NullPointerException();
            }
            this.f497a = uri;
            this.f498b = i;
            this.f499c = i2;
            this.f500d = z;
            this.f501e = i3;
        }
    }

    /* renamed from: a.b.c.e.b$g */
    public static final class g {

        /* renamed from: a */
        public final Typeface f502a;

        /* renamed from: b */
        public final int f503b;

        public g(Typeface typeface, int i) {
            this.f502a = typeface;
            this.f503b = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[LOOP:1: B:14:0x004d->B:28:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[EDGE_INSN: B:29:0x0096->B:30:0x0096 BREAK  A[LOOP:1: B:14:0x004d->B:28:0x0092], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p006b.p010c.p018e.C0093b.e m365a(android.content.Context r28, android.os.CancellationSignal r29, p000a.p006b.p010c.p018e.C0092a r30) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p018e.C0093b.m365a(android.content.Context, android.os.CancellationSignal, a.b.c.e.a):a.b.c.e.b$e");
    }

    /* renamed from: a */
    public static g m366a(Context context, C0092a c0092a, int i) {
        try {
            e m365a = m365a(context, (CancellationSignal) null, c0092a);
            int i2 = m365a.f495a;
            if (i2 != 0) {
                return new g(null, i2 == 1 ? -2 : -3);
            }
            Typeface mo341a = C0079c.f452a.mo341a(context, (CancellationSignal) null, m365a.f496b, i);
            return new g(mo341a, mo341a != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    /* renamed from: a */
    public static Typeface m367a(Context context, C0092a c0092a, AbstractC0076h abstractC0076h, Handler handler, boolean z, int i, int i2) {
        String str = c0092a.f482f + "-" + i2;
        Typeface m405a = f483a.m405a((C0102g<String, Typeface>) str);
        if (m405a != null) {
            if (abstractC0076h != null) {
                abstractC0076h.mo330a(m405a);
            }
            return m405a;
        }
        if (z && i == -1) {
            g m366a = m366a(context, c0092a, i2);
            if (abstractC0076h != null) {
                int i3 = m366a.f503b;
                if (i3 == 0) {
                    abstractC0076h.m331a(m366a.f502a, handler);
                } else {
                    abstractC0076h.m329a(i3, handler);
                }
            }
            return m366a.f502a;
        }
        a aVar = new a(context, c0092a, i2, str);
        if (z) {
            try {
                return ((g) f484b.m370a(aVar, i)).f502a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        b bVar = abstractC0076h == null ? null : new b(abstractC0076h, handler);
        synchronized (f485c) {
            if (f486d.m414a(str) >= 0) {
                if (bVar != null) {
                    f486d.get(str).add(bVar);
                }
                return null;
            }
            if (bVar != null) {
                ArrayList<C0094c.d<g>> arrayList = new ArrayList<>();
                arrayList.add(bVar);
                f486d.put(str, arrayList);
            }
            f484b.m373a(aVar, new c(str));
            return null;
        }
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m368a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.f501e == 0) {
                Uri uri = fVar.f497a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0027d.m59a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
