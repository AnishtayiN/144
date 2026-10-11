package p000a.p006b.p010c.p011a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.c.a.z */
/* loaded from: classes.dex */
public class RunnableC0066z implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f427b;

    /* renamed from: c */
    public final /* synthetic */ Map f428c;

    public RunnableC0066z(AbstractC0036b0 abstractC0036b0, ArrayList arrayList, Map map) {
        this.f427b = arrayList;
        this.f428c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f427b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f427b.get(i);
            String m470e = C0119n.m470e(view);
            if (m470e != null) {
                Iterator it = this.f428c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (m470e.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                C0119n.m464a(view, str);
            }
        }
    }
}
