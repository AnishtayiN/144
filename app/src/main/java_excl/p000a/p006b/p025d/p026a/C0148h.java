package p000a.p006b.p025d.p026a;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* renamed from: a.b.d.a.h */
/* loaded from: classes.dex */
public class C0148h extends CursorAdapter {

    /* renamed from: b */
    public final int f696b;

    /* renamed from: c */
    public final int f697c;

    /* renamed from: d */
    public final /* synthetic */ AlertController.RecycleListView f698d;

    /* renamed from: e */
    public final /* synthetic */ AlertController f699e;

    /* renamed from: f */
    public final /* synthetic */ AlertController.C0287b f700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148h(AlertController.C0287b c0287b, Context context, Cursor cursor, boolean z, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, z);
        this.f700f = c0287b;
        this.f698d = recycleListView;
        this.f699e = alertController;
        Cursor cursor2 = getCursor();
        this.f696b = cursor2.getColumnIndexOrThrow(this.f700f.f1697L);
        this.f697c = cursor2.getColumnIndexOrThrow(this.f700f.f1698M);
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f696b));
        this.f698d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f697c) == 1);
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f700f.f1701b.inflate(this.f699e.f1650M, viewGroup, false);
    }
}
