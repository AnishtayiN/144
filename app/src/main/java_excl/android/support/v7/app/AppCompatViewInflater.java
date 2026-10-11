package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p000a.p006b.p010c.p020g.C0096a;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.C0188c;
import p000a.p006b.p025d.p035g.C0225d;
import p000a.p006b.p025d.p035g.C0231f;
import p000a.p006b.p025d.p035g.C0234g;
import p000a.p006b.p025d.p035g.C0237h;
import p000a.p006b.p025d.p035g.C0246k;
import p000a.p006b.p025d.p035g.C0248l;
import p000a.p006b.p025d.p035g.C0252n;
import p000a.p006b.p025d.p035g.C0254o;
import p000a.p006b.p025d.p035g.C0260r;
import p000a.p006b.p025d.p035g.C0262s;
import p000a.p006b.p025d.p035g.C0264t;
import p000a.p006b.p025d.p035g.C0270w;
import p000a.p006b.p025d.p035g.C0274y;
import p000a.p006b.p025d.p035g.C0277z0;
import p038c.p039a.p040a.p041a.C0335a;

/* loaded from: classes.dex */
public class AppCompatViewInflater {

    /* renamed from: b */
    public static final Class<?>[] f1727b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f1728c = {R.attr.onClick};

    /* renamed from: d */
    public static final String[] f1729d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    public static final Map<String, Constructor<? extends View>> f1730e = new C0096a();

    /* renamed from: a */
    public final Object[] f1731a = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    public static class ViewOnClickListenerC0290a implements View.OnClickListener {

        /* renamed from: b */
        public final View f1732b;

        /* renamed from: c */
        public final String f1733c;

        /* renamed from: d */
        public Method f1734d;

        /* renamed from: e */
        public Context f1735e;

        public ViewOnClickListenerC0290a(View view, String str) {
            this.f1732b = view;
            this.f1733c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String sb;
            Method method;
            if (this.f1734d == null) {
                Context context = this.f1732b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1733c, View.class)) != null) {
                            this.f1734d = method;
                            this.f1735e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f1732b.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder m1134a = C0335a.m1134a(" with id '");
                    m1134a.append(this.f1732b.getContext().getResources().getResourceEntryName(id));
                    m1134a.append("'");
                    sb = m1134a.toString();
                }
                StringBuilder m1134a2 = C0335a.m1134a("Could not find method ");
                m1134a2.append(this.f1733c);
                m1134a2.append("(View) in a parent or ancestor Context for android:onClick ");
                m1134a2.append("attribute defined on view ");
                m1134a2.append(this.f1732b.getClass());
                m1134a2.append(sb);
                throw new IllegalStateException(m1134a2.toString());
            }
            try {
                this.f1734d.invoke(this.f1735e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    public final View m1013a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = f1730e.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f1727b);
                f1730e.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f1731a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    public final View m1014a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        char c2;
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0175j.View, 0, 0);
            int resourceId = z2 ? obtainStyledAttributes.getResourceId(C0175j.View_android_theme, 0) : 0;
            if (z3 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0175j.View_theme, 0)) != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
            obtainStyledAttributes.recycle();
            if (resourceId != 0 && (!(context2 instanceof C0188c) || ((C0188c) context2).f925a != resourceId)) {
                context2 = new C0188c(context2, resourceId);
            }
        }
        if (z4) {
            context2 = C0277z0.m953a(context2);
        }
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                view2 = new C0274y(context2, attributeSet);
                m1015a(view2, str);
                break;
            case 1:
                view2 = new C0252n(context2, attributeSet);
                m1015a(view2, str);
                break;
            case 2:
                view2 = new C0231f(context2, attributeSet);
                m1015a(view2, str);
                break;
            case 3:
                view2 = new C0246k(context2, attributeSet);
                m1015a(view2, str);
                break;
            case 4:
                view2 = new C0270w(context2, attributeSet, C0166a.spinnerStyle);
                m1015a(view2, str);
                break;
            case 5:
                view2 = new C0248l(context2, attributeSet, C0166a.imageButtonStyle);
                m1015a(view2, str);
                break;
            case 6:
                view2 = new C0234g(context2, attributeSet);
                m1015a(view2, str);
                break;
            case 7:
                view2 = new C0260r(context2, attributeSet);
                m1015a(view2, str);
                break;
            case '\b':
                view2 = new C0237h(context2, attributeSet);
                m1015a(view2, str);
                break;
            case '\t':
                view2 = new C0225d(context2, attributeSet);
                m1015a(view2, str);
                break;
            case '\n':
                view2 = new C0254o(context2, attributeSet);
                m1015a(view2, str);
                break;
            case 11:
                view2 = new C0262s(context2, attributeSet);
                m1015a(view2, str);
                break;
            case '\f':
                view2 = new C0264t(context2, attributeSet);
                m1015a(view2, str);
                break;
            default:
                view2 = null;
                break;
        }
        if (view2 == null && context != context2) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                this.f1731a[0] = context2;
                this.f1731a[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        if (i < f1729d.length) {
                            view2 = m1013a(context2, str, f1729d[i]);
                            if (view2 == null) {
                                i++;
                            }
                        } else {
                            view2 = null;
                        }
                    }
                } else {
                    View m1013a = m1013a(context2, str, null);
                    Object[] objArr = this.f1731a;
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = m1013a;
                }
            } catch (Exception unused) {
                view2 = null;
            } finally {
                Object[] objArr2 = this.f1731a;
                objArr2[0] = null;
                objArr2[1] = null;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && (Build.VERSION.SDK_INT < 15 || C0119n.m472g(view2))) {
                TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, f1728c);
                String string = obtainStyledAttributes2.getString(0);
                if (string != null) {
                    view2.setOnClickListener(new ViewOnClickListenerC0290a(view2, string));
                }
                obtainStyledAttributes2.recycle();
            }
        }
        return view2;
    }

    /* renamed from: a */
    public final void m1015a(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
