package p000a.p006b.p008b.p009a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p006b.p007a.C0021a;
import p000a.p006b.p007a.C0023c;
import p000a.p006b.p010c.p012b.p013c.C0069a;
import p000a.p006b.p010c.p012b.p013c.C0071c;
import p000a.p006b.p010c.p012b.p013c.C0072d;
import p000a.p006b.p010c.p012b.p013c.C0073e;
import p000a.p006b.p010c.p012b.p013c.C0075g;
import p000a.p006b.p010c.p012b.p013c.InterfaceC0070b;
import p000a.p006b.p010c.p014c.C0078b;
import p000a.p006b.p010c.p014c.p015i.C0087c;
import p000a.p006b.p010c.p014c.p015i.C0088d;
import p000a.p006b.p010c.p014c.p015i.InterfaceC0085a;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuC0089a;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p018e.C0092a;
import p000a.p006b.p010c.p019f.C0095a;
import p000a.p006b.p010c.p021h.InterfaceC0113h;
import p000a.p006b.p010c.p021h.InterfaceC0114i;
import p000a.p006b.p010c.p021h.p023v.C0128a;
import p000a.p006b.p010c.p021h.p023v.C0129b;
import p000a.p006b.p010c.p021h.p023v.C0130c;
import p000a.p006b.p010c.p024i.ActionModeCallbackC0138g;
import p000a.p006b.p025d.p033f.p034i.C0206m;
import p000a.p006b.p025d.p033f.p034i.MenuC0211r;
import p000a.p006b.p025d.p033f.p034i.MenuItemC0205l;
import p000a.p006b.p025d.p035g.InterfaceC0245j1;
import p000a.p006b.p025d.p035g.ViewOnLongClickListenerC0233f1;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.b.a.d */
/* loaded from: classes.dex */
public class C0027d {

    /* renamed from: a */
    public static Method f62a;

    /* renamed from: b */
    public static boolean f63b;

    /* renamed from: c */
    public static Method f64c;

    /* renamed from: d */
    public static boolean f65d;

    /* renamed from: e */
    public static Field f66e;

    /* renamed from: f */
    public static boolean f67f;

    /* renamed from: g */
    public static Field f68g;

    /* renamed from: h */
    public static boolean f69h;

    /* renamed from: i */
    public static Method f70i;

    /* renamed from: j */
    public static boolean f71j;

    /* renamed from: k */
    public static Field f72k;

    /* renamed from: l */
    public static boolean f73l;

    /* renamed from: m */
    public static Field f74m;

    /* renamed from: n */
    public static boolean f75n;

    /* renamed from: o */
    public static Class f76o;

    /* renamed from: p */
    public static boolean f77p;

    /* renamed from: q */
    public static Field f78q;

    /* renamed from: r */
    public static boolean f79r;

    /* renamed from: s */
    public static Field f80s;

    /* renamed from: t */
    public static boolean f81t;

