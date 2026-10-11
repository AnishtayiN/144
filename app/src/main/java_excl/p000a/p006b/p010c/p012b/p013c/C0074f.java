package p000a.p006b.p010c.p012b.p013c;

import java.util.List;

/* renamed from: a.b.c.b.c.f */
/* loaded from: classes.dex */
public final class C0074f {

    /* renamed from: a */
    public final int[] f444a;

    /* renamed from: b */
    public final float[] f445b;

    public C0074f(int i, int i2) {
        this.f444a = new int[]{i, i2};
        this.f445b = new float[]{0.0f, 1.0f};
    }

    public C0074f(int i, int i2, int i3) {
        this.f444a = new int[]{i, i2, i3};
        this.f445b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0074f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f444a = new int[size];
        this.f445b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f444a[i] = list.get(i).intValue();
            this.f445b[i] = list2.get(i).floatValue();
        }
    }
}
