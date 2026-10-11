package p000a.p006b.p025d.p026a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.AbstractC0186a;

/* renamed from: a.b.d.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0141a {

    /* renamed from: a.b.d.a.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f683a;

        public a(int i, int i2) {
            super(i, i2);
            this.f683a = 0;
            this.f683a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f683a = 0;
            this.f683a = aVar.f683a;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f683a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.ActionBarLayout);
            this.f683a = obtainStyledAttributes.getInt(C0175j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f683a = 0;
        }
    }

    /* renamed from: a.b.d.a.a$b */
    public interface b {
        /* renamed from: a */
        void m526a(boolean z);
    }

    @Deprecated
    /* renamed from: a.b.d.a.a$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m527a();

        /* renamed from: b */
        public abstract View m528b();

        /* renamed from: c */
        public abstract Drawable m529c();

        /* renamed from: d */
        public abstract CharSequence m530d();

        /* renamed from: e */
        public abstract void m531e();
    }

    /* renamed from: a */
    public abstract AbstractC0186a mo515a(AbstractC0186a.a aVar);

    /* renamed from: a */
    public abstract void mo516a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo517a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo518a(boolean z);

    /* renamed from: a */
    public abstract boolean mo519a();

    /* renamed from: a */
    public abstract boolean mo520a(int i, KeyEvent keyEvent);

    /* renamed from: b */
    public abstract int mo521b();

    /* renamed from: b */
    public abstract void mo522b(boolean z);

    /* renamed from: c */
    public abstract Context mo523c();

    /* renamed from: c */
    public abstract void mo524c(boolean z);

    /* renamed from: d */
    public void m525d() {
    }
}
