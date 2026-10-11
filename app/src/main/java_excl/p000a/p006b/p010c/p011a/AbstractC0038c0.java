package p000a.p006b.p010c.p011a;

import android.support.v4.app.LoaderManagerImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p001a.p005b.InterfaceC0010f;
import p000a.p001a.p005b.InterfaceC0020p;

/* renamed from: a.b.c.a.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC0038c0 {
    /* renamed from: a */
    public static <T extends InterfaceC0010f & InterfaceC0020p> AbstractC0038c0 m157a(T t) {
        return new LoaderManagerImpl(t, t.mo29b());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo158a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
