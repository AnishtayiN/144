package p000a.p006b.p010c.p020g;

/* renamed from: a.b.c.g.j */
/* loaded from: classes.dex */
public class C0105j<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f583f = new Object();

    /* renamed from: b */
    public boolean f584b;

    /* renamed from: c */
    public int[] f585c;

    /* renamed from: d */
    public Object[] f586d;

    /* renamed from: e */
    public int f587e;

    public C0105j() {
        this(10);
    }

    public C0105j(int i) {
        this.f584b = false;
        if (i == 0) {
            this.f585c = C0099d.f544a;
            this.f586d = C0099d.f546c;
        } else {
            int m398b = C0099d.m398b(i);
            this.f585c = new int[m398b];
            this.f586d = new Object[m398b];
        }
        this.f587e = 0;
    }

    /* renamed from: a */
    public E m421a(int i) {
        return m426b(i, null);
    }

    /* renamed from: a */
    public final void m422a() {
        int i = this.f587e;
        int[] iArr = this.f585c;
        Object[] objArr = this.f586d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f583f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f584b = false;
        this.f587e = i2;
    }

    /* renamed from: a */
    public void m423a(int i, E e) {
        int i2 = this.f587e;
        if (i2 != 0 && i <= this.f585c[i2 - 1]) {
            m428c(i, e);
            return;
        }
        if (this.f584b && this.f587e >= this.f585c.length) {
            m422a();
        }
        int i3 = this.f587e;
        if (i3 >= this.f585c.length) {
            int m398b = C0099d.m398b(i3 + 1);
            int[] iArr = new int[m398b];
            Object[] objArr = new Object[m398b];
            int[] iArr2 = this.f585c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f586d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f585c = iArr;
            this.f586d = objArr;
        }
        this.f585c[i3] = i;
        this.f586d[i3] = e;
        this.f587e = i3 + 1;
    }

    /* renamed from: b */
    public int m424b() {
        if (this.f584b) {
            m422a();
        }
        return this.f587e;
    }

    /* renamed from: b */
    public int m425b(int i) {
        if (this.f584b) {
            m422a();
        }
        return this.f585c[i];
    }

    /* renamed from: b */
    public E m426b(int i, E e) {
        int m395a = C0099d.m395a(this.f585c, this.f587e, i);
        if (m395a >= 0) {
            Object[] objArr = this.f586d;
            if (objArr[m395a] != f583f) {
                return (E) objArr[m395a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public void m427c(int i) {
        int m395a = C0099d.m395a(this.f585c, this.f587e, i);
        if (m395a >= 0) {
            Object[] objArr = this.f586d;
            Object obj = objArr[m395a];
            Object obj2 = f583f;
            if (obj != obj2) {
                objArr[m395a] = obj2;
                this.f584b = true;
            }
        }
    }

    /* renamed from: c */
    public void m428c(int i, E e) {
        int m395a = C0099d.m395a(this.f585c, this.f587e, i);
        if (m395a >= 0) {
            this.f586d[m395a] = e;
            return;
        }
        int i2 = m395a ^ (-1);
        if (i2 < this.f587e) {
            Object[] objArr = this.f586d;
            if (objArr[i2] == f583f) {
                this.f585c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f584b && this.f587e >= this.f585c.length) {
            m422a();
            i2 = C0099d.m395a(this.f585c, this.f587e, i) ^ (-1);
        }
        int i3 = this.f587e;
        if (i3 >= this.f585c.length) {
            int m398b = C0099d.m398b(i3 + 1);
            int[] iArr = new int[m398b];
            Object[] objArr2 = new Object[m398b];
            int[] iArr2 = this.f585c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f586d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f585c = iArr;
            this.f586d = objArr2;
        }
        int i4 = this.f587e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f585c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f586d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f587e - i2);
        }
        this.f585c[i2] = i;
        this.f586d[i2] = e;
        this.f587e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C0105j<E> m1892clone() {
        try {
            C0105j<E> c0105j = (C0105j) super.clone();
            c0105j.f585c = (int[]) this.f585c.clone();
            c0105j.f586d = (Object[]) this.f586d.clone();
            return c0105j;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public E m429d(int i) {
        if (this.f584b) {
            m422a();
        }
        return (E) this.f586d[i];
    }

    public String toString() {
        if (m424b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f587e * 28);
        sb.append('{');
        for (int i = 0; i < this.f587e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m425b(i));
            sb.append('=');
            E m429d = m429d(i);
            if (m429d != this) {
                sb.append(m429d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
