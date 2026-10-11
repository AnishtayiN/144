package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.InterfaceC0118m;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.w */
/* loaded from: classes.dex */
public class C0270w extends Spinner implements InterfaceC0118m {

    /* renamed from: j */
    public static final int[] f1494j = {R.attr.spinnerMode};

    /* renamed from: b */
    public final C0228e f1495b;

    /* renamed from: c */
    public final Context f1496c;

    /* renamed from: d */
    public AbstractViewOnTouchListenerC0247k0 f1497d;

    /* renamed from: e */
    public SpinnerAdapter f1498e;

    /* renamed from: f */
    public final boolean f1499f;

    /* renamed from: g */
    public b f1500g;

    /* renamed from: h */
    public int f1501h;

    /* renamed from: i */
    public final Rect f1502i;

    /* renamed from: a.b.d.g.w$a */
    public static class a implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f1503b;

        /* renamed from: c */
        public ListAdapter f1504c;

        public a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1503b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1504c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0275y0) {
                    InterfaceC0275y0 interfaceC0275y0 = (InterfaceC0275y0) spinnerAdapter;
                    if (interfaceC0275y0.getDropDownViewTheme() == null) {
                        interfaceC0275y0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1504c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1504c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1503b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a.b.d.g.w$b */
    public class b extends C0255o0 {

        /* renamed from: J */
        public CharSequence f1505J;

        /* renamed from: K */
        public ListAdapter f1506K;

        /* renamed from: L */
        public final Rect f1507L;

        /* renamed from: a.b.d.g.w$b$a */
        public class a implements AdapterView.OnItemClickListener {
            public a(C0270w c0270w) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0270w.this.setSelection(i);
                if (C0270w.this.getOnItemClickListener() != null) {
                    b bVar = b.this;
                    C0270w.this.performItemClick(view, i, bVar.f1506K.getItemId(i));
                }
                b.this.dismiss();
            }
        }

        /* renamed from: a.b.d.g.w$b$b, reason: collision with other inner class name */
        public class ViewTreeObserverOnGlobalLayoutListenerC0385b implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserverOnGlobalLayoutListenerC0385b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                b bVar = b.this;
                if (!bVar.m915a(C0270w.this)) {
                    b.this.dismiss();
                } else {
                    b.this.m916e();
                    b.super.mo681d();
                }
            }
        }

        /* renamed from: a.b.d.g.w$b$c */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1511b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1511b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0270w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1511b);
                }
            }
        }

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f1507L = new Rect();
            this.f1402t = C0270w.this;
            m891a(true);
            this.f1400r = 0;
            this.f1404v = new a(C0270w.this);
        }

        @Override // p000a.p006b.p025d.p035g.C0255o0
        /* renamed from: a */
        public void mo890a(ListAdapter listAdapter) {
            super.mo890a(listAdapter);
            this.f1506K = listAdapter;
        }

        /* renamed from: a */
        public void m914a(CharSequence charSequence) {
            this.f1505J = charSequence;
        }

        /* renamed from: a */
        public boolean m915a(View view) {
            return C0119n.m474i(view) && view.getGlobalVisibleRect(this.f1507L);
        }

        @Override // p000a.p006b.p025d.p035g.C0255o0, p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
        /* renamed from: d */
        public void mo681d() {
            ViewTreeObserver viewTreeObserver;
            boolean mo676b = mo676b();
            m916e();
            this.f1383F.setInputMethodMode(2);
            super.mo681d();
            this.f1386d.setChoiceMode(1);
            int selectedItemPosition = C0270w.this.getSelectedItemPosition();
            C0241i0 c0241i0 = this.f1386d;
            if (mo676b() && c0241i0 != null) {
                c0241i0.setListSelectionHidden(false);
                c0241i0.setSelection(selectedItemPosition);
                if (c0241i0.getChoiceMode() != 0) {
                    c0241i0.setItemChecked(selectedItemPosition, true);
                }
            }
            if (mo676b || (viewTreeObserver = C0270w.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0385b viewTreeObserverOnGlobalLayoutListenerC0385b = new ViewTreeObserverOnGlobalLayoutListenerC0385b();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0385b);
            this.f1383F.setOnDismissListener(new c(viewTreeObserverOnGlobalLayoutListenerC0385b));
        }

        /* renamed from: e */
        public void m916e() {
            Drawable m886a = m886a();
            int i = 0;
            if (m886a != null) {
                m886a.getPadding(C0270w.this.f1502i);
                i = C0242i1.m837a(C0270w.this) ? C0270w.this.f1502i.right : -C0270w.this.f1502i.left;
            } else {
                Rect rect = C0270w.this.f1502i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C0270w.this.getPaddingLeft();
            int paddingRight = C0270w.this.getPaddingRight();
            int width = C0270w.this.getWidth();
            C0270w c0270w = C0270w.this;
            int i2 = c0270w.f1501h;
            if (i2 == -2) {
                int m912a = c0270w.m912a((SpinnerAdapter) this.f1506K, m886a());
                int i3 = C0270w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0270w.this.f1502i;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (m912a > i4) {
                    m912a = i4;
                }
                m887a(Math.max(m912a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m887a((width - paddingLeft) - paddingRight);
            } else {
                m887a(i2);
            }
            this.f1389g = C0242i1.m837a(C0270w.this) ? ((width - paddingRight) - this.f1388f) + i : i + paddingLeft;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0270w(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f1502i = r0
            int[] r0 = p000a.p006b.p025d.p027b.C0175j.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            a.b.d.g.e r2 = new a.b.d.g.e
            r2.<init>(r9)
            r9.f1495b = r2
            r2 = 0
            int r3 = p000a.p006b.p025d.p027b.C0175j.Spinner_popupTheme
            int r3 = r0.getResourceId(r3, r1)
            if (r3 == 0) goto L29
            a.b.d.f.c r4 = new a.b.d.f.c
            r4.<init>(r10, r3)
            r9.f1496c = r4
            goto L34
        L29:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 >= r4) goto L31
            r3 = r10
            goto L32
        L31:
            r3 = r2
        L32:
            r9.f1496c = r3
        L34:
            android.content.Context r3 = r9.f1496c
            r4 = 1
            if (r3 == 0) goto La2
            r3 = -1
            int[] r5 = p000a.p006b.p025d.p035g.C0270w.f1494j     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r11, r5, r12, r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            if (r6 == 0) goto L5e
            int r3 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            goto L5e
        L4b:
            r10 = move-exception
            r2 = r5
            goto L9c
        L4e:
            r6 = move-exception
            goto L55
        L50:
            r10 = move-exception
            goto L9c
        L52:
            r5 = move-exception
            r6 = r5
            r5 = r2
        L55:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L61
        L5e:
            r5.recycle()
        L61:
            if (r3 != r4) goto La2
            a.b.d.g.w$b r3 = new a.b.d.g.w$b
            android.content.Context r5 = r9.f1496c
            r3.<init>(r5, r11, r12)
            android.content.Context r5 = r9.f1496c
            int[] r6 = p000a.p006b.p025d.p027b.C0175j.Spinner
            a.b.d.g.c1 r1 = p000a.p006b.p025d.p035g.C0224c1.m775a(r5, r11, r6, r12, r1)
            int r5 = p000a.p006b.p025d.p027b.C0175j.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r1.m786e(r5, r6)
            r9.f1501h = r5
            int r5 = p000a.p006b.p025d.p027b.C0175j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r1.m781b(r5)
            r3.m889a(r5)
            int r5 = p000a.p006b.p025d.p027b.C0175j.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.m914a(r5)
            android.content.res.TypedArray r1 = r1.f1236b
            r1.recycle()
            r9.f1500g = r3
            a.b.d.g.v r1 = new a.b.d.g.v
            r1.<init>(r9, r9, r3)
            r9.f1497d = r1
            goto La2
        L9c:
            if (r2 == 0) goto La1
            r2.recycle()
        La1:
            throw r10
        La2:
            int r1 = p000a.p006b.p025d.p027b.C0175j.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lba
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r5, r1)
            int r10 = p000a.p006b.p025d.p027b.C0172g.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lba:
            r0.recycle()
            r9.f1499f = r4
            android.widget.SpinnerAdapter r10 = r9.f1498e
            if (r10 == 0) goto Lc8
            r9.setAdapter(r10)
            r9.f1498e = r2
        Lc8:
            a.b.d.g.e r10 = r9.f1495b
            r10.m793a(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0270w.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public int m912a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1502i);
        Rect rect = this.f1502i;
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228e c0228e = this.f1495b;
        if (c0228e != null) {
            c0228e.m789a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        b bVar = this.f1500g;
        if (bVar != null) {
            return bVar.f1389g;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        b bVar = this.f1500g;
        if (bVar != null) {
            if (bVar.f1392j) {
                return bVar.f1390h;
            }
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1500g != null) {
            return this.f1501h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        b bVar = this.f1500g;
        if (bVar != null) {
            return bVar.m886a();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f1500g != null) {
            return this.f1496c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        b bVar = this.f1500g;
        return bVar != null ? bVar.f1505J : super.getPrompt();
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public ColorStateList getSupportBackgroundTintList() {
        C0228e c0228e = this.f1495b;
        if (c0228e != null) {
            return c0228e.m794b();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228e c0228e = this.f1495b;
        if (c0228e != null) {
            return c0228e.m796c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f1500g;
        if (bVar == null || !bVar.mo676b()) {
            return;
        }
        this.f1500g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1500g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m912a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0247k0 abstractViewOnTouchListenerC0247k0 = this.f1497d;
        if (abstractViewOnTouchListenerC0247k0 == null || !abstractViewOnTouchListenerC0247k0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        b bVar = this.f1500g;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.mo676b()) {
            return true;
        }
        this.f1500g.mo681d();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1499f) {
            this.f1498e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1500g != null) {
            Context context = this.f1496c;
            if (context == null) {
                context = getContext();
            }
            this.f1500g.mo890a(new a(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228e c0228e = this.f1495b;
        if (c0228e != null) {
            c0228e.m797d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228e c0228e = this.f1495b;
        if (c0228e != null) {
            c0228e.m790a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        b bVar = this.f1500g;
        if (bVar != null) {
            bVar.f1389g = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        b bVar = this.f1500g;
        if (bVar != null) {
            bVar.f1390h = i;
            bVar.f1392j = true;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1500g != null) {
            this.f1501h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        b bVar = this.f1500g;
        if (bVar != null) {
            bVar.f1383F.setBackgroundDrawable(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0181a.m618c(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        b bVar = this.f1500g;
        if (bVar != null) {
            bVar.f1505J = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228e c0228e = this.f1495b;
        if (c0228e != null) {
            c0228e.m795b(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228e c0228e = this.f1495b;
        if (c0228e != null) {
            c0228e.m792a(mode);
        }
    }
}
