package p000a.p001a.p002a.p004b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.a.a.b.b */
/* loaded from: classes.dex */
public class C0004b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public d<K, V> f7b;

    /* renamed from: c */
    public d<K, V> f8c;

    /* renamed from: d */
    public WeakHashMap<g<K, V>, Boolean> f9d = new WeakHashMap<>();

    /* renamed from: e */
    public int f10e = 0;

    /* renamed from: a.a.a.b.b$b */
    public static class b<K, V> extends f<K, V> {
        public b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // p000a.p001a.p002a.p004b.C0004b.f
        /* renamed from: b */
        public d<K, V> mo7b(d<K, V> dVar) {
            return dVar.f14e;
        }

        @Override // p000a.p001a.p002a.p004b.C0004b.f
        /* renamed from: c */
        public d<K, V> mo8c(d<K, V> dVar) {
            return dVar.f13d;
        }
    }

    /* renamed from: a.a.a.b.b$c */
    public static class c<K, V> extends f<K, V> {
        public c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        @Override // p000a.p001a.p002a.p004b.C0004b.f
        /* renamed from: b */
        public d<K, V> mo7b(d<K, V> dVar) {
            return dVar.f13d;
        }

        @Override // p000a.p001a.p002a.p004b.C0004b.f
        /* renamed from: c */
        public d<K, V> mo8c(d<K, V> dVar) {
            return dVar.f14e;
        }
    }

    /* renamed from: a.a.a.b.b$d */
    public static class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f11b;

        /* renamed from: c */
        public final V f12c;

        /* renamed from: d */
        public d<K, V> f13d;

        /* renamed from: e */
        public d<K, V> f14e;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f11b.equals(dVar.f11b) && this.f12c.equals(dVar.f12c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f11b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f11b + "=" + this.f12c;
        }
    }

    /* renamed from: a.a.a.b.b$e */
    public class e implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: b */
        public d<K, V> f15b;

        /* renamed from: c */
        public boolean f16c = true;

        public /* synthetic */ e(a aVar) {
        }

        @Override // p000a.p001a.p002a.p004b.C0004b.g
        /* renamed from: a */
        public void mo9a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f15b;
            if (dVar == dVar2) {
                this.f15b = dVar2.f14e;
                this.f16c = this.f15b == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16c) {
                return C0004b.this.f7b != null;
            }
            d<K, V> dVar = this.f15b;
            return (dVar == null || dVar.f13d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f16c) {
                this.f16c = false;
                this.f15b = C0004b.this.f7b;
            } else {
                d<K, V> dVar = this.f15b;
                this.f15b = dVar != null ? dVar.f13d : null;
            }
            return this.f15b;
        }
    }

    /* renamed from: a.a.a.b.b$f */
    public static abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: b */
        public d<K, V> f18b;

        /* renamed from: c */
        public d<K, V> f19c;

        public f(d<K, V> dVar, d<K, V> dVar2) {
            this.f18b = dVar2;
            this.f19c = dVar;
        }

        /* renamed from: a */
        public final d<K, V> m10a() {
            d<K, V> dVar = this.f19c;
            d<K, V> dVar2 = this.f18b;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return mo8c(dVar);
        }

        @Override // p000a.p001a.p002a.p004b.C0004b.g
        /* renamed from: a */
        public void mo9a(d<K, V> dVar) {
            d<K, V> dVar2 = null;
            if (this.f18b == dVar && dVar == this.f19c) {
                this.f19c = null;
                this.f18b = null;
            }
            d<K, V> dVar3 = this.f18b;
            if (dVar3 == dVar) {
                this.f18b = mo7b(dVar3);
            }
            d<K, V> dVar4 = this.f19c;
            if (dVar4 == dVar) {
                d<K, V> dVar5 = this.f18b;
                if (dVar4 != dVar5 && dVar5 != null) {
                    dVar2 = mo8c(dVar4);
                }
                this.f19c = dVar2;
            }
        }

        /* renamed from: b */
        public abstract d<K, V> mo7b(d<K, V> dVar);

        /* renamed from: c */
        public abstract d<K, V> mo8c(d<K, V> dVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            d<K, V> dVar = this.f19c;
            this.f19c = m10a();
            return dVar;
        }
    }

    /* renamed from: a.a.a.b.b$g */
    public interface g<K, V> {
        /* renamed from: a */
        void mo9a(d<K, V> dVar);
    }

    /* renamed from: a */
    public d<K, V> mo4a(K k) {
        d<K, V> dVar = this.f7b;
        while (dVar != null && !dVar.f11b.equals(k)) {
            dVar = dVar.f13d;
        }
        return dVar;
    }

    /* renamed from: a */
    public C0004b<K, V>.e m6a() {
        C0004b<K, V>.e eVar = new e(null);
        this.f9d.put(eVar, false);
        return eVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0004b)) {
            return false;
        }
        C0004b c0004b = (C0004b) obj;
        if (this.f10e != c0004b.f10e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0004b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        b bVar = new b(this.f7b, this.f8c);
        this.f9d.put(bVar, false);
        return bVar;
    }

    public V remove(K k) {
        d<K, V> mo4a = mo4a((C0004b<K, V>) k);
        if (mo4a == null) {
            return null;
        }
        this.f10e--;
        if (!this.f9d.isEmpty()) {
            Iterator<g<K, V>> it = this.f9d.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo9a(mo4a);
            }
        }
        d<K, V> dVar = mo4a.f14e;
        if (dVar != null) {
            dVar.f13d = mo4a.f13d;
        } else {
            this.f7b = mo4a.f13d;
        }
        d<K, V> dVar2 = mo4a.f13d;
        if (dVar2 != null) {
            dVar2.f14e = mo4a.f14e;
        } else {
            this.f8c = mo4a.f14e;
        }
        mo4a.f13d = null;
        mo4a.f14e = null;
        return mo4a.f12c;
    }

    public String toString() {
        StringBuilder m1134a = C0335a.m1134a("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            m1134a.append(it.next().toString());
            if (it.hasNext()) {
                m1134a.append(", ");
            }
        }
        m1134a.append("]");
        return m1134a.toString();
    }
}
