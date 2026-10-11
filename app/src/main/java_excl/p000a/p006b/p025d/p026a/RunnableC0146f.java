package p000a.p006b.p025d.p026a;

import android.support.v7.app.AlertController;
import android.view.View;

/* renamed from: a.b.d.a.f */
/* loaded from: classes.dex */
public class RunnableC0146f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f691b;

    /* renamed from: c */
    public final /* synthetic */ View f692c;

    /* renamed from: d */
    public final /* synthetic */ AlertController f693d;

    public RunnableC0146f(AlertController alertController, View view, View view2) {
        this.f693d = alertController;
        this.f691b = view;
        this.f692c = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m1004a(this.f693d.f1663g, this.f691b, this.f692c);
    }
}
