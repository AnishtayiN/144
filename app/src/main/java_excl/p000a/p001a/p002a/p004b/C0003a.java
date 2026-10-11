package p000a.p001a.p002a.p004b;

import java.util.HashMap;
import p000a.p001a.p002a.p004b.C0004b;

/* renamed from: a.a.a.b.a */
/* loaded from: classes.dex */
public class C0003a<K, V> extends C0004b<K, V> {

    /* renamed from: f */
    public HashMap<K, C0004b.d<K, V>> f6f = new HashMap<>();

    @Override // p000a.p001a.p002a.p004b.C0004b
    /* renamed from: a */
    public C0004b.d<K, V> mo4a(K k) {
        return this.f6f.get(k);
    }

    public boolean contains(K k) {
        return this.f6f.containsKey(k);
    }

    @Override // p000a.p001a.p002a.p004b.C0004b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f6f.remove(k);
        return v;
    }
}
