package android.arch.lifecycle;

import p000a.p001a.p005b.AbstractC0008d;
import p000a.p001a.p005b.C0013i;
import p000a.p001a.p005b.InterfaceC0007c;
import p000a.p001a.p005b.InterfaceC0010f;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    public final InterfaceC0007c[] f1571a;

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo954a(InterfaceC0010f interfaceC0010f, AbstractC0008d.a aVar) {
        C0013i c0013i = new C0013i();
        for (InterfaceC0007c interfaceC0007c : this.f1571a) {
            interfaceC0007c.m13a(interfaceC0010f, aVar, false, c0013i);
        }
        for (InterfaceC0007c interfaceC0007c2 : this.f1571a) {
            interfaceC0007c2.m13a(interfaceC0010f, aVar, true, c0013i);
        }
    }
}
