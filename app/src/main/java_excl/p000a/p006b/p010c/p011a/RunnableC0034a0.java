package p000a.p006b.p010c.p011a;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.c.a.a0 */
/* loaded from: classes.dex */
public class RunnableC0034a0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f155b;

    /* renamed from: c */
    public final /* synthetic */ Map f156c;

    public RunnableC0034a0(AbstractC0036b0 abstractC0036b0, ArrayList arrayList, Map map) {
        this.f155b = arrayList;
        this.f156c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f155b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f155b.get(i);
            C0119n.m464a(view, (String) this.f156c.get(C0119n.m470e(view)));
        }
    }
}
