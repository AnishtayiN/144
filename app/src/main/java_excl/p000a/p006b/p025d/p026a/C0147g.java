package p000a.p006b.p025d.p026a;

import android.content.Context;
import android.support.v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* renamed from: a.b.d.a.g */
/* loaded from: classes.dex */
public class C0147g extends ArrayAdapter<CharSequence> {

    /* renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f694b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0287b f695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147g(AlertController.C0287b c0287b, Context context, int i, int i2, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, i2, charSequenceArr);
        this.f695c = c0287b;
        this.f694b = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f695c.f1691F;
        if (zArr != null && zArr[i]) {
            this.f694b.setItemChecked(i, true);
        }
        return view2;
    }
}
