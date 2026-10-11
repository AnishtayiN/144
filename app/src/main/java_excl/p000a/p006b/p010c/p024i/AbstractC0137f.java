package p000a.p006b.p010c.p024i;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.c.i.f */
/* loaded from: classes.dex */
public abstract class AbstractC0137f extends AbstractC0134c {

    /* renamed from: j */
    public int f674j;

    /* renamed from: k */
    public int f675k;

    /* renamed from: l */
    public LayoutInflater f676l;

    @Deprecated
    public AbstractC0137f(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f675k = i;
        this.f674j = i;
        this.f676l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p000a.p006b.p010c.p024i.AbstractC0134c
    /* renamed from: a */
    public View mo510a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f676l.inflate(this.f674j, viewGroup, false);
    }
}
