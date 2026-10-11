package p000a.p006b.p025d.p026a;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: a.b.d.a.j */
/* loaded from: classes.dex */
public class C0150j implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f703b;

    /* renamed from: c */
    public final /* synthetic */ AlertController f704c;

    /* renamed from: d */
    public final /* synthetic */ AlertController.C0287b f705d;

    public C0150j(AlertController.C0287b c0287b, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f705d = c0287b;
        this.f703b = recycleListView;
        this.f704c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f705d.f1691F;
        if (zArr != null) {
            zArr[i] = this.f703b.isItemChecked(i);
        }
        this.f705d.f1695J.onClick(this.f704c.f1658b, i, this.f703b.isItemChecked(i));
    }
}
