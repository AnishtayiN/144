package p000a.p006b.p010c.p019f;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p000a.p006b.p008b.p009a.C0027d;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.c.f.a */
/* loaded from: classes.dex */
public class C0095a implements Spannable {

    /* renamed from: b */
    public final Spannable f523b;

    /* renamed from: c */
    public final a f524c;

    /* renamed from: d */
    public final PrecomputedText f525d;

    /* renamed from: a.b.c.f.a$a */
    public static final class a {

        /* renamed from: a */
        public final TextPaint f526a;

        /* renamed from: b */
        public final TextDirectionHeuristic f527b;

        /* renamed from: c */
        public final int f528c;

        /* renamed from: d */
        public final int f529d;

        /* renamed from: e */
        public final PrecomputedText.Params f530e;

        public a(PrecomputedText.Params params) {
            this.f526a = params.getTextPaint();
            this.f527b = params.getTextDirection();
            this.f528c = params.getBreakStrategy();
            this.f529d = params.getHyphenationFrequency();
            this.f530e = params;
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f530e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f530e = null;
            }
            this.f526a = textPaint;
            this.f527b = textDirectionHeuristic;
            this.f528c = i;
            this.f529d = i2;
        }

        /* renamed from: a */
        public int m375a() {
            return this.f528c;
        }

        /* renamed from: b */
        public int m376b() {
            return this.f529d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic m377c() {
            return this.f527b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            PrecomputedText.Params params = this.f530e;
            if (params != null) {
                return params.equals(aVar.f530e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f528c != aVar.f528c || this.f529d != aVar.f529d)) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f527b != aVar.f527b) || this.f526a.getTextSize() != aVar.f526a.getTextSize() || this.f526a.getTextScaleX() != aVar.f526a.getTextScaleX() || this.f526a.getTextSkewX() != aVar.f526a.getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f526a.getLetterSpacing() != aVar.f526a.getLetterSpacing() || !TextUtils.equals(this.f526a.getFontFeatureSettings(), aVar.f526a.getFontFeatureSettings()))) || this.f526a.getFlags() != aVar.f526a.getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f526a.getTextLocales().equals(aVar.f526a.getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f526a.getTextLocale().equals(aVar.f526a.getTextLocale())) {
                return false;
            }
            if (this.f526a.getTypeface() == null) {
                if (aVar.f526a.getTypeface() != null) {
                    return false;
                }
            } else if (!this.f526a.getTypeface().equals(aVar.f526a.getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0027d.m37a(Float.valueOf(this.f526a.getTextSize()), Float.valueOf(this.f526a.getTextScaleX()), Float.valueOf(this.f526a.getTextSkewX()), Float.valueOf(this.f526a.getLetterSpacing()), Integer.valueOf(this.f526a.getFlags()), this.f526a.getTextLocales(), this.f526a.getTypeface(), Boolean.valueOf(this.f526a.isElegantTextHeight()), this.f527b, Integer.valueOf(this.f528c), Integer.valueOf(this.f529d));
            }
            if (i >= 21) {
                return C0027d.m37a(Float.valueOf(this.f526a.getTextSize()), Float.valueOf(this.f526a.getTextScaleX()), Float.valueOf(this.f526a.getTextSkewX()), Float.valueOf(this.f526a.getLetterSpacing()), Integer.valueOf(this.f526a.getFlags()), this.f526a.getTextLocale(), this.f526a.getTypeface(), Boolean.valueOf(this.f526a.isElegantTextHeight()), this.f527b, Integer.valueOf(this.f528c), Integer.valueOf(this.f529d));
            }
            if (i < 18 && i < 17) {
                return C0027d.m37a(Float.valueOf(this.f526a.getTextSize()), Float.valueOf(this.f526a.getTextScaleX()), Float.valueOf(this.f526a.getTextSkewX()), Integer.valueOf(this.f526a.getFlags()), this.f526a.getTypeface(), this.f527b, Integer.valueOf(this.f528c), Integer.valueOf(this.f529d));
            }
            return C0027d.m37a(Float.valueOf(this.f526a.getTextSize()), Float.valueOf(this.f526a.getTextScaleX()), Float.valueOf(this.f526a.getTextSkewX()), Integer.valueOf(this.f526a.getFlags()), this.f526a.getTextLocale(), this.f526a.getTypeface(), this.f527b, Integer.valueOf(this.f528c), Integer.valueOf(this.f529d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder m1134a = C0335a.m1134a("textSize=");
            m1134a.append(this.f526a.getTextSize());
            sb.append(m1134a.toString());
            sb.append(", textScaleX=" + this.f526a.getTextScaleX());
            sb.append(", textSkewX=" + this.f526a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                StringBuilder m1134a2 = C0335a.m1134a(", letterSpacing=");
                m1134a2.append(this.f526a.getLetterSpacing());
                sb.append(m1134a2.toString());
                sb.append(", elegantTextHeight=" + this.f526a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                StringBuilder m1134a3 = C0335a.m1134a(", textLocale=");
                m1134a3.append(this.f526a.getTextLocales());
                sb.append(m1134a3.toString());
            } else if (i >= 17) {
                StringBuilder m1134a4 = C0335a.m1134a(", textLocale=");
                m1134a4.append(this.f526a.getTextLocale());
                sb.append(m1134a4.toString());
            }
            StringBuilder m1134a5 = C0335a.m1134a(", typeface=");
            m1134a5.append(this.f526a.getTypeface());
            sb.append(m1134a5.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder m1134a6 = C0335a.m1134a(", variationSettings=");
                m1134a6.append(this.f526a.getFontVariationSettings());
                sb.append(m1134a6.toString());
            }
            StringBuilder m1134a7 = C0335a.m1134a(", textDir=");
            m1134a7.append(this.f527b);
            sb.append(m1134a7.toString());
            sb.append(", breakStrategy=" + this.f528c);
            sb.append(", hyphenationFrequency=" + this.f529d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f523b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f523b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f523b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f523b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.f525d.getSpans(i, i2, cls) : (T[]) this.f523b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f523b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f523b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f525d.removeSpan(obj);
        } else {
            this.f523b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f525d.setSpan(obj, i, i2, i3);
        } else {
            this.f523b.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f523b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f523b.toString();
    }
}
