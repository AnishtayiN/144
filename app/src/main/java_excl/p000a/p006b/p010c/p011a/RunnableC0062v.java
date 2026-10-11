package p000a.p006b.p010c.p011a;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import p000a.p006b.p010c.p011a.C0063w;
import p000a.p006b.p010c.p020g.C0096a;

/* renamed from: a.b.c.a.v */
/* loaded from: classes.dex */
public final class RunnableC0062v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractC0036b0 f390b;

    /* renamed from: c */
    public final /* synthetic */ C0096a f391c;

    /* renamed from: d */
    public final /* synthetic */ Object f392d;

    /* renamed from: e */
    public final /* synthetic */ C0063w.a f393e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f394f;

    /* renamed from: g */
    public final /* synthetic */ View f395g;

    /* renamed from: h */
    public final /* synthetic */ ComponentCallbacksC0041e f396h;

    /* renamed from: i */
    public final /* synthetic */ ComponentCallbacksC0041e f397i;

    /* renamed from: j */
    public final /* synthetic */ boolean f398j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f399k;

    /* renamed from: l */
    public final /* synthetic */ Object f400l;

    /* renamed from: m */
    public final /* synthetic */ Rect f401m;

    public RunnableC0062v(AbstractC0036b0 abstractC0036b0, C0096a c0096a, Object obj, C0063w.a aVar, ArrayList arrayList, View view, ComponentCallbacksC0041e componentCallbacksC0041e, ComponentCallbacksC0041e componentCallbacksC0041e2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f390b = abstractC0036b0;
        this.f391c = c0096a;
        this.f392d = obj;
        this.f393e = aVar;
        this.f394f = arrayList;
        this.f395g = view;
        this.f396h = componentCallbacksC0041e;
        this.f397i = componentCallbacksC0041e2;
        this.f398j = z;
        this.f399k = arrayList2;
        this.f400l = obj2;
        this.f401m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0096a<String, View> m302a = C0063w.m302a(this.f390b, (C0096a<String, String>) this.f391c, this.f392d, this.f393e);
        if (m302a != null) {
            this.f394f.addAll(m302a.values());
            this.f394f.add(this.f395g);
        }
        C0063w.m310a(this.f396h, this.f397i, this.f398j, m302a, false);
        Object obj = this.f392d;
        if (obj != null) {
            this.f390b.mo155b(obj, this.f399k, this.f394f);
            View m303a = C0063w.m303a(m302a, this.f393e, this.f400l, this.f398j);
            if (m303a != null) {
                this.f390b.m140a(m303a, this.f401m);
            }
        }
    }
}
