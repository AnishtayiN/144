package p000a.p001a.p005b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p001a.p005b.AbstractC0008d;

/* renamed from: a.a.b.b */
/* loaded from: classes.dex */
public class C0006b {

    /* renamed from: a */
    public final int f21a;

    /* renamed from: b */
    public final Method f22b;

    /* renamed from: a */
    public void m12a(InterfaceC0010f interfaceC0010f, AbstractC0008d.a aVar, Object obj) {
        try {
            int i = this.f21a;
            if (i == 0) {
                this.f22b.invoke(obj, new Object[0]);
            } else if (i == 1) {
                this.f22b.invoke(obj, interfaceC0010f);
            } else {
                if (i != 2) {
                    return;
                }
                this.f22b.invoke(obj, interfaceC0010f, aVar);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("Failed to call observer method", e2.getCause());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0006b.class != obj.getClass()) {
            return false;
        }
        C0006b c0006b = (C0006b) obj;
        return this.f21a == c0006b.f21a && this.f22b.getName().equals(c0006b.f22b.getName());
    }

    public int hashCode() {
        return this.f22b.getName().hashCode() + (this.f21a * 31);
    }
}
