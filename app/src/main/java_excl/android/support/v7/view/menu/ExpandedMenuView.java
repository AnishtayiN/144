package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.C0204k;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0201h.b, InterfaceC0210q, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public static final int[] f1748d = {R.attr.background, R.attr.divider};

    /* renamed from: b */
    public C0201h f1749b;

    /* renamed from: c */
    public int f1750c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1748d, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C0181a.m618c(context, resourceId2));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider((!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) ? obtainStyledAttributes.getDrawable(1) : C0181a.m618c(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q
    /* renamed from: a */
    public void mo738a(C0201h c0201h) {
        this.f1749b = c0201h;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h.b
    /* renamed from: a */
    public boolean mo717a(C0204k c0204k) {
        return this.f1749b.m703a(c0204k, (InterfaceC0209p) null, 0);
    }

    public int getWindowAnimations() {
        return this.f1750c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo717a((C0204k) getAdapter().getItem(i));
    }
}
