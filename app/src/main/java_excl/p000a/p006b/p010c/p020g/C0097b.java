package p000a.p006b.p010c.p020g;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: a.b.c.g.b */
/* loaded from: classes.dex */
public class C0097b<E> extends AbstractC0103h<E, E> {

    /* renamed from: d */
    public final /* synthetic */ C0098c f533d;

    public C0097b(C0098c c0098c) {
        this.f533d = c0098c;
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: a */
    public int mo379a(Object obj) {
        return this.f533d.m390a(obj);
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: a */
    public Object mo380a(int i, int i2) {
        return this.f533d.f541c[i];
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: a */
    public E mo381a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: a */
    public void mo382a() {
        this.f533d.clear();
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: a */
    public void mo383a(int i) {
        this.f533d.m393b(i);
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: a */
    public void mo384a(E e, E e2) {
        this.f533d.add(e);
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: b */
    public int mo385b(Object obj) {
        return this.f533d.m390a(obj);
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: b */
    public Map<E, E> mo386b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // p000a.p006b.p010c.p020g.AbstractC0103h
    /* renamed from: c */
    public int mo387c() {
        return this.f533d.f542d;
    }
}
