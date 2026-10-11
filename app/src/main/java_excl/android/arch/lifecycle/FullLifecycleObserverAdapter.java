package android.arch.lifecycle;

import p000a.p001a.p005b.AbstractC0008d;
import p000a.p001a.p005b.InterfaceC0010f;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    public final FullLifecycleObserver f1572a;

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo954a(InterfaceC0010f interfaceC0010f, AbstractC0008d.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f1572a.m957c(interfaceC0010f);
                return;
            case ON_START:
                this.f1572a.m956b(interfaceC0010f);
                return;
            case ON_RESUME:
                this.f1572a.m960f(interfaceC0010f);
                return;
            case ON_PAUSE:
                this.f1572a.m958d(interfaceC0010f);
                return;
            case ON_STOP:
                this.f1572a.m959e(interfaceC0010f);
                return;
            case ON_DESTROY:
                this.f1572a.m955a(interfaceC0010f);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
