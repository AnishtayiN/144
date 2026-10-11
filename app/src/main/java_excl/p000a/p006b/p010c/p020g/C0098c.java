package p000a.p006b.p010c.p020g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000a.p006b.p010c.p020g.AbstractC0103h;

/* renamed from: a.b.c.g.c */
/* loaded from: classes.dex */
public final class C0098c<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f534f = new int[0];

    /* renamed from: g */
    public static final Object[] f535g = new Object[0];

    /* renamed from: h */
    public static Object[] f536h;

    /* renamed from: i */
    public static int f537i;

    /* renamed from: j */
    public static Object[] f538j;

    /* renamed from: k */
    public static int f539k;

    /* renamed from: b */
    public int[] f540b = f534f;

    /* renamed from: c */
    public Object[] f541c = f535g;

    /* renamed from: d */
    public int f542d = 0;

    /* renamed from: e */
    public AbstractC0103h<E, E> f543e;

    /* renamed from: a */
    public static void m388a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0098c.class) {
                if (f539k < 10) {
                    objArr[0] = f538j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f538j = objArr;
                    f539k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0098c.class) {
                if (f537i < 10) {
                    objArr[0] = f536h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f536h = objArr;
                    f537i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final int m389a() {
        int i = this.f542d;
        if (i == 0) {
            return -1;
        }
        int m395a = C0099d.m395a(this.f540b, i, 0);
        if (m395a < 0 || this.f541c[m395a] == null) {
            return m395a;
        }
        int i2 = m395a + 1;
        while (i2 < i && this.f540b[i2] == 0) {
            if (this.f541c[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m395a - 1; i3 >= 0 && this.f540b[i3] == 0; i3--) {
            if (this.f541c[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* renamed from: a */
    public int m390a(Object obj) {
        return obj == null ? m389a() : m391a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public final int m391a(Object obj, int i) {
        int i2 = this.f542d;
        if (i2 == 0) {
            return -1;
        }
        int m395a = C0099d.m395a(this.f540b, i2, i);
        if (m395a < 0 || obj.equals(this.f541c[m395a])) {
            return m395a;
        }
        int i3 = m395a + 1;
        while (i3 < i2 && this.f540b[i3] == i) {
            if (obj.equals(this.f541c[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m395a - 1; i4 >= 0 && this.f540b[i4] == i; i4--) {
            if (obj.equals(this.f541c[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    public final void m392a(int i) {
        if (i == 8) {
            synchronized (C0098c.class) {
                if (f538j != null) {
                    Object[] objArr = f538j;
                    this.f541c = objArr;
                    f538j = (Object[]) objArr[0];
                    this.f540b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f539k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0098c.class) {
                if (f536h != null) {
                    Object[] objArr2 = f536h;
                    this.f541c = objArr2;
                    f536h = (Object[]) objArr2[0];
                    this.f540b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f537i--;
                    return;
                }
            }
        }
        this.f540b = new int[i];
        this.f541c = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m391a;
        if (e == null) {
            m391a = m389a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m391a = m391a(e, hashCode);
        }
        if (m391a >= 0) {
            return false;
        }
        int i2 = m391a ^ (-1);
        int i3 = this.f542d;
        if (i3 >= this.f540b.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f540b;
            Object[] objArr = this.f541c;
            m392a(i4);
            int[] iArr2 = this.f540b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f541c, 0, objArr.length);
            }
            m388a(iArr, objArr, this.f542d);
        }
        int i5 = this.f542d;
        if (i2 < i5) {
            int[] iArr3 = this.f540b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f541c;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f542d - i2);
        }
        this.f540b[i2] = i;
        this.f541c[i2] = e;
        this.f542d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f542d;
        int[] iArr = this.f540b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f541c;
            m392a(size);
            int i = this.f542d;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f540b, 0, i);
                System.arraycopy(objArr, 0, this.f541c, 0, this.f542d);
            }
            m388a(iArr, objArr, this.f542d);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public E m393b(int i) {
        Object[] objArr = this.f541c;
        E e = (E) objArr[i];
        int i2 = this.f542d;
        if (i2 <= 1) {
            m388a(this.f540b, objArr, i2);
            this.f540b = f534f;
            this.f541c = f535g;
            this.f542d = 0;
        } else {
            int[] iArr = this.f540b;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f542d--;
                int i3 = this.f542d;
                if (i < i3) {
                    int[] iArr2 = this.f540b;
                    int i4 = i + 1;
                    System.arraycopy(iArr2, i4, iArr2, i, i3 - i);
                    Object[] objArr2 = this.f541c;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f542d - i);
                }
                this.f541c[this.f542d] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr3 = this.f540b;
                Object[] objArr3 = this.f541c;
                m392a(i5);
                this.f542d--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f540b, 0, i);
                    System.arraycopy(objArr3, 0, this.f541c, 0, i);
                }
                int i6 = this.f542d;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f540b, i, i6 - i);
                    System.arraycopy(objArr3, i7, this.f541c, i, this.f542d - i);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f542d;
        if (i != 0) {
            m388a(this.f540b, this.f541c, i);
            this.f540b = f534f;
            this.f541c = f535g;
            this.f542d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m390a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f542d != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f542d; i++) {
                try {
                    if (!set.contains(this.f541c[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f540b;
        int i = this.f542d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f542d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f543e == null) {
            this.f543e = new C0097b(this);
        }
        AbstractC0103h<E, E> abstractC0103h = this.f543e;
        if (abstractC0103h.f562b == null) {
            abstractC0103h.f562b = new AbstractC0103h.c();
        }
        return abstractC0103h.f562b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int m390a = m390a(obj);
        if (m390a < 0) {
            return false;
        }
        m393b(m390a);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f542d - 1; i >= 0; i--) {
            if (!collection.contains(this.f541c[i])) {
                m393b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f542d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f542d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f541c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f542d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f542d));
        }
        System.arraycopy(this.f541c, 0, tArr, 0, this.f542d);
        int length = tArr.length;
        int i = this.f542d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f542d * 14);
        sb.append('{');
        for (int i = 0; i < this.f542d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f541c[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
