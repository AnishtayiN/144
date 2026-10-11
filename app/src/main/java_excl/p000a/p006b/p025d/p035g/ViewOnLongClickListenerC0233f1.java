package p000a.p006b.p025d.p035g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0120o;
import p000a.p006b.p025d.p027b.C0169d;

/* renamed from: a.b.d.g.f1 */
/* loaded from: classes.dex */
public class ViewOnLongClickListenerC0233f1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static ViewOnLongClickListenerC0233f1 f1271k;

    /* renamed from: l */
    public static ViewOnLongClickListenerC0233f1 f1272l;

    /* renamed from: b */
    public final View f1273b;

    /* renamed from: c */
    public final CharSequence f1274c;

    /* renamed from: d */
    public final int f1275d;

    /* renamed from: e */
    public final Runnable f1276e = new a();

    /* renamed from: f */
    public final Runnable f1277f = new b();

    /* renamed from: g */
    public int f1278g;

    /* renamed from: h */
    public int f1279h;

    /* renamed from: i */
    public C0236g1 f1280i;

    /* renamed from: j */
    public boolean f1281j;

    /* renamed from: a.b.d.g.f1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0233f1.this.m822a(false);
        }
    }

    /* renamed from: a.b.d.g.f1$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC0233f1.this.m823b();
        }
    }

    public ViewOnLongClickListenerC0233f1(View view, CharSequence charSequence) {
        this.f1273b = view;
        this.f1274c = charSequence;
        this.f1275d = C0120o.m486a(ViewConfiguration.get(this.f1273b.getContext()));
        m821a();
        this.f1273b.setOnLongClickListener(this);
        this.f1273b.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m820a(ViewOnLongClickListenerC0233f1 viewOnLongClickListenerC0233f1) {
        ViewOnLongClickListenerC0233f1 viewOnLongClickListenerC0233f12 = f1271k;
        if (viewOnLongClickListenerC0233f12 != null) {
            viewOnLongClickListenerC0233f12.f1273b.removeCallbacks(viewOnLongClickListenerC0233f12.f1276e);
        }
        f1271k = viewOnLongClickListenerC0233f1;
        ViewOnLongClickListenerC0233f1 viewOnLongClickListenerC0233f13 = f1271k;
        if (viewOnLongClickListenerC0233f13 != null) {
            viewOnLongClickListenerC0233f13.f1273b.postDelayed(viewOnLongClickListenerC0233f13.f1276e, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m821a() {
        this.f1278g = Integer.MAX_VALUE;
        this.f1279h = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public void m822a(boolean z) {
        int height;
        int i;
        long j;
        int longPressTimeout;
        long j2;
        if (C0119n.m474i(this.f1273b)) {
            m820a((ViewOnLongClickListenerC0233f1) null);
            ViewOnLongClickListenerC0233f1 viewOnLongClickListenerC0233f1 = f1272l;
            if (viewOnLongClickListenerC0233f1 != null) {
                viewOnLongClickListenerC0233f1.m823b();
            }
            f1272l = this;
            this.f1281j = z;
            this.f1280i = new C0236g1(this.f1273b.getContext());
            C0236g1 c0236g1 = this.f1280i;
            View view = this.f1273b;
            int i2 = this.f1278g;
            int i3 = this.f1279h;
            boolean z2 = this.f1281j;
            CharSequence charSequence = this.f1274c;
            if (c0236g1.m825b()) {
                c0236g1.m824a();
            }
            c0236g1.f1287c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = c0236g1.f1288d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = c0236g1.f1285a.getResources().getDimensionPixelOffset(C0169d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = c0236g1.f1285a.getResources().getDimensionPixelOffset(C0169d.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = c0236g1.f1285a.getResources().getDimensionPixelOffset(z2 ? C0169d.tooltip_y_offset_touch : C0169d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(c0236g1.f1289e);
                Rect rect = c0236g1.f1289e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = c0236g1.f1285a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    c0236g1.f1289e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(c0236g1.f1291g);
                view.getLocationOnScreen(c0236g1.f1290f);
                int[] iArr = c0236g1.f1290f;
                int i4 = iArr[0];
                int[] iArr2 = c0236g1.f1291g;
                iArr[0] = i4 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                c0236g1.f1286b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = c0236g1.f1286b.getMeasuredHeight();
                int[] iArr3 = c0236g1.f1290f;
                int i5 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i6 = iArr3[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i5 >= 0) {
                        layoutParams.y = i5;
                    } else {
                        layoutParams.y = i6;
                    }
                } else if (measuredHeight + i6 <= c0236g1.f1289e.height()) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i5;
                }
            }
            ((WindowManager) c0236g1.f1285a.getSystemService("window")).addView(c0236g1.f1286b, c0236g1.f1288d);
            this.f1273b.addOnAttachStateChangeListener(this);
            if (this.f1281j) {
                j2 = 2500;
            } else {
                if ((C0119n.m471f(this.f1273b) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - longPressTimeout;
            }
            this.f1273b.removeCallbacks(this.f1277f);
            this.f1273b.postDelayed(this.f1277f, j2);
        }
    }

    /* renamed from: b */
    public void m823b() {
        if (f1272l == this) {
            f1272l = null;
            C0236g1 c0236g1 = this.f1280i;
            if (c0236g1 != null) {
                c0236g1.m824a();
                this.f1280i = null;
                m821a();
                this.f1273b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1271k == this) {
            m820a((ViewOnLongClickListenerC0233f1) null);
        }
        this.f1273b.removeCallbacks(this.f1277f);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1280i != null && this.f1281j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1273b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m821a();
                m823b();
            }
        } else if (this.f1273b.isEnabled() && this.f1280i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1278g) > this.f1275d || Math.abs(y - this.f1279h) > this.f1275d) {
                this.f1278g = x;
                this.f1279h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m820a(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1278g = view.getWidth() / 2;
        this.f1279h = view.getHeight() / 2;
        m822a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m823b();
    }
}
