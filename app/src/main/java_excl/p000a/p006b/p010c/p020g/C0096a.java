package p000a.p006b.p010c.p020g;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import p000a.p006b.p010c.p020g.AbstractC0103h.b;
import p000a.p006b.p010c.p020g.AbstractC0103h.c;
import p000a.p006b.p010c.p020g.AbstractC0103h.e;

/* renamed from: a.b.c.g.a */
/* loaded from: classes.dex */
public class C0096a<K, V> extends C0104i<K, V> implements Map<K, V> {

    /* renamed from: i */
    public AbstractC0103h<K, V> f531i;

    /* renamed from: a.b.c.g.a$a */
    public class a extends AbstractC0103h<K, V> {
        public a() {
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: a */
        public int mo379a(Object obj) {
            return C0096a.this.m414a(obj);
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: a */
        public Object mo380a(int i, int i2) {
            return C0096a.this.f581c[(i << 1) + i2];
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: a */
        public V mo381a(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = C0096a.this.f581c;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: a */
        public void mo382a() {
            C0096a.this.clear();
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: a */
        public void mo383a(int i) {
            C0096a.this.m419c(i);
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: a */
        public void mo384a(K k, V v) {
            C0096a.this.put(k, v);
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: b */
        public int mo385b(Object obj) {
            return C0096a.this.m417b(obj);
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: b */
        public Map<K, V> mo386b() {
            return C0096a.this;
        }

        @Override // p000a.p006b.p010c.p020g.AbstractC0103h
        /* renamed from: c */
        public int mo387c() {
            return C0096a.this.f582d;
        }
    }

    public C0096a() {
    }

    public C0096a(int i) {
        super(i);
    }

    /* renamed from: b */
    public final AbstractC0103h<K, V> m378b() {
        if (this.f531i == null) {
            this.f531i = new a();
        }
        return this.f531i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        AbstractC0103h<K, V> m378b = m378b();
        if (m378b.f561a == null) {
            m378b.f561a = m378b.new b();
        }
        return m378b.f561a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        AbstractC0103h<K, V> m378b = m378b();
        if (m378b.f562b == null) {
            m378b.f562b = m378b.new c();
        }
        return m378b.f562b;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size() + this.f582d;
        int i = this.f582d;
        int[] iArr = this.f580b;
        if (iArr.length < size) {
            Object[] objArr = this.f581c;
            m416a(size);
            if (this.f582d > 0) {
                System.arraycopy(iArr, 0, this.f580b, 0, i);
                System.arraycopy(objArr, 0, this.f581c, 0, i << 1);
            }
            C0104i.m412a(iArr, objArr, i);
        }
        if (this.f582d != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        AbstractC0103h<K, V> m378b = m378b();
        if (m378b.f563c == null) {
            m378b.f563c = m378b.new e();
        }
        return m378b.f563c;
    }
}
