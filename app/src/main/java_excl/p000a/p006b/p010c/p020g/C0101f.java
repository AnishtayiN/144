package p000a.p006b.p010c.p020g;

/* renamed from: a.b.c.g.f */
/* loaded from: classes.dex */
public class C0101f<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f549f = new Object();

    /* renamed from: b */
    public boolean f550b = false;

    /* renamed from: c */
    public long[] f551c;

    /* renamed from: d */
    public Object[] f552d;

    /* renamed from: e */
    public int f553e;

    public C0101f() {
        int m399c = C0099d.m399c(10);
        this.f551c = new long[m399c];
        this.f552d = new Object[m399c];
        this.f553e = 0;
    }

    /* renamed from: a */
    public final void m401a() {
        int i = this.f553e;
        long[] jArr = this.f551c;
        Object[] objArr = this.f552d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f549f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f550b = false;
        this.f553e = i2;
    }

    /* renamed from: a */
    public void m402a(long j, E e) {
        int i = this.f553e;
        if (i != 0 && j <= this.f551c[i - 1]) {
            m404c(j, e);
            return;
        }
        if (this.f550b && this.f553e >= this.f551c.length) {
            m401a();
        }
        int i2 = this.f553e;
        if (i2 >= this.f551c.length) {
            int m399c = C0099d.m399c(i2 + 1);
            long[] jArr = new long[m399c];
            Object[] objArr = new Object[m399c];
            long[] jArr2 = this.f551c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f552d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f551c = jArr;
            this.f552d = objArr;
        }
        this.f551c[i2] = j;
        this.f552d[i2] = e;
        this.f553e = i2 + 1;
    }

    /* renamed from: b */
    public E m403b(long j, E e) {
        int m396a = C0099d.m396a(this.f551c, this.f553e, j);
        if (m396a >= 0) {
            Object[] objArr = this.f552d;
            if (objArr[m396a] != f549f) {
                return (E) objArr[m396a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public void m404c(long j, E e) {
        int m396a = C0099d.m396a(this.f551c, this.f553e, j);
        if (m396a >= 0) {
            this.f552d[m396a] = e;
            return;
        }
        int i = m396a ^ (-1);
        if (i < this.f553e) {
            Object[] objArr = this.f552d;
            if (objArr[i] == f549f) {
                this.f551c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f550b && this.f553e >= this.f551c.length) {
            m401a();
            i = C0099d.m396a(this.f551c, this.f553e, j) ^ (-1);
        }
        int i2 = this.f553e;
        if (i2 >= this.f551c.length) {
            int m399c = C0099d.m399c(i2 + 1);
            long[] jArr = new long[m399c];
            Object[] objArr2 = new Object[m399c];
            long[] jArr2 = this.f551c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f552d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f551c = jArr;
            this.f552d = objArr2;
        }
        int i3 = this.f553e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f551c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f552d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f553e - i);
        }
        this.f551c[i] = j;
        this.f552d[i] = e;
        this.f553e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C0101f<E> m1891clone() {
        try {
            C0101f<E> c0101f = (C0101f) super.clone();
            c0101f.f551c = (long[]) this.f551c.clone();
            c0101f.f552d = (Object[]) this.f552d.clone();
            return c0101f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (this.f550b) {
            m401a();
        }
        int i = this.f553e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f553e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f550b) {
                m401a();
            }
            sb.append(this.f551c[i2]);
            sb.append('=');
            if (this.f550b) {
                m401a();
            }
            Object obj = this.f552d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
