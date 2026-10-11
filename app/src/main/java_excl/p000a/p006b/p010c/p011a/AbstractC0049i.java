package p000a.p006b.p010c.p011a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import p000a.p006b.p008b.p009a.C0027d;

/* renamed from: a.b.c.a.i */
/* loaded from: classes.dex */
public abstract class AbstractC0049i<E> extends AbstractC0045g {

    /* renamed from: a */
    public final Activity f288a;

    /* renamed from: b */
    public final Context f289b;

    /* renamed from: c */
    public final Handler f290c;

    /* renamed from: d */
    public final LayoutInflaterFactory2C0051k f291d;

    public AbstractC0049i(ActivityC0043f activityC0043f) {
        Handler handler = activityC0043f.f270c;
        this.f291d = new LayoutInflaterFactory2C0051k();
        this.f288a = activityC0043f;
        C0027d.m57a(activityC0043f, (Object) "context == null");
        this.f289b = activityC0043f;
        C0027d.m57a(handler, "handler == null");
        this.f290c = handler;
    }
}
