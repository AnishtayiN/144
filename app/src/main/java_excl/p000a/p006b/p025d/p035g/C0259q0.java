package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p000a.p006b.p025d.p033f.p034i.C0200g;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.C0204k;

/* renamed from: a.b.d.g.q0 */
/* loaded from: classes.dex */
public class C0259q0 extends C0255o0 implements InterfaceC0257p0 {

    /* renamed from: K */
    public static Method f1419K;

    /* renamed from: J */
    public InterfaceC0257p0 f1420J;

    /* renamed from: a.b.d.g.q0$a */
    public static class a extends C0241i0 {

        /* renamed from: p */
        public final int f1421p;

        /* renamed from: q */
        public final int f1422q;

        /* renamed from: r */
        public InterfaceC0257p0 f1423r;

        /* renamed from: s */
        public MenuItem f1424s;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1421p = 22;
                this.f1422q = 21;
            } else {
                this.f1421p = 21;
                this.f1422q = 22;
            }
        }

        @Override // p000a.p006b.p025d.p035g.C0241i0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0200g c0200g;
            int pointToPosition;
            int i2;
            if (this.f1423r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0200g = (C0200g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    c0200g = (C0200g) adapter;
                }
                C0204k c0204k = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0200g.getCount()) {
                    c0204k = c0200g.getItem(i2);
                }
                MenuItem menuItem = this.f1424s;
                if (menuItem != c0204k) {
                    C0201h c0201h = c0200g.f1072b;
                    if (menuItem != null) {
                        this.f1423r.mo684b(c0201h, menuItem);
                    }
                    this.f1424s = c0204k;
                    if (c0204k != null) {
                        this.f1423r.mo683a(c0201h, c0204k);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1421p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f1422q) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ((C0200g) getAdapter()).f1072b.m699a(false);
            return true;
        }

        public void setHoverListener(InterfaceC0257p0 interfaceC0257p0) {
            this.f1423r = interfaceC0257p0;
        }

        @Override // p000a.p006b.p025d.p035g.C0241i0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f1419K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0259q0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p000a.p006b.p025d.p035g.C0255o0
    /* renamed from: a */
    public C0241i0 mo885a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0257p0
    /* renamed from: a */
    public void mo683a(C0201h c0201h, MenuItem menuItem) {
        InterfaceC0257p0 interfaceC0257p0 = this.f1420J;
        if (interfaceC0257p0 != null) {
            interfaceC0257p0.mo683a(c0201h, menuItem);
        }
    }

    /* renamed from: a */
    public void m895a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1383F.setExitTransition((Transition) obj);
        }
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0257p0
    /* renamed from: b */
    public void mo684b(C0201h c0201h, MenuItem menuItem) {
        InterfaceC0257p0 interfaceC0257p0 = this.f1420J;
        if (interfaceC0257p0 != null) {
            interfaceC0257p0.mo684b(c0201h, menuItem);
        }
    }
}
