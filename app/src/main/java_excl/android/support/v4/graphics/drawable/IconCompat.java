package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    public static final PorterDuff.Mode f1599j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1600a;

    /* renamed from: b */
    public Object f1601b;

    /* renamed from: c */
    public byte[] f1602c;

    /* renamed from: d */
    public Parcelable f1603d;

    /* renamed from: e */
    public int f1604e;

    /* renamed from: f */
    public int f1605f;

    /* renamed from: g */
    public ColorStateList f1606g = null;

    /* renamed from: h */
    public PorterDuff.Mode f1607h = f1599j;

    /* renamed from: i */
    public String f1608i;

    /* renamed from: a */
    public int m976a() {
        int i;
        if (this.f1600a != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            if (this.f1600a == 2) {
                return this.f1604e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Icon icon = (Icon) this.f1601b;
        if (i >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: a */
    public void m977a(boolean z) {
        this.f1608i = this.f1607h.name();
        int i = this.f1600a;
        if (i == -1) {
            if (z) {
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            }
            this.f1603d = (Parcelable) this.f1601b;
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f1602c = ((String) this.f1601b).getBytes(Charset.forName("UTF-16"));
                return;
            }
            if (i == 3) {
                this.f1602c = (byte[]) this.f1601b;
                return;
            } else if (i == 4) {
                this.f1602c = this.f1601b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            } else if (i != 5) {
                return;
            }
        }
        if (!z) {
            this.f1603d = (Parcelable) this.f1601b;
            return;
        }
        Bitmap bitmap = (Bitmap) this.f1601b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
        this.f1602c = byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public String m978b() {
        int i;
        if (this.f1600a != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            if (this.f1600a == 2) {
                return ((String) this.f1601b).split(":", -1)[0];
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        Icon icon = (Icon) this.f1601b;
        if (i >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: c */
    public void m979c() {
        this.f1607h = PorterDuff.Mode.valueOf(this.f1608i);
        int i = this.f1600a;
        if (i == -1) {
            Parcelable parcelable = this.f1603d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
            this.f1601b = parcelable;
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f1601b = this.f1602c;
                    return;
                } else if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                }
            }
            this.f1601b = new String(this.f1602c, Charset.forName("UTF-16"));
            return;
        }
        Parcelable parcelable2 = this.f1603d;
        if (parcelable2 != null) {
            this.f1601b = parcelable2;
            return;
        }
        byte[] bArr = this.f1602c;
        this.f1601b = bArr;
        this.f1600a = 3;
        this.f1604e = 0;
        this.f1605f = bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r1 != 5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.f1600a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r7.f1601b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r7.f1600a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == r6) goto L33
            if (r1 == r5) goto L30
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L2a
            if (r1 == r2) goto L27
            java.lang.String r1 = "UNKNOWN"
            goto L35
        L27:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L35
        L2a:
            java.lang.String r1 = "URI"
            goto L35
        L2d:
            java.lang.String r1 = "DATA"
            goto L35
        L30:
            java.lang.String r1 = "RESOURCE"
            goto L35
        L33:
            java.lang.String r1 = "BITMAP"
        L35:
            r0.append(r1)
            int r1 = r7.f1600a
            if (r1 == r6) goto L91
            if (r1 == r5) goto L69
            if (r1 == r4) goto L50
            if (r1 == r3) goto L45
            if (r1 == r2) goto L91
            goto Lb1
        L45:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r7.f1601b
            r0.append(r1)
            goto Lb1
        L50:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r7.f1604e
            r0.append(r1)
            int r1 = r7.f1605f
            if (r1 == 0) goto Lb1
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r7.f1605f
            r0.append(r1)
            goto Lb1
        L69:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r7.m978b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r2 = 0
            int r3 = r7.m976a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto Lb1
        L91:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r7.f1601b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r7.f1601b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        Lb1:
            android.content.res.ColorStateList r1 = r7.f1606g
            if (r1 == 0) goto Lbf
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r7.f1606g
            r0.append(r1)
        Lbf:
            android.graphics.PorterDuff$Mode r1 = r7.f1607h
            android.graphics.PorterDuff$Mode r2 = android.support.v4.graphics.drawable.IconCompat.f1599j
            if (r1 == r2) goto Lcf
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r7.f1607h
            r0.append(r1)
        Lcf:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
