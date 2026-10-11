package p000a.p006b.p025d.p029d.p030a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p012b.C0067a;
import p000a.p006b.p025d.p035g.C0243j;

/* renamed from: a.b.d.d.a.a */
/* loaded from: classes.dex */
public final class C0181a {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f851a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<a>> f852b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f853c = new Object();

    /* renamed from: a.b.d.d.a.a$a */
    public static class a {

        /* renamed from: a */
        public final ColorStateList f854a;

        /* renamed from: b */
        public final Configuration f855b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f854a = colorStateList;
            this.f855b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m615a(Context context, int i) {
        a aVar;
        synchronized (f853c) {
            SparseArray<a> sparseArray = f852b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.f855b.equals(context.getResources().getConfiguration())) {
                    return aVar.f854a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m616a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f853c) {
            SparseArray<a> sparseArray = f852b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f852b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static ColorStateList m617b(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList m615a = m615a(context, i);
        if (m615a != null) {
            return m615a;
        }
        Resources resources = context.getResources();
        TypedValue typedValue = f851a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f851a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        ColorStateList colorStateList = null;
        if (!(i2 >= 28 && i2 <= 31)) {
            Resources resources2 = context.getResources();
            XmlResourceParser xml = resources2.getXml(i);
            try {
                Resources.Theme theme = context.getTheme();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                colorStateList = C0027d.m47a(resources2, xml, asAttributeSet, theme);
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return C0067a.m318a(context, i);
        }
        m616a(context, i, colorStateList);
        return colorStateList;
    }

    /* renamed from: c */
    public static Drawable m618c(Context context, int i) {
        return C0243j.m839a().m854c(context, i);
    }
}
