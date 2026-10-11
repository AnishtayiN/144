package p000a.p006b.p025d.p033f;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p006b.p010c.p021h.C0121p;
import p000a.p006b.p010c.p021h.C0123r;
import p000a.p006b.p010c.p021h.InterfaceC0122q;

/* renamed from: a.b.d.f.g */
/* loaded from: classes.dex */
public class C0192g {

    /* renamed from: c */
    public Interpolator f985c;

    /* renamed from: d */
    public InterfaceC0122q f986d;

    /* renamed from: e */
    public boolean f987e;

    /* renamed from: b */
    public long f984b = -1;

    /* renamed from: f */
    public final C0123r f988f = new a();

    /* renamed from: a */
    public final ArrayList<C0121p> f983a = new ArrayList<>();

    /* renamed from: a.b.d.f.g$a */
    public class a extends C0123r {

        /* renamed from: a */
        public boolean f989a = false;

        /* renamed from: b */
        public int f990b = 0;

        public a() {
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: a */
        public void mo495a(View view) {
            int i = this.f990b + 1;
            this.f990b = i;
            if (i == C0192g.this.f983a.size()) {
                InterfaceC0122q interfaceC0122q = C0192g.this.f986d;
                if (interfaceC0122q != null) {
                    interfaceC0122q.mo495a(null);
                }
                this.f990b = 0;
                this.f989a = false;
                C0192g.this.f987e = false;
            }
        }

        @Override // p000a.p006b.p010c.p021h.C0123r, p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: b */
        public void mo496b(View view) {
            if (this.f989a) {
                return;
            }
            this.f989a = true;
            InterfaceC0122q interfaceC0122q = C0192g.this.f986d;
            if (interfaceC0122q != null) {
                interfaceC0122q.mo496b(null);
            }
        }
    }

    /* renamed from: a */
    public void m654a() {
        if (this.f987e) {
            Iterator<C0121p> it = this.f983a.iterator();
            while (it.hasNext()) {
                it.next().m492a();
            }
            this.f987e = false;
        }
    }

    /* renamed from: b */
    public void m655b() {
        View view;
        if (this.f987e) {
            return;
        }
        Iterator<C0121p> it = this.f983a.iterator();
        while (it.hasNext()) {
            C0121p next = it.next();
            long j = this.f984b;
            if (j >= 0) {
                next.m489a(j);
            }
            Interpolator interpolator = this.f985c;
            if (interpolator != null && (view = next.f613a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f986d != null) {
                next.m490a(this.f988f);
            }
            View view2 = next.f613a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f987e = true;
    }
}
