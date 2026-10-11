package p000a.p006b.p010c.p021h;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p006b.p007a.C0022b;
import p000a.p006b.p025d.p026a.C0156p;

/* renamed from: a.b.c.h.n */
/* loaded from: classes.dex */
public class C0119n {

    /* renamed from: a */
    public static Field f604a;

    /* renamed from: b */
    public static boolean f605b;

    /* renamed from: c */
    public static WeakHashMap<View, String> f606c;

    /* renamed from: d */
    public static WeakHashMap<View, C0121p> f607d;

    /* renamed from: a.b.c.h.n$a */
    public static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0116k f608a;

        public a(InterfaceC0116k interfaceC0116k) {
            this.f608a = interfaceC0116k;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            C0125t m589a = ((C0156p) this.f608a).m589a(view, C0125t.m498a(windowInsets));
            return (WindowInsets) (m589a == null ? null : m589a.f623a);
        }
    }

    /* renamed from: a.b.c.h.n$b */
    public interface b {
        /* renamed from: a */
        boolean m479a(View view, KeyEvent keyEvent);
    }

    /* renamed from: a.b.c.h.n$c */
    public static class c {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f609d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f610a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f611b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f612c = null;

        /* renamed from: a */
        public static c m480a(View view) {
            c cVar = (c) view.getTag(C0022b.tag_unhandled_key_event_manager);
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c();
            view.setTag(C0022b.tag_unhandled_key_event_manager, cVar2);
            return cVar2;
        }

        /* renamed from: a */
        public final SparseArray<WeakReference<View>> m481a() {
            if (this.f611b == null) {
                this.f611b = new SparseArray<>();
            }
            return this.f611b;
        }

        /* renamed from: a */
        public boolean m482a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m484b();
            }
            View m483b = m483b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m483b != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (this.f611b == null) {
                        this.f611b = new SparseArray<>();
                    }
                    this.f611b.put(keyCode, new WeakReference<>(m483b));
                }
            }
            return m483b != null;
        }

        /* renamed from: b */
        public final View m483b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f610a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m483b = m483b(viewGroup.getChildAt(childCount), keyEvent);
                        if (m483b != null) {
                            return m483b;
                        }
                    }
                }
                if (m485c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final void m484b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f610a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f609d.isEmpty()) {
                return;
            }
            synchronized (f609d) {
                if (this.f610a == null) {
                    this.f610a = new WeakHashMap<>();
                }
                for (int size = f609d.size() - 1; size >= 0; size--) {
                    View view = f609d.get(size).get();
                    if (view == null) {
                        f609d.remove(size);
                    } else {
                        this.f610a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f610a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public final boolean m485c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0022b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((b) arrayList.get(size)).m479a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f607d = null;
    }

    /* renamed from: a */
    public static C0121p m453a(View view) {
        if (f607d == null) {
            f607d = new WeakHashMap<>();
        }
        C0121p c0121p = f607d.get(view);
        if (c0121p != null) {
            return c0121p;
        }
        C0121p c0121p2 = new C0121p(view);
        f607d.put(view, c0121p2);
        return c0121p2;
    }

    /* renamed from: a */
    public static C0125t m454a(View view, C0125t c0125t) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0125t;
        }
        WindowInsets windowInsets = (WindowInsets) (c0125t == null ? null : c0125t.f623a);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0125t.m498a(windowInsets);
    }

    /* renamed from: a */
    public static void m455a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    public static void m456a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m457a(View view, C0107b c0107b) {
        view.setAccessibilityDelegate(c0107b == null ? null : c0107b.f591a);
    }

    /* renamed from: a */
    public static void m458a(View view, InterfaceC0116k interfaceC0116k) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (interfaceC0116k == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(interfaceC0116k));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m459a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC0118m) {
                ((InterfaceC0118m) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m460a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC0118m) {
                ((InterfaceC0118m) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: a */
    public static void m461a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m462a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m463a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m464a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f606c == null) {
            f606c = new WeakHashMap<>();
        }
        f606c.put(view, str);
    }

    /* renamed from: a */
    public static boolean m465a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.m480a(view).m482a(view, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static ColorStateList m466b(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC0118m) {
            return ((InterfaceC0118m) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m467b(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        c m480a = c.m480a(view);
        WeakReference<KeyEvent> weakReference = m480a.f612c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        m480a.f612c = new WeakReference<>(keyEvent);
        WeakReference<View> weakReference2 = null;
        SparseArray<WeakReference<View>> m481a = m480a.m481a();
        if (keyEvent.getAction() == 1 && (indexOfKey = m481a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = m481a.valueAt(indexOfKey);
            m481a.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = m481a.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = weakReference2.get();
        if (view2 != null && m474i(view2)) {
            m480a.m485c(view2, keyEvent);
        }
        return true;
    }

    /* renamed from: c */
    public static int m468c(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: d */
    public static int m469d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f605b) {
            try {
                f604a = View.class.getDeclaredField("mMinHeight");
                f604a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f605b = true;
        }
        Field field = f604a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: e */
    public static String m470e(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f606c;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: f */
    public static int m471f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: g */
    public static boolean m472g(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m473h(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m474i(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: j */
    public static boolean m475j(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: k */
    public static void m476k(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: l */
    public static void m477l(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static void m478m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceC0111f) {
            ((InterfaceC0111f) view).stopNestedScroll();
        }
    }
}
