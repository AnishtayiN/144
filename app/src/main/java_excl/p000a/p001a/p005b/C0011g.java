package p000a.p001a.p005b;

import android.arch.lifecycle.GenericLifecycleObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p001a.p002a.p004b.C0003a;
import p000a.p001a.p005b.AbstractC0008d;

/* renamed from: a.a.b.g */
/* loaded from: classes.dex */
public class C0011g extends AbstractC0008d {

    /* renamed from: c */
    public final WeakReference<InterfaceC0010f> f31c;

    /* renamed from: a */
    public C0003a<InterfaceC0009e, a> f29a = new C0003a<>();

    /* renamed from: d */
    public int f32d = 0;

    /* renamed from: e */
    public boolean f33e = false;

    /* renamed from: f */
    public boolean f34f = false;

    /* renamed from: g */
    public ArrayList<AbstractC0008d.b> f35g = new ArrayList<>();

    /* renamed from: b */
    public AbstractC0008d.b f30b = AbstractC0008d.b.INITIALIZED;

    /* renamed from: a.a.b.g$a */
    public static class a {

        /* renamed from: a */
        public AbstractC0008d.b f36a;

        /* renamed from: b */
        public GenericLifecycleObserver f37b;

        /* renamed from: a */
        public void m22a(InterfaceC0010f interfaceC0010f, AbstractC0008d.a aVar) {
            AbstractC0008d.b m17b = C0011g.m17b(aVar);
            this.f36a = C0011g.m15a(this.f36a, m17b);
            this.f37b.mo954a(interfaceC0010f, aVar);
            this.f36a = m17b;
        }
    }

    public C0011g(InterfaceC0010f interfaceC0010f) {
        this.f31c = new WeakReference<>(interfaceC0010f);
    }

    /* renamed from: a */
    public static AbstractC0008d.b m15a(AbstractC0008d.b bVar, AbstractC0008d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: b */
    public static AbstractC0008d.a m16b(AbstractC0008d.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return AbstractC0008d.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return AbstractC0008d.a.ON_START;
        }
        if (ordinal == 3) {
            return AbstractC0008d.a.ON_RESUME;
        }
        if (ordinal == 4) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* renamed from: b */
    public static AbstractC0008d.b m17b(AbstractC0008d.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return AbstractC0008d.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return AbstractC0008d.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return AbstractC0008d.b.STARTED;
        }
        return AbstractC0008d.b.CREATED;
    }

    /* renamed from: a */
    public final void m18a() {
        this.f35g.remove(r0.size() - 1);
    }

    /* renamed from: a */
    public void m19a(AbstractC0008d.a aVar) {
        m20a(m17b(aVar));
    }

    /* renamed from: a */
    public final void m20a(AbstractC0008d.b bVar) {
        if (this.f30b == bVar) {
            return;
        }
        this.f30b = bVar;
        if (this.f33e || this.f32d != 0) {
            this.f34f = true;
            return;
        }
        this.f33e = true;
        m21b();
        this.f33e = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21b() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p005b.C0011g.m21b():void");
    }
}
