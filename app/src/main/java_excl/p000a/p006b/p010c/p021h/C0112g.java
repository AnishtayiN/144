package p000a.p006b.p010c.p021h;

import android.view.View;
import android.view.ViewParent;

/* renamed from: a.b.c.h.g */
/* loaded from: classes.dex */
public class C0112g {

    /* renamed from: a */
    public ViewParent f598a;

    /* renamed from: b */
    public ViewParent f599b;

    /* renamed from: c */
    public final View f600c;

    /* renamed from: d */
    public boolean f601d;

    /* renamed from: e */
    public int[] f602e;

    public C0112g(View view) {
        this.f600c = view;
    }

    /* renamed from: a */
    public final ViewParent m444a(int i) {
        if (i == 0) {
            return this.f598a;
        }
        if (i != 1) {
            return null;
        }
        return this.f599b;
    }

    /* renamed from: a */
    public final void m445a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f598a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f599b = viewParent;
        }
    }

    /* renamed from: b */
    public boolean m446b(int i) {
        return m444a(i) != null;
    }
}
