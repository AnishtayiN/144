package p000a.p006b.p025d.p026a;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: a.b.d.a.i */
/* loaded from: classes.dex */
public class C0149i implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController f701b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0287b f702c;

    public C0149i(AlertController.C0287b c0287b, AlertController alertController) {
        this.f702c = c0287b;
        this.f701b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f702c.f1723x.onClick(this.f701b.f1658b, i);
        if (this.f702c.f1693H) {
            return;
        }
        this.f701b.f1658b.dismiss();
    }
}
