package p000a.p006b.p025d.p026a;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AbsListView;

/* renamed from: a.b.d.a.e */
/* loaded from: classes.dex */
public class C0145e implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ View f689a;

    /* renamed from: b */
    public final /* synthetic */ View f690b;

    public C0145e(AlertController alertController, View view, View view2) {
        this.f689a = view;
        this.f690b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m1004a(absListView, this.f689a, this.f690b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