    /* renamed from: a */
    public static float m32a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m84a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m33a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static int m34a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }

    /* renamed from: a */
    public static int m35a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = Build.VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if ((Build.VERSION.SDK_INT >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) : 1) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m36a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m84a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static int m37a(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C0069a m38a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        C0069a c0069a;
        if (m84a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C0069a(null, null, typedValue.data);
            }
            try {
                c0069a = C0069a.m321a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0069a = null;
            }
            if (c0069a != null) {
                return c0069a;
            }
        }
        return new C0069a(null, null, i2);
    }

    /* renamed from: a */
    public static InterfaceC0070b m39a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (!xmlPullParser.getName().equals("font-family")) {
            m79a(xmlPullParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0023c.FontFamily);
        String string = obtainAttributes.getString(C0023c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0023c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0023c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0023c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0023c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0023c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m79a(xmlPullParser);
            }
            return new C0073e(new C0092a(string, string2, string3, m60a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0023c.FontFamilyFont);
                    int i = obtainAttributes2.getInt(obtainAttributes2.hasValue(C0023c.FontFamilyFont_fontWeight) ? C0023c.FontFamilyFont_fontWeight : C0023c.FontFamilyFont_android_fontWeight, 400);
                    boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(C0023c.FontFamilyFont_fontStyle) ? C0023c.FontFamilyFont_fontStyle : C0023c.FontFamilyFont_android_fontStyle, 0);
                    int i2 = obtainAttributes2.hasValue(C0023c.FontFamilyFont_ttcIndex) ? C0023c.FontFamilyFont_ttcIndex : C0023c.FontFamilyFont_android_ttcIndex;
                    String string4 = obtainAttributes2.getString(obtainAttributes2.hasValue(C0023c.FontFamilyFont_fontVariationSettings) ? C0023c.FontFamilyFont_fontVariationSettings : C0023c.FontFamilyFont_android_fontVariationSettings);
                    int i3 = obtainAttributes2.getInt(i2, 0);
                    int i4 = obtainAttributes2.hasValue(C0023c.FontFamilyFont_font) ? C0023c.FontFamilyFont_font : C0023c.FontFamilyFont_android_font;
                    int resourceId2 = obtainAttributes2.getResourceId(i4, 0);
                    String string5 = obtainAttributes2.getString(i4);
                    obtainAttributes2.recycle();
                    while (xmlPullParser.next() != 3) {
                        m79a(xmlPullParser);
                    }
                    arrayList.add(new C0072d(string5, i, z, string4, i3, resourceId2));
                } else {
                    m79a(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0071c((C0072d[]) arrayList.toArray(new C0072d[arrayList.size()]));
    }

    /* renamed from: a */
    public static C0095a.a m40a(TextView textView) {
        int i;
        int i2;
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0095a.a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
            i2 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
        if (Build.VERSION.SDK_INT >= 23) {
            i = textView.getBreakStrategy();
            i2 = textView.getHyphenationFrequency();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
                boolean z = textView.getLayoutDirection() == 1;
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
            textDirectionHeuristic2 = textDirectionHeuristic;
        }
        return new C0095a.a(textPaint, textDirectionHeuristic2, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x032e, code lost:
    
        if (r2.hasNext() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0330, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x033c, code lost:
    
        if (r28 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x033e, code lost:
    
        r27.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0342, code lost:
    
        r27.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0345, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x031c, code lost:
    
        if (r27 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x031e, code lost:
    
        if (r13 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0320, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0193  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator m41a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28, float r29) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p008b.p009a.C0027d.m41a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    public static Keyframe m42a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    public static PropertyValuesHolder m43a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m96b(i4)) || (z2 && m96b(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C0029f c0029f = i == 3 ? C0029f.f83a : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
            } else {
                if (!z) {
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m96b(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                    }
                    if (propertyValuesHolder == null && c0029f != null) {
                        propertyValuesHolder.setEvaluator(c0029f);
                        return propertyValuesHolder;
                    }
                }
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m96b(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m96b(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C0078b[] m87a = m87a(string);
        C0078b[] m87a2 = m87a(string2);
        if (m87a == null && m87a2 == null) {
            return null;
        }
        if (m87a == null) {
            if (m87a2 != null) {
                return PropertyValuesHolder.ofObject(str, new C0028e(), m87a2);
            }
            return null;
        }
        C0028e c0028e = new C0028e();
        if (m87a2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c0028e, m87a);
        } else {
            if (!m85a(m87a, m87a2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, c0028e, m87a, m87a2);
        }
        return ofObject;
    }

    /* renamed from: a */
    public static ValueAnimator m44a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        int i;
        ValueAnimator valueAnimator3;
        TypedArray m48a = m48a(resources, theme, attributeSet, C0024a.f45g);
        TypedArray m48a2 = m48a(resources, theme, attributeSet, C0024a.f49k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long m89b = m89b(m48a, xmlPullParser, "duration", 1, 300);
        int i2 = 0;
        long m89b2 = m89b(m48a, xmlPullParser, "startOffset", 2, 0);
        int m89b3 = m89b(m48a, xmlPullParser, "valueType", 7, 4);
        if (m84a(xmlPullParser, "valueFrom") && m84a(xmlPullParser, "valueTo")) {
            if (m89b3 == 4) {
                TypedValue peekValue = m48a.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = m48a.peekValue(6);
                boolean z2 = peekValue2 != null;
                m89b3 = ((z && m96b(i3)) || (z2 && m96b(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m43a = m43a(m48a, m89b3, 5, 6, "");
            if (m43a != null) {
                valueAnimator4.setValues(m43a);
            }
        }
        valueAnimator4.setDuration(m89b);
        valueAnimator4.setStartDelay(m89b2);
        valueAnimator4.setRepeatCount(m89b(m48a, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(m89b(m48a, xmlPullParser, "repeatMode", 4, 1));
        if (m48a2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String m58a = m58a(m48a2, xmlPullParser, "pathData", 1);
            if (m58a != null) {
                String m58a2 = m58a(m48a2, xmlPullParser, "propertyXName", 2);
                String m58a3 = m58a(m48a2, xmlPullParser, "propertyYName", 3);
                if (m58a2 == null && m58a3 == null) {
                    throw new InflateException(m48a2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m90b = m90b(m58a);
                float f2 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(m90b, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(m90b, false);
                int min = Math.min(100, ((int) (f3 / f2)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / (min - 1);
                valueAnimator2 = valueAnimator4;
                int i4 = 0;
                float f5 = 0.0f;
                while (true) {
                    if (i4 >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
                    fArr[i4] = fArr3[0];
                    fArr2[i4] = fArr3[1];
                    f5 += f4;
                    int i6 = i2 + 1;
                    if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i2 = i6;
                    }
                    i4++;
                    min = i5;
                }
                PropertyValuesHolder ofFloat = m58a2 != null ? PropertyValuesHolder.ofFloat(m58a2, fArr) : null;
                PropertyValuesHolder ofFloat2 = m58a3 != null ? PropertyValuesHolder.ofFloat(m58a3, fArr2) : null;
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                i = 0;
                objectAnimator.setPropertyName(m58a(m48a2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            i = 0;
        }
        if (m84a(xmlPullParser, "interpolator")) {
            i = m48a.getResourceId(i, i);
        }
        if (i > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(m53a(context, i));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        m48a.recycle();
        if (m48a2 != null) {
            m48a2.recycle();
        }
        return valueAnimator3;
    }

    /* renamed from: a */
    public static Intent m45a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        try {
            String m93b = m93b(activity, activity.getComponentName());
            if (m93b == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m93b);
            try {
                return m93b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m93b + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static Intent m46a(Context context, ComponentName componentName) {
        String m93b = m93b(context, componentName);
        if (m93b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m93b);
        return m93b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: a */
    public static ColorStateList m47a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = C0023c.ColorStateListItem;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                int color = obtainAttributes.getColor(C0023c.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (obtainAttributes.hasValue(C0023c.ColorStateListItem_android_alpha)) {
                    f = obtainAttributes.getFloat(C0023c.ColorStateListItem_android_alpha, 1.0f);
                } else if (obtainAttributes.hasValue(C0023c.ColorStateListItem_alpha)) {
                    f = obtainAttributes.getFloat(C0023c.ColorStateListItem_alpha, 1.0f);
                }
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C0021a.alpha) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr4, i3);
                int round = (Math.round(Color.alpha(color) * f) << 24) | (color & 16777215);
                if (i2 != 0) {
                    int length = trimStateSet.length;
                }
                int i6 = i2 + 1;
                if (i6 > iArr2.length) {
                    int[] iArr5 = new int[C0075g.m327a(i2)];
                    System.arraycopy(iArr2, 0, iArr5, 0, i2);
                    iArr2 = iArr5;
                }
                iArr2[i2] = round;
                if (i6 > iArr.length) {
                    int[] r8 = new int[C0075g.m327a(i2)];
                    System.arraycopy(iArr, 0, r8, 0, i2);
                    iArr = r8;
                }
                iArr[i2] = trimStateSet;
                iArr = iArr;
                i2 = i6;
            }
            i = 1;
        }
        int[] iArr6 = new int[i2];
        int[][] iArr7 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr6, 0, i2);
        System.arraycopy(iArr, 0, iArr7, 0, i2);
        return new ColorStateList(iArr7, iArr6);
    }

    /* renamed from: a */
    public static TypedArray m48a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static Drawable m49a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f69h) {
            try {
                f68g = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f68g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f69h = true;
        }
        Field field = f68g;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f68g = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static ActionMode.Callback m50a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC0138g)) ? callback : new ActionModeCallbackC0138g(callback, textView);
    }

    /* renamed from: a */
    public static Menu m51a(Context context, InterfaceMenuC0089a interfaceMenuC0089a) {
        return new MenuC0211r(context, interfaceMenuC0089a);
    }

    /* renamed from: a */
    public static MenuItem m52a(Context context, InterfaceMenuItemC0090b interfaceMenuItemC0090b) {
        return Build.VERSION.SDK_INT >= 16 ? new C0206m(context, interfaceMenuItemC0090b) : new MenuItemC0205l(context, interfaceMenuItemC0090b);
    }

    /* renamed from: a */
    public static Interpolator m53a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i == 17563663) {
                    return new C0128a();
                }
                if (i == 17563661) {
                    return new C0129b();
                }
                if (i == 17563662) {
                    return new C0130c();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i);
                context.getResources();
                context.getTheme();
                Interpolator m54a = m54a(context, (XmlPullParser) animation);
                animation.close();
                return m54a;
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c6, code lost:
    
        return r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.animation.Interpolator m54a(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5) {
        /*
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto Lc6
        L12:
            r3 = 1
            if (r2 == r3) goto Lc6
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "linearInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2f
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            goto L5
        L2f:
            java.lang.String r3 = "accelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3e
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>(r4, r1)
        L3c:
            r1 = r2
            goto L5
        L3e:
            java.lang.String r3 = "decelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L4c
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L4c:
            java.lang.String r3 = "accelerateDecelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L5a
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            goto L5
        L5a:
            java.lang.String r3 = "cycleInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            android.view.animation.CycleInterpolator r2 = new android.view.animation.CycleInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L68:
            java.lang.String r3 = "anticipateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L76
            android.view.animation.AnticipateInterpolator r2 = new android.view.animation.AnticipateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L76:
            java.lang.String r3 = "overshootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L84
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L84:
            java.lang.String r3 = "anticipateOvershootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L92
            android.view.animation.AnticipateOvershootInterpolator r2 = new android.view.animation.AnticipateOvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L92:
            java.lang.String r3 = "bounceInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto La1
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            goto L5
        La1:
            java.lang.String r3 = "pathInterpolator"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Laf
            a.b.b.a.g r2 = new a.b.b.a.g
            r2.<init>(r4, r1, r5)
            goto L3c
        Laf:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown interpolator name: "
            java.lang.StringBuilder r0 = p038c.p039a.p040a.p041a.C0335a.m1134a(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p008b.p009a.C0027d.m54a(android.content.Context, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    /* renamed from: a */
    public static InputConnection m55a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC0245j1) {
                    editorInfo.hintText = ((InterfaceC0245j1) parent).m860a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }

    /* renamed from: a */
    public static File m56a(Context context) {
        StringBuilder m1134a = C0335a.m1134a(".font");
        m1134a.append(Process.myPid());
        m1134a.append("-");
        m1134a.append(Process.myTid());
        m1134a.append("-");
        String sb = m1134a.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getCacheDir(), sb + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m57a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m58a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m84a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: a */
    public static ByteBuffer m59a(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static List<List<byte[]>> m60a(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m61a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m61a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    public static List<byte[]> m61a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m62a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m63a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC0085a) {
            ((InterfaceC0085a) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m64a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m65a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC0085a) {
            ((InterfaceC0085a) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m66a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC0085a) {
            ((InterfaceC0085a) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m67a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static void m68a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f67f) {
            try {
                f66e = LayoutInflater.class.getDeclaredField("mFactory2");
                f66e.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder m1134a = C0335a.m1134a("forceSetFactory2 Could not find field 'mFactory2' on class ");
                m1134a.append(LayoutInflater.class.getName());
                m1134a.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", m1134a.toString(), e);
            }
            f67f = true;
        }
        Field field = f66e;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m69a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        ViewOnLongClickListenerC0233f1 viewOnLongClickListenerC0233f1 = ViewOnLongClickListenerC0233f1.f1271k;
        if (viewOnLongClickListenerC0233f1 != null && viewOnLongClickListenerC0233f1.f1273b == view) {
            ViewOnLongClickListenerC0233f1.m820a((ViewOnLongClickListenerC0233f1) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0233f1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0233f1 viewOnLongClickListenerC0233f12 = ViewOnLongClickListenerC0233f1.f1272l;
        if (viewOnLongClickListenerC0233f12 != null && viewOnLongClickListenerC0233f12.f1273b == view) {
            viewOnLongClickListenerC0233f12.m823b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: a */
    public static void m70a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC0113h) {
            ((InterfaceC0113h) viewParent).mo447a(view, i);
            return;
        }
        if (i == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0114i) {
                    ((InterfaceC0114i) viewParent).onStopNestedScroll(view);
                    return;
                }
                return;
            }
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    /* renamed from: a */
    public static void m71a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof InterfaceC0113h) {
            ((InterfaceC0113h) viewParent).mo448a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0114i) {
                    ((InterfaceC0114i) viewParent).onNestedScroll(view, i, i2, i3, i4);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* renamed from: a */
    public static void m72a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC0113h) {
            ((InterfaceC0113h) viewParent).mo449a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0114i) {
                    ((InterfaceC0114i) viewParent).onNestedPreScroll(view, i, i2, iArr);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: a */
    public static void m73a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f71j) {
            try {
                f70i = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f70i.setAccessible(true);
            } catch (Exception unused) {
            }
            f71j = true;
        }
        Method method = f70i;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m74a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (i >= 21) {
            if (!f73l) {
                try {
                    f72k = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f72k.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f73l = true;
            }
            Field field = f72k;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m75a(TextView textView, int i) {
        m33a(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m76a(TextView textView, C0095a c0095a) {
        if (Build.VERSION.SDK_INT >= 28) {
            Spannable spannable = c0095a.f523b;
            textView.setText(spannable instanceof PrecomputedText ? (PrecomputedText) spannable : null);
        } else {
            if (!m40a(textView).equals(c0095a.f524c)) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(c0095a);
        }
    }

    /* renamed from: a */
    public static void m77a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f77p) {
            try {
                f76o = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f77p = true;
        }
        Class cls = f76o;
        if (cls == null) {
            return;
        }
        if (!f79r) {
            try {
                f78q = cls.getDeclaredField("mUnthemedEntries");
                f78q.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f79r = true;
        }
        Field field = f78q;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m78a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* renamed from: a */
    public static void m79a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: a */
    public static boolean m80a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m81a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0114i) {
                return ((InterfaceC0114i) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m82a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m83a = m83a(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return m83a;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m83a(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m84a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static boolean m85a(C0078b[] c0078bArr, C0078b[] c0078bArr2) {
        if (c0078bArr == null || c0078bArr2 == null || c0078bArr.length != c0078bArr2.length) {
            return false;
        }
        for (int i = 0; i < c0078bArr.length; i++) {
            if (c0078bArr[i].f450a != c0078bArr2[i].f450a || c0078bArr[i].f451b.length != c0078bArr2[i].f451b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static float[] m86a(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008a, code lost:
    
        if (r16 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: NumberFormatException -> 0x00b8, LOOP:3: B:29:0x006e->B:39:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0097, B:43:0x009d, B:48:0x00ad, B:59:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: NumberFormatException -> 0x00b8, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0097, B:43:0x009d, B:48:0x00ad, B:59:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad A[Catch: NumberFormatException -> 0x00b8, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0097, B:43:0x009d, B:48:0x00ad, B:59:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p006b.p010c.p014c.C0078b[] m87a(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p008b.p009a.C0027d.m87a(java.lang.String):a.b.c.c.b[]");
    }

    /* renamed from: a */
    public static C0078b[] m88a(C0078b[] c0078bArr) {
        if (c0078bArr == null) {
            return null;
        }
        C0078b[] c0078bArr2 = new C0078b[c0078bArr.length];
        for (int i = 0; i < c0078bArr.length; i++) {
            c0078bArr2[i] = new C0078b(c0078bArr[i]);
        }
        return c0078bArr2;
    }

    /* renamed from: b */
    public static int m89b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m84a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static Path m90b(String str) {
        Path path = new Path();
        C0078b[] m87a = m87a(str);
        if (m87a == null) {
            return null;
        }
        try {
            C0078b.m336a(m87a, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* renamed from: b */
    public static Drawable m91b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof InterfaceC0085a) ? new C0088d(drawable) : drawable : !(drawable instanceof InterfaceC0085a) ? new C0087c(drawable) : drawable;
    }

    /* renamed from: b */
    public static TypedValue m92b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m84a(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }

    /* renamed from: b */
    public static String m93b(Context context, ComponentName componentName) {
        String string;
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: b */
    public static void m94b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m68a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m68a(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: b */
    public static void m95b(TextView textView, int i) {
        m33a(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: b */
    public static boolean m96b(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: c */
    public static int m97c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m84a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: c */
    public static Shader.TileMode m98c(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* renamed from: c */
    public static void m99c(TextView textView, int i) {
        m33a(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }
}
