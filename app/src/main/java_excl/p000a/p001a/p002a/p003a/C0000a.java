package p000a.p001a.p002a.p003a;

import java.util.concurrent.Executor;

/* renamed from: a.a.a.a.a */
/* loaded from: classes.dex */
public class C0000a extends AbstractC0002c {

    /* renamed from: c */
    public static volatile C0000a f0c;

    /* renamed from: b */
    public AbstractC0002c f2b = new C0001b();

    /* renamed from: a */
    public AbstractC0002c f1a = this.f2b;

    /* renamed from: a.a.a.a.a$a */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0000a.m0b().mo3b(runnable);
        }
    }

    /* renamed from: a.a.a.a.a$b */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0000a.m0b().mo1a(runnable);
        }
    }

    /* renamed from: b */
    public static C0000a m0b() {
        if (f0c != null) {
            return f0c;
        }
        synchronized (C0000a.class) {
            if (f0c == null) {
                f0c = new C0000a();
            }
        }
        return f0c;
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0002c
    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f1a.mo1a(runnable);
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0002c
    /* renamed from: a */
    public boolean mo2a() {
        return this.f1a.mo2a();
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0002c
    /* renamed from: b */
    public void mo3b(Runnable runnable) {
        this.f1a.mo3b(runnable);
    }
}
