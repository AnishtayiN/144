package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0121p;
import p000a.p006b.p010c.p021h.InterfaceC0122q;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.p034i.C0201h;

/* renamed from: a.b.d.g.a */
/* loaded from: classes.dex */
public abstract class AbstractC0216a extends ViewGroup {

    /* renamed from: b */
    public final a f1187b;

    /* renamed from: c */
    public final Context f1188c;

    /* renamed from: d */
    public ActionMenuView f1189d;

    /* renamed from: e */
    public C0222c f1190e;

    /* renamed from: f */
    public int f1191f;

    /* renamed from: g */
    public C0121p f1192g;

    /* renamed from: h */
    public boolean f1193h;

    /* renamed from: i */
    public boolean f1194i;

    /* renamed from: a.b.d.g.a$a */
    public class a implements InterfaceC0122q {

        /* renamed from: a */
        public boolean f1195a = false;

        /* renamed from: b */
        public int f1196b;

        public a() {
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: a */
        public void mo495a(View view) {
            if (this.f1195a) {
                return;
            }
            AbstractC0216a abstractC0216a = AbstractC0216a.this;
            abstractC0216a.f1192g = null;
            AbstractC0216a.super.setVisibility(this.f1196b);
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: b */
        public void mo496b(View view) {
            AbstractC0216a.super.setVisibility(0);
            this.f1195a = false;
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: c */
        public void mo497c(View view) {
            this.f1195a = true;
        }
    }

    public AbstractC0216a(Context context) {
        this(context, null);
    }

    public AbstractC0216a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0216a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f1187b = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0166a.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.f1188c = context;
        } else {
            this.f1188c = new ContextThemeWrapper(context, i2);
        }
    }

    /* renamed from: a */
    public int m743a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: a */
    public int m744a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0121p m745a(int i, long j) {
        C0121p c0121p = this.f1192g;
        if (c0121p != null) {
            c0121p.m492a();
        }
        if (i != 0) {
            C0121p m453a = C0119n.m453a(this);
            m453a.m488a(0.0f);
            m453a.m489a(j);
            a aVar = this.f1187b;
            AbstractC0216a.this.f1192g = m453a;
            aVar.f1196b = i;
            m453a.m490a(aVar);
            return m453a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0121p m453a2 = C0119n.m453a(this);
        m453a2.m488a(1.0f);
        m453a2.m489a(j);
        a aVar2 = this.f1187b;
        AbstractC0216a.this.f1192g = m453a2;
        aVar2.f1196b = i;
        m453a2.m490a(aVar2);
        return m453a2;
    }

    public int getAnimatedVisibility() {
        return this.f1192g != null ? this.f1187b.f1196b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1191f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0175j.ActionBar, C0166a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0175j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0222c c0222c = this.f1190e;
        if (c0222c != null) {
            if (!c0222c.f1216r) {
                Configuration configuration2 = c0222c.f1013c.getResources().getConfiguration();
                int i = configuration2.screenWidthDp;
                int i2 = configuration2.screenHeightDp;
                c0222c.f1215q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            }
            C0201h c0201h = c0222c.f1014d;
            if (c0201h != null) {
                c0201h.m706b(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1194i = false;
        }
        if (!this.f1194i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1194i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1194i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1193h = false;
        }
        if (!this.f1193h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1193h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1193h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0121p c0121p = this.f1192g;
            if (c0121p != null) {
                c0121p.m492a();
            }
            super.setVisibility(i);
        }
    }
}
