package p000a.p006b.p010c.p011a;

import android.view.View;
import java.util.ArrayList;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.c.a.y */
/* loaded from: classes.dex */
public class RunnableC0065y implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f422b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f423c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f424d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f425e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f426f;

    public RunnableC0065y(AbstractC0036b0 abstractC0036b0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f422b = i;
        this.f423c = arrayList;
        this.f424d = arrayList2;
        this.f425e = arrayList3;
        this.f426f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f422b; i++) {
            C0119n.m464a((View) this.f423c.get(i), (String) this.f424d.get(i));
            C0119n.m464a((View) this.f425e.get(i), (String) this.f426f.get(i));
        }
    }
}
