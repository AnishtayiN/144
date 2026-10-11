package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p025d.p026a.AbstractC0141a;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0167b;
import p000a.p006b.p025d.p027b.C0169d;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p000a.p006b.p025d.p035g.C0249l0;

/* renamed from: a.b.d.g.v0 */
/* loaded from: classes.dex */
public class C0269v0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public Runnable f1475b;

    /* renamed from: c */
    public c f1476c;

    /* renamed from: d */
    public C0249l0 f1477d;

    /* renamed from: e */
    public Spinner f1478e;

    /* renamed from: f */
    public boolean f1479f;

    /* renamed from: g */
    public int f1480g;

    /* renamed from: h */
    public int f1481h;

    /* renamed from: i */
    public int f1482i;

    /* renamed from: j */
    public int f1483j;

    /* renamed from: a.b.d.g.v0$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f1484b;

        public a(View view) {
            this.f1484b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0269v0.this.smoothScrollTo(this.f1484b.getLeft() - ((C0269v0.this.getWidth() - this.f1484b.getWidth()) / 2), 0);
            C0269v0.this.f1475b = null;
        }
    }

    /* renamed from: a.b.d.g.v0$b */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0269v0.this.f1477d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) C0269v0.this.f1477d.getChildAt(i)).f1489c;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0269v0 c0269v0 = C0269v0.this;
                return c0269v0.m907a(((d) c0269v0.f1477d.getChildAt(i)).f1489c, true);
            }
            d dVar = (d) view;
            dVar.f1489c = ((d) C0269v0.this.f1477d.getChildAt(i)).f1489c;
            dVar.m911a();
            return view;
        }
    }

    /* renamed from: a.b.d.g.v0$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).f1489c.m531e();
            int childCount = C0269v0.this.f1477d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0269v0.this.f1477d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: a.b.d.g.v0$d */
    public class d extends LinearLayout {

        /* renamed from: b */
        public final int[] f1488b;

        /* renamed from: c */
        public AbstractC0141a.c f1489c;

        /* renamed from: d */
        public TextView f1490d;

        /* renamed from: e */
        public ImageView f1491e;

        /* renamed from: f */
        public View f1492f;

        public d(Context context, AbstractC0141a.c cVar, boolean z) {
            super(context, null, C0166a.actionBarTabStyle);
            int resourceId;
            this.f1488b = new int[]{R.attr.background};
            this.f1489c = cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, this.f1488b, C0166a.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C0181a.m618c(context, resourceId));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            m911a();
        }

        /* renamed from: a */
        public void m911a() {
            AbstractC0141a.c cVar = this.f1489c;
            View m528b = cVar.m528b();
            if (m528b != null) {
                ViewParent parent = m528b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m528b);
                    }
                    addView(m528b);
                }
                this.f1492f = m528b;
                TextView textView = this.f1490d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1491e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1491e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1492f;
            if (view != null) {
                removeView(view);
                this.f1492f = null;
            }
            Drawable m529c = cVar.m529c();
            CharSequence m530d = cVar.m530d();
            if (m529c != null) {
                if (this.f1491e == null) {
                    C0252n c0252n = new C0252n(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c0252n.setLayoutParams(layoutParams);
                    addView(c0252n, 0);
                    this.f1491e = c0252n;
                }
                this.f1491e.setImageDrawable(m529c);
                this.f1491e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1491e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1491e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m530d);
            if (z) {
                if (this.f1490d == null) {
                    C0274y c0274y = new C0274y(getContext(), null, C0166a.actionBarTabTextStyle);
                    c0274y.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0274y.setLayoutParams(layoutParams2);
                    addView(c0274y);
                    this.f1490d = c0274y;
                }
                this.f1490d.setText(m530d);
                this.f1490d.setVisibility(0);
            } else {
                TextView textView2 = this.f1490d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1490d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1491e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m527a());
            }
            C0027d.m69a((View) this, z ? null : cVar.m527a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0141a.c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0141a.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0269v0.this.f1480g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0269v0.this.f1480g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public d m907a(AbstractC0141a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1482i));
        } else {
            dVar.setFocusable(true);
            if (this.f1476c == null) {
                this.f1476c = new c();
            }
            dVar.setOnClickListener(this.f1476c);
        }
        return dVar;
    }

    /* renamed from: a */
    public void m908a(int i) {
        View childAt = this.f1477d.getChildAt(i);
        Runnable runnable = this.f1475b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f1475b = new a(childAt);
        post(this.f1475b);
    }

    /* renamed from: a */
    public final boolean m909a() {
        Spinner spinner = this.f1478e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: b */
    public final boolean m910b() {
        Spinner spinner = this.f1478e;
        if (!(spinner != null && spinner.getParent() == this)) {
            return false;
        }
        removeView(this.f1478e);
        addView(this.f1477d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1478e.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1475b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0175j.ActionBar, C0166a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0175j.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(C0167b.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0169d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1481h = context.getResources().getDimensionPixelSize(C0169d.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1475b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).f1489c.m531e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f1477d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1480g = -1;
        } else {
            if (childCount > 2) {
                this.f1480g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1480g = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1480g = Math.min(this.f1480g, this.f1481h);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1482i, 1073741824);
        if (!z && this.f1479f) {
            this.f1477d.measure(0, makeMeasureSpec);
            if (this.f1477d.getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                m910b();
            } else if (!m909a()) {
                if (this.f1478e == null) {
                    C0270w c0270w = new C0270w(getContext(), null, C0166a.actionDropDownStyle);
                    c0270w.setLayoutParams(new C0249l0.a(-2, -1));
                    c0270w.setOnItemSelectedListener(this);
                    this.f1478e = c0270w;
                }
                removeView(this.f1477d);
                addView(this.f1478e, new ViewGroup.LayoutParams(-2, -1));
                if (this.f1478e.getAdapter() == null) {
                    this.f1478e.setAdapter((SpinnerAdapter) new b());
                }
                Runnable runnable = this.f1475b;
                if (runnable != null) {
                    removeCallbacks(runnable);
                    this.f1475b = null;
                }
                this.f1478e.setSelection(this.f1483j);
            }
        } else {
            m910b();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1483j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1479f = z;
    }

    public void setContentHeight(int i) {
        this.f1482i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1483j = i;
        int childCount = this.f1477d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1477d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m908a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1478e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
