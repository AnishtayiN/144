package p000a.p006b.p010c.p020g;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: a.b.c.g.i */
/* loaded from: classes.dex */
public class C0104i<K, V> {

    /* renamed from: e */
    public static Object[] f576e;

    /* renamed from: f */
    public static int f577f;

    /* renamed from: g */
    public static Object[] f578g;

    /* renamed from: h */
    public static int f579h;

    /* renamed from: b */
    public int[] f580b;

    /* renamed from: c */
    public Object[] f581c;

    /* renamed from: d */
    public int f582d;

    public C0104i() {
        this.f580b = C0099d.f544a;
        this.f581c = C0099d.f546c;
        this.f582d = 0;
    }

    public C0104i(int i) {
        if (i == 0) {
            this.f580b = C0099d.f544a;
            this.f581c = C0099d.f546c;
        } else {
            m416a(i);
        }
        this.f582d = 0;
    }

    /* renamed from: a */
    public static void m412a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0096a.class) {
                if (f579h < 10) {
                    objArr[0] = f578g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f578g = objArr;
                    f579h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0096a.class) {
                if (f577f < 10) {
                    objArr[0] = f576e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f576e = objArr;
                    f577f++;
                }
            }
        }
    }

    /* renamed from: a */
    public int m413a() {
        int i = this.f582d;
        if (i == 0) {
            return -1;
        }
        try {
            int m395a = C0099d.m395a(this.f580b, i, 0);
            if (m395a < 0 || this.f581c[m395a << 1] == null) {
                return m395a;
            }
            int i2 = m395a + 1;
            while (i2 < i && this.f580b[i2] == 0) {
                if (this.f581c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m395a - 1; i3 >= 0 && this.f580b[i3] == 0; i3--) {
                if (this.f581c[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public int m414a(Object obj) {
        return obj == null ? m413a() : m415a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public int m415a(Object obj, int i) {
        int i2 = this.f582d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m395a = C0099d.m395a(this.f580b, i2, i);
            if (m395a < 0 || obj.equals(this.f581c[m395a << 1])) {
                return m395a;
            }
            int i3 = m395a + 1;
            while (i3 < i2 && this.f580b[i3] == i) {
                if (obj.equals(this.f581c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m395a - 1; i4 >= 0 && this.f580b[i4] == i; i4--) {
                if (obj.equals(this.f581c[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public final void m416a(int i) {
        if (i == 8) {
            synchronized (C0096a.class) {
                if (f578g != null) {
                    Object[] objArr = f578g;
                    this.f581c = objArr;
                    f578g = (Object[]) objArr[0];
                    this.f580b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f579h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0096a.class) {
                if (f576e != null) {
                    Object[] objArr2 = f576e;
                    this.f581c = objArr2;
                    f576e = (Object[]) objArr2[0];
                    this.f580b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f577f--;
                    return;
                }
            }
        }
        this.f580b = new int[i];
        this.f581c = new Object[i << 1];
    }

    /* renamed from: b */
    public int m417b(Object obj) {
        int i = this.f582d * 2;
        Object[] objArr = this.f581c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K m418b(int i) {
        return (K) this.f581c[i << 1];
    }

    /* renamed from: c */
    public V m419c(int i) {
        int i2;
        Object[] objArr = this.f581c;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f582d;
        if (i4 <= 1) {
            m412a(this.f580b, objArr, i4);
            this.f580b = C0099d.f544a;
            this.f581c = C0099d.f546c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f580b;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f580b;
                    int i5 = i + 1;
                    int i6 = i2 - i;
                    System.arraycopy(iArr2, i5, iArr2, i, i6);
                    Object[] objArr2 = this.f581c;
                    System.arraycopy(objArr2, i5 << 1, objArr2, i3, i6 << 1);
                }
                Object[] objArr3 = this.f581c;
                int i7 = i2 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                int i8 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] iArr3 = this.f580b;
                Object[] objArr4 = this.f581c;
                m416a(i8);
                if (i4 != this.f582d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f580b, 0, i);
                    System.arraycopy(objArr4, 0, this.f581c, 0, i3);
                }
                if (i < i2) {
                    int i9 = i + 1;
                    int i10 = i2 - i;
                    System.arraycopy(iArr3, i9, this.f580b, i, i10);
                    System.arraycopy(objArr4, i9 << 1, this.f581c, i3, i10 << 1);
                }
            }
        }
        if (i4 != this.f582d) {
            throw new ConcurrentModificationException();
        }
        this.f582d = i2;
        return v;
    }

    public void clear() {
        int i = this.f582d;
        if (i > 0) {
            int[] iArr = this.f580b;
            Object[] objArr = this.f581c;
            this.f580b = C0099d.f544a;
            this.f581c = C0099d.f546c;
            this.f582d = 0;
            m412a(iArr, objArr, i);
        }
        if (this.f582d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m414a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m417b(obj) >= 0;
    }

    /* renamed from: d */
    public V m420d(int i) {
        return (V) this.f581c[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0104i) {
            C0104i c0104i = (C0104i) obj;
            if (this.f582d != c0104i.f582d) {
                return false;
            }
            for (int i = 0; i < this.f582d; i++) {
                try {
                    K m418b = m418b(i);
                    V m420d = m420d(i);
                    Object obj2 = c0104i.get(m418b);
                    if (m420d == null) {
                        if (obj2 != null || !c0104i.containsKey(m418b)) {
                            return false;
                        }
                    } else if (!m420d.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f582d != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f582d; i2++) {
                try {
                    K m418b2 = m418b(i2);
                    V m420d2 = m420d(i2);
                    Object obj3 = map.get(m418b2);
                    if (m420d2 == null) {
                        if (obj3 != null || !map.containsKey(m418b2)) {
                            return false;
                        }
                    } else if (!m420d2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int m414a = m414a(obj);
        if (m414a >= 0) {
            return (V) this.f581c[(m414a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f580b;
        Object[] objArr = this.f581c;
        int i = this.f582d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f582d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int m415a;
        int i2 = this.f582d;
        if (k == null) {
            m415a = m413a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m415a = m415a(k, hashCode);
        }
        if (m415a >= 0) {
            int i3 = (m415a << 1) + 1;
            Object[] objArr = this.f581c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = m415a ^ (-1);
        if (i2 >= this.f580b.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f580b;
            Object[] objArr2 = this.f581c;
            m416a(i5);
            if (i2 != this.f582d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f580b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f581c, 0, objArr2.length);
            }
            m412a(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f580b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f581c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f582d - i4) << 1);
        }
        int i7 = this.f582d;
        if (i2 == i7) {
            int[] iArr4 = this.f580b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f581c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f582d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int m414a = m414a(obj);
        if (m414a >= 0) {
            return m419c(m414a);
        }
        return null;
    }

    public int size() {
        return this.f582d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f582d * 28);
        sb.append('{');
        for (int i = 0; i < this.f582d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m418b = m418b(i);
            if (m418b != this) {
                sb.append(m418b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m420d = m420d(i);
            if (m420d != this) {
                sb.append(m420d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
