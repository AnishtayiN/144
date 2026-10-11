package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000a.p006b.p025d.p027b.C0175j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f1988b;

    /* renamed from: c */
    public int f1989c;

    /* renamed from: d */
    public WeakReference<View> f1990d;

    /* renamed from: e */
    public LayoutInflater f1991e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface InterfaceC0330a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1988b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.ViewStubCompat, i, 0);
        this.f1989c = obtainStyledAttributes.getResourceId(C0175j.ViewStubCompat_android_inflatedId, -1);
        this.f1988b = obtainStyledAttributes.getResourceId(C0175j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0175j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m1121a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1988b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1991e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1988b, viewGroup, false);
        int i = this.f1989c;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1990d = new WeakReference<>(inflate);
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1989c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1991e;
    }

    public int getLayoutResource() {
        return this.f1988b;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1989c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1991e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1988b = i;
    }

    public void setOnInflateListener(InterfaceC0330a interfaceC0330a) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1990d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m1121a();
        }
    }
}
