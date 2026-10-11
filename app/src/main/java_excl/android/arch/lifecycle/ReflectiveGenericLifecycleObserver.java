package android.arch.lifecycle;

import p000a.p001a.p005b.AbstractC0008d;
import p000a.p001a.p005b.C0005a;
import p000a.p001a.p005b.InterfaceC0010f;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    public final Object f1589a;

    /* renamed from: b */
    public final C0005a f1590b;

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo954a(InterfaceC0010f interfaceC0010f, AbstractC0008d.a aVar) {
        C0005a c0005a = this.f1590b;
        Object obj = this.f1589a;
        C0005a.m11a(c0005a.f20a.get(aVar), interfaceC0010f, aVar, obj);
        C0005a.m11a(c0005a.f20a.get(AbstractC0008d.a.ON_ANY), interfaceC0010f, aVar, obj);
    }
}
