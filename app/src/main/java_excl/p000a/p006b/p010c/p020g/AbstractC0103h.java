package p000a.p006b.p010c.p020g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.b.c.g.h */
/* loaded from: classes.dex */
public abstract class AbstractC0103h<K, V> {

    /* renamed from: a */
    public AbstractC0103h<K, V>.b f561a;

    /* renamed from: b */
    public AbstractC0103h<K, V>.c f562b;

    /* renamed from: c */
    public AbstractC0103h<K, V>.e f563c;

    /* renamed from: a.b.c.g.h$a */
    public final class a<T> implements Iterator<T> {

        /* renamed from: b */
        public final int f564b;

        /* renamed from: c */
        public int f565c;

        /* renamed from: d */
        public int f566d;

        /* renamed from: e */
        public boolean f567e = false;

        public a(int i) {
            this.f564b = i;
            this.f565c = AbstractC0103h.this.mo387c();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f566d < this.f565c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC0103h.this.mo380a(this.f566d, this.f564b);
            this.f566d++;
            this.f567e = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f567e) {
                throw new IllegalStateException();
            }
            this.f566d--;
            this.f565c--;
            this.f567e = false;
            AbstractC0103h.this.mo383a(this.f566d);
        }
    }

    /* renamed from: a.b.c.g.h$b */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo387c = AbstractC0103h.this.mo387c();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0103h.this.mo384a((AbstractC0103h) entry.getKey(), (K) entry.getValue());
            }
            return mo387c != AbstractC0103h.this.mo387c();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0103h.this.mo382a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo379a = AbstractC0103h.this.mo379a(entry.getKey());
            if (mo379a < 0) {
                return false;
            }
            return C0099d.m397a(AbstractC0103h.this.mo380a(mo379a, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0103h.m409a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo387c = AbstractC0103h.this.mo387c() - 1; mo387c >= 0; mo387c--) {
                Object mo380a = AbstractC0103h.this.mo380a(mo387c, 0);
                Object mo380a2 = AbstractC0103h.this.mo380a(mo387c, 1);
                i += (mo380a == null ? 0 : mo380a.hashCode()) ^ (mo380a2 == null ? 0 : mo380a2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0103h.this.mo387c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0103h.this.mo387c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a.b.c.g.h$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0103h.this.mo382a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0103h.this.mo379a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> mo386b = AbstractC0103h.this.mo386b();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mo386b.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0103h.m409a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo387c = AbstractC0103h.this.mo387c() - 1; mo387c >= 0; mo387c--) {
                Object mo380a = AbstractC0103h.this.mo380a(mo387c, 0);
                i += mo380a == null ? 0 : mo380a.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0103h.this.mo387c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo379a = AbstractC0103h.this.mo379a(obj);
            if (mo379a < 0) {
                return false;
            }
            AbstractC0103h.this.mo383a(mo379a);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> mo386b = AbstractC0103h.this.mo386b();
            int size = mo386b.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mo386b.remove(it.next());
            }
            return size != mo386b.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0103h.m408a((Map) AbstractC0103h.this.mo386b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0103h.this.mo387c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0103h.this.m411b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0103h.this.m410a(tArr, 0);
        }
    }

    /* renamed from: a.b.c.g.h$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f571b;

        /* renamed from: d */
        public boolean f573d = false;

        /* renamed from: c */
        public int f572c = -1;

        public d() {
            this.f571b = AbstractC0103h.this.mo387c() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f573d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0099d.m397a(entry.getKey(), AbstractC0103h.this.mo380a(this.f572c, 0)) && C0099d.m397a(entry.getValue(), AbstractC0103h.this.mo380a(this.f572c, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f573d) {
                return (K) AbstractC0103h.this.mo380a(this.f572c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f573d) {
                return (V) AbstractC0103h.this.mo380a(this.f572c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f572c < this.f571b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f573d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo380a = AbstractC0103h.this.mo380a(this.f572c, 0);
            Object mo380a2 = AbstractC0103h.this.mo380a(this.f572c, 1);
            return (mo380a == null ? 0 : mo380a.hashCode()) ^ (mo380a2 != null ? mo380a2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f572c++;
            this.f573d = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f573d) {
                throw new IllegalStateException();
            }
            AbstractC0103h.this.mo383a(this.f572c);
            this.f572c--;
            this.f571b--;
            this.f573d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f573d) {
                return (V) AbstractC0103h.this.mo381a(this.f572c, (int) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: a.b.c.g.h$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0103h.this.mo382a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0103h.this.mo385b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0103h.this.mo387c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo385b = AbstractC0103h.this.mo385b(obj);
            if (mo385b < 0) {
                return false;
            }
            AbstractC0103h.this.mo383a(mo385b);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo387c = AbstractC0103h.this.mo387c();
            int i = 0;
            boolean z = false;
            while (i < mo387c) {
                if (collection.contains(AbstractC0103h.this.mo380a(i, 1))) {
                    AbstractC0103h.this.mo383a(i);
                    i--;
                    mo387c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo387c = AbstractC0103h.this.mo387c();
            int i = 0;
            boolean z = false;
            while (i < mo387c) {
                if (!collection.contains(AbstractC0103h.this.mo380a(i, 1))) {
                    AbstractC0103h.this.mo383a(i);
                    i--;
                    mo387c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0103h.this.mo387c();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0103h.this.m411b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0103h.this.m410a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m408a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public static <T> boolean m409a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract int mo379a(Object obj);

    /* renamed from: a */
    public abstract Object mo380a(int i, int i2);

    /* renamed from: a */
    public abstract V mo381a(int i, V v);

    /* renamed from: a */
    public abstract void mo382a();

    /* renamed from: a */
    public abstract void mo383a(int i);

    /* renamed from: a */
    public abstract void mo384a(K k, V v);

    /* renamed from: a */
    public <T> T[] m410a(T[] tArr, int i) {
        int mo387c = mo387c();
        if (tArr.length < mo387c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo387c));
        }
        for (int i2 = 0; i2 < mo387c; i2++) {
            tArr[i2] = mo380a(i2, i);
        }
        if (tArr.length > mo387c) {
            tArr[mo387c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    public abstract int mo385b(Object obj);

    /* renamed from: b */
    public abstract Map<K, V> mo386b();

    /* renamed from: b */
    public Object[] m411b(int i) {
        int mo387c = mo387c();
        Object[] objArr = new Object[mo387c];
        for (int i2 = 0; i2 < mo387c; i2++) {
            objArr[i2] = mo380a(i2, i);
        }
        return objArr;
    }

    /* renamed from: c */
    public abstract int mo387c();
}
