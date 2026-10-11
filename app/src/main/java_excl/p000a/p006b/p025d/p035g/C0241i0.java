package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.C0121p;
import p000a.p006b.p010c.p024i.C0136e;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p031e.p032a.C0184c;

/* renamed from: a.b.d.g.i0 */
/* loaded from: classes.dex */
public class C0241i0 extends ListView {

    /* renamed from: b */
    public final Rect f1300b;

    /* renamed from: c */
    public int f1301c;

    /* renamed from: d */
    public int f1302d;

    /* renamed from: e */
    public int f1303e;

    /* renamed from: f */
    public int f1304f;

    /* renamed from: g */
    public int f1305g;

    /* renamed from: h */
    public Field f1306h;

    /* renamed from: i */
    public a f1307i;

    /* renamed from: j */
    public boolean f1308j;

    /* renamed from: k */
    public boolean f1309k;

    /* renamed from: l */
    public boolean f1310l;

    /* renamed from: m */
    public C0121p f1311m;

    /* renamed from: n */
    public C0136e f1312n;

    /* renamed from: o */
    public b f1313o;

    /* renamed from: a.b.d.g.i0$a */
    public static class a extends C0184c {

        /* renamed from: c */
        public boolean f1314c;

        public a(Drawable drawable) {
            super(drawable);
            this.f1314c = true;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0184c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1314c) {
                this.f919b.draw(canvas);
            }
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0184c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1314c) {
                C0027d.m62a(this.f919b, f, f2);
            }
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0184c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1314c) {
                C0027d.m64a(this.f919b, i, i2, i3, i4);
            }
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0184c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1314c) {
                return this.f919b.setState(iArr);
            }
            return false;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0184c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1314c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: a.b.d.g.i0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0241i0 c0241i0 = C0241i0.this;
            c0241i0.f1313o = null;
            c0241i0.drawableStateChanged();
        }
    }

    public C0241i0(Context context, boolean z) {
        super(context, null, C0166a.dropDownListViewStyle);
        this.f1300b = new Rect();
        this.f1301c = 0;
        this.f1302d = 0;
        this.f1303e = 0;
        this.f1304f = 0;
        this.f1309k = z;
        setCacheColorHint(0);
        try {
            this.f1306h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1306h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f1307i;
        if (aVar != null) {
            aVar.f1314c = z;
        }
    }

    /* renamed from: a */
    public int m833a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = i4;
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i2) {
                return (i3 < 0 || i6 <= i3 || i8 <= 0 || i5 == i2) ? i2 : i8;
            }
            if (i3 >= 0 && i6 >= i3) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* renamed from: a */
    public final void m834a() {
        Drawable selector = getSelector();
        if (selector != null && this.f1310l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r3 != 3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m835a(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0241i0.m835a(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1300b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1300b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1313o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m834a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1309k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1309k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1309k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1309k && this.f1308j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1313o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1313o == null) {
            this.f1313o = new b();
            b bVar = this.f1313o;
            C0241i0.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m834a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1305g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1313o;
        if (bVar != null) {
            C0241i0 c0241i0 = C0241i0.this;
            c0241i0.f1313o = null;
            c0241i0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1308j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f1307i = drawable != null ? new a(drawable) : null;
        super.setSelector(this.f1307i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1301c = rect.left;
        this.f1302d = rect.top;
        this.f1303e = rect.right;
        this.f1304f = rect.bottom;
    }
}
