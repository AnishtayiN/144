package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a.b.d.g.z */
/* loaded from: classes.dex */
public class C0276z {

    /* renamed from: k */
    public static final RectF f1555k = new RectF();

    /* renamed from: l */
    public static ConcurrentHashMap<String, Method> f1556l = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f1557a = 0;

    /* renamed from: b */
    public boolean f1558b = false;

    /* renamed from: c */
    public float f1559c = -1.0f;

    /* renamed from: d */
    public float f1560d = -1.0f;

    /* renamed from: e */
    public float f1561e = -1.0f;

    /* renamed from: f */
    public int[] f1562f = new int[0];

    /* renamed from: g */
    public boolean f1563g = false;

    /* renamed from: h */
    public TextPaint f1564h;

    /* renamed from: i */
    public final TextView f1565i;

    /* renamed from: j */
    public final Context f1566j;

    public C0276z(TextView textView) {
        this.f1565i = textView;
        this.f1566j = this.f1565i.getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0155, code lost:
    
        if (r4.getLineEnd(r4.getLineCount() - 1) != r8.length()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0170  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m943a(android.graphics.RectF r19) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0276z.m943a(android.graphics.RectF):int");
    }

    /* renamed from: a */
    public final <T> T m944a(Object obj, String str, T t) {
        try {
            return (T) m945a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    public final Method m945a(String str) {
        try {
            Method method = f1556l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1556l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    public void m946a() {
        if (m952d() && this.f1557a != 0) {
            if (this.f1558b) {
                if (this.f1565i.getMeasuredHeight() <= 0 || this.f1565i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) m944a((Object) this.f1565i, "getHorizontallyScrolling", (String) false)).booleanValue() ? 1048576 : (this.f1565i.getMeasuredWidth() - this.f1565i.getTotalPaddingLeft()) - this.f1565i.getTotalPaddingRight();
                int height = (this.f1565i.getHeight() - this.f1565i.getCompoundPaddingBottom()) - this.f1565i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f1555k) {
                    f1555k.setEmpty();
                    f1555k.right = measuredWidth;
                    f1555k.bottom = height;
                    float m943a = m943a(f1555k);
                    if (m943a != this.f1565i.getTextSize()) {
                        m948a(0, m943a);
                    }
                }
            }
            this.f1558b = true;
        }
    }

    /* renamed from: a */
    public final void m947a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f1557a = 1;
        this.f1560d = f;
        this.f1561e = f2;
        this.f1559c = f3;
        this.f1563g = false;
    }

    /* renamed from: a */
    public void m948a(int i, float f) {
        Context context = this.f1566j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f1565i.getPaint().getTextSize()) {
            this.f1565i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1565i.isInLayout() : false;
            if (this.f1565i.getLayout() != null) {
                this.f1558b = false;
                try {
                    Method m945a = m945a("nullLayouts");
                    if (m945a != null) {
                        m945a.invoke(this.f1565i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.f1565i.forceLayout();
                } else {
                    this.f1565i.requestLayout();
                }
                this.f1565i.invalidate();
            }
        }
    }

    /* renamed from: a */
    public final int[] m949a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: b */
    public final boolean m950b() {
        if (m952d() && this.f1557a == 1) {
            if (!this.f1563g || this.f1562f.length == 0) {
                float round = Math.round(this.f1560d);
                int i = 1;
                while (Math.round(this.f1559c + round) <= Math.round(this.f1561e)) {
                    i++;
                    round += this.f1559c;
                }
                int[] iArr = new int[i];
                float f = this.f1560d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f1559c;
                }
                this.f1562f = m949a(iArr);
            }
            this.f1558b = true;
        } else {
            this.f1558b = false;
        }
        return this.f1558b;
    }

    /* renamed from: c */
    public final boolean m951c() {
        this.f1563g = this.f1562f.length > 0;
        if (this.f1563g) {
            this.f1557a = 1;
            int[] iArr = this.f1562f;
            this.f1560d = iArr[0];
            this.f1561e = iArr[r0 - 1];
            this.f1559c = -1.0f;
        }
        return this.f1563g;
    }

    /* renamed from: d */
    public final boolean m952d() {
        return !(this.f1565i instanceof C0246k);
    }
}
