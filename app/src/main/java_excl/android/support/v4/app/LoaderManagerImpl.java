package android.support.v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p001a.p005b.AbstractC0017m;
import p000a.p001a.p005b.C0014j;
import p000a.p001a.p005b.C0019o;
import p000a.p001a.p005b.InterfaceC0010f;
import p000a.p001a.p005b.InterfaceC0015k;
import p000a.p001a.p005b.InterfaceC0018n;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p011a.AbstractC0038c0;
import p000a.p006b.p010c.p012b.InterfaceC0068b;
import p000a.p006b.p010c.p020g.C0105j;

/* loaded from: classes.dex */
public class LoaderManagerImpl extends AbstractC0038c0 {

    /* renamed from: a */
    public final InterfaceC0010f f1592a;

    /* renamed from: b */
    public final LoaderViewModel f1593b;

    public static class LoaderViewModel extends AbstractC0017m {

        /* renamed from: b */
        public static final InterfaceC0018n f1594b = new C0281a();

        /* renamed from: a */
        public C0105j<C0282a> f1595a = new C0105j<>(10);

        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$a */
        public static class C0281a implements InterfaceC0018n {
            /* renamed from: a */
            public <T extends AbstractC0017m> T m974a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        @Override // p000a.p001a.p005b.AbstractC0017m
        /* renamed from: a */
        public void mo27a() {
            if (this.f1595a.m424b() > 0) {
                this.f1595a.m429d(0).m975a(true);
                throw null;
            }
            C0105j<C0282a> c0105j = this.f1595a;
            int i = c0105j.f587e;
            Object[] objArr = c0105j.f586d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            c0105j.f587e = 0;
            c0105j.f584b = false;
        }

        /* renamed from: a */
        public void m972a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1595a.m424b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f1595a.m424b() <= 0) {
                    return;
                }
                C0282a m429d = this.f1595a.m429d(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1595a.m425b(0));
                printWriter.print(": ");
                printWriter.println(m429d.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(m429d.f1596j);
                printWriter.print(" mArgs=");
                printWriter.println(m429d.f1597k);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                String str3 = str2 + "  ";
                throw null;
            }
        }

        /* renamed from: b */
        public void m973b() {
            int m424b = this.f1595a.m424b();
            for (int i = 0; i < m424b; i++) {
                InterfaceC0010f interfaceC0010f = this.f1595a.m429d(i).f1598l;
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0282a<D> extends C0014j<D> implements InterfaceC0068b<D> {

        /* renamed from: j */
        public final int f1596j;

        /* renamed from: k */
        public final Bundle f1597k;

        /* renamed from: l */
        public InterfaceC0010f f1598l;

        @Override // android.arch.lifecycle.LiveData
        /* renamed from: a */
        public void mo962a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        /* renamed from: a */
        public void mo963a(InterfaceC0015k<? super D> interfaceC0015k) {
            super.mo963a((InterfaceC0015k) interfaceC0015k);
            this.f1598l = null;
        }

        @Override // p000a.p001a.p005b.C0014j, android.arch.lifecycle.LiveData
        /* renamed from: a */
        public void mo23a(D d) {
            super.mo23a((C0282a<D>) d);
        }

        /* JADX WARN: Incorrect return type in method signature: (Z)Ljava/lang/Object<TD;>; */
        /* renamed from: a */
        public void m975a(boolean z) {
            throw null;
        }

        @Override // android.arch.lifecycle.LiveData
        /* renamed from: b */
        public void mo965b() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1596j);
            sb.append(" : ");
            C0027d.m78a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public LoaderManagerImpl(InterfaceC0010f interfaceC0010f, C0019o c0019o) {
        AbstractC0017m put;
        this.f1592a = interfaceC0010f;
        InterfaceC0018n interfaceC0018n = LoaderViewModel.f1594b;
        String canonicalName = LoaderViewModel.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
        AbstractC0017m abstractC0017m = c0019o.f38a.get(str);
        if (!LoaderViewModel.class.isInstance(abstractC0017m) && (put = c0019o.f38a.put(str, (abstractC0017m = ((LoaderViewModel.C0281a) interfaceC0018n).m974a(LoaderViewModel.class)))) != null) {
            put.mo27a();
        }
        this.f1593b = (LoaderViewModel) abstractC0017m;
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0038c0
    @Deprecated
    /* renamed from: a */
    public void mo158a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1593b.m972a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0027d.m78a((Object) this.f1592a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
