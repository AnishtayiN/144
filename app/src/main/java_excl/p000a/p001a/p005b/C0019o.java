package p000a.p001a.p005b;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: a.a.b.o */
/* loaded from: classes.dex */
public class C0019o {

    /* renamed from: a */
    public final HashMap<String, AbstractC0017m> f38a = new HashMap<>();

    /* renamed from: a */
    public final void m28a() {
        Iterator<AbstractC0017m> it = this.f38a.values().iterator();
        while (it.hasNext()) {
            it.next().mo27a();
        }
        this.f38a.clear();
    }
}
