package p000a.p006b.p008b.p009a;

import android.animation.TypeEvaluator;
import p000a.p006b.p010c.p014c.C0078b;

/* renamed from: a.b.b.a.e */
/* loaded from: classes.dex */
public class C0028e implements TypeEvaluator<C0078b[]> {

    /* renamed from: a */
    public C0078b[] f82a;

    @Override // android.animation.TypeEvaluator
    public C0078b[] evaluate(float f, C0078b[] c0078bArr, C0078b[] c0078bArr2) {
        C0078b[] c0078bArr3 = c0078bArr;
        C0078b[] c0078bArr4 = c0078bArr2;
        if (!C0027d.m85a(c0078bArr3, c0078bArr4)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        C0078b[] c0078bArr5 = this.f82a;
        if (c0078bArr5 == null || !C0027d.m85a(c0078bArr5, c0078bArr3)) {
            this.f82a = C0027d.m88a(c0078bArr3);
        }
        for (int i = 0; i < c0078bArr3.length; i++) {
            this.f82a[i].m337a(c0078bArr3[i], c0078bArr4[i], f);
        }
        return this.f82a;
    }
}
