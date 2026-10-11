package p000a.p006b.p025d.p026a;

import android.support.v7.app.AlertController;
import android.view.View;

/* renamed from: a.b.d.a.d */
/* loaded from: classes.dex */
public class RunnableC0144d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f686b;

    /* renamed from: c */
    public final /* synthetic */ View f687c;

    /* renamed from: d */
    public final /* synthetic */ AlertController f688d;

    public RunnableC0144d(AlertController alertController, View view, View view2) {
        this.f688d = alertController;
        this.f686b = view;
        this.f687c = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m1004a(this.f688d.f1638A, this.f686b, this.f687c);
    }
}
