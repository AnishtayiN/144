package p000a.p006b.p008b.p009a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p006b.p010c.p012b.p013c.C0069a;
import p000a.p006b.p010c.p014c.C0078b;
import p000a.p006b.p010c.p020g.C0096a;

/* renamed from: a.b.b.a.i */
/* loaded from: classes.dex */
public class C0032i extends AbstractC0031h {

    /* renamed from: k */
    public static final PorterDuff.Mode f87k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public h f88c;

    /* renamed from: d */
    public PorterDuffColorFilter f89d;

    /* renamed from: e */
    public ColorFilter f90e;

    /* renamed from: f */
    public boolean f91f;

    /* renamed from: g */
    public boolean f92g;

    /* renamed from: h */
    public final float[] f93h;

    /* renamed from: i */
    public final Matrix f94i;

    /* renamed from: j */
    public final Rect f95j;

    /* renamed from: a.b.b.a.i$b */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void m105a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0027d.m84a(xmlPullParser, "pathData")) {
                TypedArray m48a = C0027d.m48a(resources, theme, attributeSet, C0024a.f42d);
                String string = m48a.getString(0);
                if (string != null) {
                    this.f123b = string;
                }
                String string2 = m48a.getString(1);
                if (string2 != null) {
                    this.f122a = C0027d.m87a(string2);
                }
                m48a.recycle();
            }
        }

        @Override // p000a.p006b.p008b.p009a.C0032i.f
        /* renamed from: b */
        public boolean mo106b() {
            return true;
        }
    }

    /* renamed from: a.b.b.a.i$c */
    public static class c extends f {

        /* renamed from: d */
        public int[] f96d;

        /* renamed from: e */
        public C0069a f97e;

        /* renamed from: f */
        public float f98f;

        /* renamed from: g */
        public C0069a f99g;

        /* renamed from: h */
        public float f100h;

        /* renamed from: i */
        public int f101i;

        /* renamed from: j */
        public float f102j;

        /* renamed from: k */
        public float f103k;

        /* renamed from: l */
        public float f104l;

        /* renamed from: m */
        public float f105m;

        /* renamed from: n */
        public Paint.Cap f106n;

        /* renamed from: o */
        public Paint.Join f107o;

        /* renamed from: p */
        public float f108p;

        public c() {
            this.f98f = 0.0f;
            this.f100h = 1.0f;
            this.f101i = 0;
            this.f102j = 1.0f;
            this.f103k = 0.0f;
            this.f104l = 1.0f;
            this.f105m = 0.0f;
            this.f106n = Paint.Cap.BUTT;
            this.f107o = Paint.Join.MITER;
            this.f108p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f98f = 0.0f;
            this.f100h = 1.0f;
            this.f101i = 0;
            this.f102j = 1.0f;
            this.f103k = 0.0f;
            this.f104l = 1.0f;
            this.f105m = 0.0f;
            this.f106n = Paint.Cap.BUTT;
            this.f107o = Paint.Join.MITER;
            this.f108p = 4.0f;
            this.f96d = cVar.f96d;
            this.f97e = cVar.f97e;
            this.f98f = cVar.f98f;
            this.f100h = cVar.f100h;
            this.f99g = cVar.f99g;
            this.f101i = cVar.f101i;
            this.f102j = cVar.f102j;
            this.f103k = cVar.f103k;
            this.f104l = cVar.f104l;
            this.f105m = cVar.f105m;
            this.f106n = cVar.f106n;
            this.f107o = cVar.f107o;
            this.f108p = cVar.f108p;
        }

        /* renamed from: a */
        public void m107a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m48a = C0027d.m48a(resources, theme, attributeSet, C0024a.f41c);
            this.f96d = null;
            if (C0027d.m84a(xmlPullParser, "pathData")) {
                String string = m48a.getString(0);
                if (string != null) {
                    this.f123b = string;
                }
                String string2 = m48a.getString(2);
                if (string2 != null) {
                    this.f122a = C0027d.m87a(string2);
                }
                this.f99g = C0027d.m38a(m48a, xmlPullParser, theme, "fillColor", 1, 0);
                this.f102j = C0027d.m32a(m48a, xmlPullParser, "fillAlpha", 12, this.f102j);
                int m89b = C0027d.m89b(m48a, xmlPullParser, "strokeLineCap", 8, -1);
                Paint.Cap cap = this.f106n;
                if (m89b == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (m89b == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (m89b == 2) {
                    cap = Paint.Cap.SQUARE;
                }
                this.f106n = cap;
                int m89b2 = C0027d.m89b(m48a, xmlPullParser, "strokeLineJoin", 9, -1);
                Paint.Join join = this.f107o;
                if (m89b2 == 0) {
                    join = Paint.Join.MITER;
                } else if (m89b2 == 1) {
                    join = Paint.Join.ROUND;
                } else if (m89b2 == 2) {
                    join = Paint.Join.BEVEL;
                }
                this.f107o = join;
                this.f108p = C0027d.m32a(m48a, xmlPullParser, "strokeMiterLimit", 10, this.f108p);
                this.f97e = C0027d.m38a(m48a, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f100h = C0027d.m32a(m48a, xmlPullParser, "strokeAlpha", 11, this.f100h);
                this.f98f = C0027d.m32a(m48a, xmlPullParser, "strokeWidth", 4, this.f98f);
                this.f104l = C0027d.m32a(m48a, xmlPullParser, "trimPathEnd", 6, this.f104l);
                this.f105m = C0027d.m32a(m48a, xmlPullParser, "trimPathOffset", 7, this.f105m);
                this.f103k = C0027d.m32a(m48a, xmlPullParser, "trimPathStart", 5, this.f103k);
                this.f101i = C0027d.m89b(m48a, xmlPullParser, "fillType", 13, this.f101i);
            }
            m48a.recycle();
        }

        @Override // p000a.p006b.p008b.p009a.C0032i.e
        /* renamed from: a */
        public boolean mo108a() {
            return this.f99g.m325c() || this.f97e.m325c();
        }

        @Override // p000a.p006b.p008b.p009a.C0032i.e
        /* renamed from: a */
        public boolean mo109a(int[] iArr) {
            return this.f97e.m323a(iArr) | this.f99g.m323a(iArr);
        }

        public float getFillAlpha() {
            return this.f102j;
        }

        public int getFillColor() {
            return this.f99g.f433c;
        }

        public float getStrokeAlpha() {
            return this.f100h;
        }

        public int getStrokeColor() {
            return this.f97e.f433c;
        }

        public float getStrokeWidth() {
            return this.f98f;
        }

        public float getTrimPathEnd() {
            return this.f104l;
        }

        public float getTrimPathOffset() {
            return this.f105m;
        }

        public float getTrimPathStart() {
            return this.f103k;
        }

        public void setFillAlpha(float f) {
            this.f102j = f;
        }

        public void setFillColor(int i) {
            this.f99g.f433c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f100h = f;
        }

        public void setStrokeColor(int i) {
            this.f97e.f433c = i;
        }

        public void setStrokeWidth(float f) {
            this.f98f = f;
        }

        public void setTrimPathEnd(float f) {
            this.f104l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f105m = f;
        }

        public void setTrimPathStart(float f) {
            this.f103k = f;
        }
    }

    /* renamed from: a.b.b.a.i$d */
    public static class d extends e {

        /* renamed from: a */
        public final Matrix f109a;

        /* renamed from: b */
        public final ArrayList<e> f110b;

        /* renamed from: c */
        public float f111c;

        /* renamed from: d */
        public float f112d;

        /* renamed from: e */
        public float f113e;

        /* renamed from: f */
        public float f114f;

        /* renamed from: g */
        public float f115g;

        /* renamed from: h */
        public float f116h;

        /* renamed from: i */
        public float f117i;

        /* renamed from: j */
        public final Matrix f118j;

        /* renamed from: k */
        public int f119k;

        /* renamed from: l */
        public int[] f120l;

        /* renamed from: m */
        public String f121m;

        public d() {
            super(null);
            this.f109a = new Matrix();
            this.f110b = new ArrayList<>();
            this.f111c = 0.0f;
            this.f112d = 0.0f;
            this.f113e = 0.0f;
            this.f114f = 1.0f;
            this.f115g = 1.0f;
            this.f116h = 0.0f;
            this.f117i = 0.0f;
            this.f118j = new Matrix();
            this.f121m = null;
        }

        public d(d dVar, C0096a<String, Object> c0096a) {
            super(null);
            f bVar;
            this.f109a = new Matrix();
            this.f110b = new ArrayList<>();
            this.f111c = 0.0f;
            this.f112d = 0.0f;
            this.f113e = 0.0f;
            this.f114f = 1.0f;
            this.f115g = 1.0f;
            this.f116h = 0.0f;
            this.f117i = 0.0f;
            this.f118j = new Matrix();
            this.f121m = null;
            this.f111c = dVar.f111c;
            this.f112d = dVar.f112d;
            this.f113e = dVar.f113e;
            this.f114f = dVar.f114f;
            this.f115g = dVar.f115g;
            this.f116h = dVar.f116h;
            this.f117i = dVar.f117i;
            this.f120l = dVar.f120l;
            this.f121m = dVar.f121m;
            this.f119k = dVar.f119k;
            String str = this.f121m;
            if (str != null) {
                c0096a.put(str, this);
            }
            this.f118j.set(dVar.f118j);
            ArrayList<e> arrayList = dVar.f110b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f110b.add(new d((d) eVar, c0096a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f110b.add(bVar);
                    String str2 = bVar.f123b;
                    if (str2 != null) {
                        c0096a.put(str2, bVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void m110a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m48a = C0027d.m48a(resources, theme, attributeSet, C0024a.f40b);
            this.f120l = null;
            this.f111c = C0027d.m32a(m48a, xmlPullParser, "rotation", 5, this.f111c);
            this.f112d = m48a.getFloat(1, this.f112d);
            this.f113e = m48a.getFloat(2, this.f113e);
            this.f114f = C0027d.m32a(m48a, xmlPullParser, "scaleX", 3, this.f114f);
            this.f115g = C0027d.m32a(m48a, xmlPullParser, "scaleY", 4, this.f115g);
            this.f116h = C0027d.m32a(m48a, xmlPullParser, "translateX", 6, this.f116h);
            this.f117i = C0027d.m32a(m48a, xmlPullParser, "translateY", 7, this.f117i);
            String string = m48a.getString(0);
            if (string != null) {
                this.f121m = string;
            }
            m111b();
            m48a.recycle();
        }

        @Override // p000a.p006b.p008b.p009a.C0032i.e
        /* renamed from: a */
        public boolean mo108a() {
            for (int i = 0; i < this.f110b.size(); i++) {
                if (this.f110b.get(i).mo108a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000a.p006b.p008b.p009a.C0032i.e
        /* renamed from: a */
        public boolean mo109a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f110b.size(); i++) {
                z |= this.f110b.get(i).mo109a(iArr);
            }
            return z;
        }

        /* renamed from: b */
        public final void m111b() {
            this.f118j.reset();
            this.f118j.postTranslate(-this.f112d, -this.f113e);
            this.f118j.postScale(this.f114f, this.f115g);
            this.f118j.postRotate(this.f111c, 0.0f, 0.0f);
            this.f118j.postTranslate(this.f116h + this.f112d, this.f117i + this.f113e);
        }

        public String getGroupName() {
            return this.f121m;
        }

        public Matrix getLocalMatrix() {
            return this.f118j;
        }

        public float getPivotX() {
            return this.f112d;
        }

        public float getPivotY() {
            return this.f113e;
        }

        public float getRotation() {
            return this.f111c;
        }

        public float getScaleX() {
            return this.f114f;
        }

        public float getScaleY() {
            return this.f115g;
        }

        public float getTranslateX() {
            return this.f116h;
        }

        public float getTranslateY() {
            return this.f117i;
        }

        public void setPivotX(float f) {
            if (f != this.f112d) {
                this.f112d = f;
                m111b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f113e) {
                this.f113e = f;
                m111b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f111c) {
                this.f111c = f;
                m111b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f114f) {
                this.f114f = f;
                m111b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f115g) {
                this.f115g = f;
                m111b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f116h) {
                this.f116h = f;
                m111b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f117i) {
                this.f117i = f;
                m111b();
            }
        }
    }

    /* renamed from: a.b.b.a.i$e */
    public static abstract class e {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
        }

        /* renamed from: a */
        public boolean mo108a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo109a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: a.b.b.a.i$f */
    public static abstract class f extends e {

        /* renamed from: a */
        public C0078b[] f122a;

        /* renamed from: b */
        public String f123b;

        /* renamed from: c */
        public int f124c;

        public f() {
            super(null);
            this.f122a = null;
        }

        public f(f fVar) {
            super(null);
            this.f122a = null;
            this.f123b = fVar.f123b;
            this.f124c = fVar.f124c;
            this.f122a = C0027d.m88a(fVar.f122a);
        }

        /* renamed from: a */
        public void m112a(Path path) {
            path.reset();
            C0078b[] c0078bArr = this.f122a;
            if (c0078bArr != null) {
                C0078b.m336a(c0078bArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo106b() {
            return false;
        }

        public C0078b[] getPathData() {
            return this.f122a;
        }

        public String getPathName() {
            return this.f123b;
        }

        public void setPathData(C0078b[] c0078bArr) {
            if (!C0027d.m85a(this.f122a, c0078bArr)) {
                this.f122a = C0027d.m88a(c0078bArr);
                return;
            }
            C0078b[] c0078bArr2 = this.f122a;
            for (int i = 0; i < c0078bArr.length; i++) {
                c0078bArr2[i].f450a = c0078bArr[i].f450a;
                for (int i2 = 0; i2 < c0078bArr[i].f451b.length; i2++) {
                    c0078bArr2[i].f451b[i2] = c0078bArr[i].f451b[i2];
                }
            }
        }
    }

    /* renamed from: a.b.b.a.i$g */
    public static class g {

        /* renamed from: q */
        public static final Matrix f125q = new Matrix();

        /* renamed from: a */
        public final Path f126a;

        /* renamed from: b */
        public final Path f127b;

        /* renamed from: c */
        public final Matrix f128c;

        /* renamed from: d */
        public Paint f129d;

        /* renamed from: e */
        public Paint f130e;

        /* renamed from: f */
        public PathMeasure f131f;

        /* renamed from: g */
        public int f132g;

        /* renamed from: h */
        public final d f133h;

        /* renamed from: i */
        public float f134i;

        /* renamed from: j */
        public float f135j;

        /* renamed from: k */
        public float f136k;

        /* renamed from: l */
        public float f137l;

        /* renamed from: m */
        public int f138m;

        /* renamed from: n */
        public String f139n;

        /* renamed from: o */
        public Boolean f140o;

        /* renamed from: p */
        public final C0096a<String, Object> f141p;

        public g() {
            this.f128c = new Matrix();
            this.f134i = 0.0f;
            this.f135j = 0.0f;
            this.f136k = 0.0f;
            this.f137l = 0.0f;
            this.f138m = 255;
            this.f139n = null;
            this.f140o = null;
            this.f141p = new C0096a<>();
            this.f133h = new d();
            this.f126a = new Path();
            this.f127b = new Path();
        }

        public g(g gVar) {
            this.f128c = new Matrix();
            this.f134i = 0.0f;
            this.f135j = 0.0f;
            this.f136k = 0.0f;
            this.f137l = 0.0f;
            this.f138m = 255;
            this.f139n = null;
            this.f140o = null;
            this.f141p = new C0096a<>();
            this.f133h = new d(gVar.f133h, this.f141p);
            this.f126a = new Path(gVar.f126a);
            this.f127b = new Path(gVar.f127b);
            this.f134i = gVar.f134i;
            this.f135j = gVar.f135j;
            this.f136k = gVar.f136k;
            this.f137l = gVar.f137l;
            this.f132g = gVar.f132g;
            this.f138m = gVar.f138m;
            this.f139n = gVar.f139n;
            String str = gVar.f139n;
            if (str != null) {
                this.f141p.put(str, this);
            }
            this.f140o = gVar.f140o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v20 */
        /* renamed from: a */
        public final void m113a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            dVar.f109a.set(matrix);
            dVar.f109a.preConcat(dVar.f118j);
            canvas.save();
            int r11 = 0;
            int i3 = 0;
            while (i3 < dVar.f110b.size()) {
                e eVar = dVar.f110b.get(i3);
                if (eVar instanceof d) {
                    m113a((d) eVar, dVar.f109a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f = i / gVar2.f136k;
                    float f2 = i2 / gVar2.f137l;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = dVar.f109a;
                    gVar2.f128c.set(matrix2);
                    gVar2.f128c.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[r11], fArr[1]);
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f3 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f3) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        fVar.m112a(gVar.f126a);
                        Path path = gVar.f126a;
                        gVar.f127b.reset();
                        if (fVar.mo106b()) {
                            gVar.f127b.addPath(path, gVar.f128c);
                            canvas.clipPath(gVar.f127b);
                        } else {
                            c cVar = (c) fVar;
                            if (cVar.f103k != 0.0f || cVar.f104l != 1.0f) {
                                float f4 = cVar.f103k;
                                float f5 = cVar.f105m;
                                float f6 = (f4 + f5) % 1.0f;
                                float f7 = (cVar.f104l + f5) % 1.0f;
                                if (gVar.f131f == null) {
                                    gVar.f131f = new PathMeasure();
                                }
                                gVar.f131f.setPath(gVar.f126a, r11 != 0);
                                float length = gVar.f131f.getLength();
                                float f8 = f6 * length;
                                float f9 = f7 * length;
                                path.reset();
                                if (f8 > f9) {
                                    gVar.f131f.getSegment(f8, length, path, true);
                                    gVar.f131f.getSegment(0.0f, f9, path, true);
                                } else {
                                    gVar.f131f.getSegment(f8, f9, path, true);
                                }
                                path.rLineTo(0.0f, 0.0f);
                            }
                            gVar.f127b.addPath(path, gVar.f128c);
                            if (cVar.f99g.m326d()) {
                                C0069a c0069a = cVar.f99g;
                                if (gVar.f130e == null) {
                                    gVar.f130e = new Paint(1);
                                    gVar.f130e.setStyle(Paint.Style.FILL);
                                }
                                Paint paint = gVar.f130e;
                                if (c0069a.m324b()) {
                                    Shader m322a = c0069a.m322a();
                                    m322a.setLocalMatrix(gVar.f128c);
                                    paint.setShader(m322a);
                                    paint.setAlpha(Math.round(cVar.f102j * 255.0f));
                                } else {
                                    paint.setColor(C0032i.m102a(c0069a.f433c, cVar.f102j));
                                }
                                paint.setColorFilter(colorFilter);
                                gVar.f127b.setFillType(cVar.f101i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(gVar.f127b, paint);
                            }
                            if (cVar.f97e.m326d()) {
                                C0069a c0069a2 = cVar.f97e;
                                if (gVar.f129d == null) {
                                    gVar.f129d = new Paint(1);
                                    gVar.f129d.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint2 = gVar.f129d;
                                Paint.Join join = cVar.f107o;
                                if (join != null) {
                                    paint2.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.f106n;
                                if (cap != null) {
                                    paint2.setStrokeCap(cap);
                                }
                                paint2.setStrokeMiter(cVar.f108p);
                                if (c0069a2.m324b()) {
                                    Shader m322a2 = c0069a2.m322a();
                                    m322a2.setLocalMatrix(gVar.f128c);
                                    paint2.setShader(m322a2);
                                    paint2.setAlpha(Math.round(cVar.f100h * 255.0f));
                                } else {
                                    paint2.setColor(C0032i.m102a(c0069a2.f433c, cVar.f100h));
                                }
                                paint2.setColorFilter(colorFilter);
                                paint2.setStrokeWidth(cVar.f98f * abs * min);
                                canvas.drawPath(gVar.f127b, paint2);
                            }
                        }
                    }
                    i3++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                gVar = gVar2;
                i3++;
                gVar2 = gVar;
                r11 = 0;
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void m114a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m113a(this.f133h, f125q, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean m115a() {
            if (this.f140o == null) {
                this.f140o = Boolean.valueOf(this.f133h.mo108a());
            }
            return this.f140o.booleanValue();
        }

        /* renamed from: a */
        public boolean m116a(int[] iArr) {
            return this.f133h.mo109a(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f138m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f138m = i;
        }
    }

    /* renamed from: a.b.b.a.i$h */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f142a;

        /* renamed from: b */
        public g f143b;

        /* renamed from: c */
        public ColorStateList f144c;

        /* renamed from: d */
        public PorterDuff.Mode f145d;

        /* renamed from: e */
        public boolean f146e;

        /* renamed from: f */
        public Bitmap f147f;

        /* renamed from: g */
        public ColorStateList f148g;

        /* renamed from: h */
        public PorterDuff.Mode f149h;

        /* renamed from: i */
        public int f150i;

        /* renamed from: j */
        public boolean f151j;

        /* renamed from: k */
        public boolean f152k;

        /* renamed from: l */
        public Paint f153l;

        public h() {
            this.f144c = null;
            this.f145d = C0032i.f87k;
            this.f143b = new g();
        }

        public h(h hVar) {
            this.f144c = null;
            this.f145d = C0032i.f87k;
            if (hVar != null) {
                this.f142a = hVar.f142a;
                this.f143b = new g(hVar.f143b);
                Paint paint = hVar.f143b.f130e;
                if (paint != null) {
                    this.f143b.f130e = new Paint(paint);
                }
                Paint paint2 = hVar.f143b.f129d;
                if (paint2 != null) {
                    this.f143b.f129d = new Paint(paint2);
                }
                this.f144c = hVar.f144c;
                this.f145d = hVar.f145d;
                this.f146e = hVar.f146e;
            }
        }

        /* renamed from: a */
        public Paint m117a(ColorFilter colorFilter) {
            if (!m123b() && colorFilter == null) {
                return null;
            }
            if (this.f153l == null) {
                this.f153l = new Paint();
                this.f153l.setFilterBitmap(true);
            }
            this.f153l.setAlpha(this.f143b.getRootAlpha());
            this.f153l.setColorFilter(colorFilter);
            return this.f153l;
        }

        /* renamed from: a */
        public void m118a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f147f, (Rect) null, rect, m117a(colorFilter));
        }

        /* renamed from: a */
        public boolean m119a() {
            return !this.f152k && this.f148g == this.f144c && this.f149h == this.f145d && this.f151j == this.f146e && this.f150i == this.f143b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean m120a(int i, int i2) {
            return i == this.f147f.getWidth() && i2 == this.f147f.getHeight();
        }

        /* renamed from: a */
        public boolean m121a(int[] iArr) {
            boolean m116a = this.f143b.m116a(iArr);
            this.f152k |= m116a;
            return m116a;
        }

        /* renamed from: b */
        public void m122b(int i, int i2) {
            if (this.f147f == null || !m120a(i, i2)) {
                this.f147f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f152k = true;
            }
        }

        /* renamed from: b */
        public boolean m123b() {
            return this.f143b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void m124c(int i, int i2) {
            this.f147f.eraseColor(0);
            this.f143b.m114a(new Canvas(this.f147f), i, i2, null);
        }

        /* renamed from: c */
        public boolean m125c() {
            return this.f143b.m115a();
        }

        /* renamed from: d */
        public void m126d() {
            this.f148g = this.f144c;
            this.f149h = this.f145d;
            this.f150i = this.f143b.getRootAlpha();
            this.f151j = this.f146e;
            this.f152k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f142a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0032i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0032i(this);
        }
    }

    /* renamed from: a.b.b.a.i$i */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f154a;

        public i(Drawable.ConstantState constantState) {
            this.f154a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f154a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f154a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0032i c0032i = new C0032i();
            c0032i.f86b = (VectorDrawable) this.f154a.newDrawable();
            return c0032i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0032i c0032i = new C0032i();
            c0032i.f86b = (VectorDrawable) this.f154a.newDrawable(resources);
            return c0032i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0032i c0032i = new C0032i();
            c0032i.f86b = (VectorDrawable) this.f154a.newDrawable(resources, theme);
            return c0032i;
        }
    }

    public C0032i() {
        this.f92g = true;
        this.f93h = new float[9];
        this.f94i = new Matrix();
        this.f95j = new Rect();
        this.f88c = new h();
    }

    public C0032i(h hVar) {
        this.f92g = true;
        this.f93h = new float[9];
        this.f94i = new Matrix();
        this.f95j = new Rect();
        this.f88c = hVar;
        this.f89d = m104a(hVar.f144c, hVar.f145d);
    }

    /* renamed from: a */
    public static int m102a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    /* renamed from: a */
    public static C0032i m103a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0032i c0032i = new C0032i();
            c0032i.f86b = Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
            new i(c0032i.f86b.getConstantState());
            return c0032i;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static C0032i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0032i c0032i = new C0032i();
        c0032i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0032i;
    }

    /* renamed from: a */
    public PorterDuffColorFilter m104a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f86b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        if (r6 == 1) goto L50;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p008b.p009a.C0032i.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f86b;
        if (drawable == null) {
            return this.f88c.f143b.getRootAlpha();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f88c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f86b;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new i(drawable.getConstantState());
        }
        this.f88c.f142a = getChangingConfigurations();
        return this.f88c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f88c.f143b.f135j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f88c.f143b.f134i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        h hVar = this.f88c;
        hVar.f143b = new g();
        TypedArray m48a = C0027d.m48a(resources, theme, attributeSet, C0024a.f39a);
        h hVar2 = this.f88c;
        g gVar = hVar2.f143b;
        int m89b = C0027d.m89b(m48a, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (m89b == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (m89b != 5) {
            if (m89b != 9) {
                switch (m89b) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        hVar2.f145d = mode;
        int i2 = 1;
        ColorStateList colorStateList = m48a.getColorStateList(1);
        if (colorStateList != null) {
            hVar2.f144c = colorStateList;
        }
        boolean z = hVar2.f146e;
        if (C0027d.m84a(xmlPullParser, "autoMirrored")) {
            z = m48a.getBoolean(5, z);
        }
        hVar2.f146e = z;
        gVar.f136k = C0027d.m32a(m48a, xmlPullParser, "viewportWidth", 7, gVar.f136k);
        gVar.f137l = C0027d.m32a(m48a, xmlPullParser, "viewportHeight", 8, gVar.f137l);
        if (gVar.f136k <= 0.0f) {
            throw new XmlPullParserException(m48a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (gVar.f137l <= 0.0f) {
            throw new XmlPullParserException(m48a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f134i = m48a.getDimension(3, gVar.f134i);
        int i3 = 2;
        gVar.f135j = m48a.getDimension(2, gVar.f135j);
        if (gVar.f134i <= 0.0f) {
            throw new XmlPullParserException(m48a.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (gVar.f135j <= 0.0f) {
            throw new XmlPullParserException(m48a.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C0027d.m32a(m48a, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = m48a.getString(0);
        if (string != null) {
            gVar.f139n = string;
            gVar.f141p.put(string, gVar);
        }
        m48a.recycle();
        hVar.f142a = getChangingConfigurations();
        hVar.f152k = true;
        h hVar3 = this.f88c;
        g gVar2 = hVar3.f143b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar2.f133h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == i3) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m107a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f110b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar2.f141p.put(cVar.getPathName(), cVar);
                    }
                    hVar3.f142a = cVar.f124c | hVar3.f142a;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m105a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f110b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar2.f141p.put(bVar.getPathName(), bVar);
                    }
                    hVar3.f142a = bVar.f124c | hVar3.f142a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m110a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f110b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar2.f141p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar3.f142a = dVar2.f119k | hVar3.f142a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
            i2 = 1;
            i3 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f89d = m104a(hVar.f144c, hVar.f145d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f86b;
        return drawable != null ? C0027d.m80a(drawable) : this.f88c.f146e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f88c) != null && (hVar.m125c() || ((colorStateList = this.f88c.f144c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f91f && super.mutate() == this) {
            this.f88c = new h(this.f88c);
            this.f91f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f86b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f88c;
        ColorStateList colorStateList = hVar.f144c;
        if (colorStateList != null && (mode = hVar.f145d) != null) {
            this.f89d = m104a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.m125c() || !hVar.m121a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f88c.f143b.getRootAlpha() != i2) {
            this.f88c.f143b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m67a(drawable, z);
        } else {
            this.f88c.f146e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f90e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTint(int i2) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m63a(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m65a(drawable, colorStateList);
            return;
        }
        h hVar = this.f88c;
        if (hVar.f144c != colorStateList) {
            hVar.f144c = colorStateList;
            this.f89d = m104a(colorStateList, hVar.f145d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m66a(drawable, mode);
            return;
        }
        h hVar = this.f88c;
        if (hVar.f145d != mode) {
            hVar.f145d = mode;
            this.f89d = m104a(hVar.f144c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
