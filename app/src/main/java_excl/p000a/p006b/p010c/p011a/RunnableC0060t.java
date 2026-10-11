package p000a.p006b.p010c.p011a;

import android.view.View;
import java.util.ArrayList;

/* renamed from: a.b.c.a.t */
/* loaded from: classes.dex */
public final class RunnableC0060t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f375b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0036b0 f376c;

    /* renamed from: d */
    public final /* synthetic */ View f377d;

    /* renamed from: e */
    public final /* synthetic */ ComponentCallbacksC0041e f378e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f379f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f380g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f381h;

    /* renamed from: i */
    public final /* synthetic */ Object f382i;

    public RunnableC0060t(Object obj, AbstractC0036b0 abstractC0036b0, View view, ComponentCallbacksC0041e componentCallbacksC0041e, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f375b = obj;
        this.f376c = abstractC0036b0;
        this.f377d = view;
        this.f378e = componentCallbacksC0041e;
        this.f379f = arrayList;
        this.f380g = arrayList2;
        this.f381h = arrayList3;
        this.f382i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f375b;
        if (obj != null) {
            this.f376c.mo143a(obj, this.f377d);
            this.f380g.addAll(C0063w.m307a(this.f376c, this.f375b, this.f378e, (ArrayList<View>) this.f379f, this.f377d));
        }
        if (this.f381h != null) {
            if (this.f382i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f377d);
                this.f376c.mo147a(this.f382i, this.f381h, arrayList);
            }
            this.f381h.clear();
            this.f381h.add(this.f377d);
        }
    }
}
