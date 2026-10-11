package p000a.p006b.p025d.p031e.p032a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p000a.p006b.p025d.p031e.p032a.C0183b;

/* renamed from: a.b.d.e.a.d */
/* loaded from: classes.dex */
public class C0185d extends C0183b {

    /* renamed from: n */
    public a f920n;

    /* renamed from: o */
    public boolean f921o;

    /* renamed from: a.b.d.e.a.d$a */
    public static class a extends C0183b.c {

        /* renamed from: J */
        public int[][] f922J;

        public a(a aVar, C0185d c0185d, Resources resources) {
            super(aVar, c0185d, resources);
            if (aVar != null) {
                this.f922J = aVar.f922J;
            } else {
                this.f922J = new int[this.f899g.length][];
            }
        }

        /* renamed from: a */
        public int m643a(int[] iArr) {
            int[][] iArr2 = this.f922J;
            int i = this.f900h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0183b.c
        /* renamed from: a */
        public void mo637a(int i, int i2) {
            super.mo637a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f922J, 0, iArr, 0, i);
            this.f922J = iArr;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0183b.c
        /* renamed from: d */
        public void mo628d() {
            int[][] iArr = this.f922J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f922J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f922J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0185d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0185d(this, resources);
        }
    }

    public C0185d(a aVar) {
        if (aVar != null) {
            mo621a(aVar);
        }
    }

    public C0185d(a aVar, Resources resources) {
        mo621a(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0183b
    /* renamed from: a */
    public a mo620a() {
        return new a(this.f920n, this, null);
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0183b
    /* renamed from: a */
    public void mo621a(C0183b.c cVar) {
        super.mo621a(cVar);
        if (cVar instanceof a) {
            this.f920n = (a) cVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f870b.m638a(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0183b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f921o) {
            super.mutate();
            if (this == this) {
                this.f920n.mo628d();
                this.f921o = true;
            }
        }
        return this;
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0183b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m643a = this.f920n.m643a(iArr);
        if (m643a < 0) {
            m643a = this.f920n.m643a(StateSet.WILD_CARD);
        }
        return m634a(m643a) || onStateChange;
    }
}
