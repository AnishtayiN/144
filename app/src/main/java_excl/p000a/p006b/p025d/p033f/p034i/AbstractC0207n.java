package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: a.b.d.f.i.n */
/* loaded from: classes.dex */
public abstract class AbstractC0207n implements InterfaceC0212s, InterfaceC0209p, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f1148b;

    /* renamed from: a */
    public static int m729a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m730b(C0201h c0201h) {
        int size = c0201h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0201h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo669a(int i);

    /* renamed from: a */
    public abstract void mo670a(C0201h c0201h);

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo661a(Context context, C0201h c0201h) {
    }

    /* renamed from: a */
    public abstract void mo671a(View view);

    /* renamed from: a */
    public abstract void mo672a(PopupWindow.OnDismissListener onDismissListener);

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo663a(C0201h c0201h, C0204k c0204k) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo674b(int i);

    /* renamed from: b */
    public abstract void mo675b(boolean z);

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: b */
    public boolean mo666b(C0201h c0201h, C0204k c0204k) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo678c(int i);

    /* renamed from: c */
    public abstract void mo680c(boolean z);

    /* renamed from: e */
    public boolean mo682e() {
        return true;
    }

    /* renamed from: f */
    public Rect m731f() {
        return this.f1148b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0200g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0200g) listAdapter).f1072b.m703a((MenuItem) listAdapter.getItem(i), this, mo682e() ? 0 : 4);
    }
}
