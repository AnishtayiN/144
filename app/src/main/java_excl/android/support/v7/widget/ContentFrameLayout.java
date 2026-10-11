package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p026a.C0158r;
import p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p035g.InterfaceC0232f0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f1855b;

    /* renamed from: c */
    public TypedValue f1856c;

    /* renamed from: d */
    public TypedValue f1857d;

    /* renamed from: e */
    public TypedValue f1858e;

    /* renamed from: f */
    public TypedValue f1859f;

    /* renamed from: g */
    public TypedValue f1860g;

    /* renamed from: h */
    public final Rect f1861h;

    /* renamed from: i */
    public InterfaceC0305a f1862i;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    public interface InterfaceC0305a {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1861h = new Rect();
    }

    /* renamed from: a */
    public void m1058a(int i, int i2, int i3, int i4) {
        this.f1861h.set(i, i2, i3, i4);
        if (C0119n.m475j(this)) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void m1059a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1859f == null) {
            this.f1859f = new TypedValue();
        }
        return this.f1859f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1860g == null) {
            this.f1860g = new TypedValue();
        }
        return this.f1860g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1857d == null) {
            this.f1857d = new TypedValue();
        }
        return this.f1857d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1858e == null) {
            this.f1858e = new TypedValue();
        }
        return this.f1858e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1855b == null) {
            this.f1855b = new TypedValue();
        }
        return this.f1855b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1856c == null) {
            this.f1856c = new TypedValue();
        }
        return this.f1856c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0305a interfaceC0305a = this.f1862i;
        if (interfaceC0305a != null) {
            ((C0158r) interfaceC0305a).m590a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C0201h c0201h;
        super.onDetachedFromWindow();
        InterfaceC0305a interfaceC0305a = this.f1862i;
        if (interfaceC0305a != null) {
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = ((C0158r) interfaceC0305a).f791a;
            InterfaceC0232f0 interfaceC0232f0 = layoutInflaterFactory2C0155o.f739j;
            if (interfaceC0232f0 != null) {
                interfaceC0232f0.mo814b();
            }
            if (layoutInflaterFactory2C0155o.f744o != null) {
                layoutInflaterFactory2C0155o.f732c.getDecorView().removeCallbacks(layoutInflaterFactory2C0155o.f745p);
                if (layoutInflaterFactory2C0155o.f744o.isShowing()) {
                    try {
                        layoutInflaterFactory2C0155o.f744o.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0155o.f744o = null;
            }
            layoutInflaterFactory2C0155o.m567d();
            LayoutInflaterFactory2C0155o.h m566d = layoutInflaterFactory2C0155o.m566d(0);
            if (m566d == null || (c0201h = m566d.f778j) == null) {
                return;
            }
            c0201h.m699a(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0305a interfaceC0305a) {
        this.f1862i = interfaceC0305a;
    }
}
