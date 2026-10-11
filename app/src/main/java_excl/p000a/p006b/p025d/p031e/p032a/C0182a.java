package p000a.p006b.p025d.p031e.p032a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import p000a.p006b.p008b.p009a.C0026c;
import p000a.p006b.p010c.p020g.C0101f;
import p000a.p006b.p010c.p020g.C0105j;
import p000a.p006b.p025d.p031e.p032a.C0183b;
import p000a.p006b.p025d.p031e.p032a.C0185d;

/* renamed from: a.b.d.e.a.a */
/* loaded from: classes.dex */
public class C0182a extends C0185d {

    /* renamed from: p */
    public c f856p;

    /* renamed from: q */
    public g f857q;

    /* renamed from: r */
    public int f858r;

    /* renamed from: s */
    public int f859s;

    /* renamed from: t */
    public boolean f860t;

    /* renamed from: a.b.d.e.a.a$b */
    public static class b extends g {

        /* renamed from: a */
        public final Animatable f861a;

        public b(Animatable animatable) {
            super(null);
            this.f861a = animatable;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: c */
        public void mo622c() {
            this.f861a.start();
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: d */
        public void mo623d() {
            this.f861a.stop();
        }
    }

    /* renamed from: a.b.d.e.a.a$c */
    public static class c extends C0185d.a {

        /* renamed from: K */
        public C0101f<Long> f862K;

        /* renamed from: L */
        public C0105j<Integer> f863L;

        public c(c cVar, C0182a c0182a, Resources resources) {
            super(cVar, c0182a, resources);
            if (cVar != null) {
                this.f862K = cVar.f862K;
                this.f863L = cVar.f863L;
            } else {
                this.f862K = new C0101f<>();
                this.f863L = new C0105j<>(10);
            }
        }

        /* renamed from: b */
        public static long m624b(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: a */
        public int m625a(int i, int i2, Drawable drawable, boolean z) {
            int m635a = super.m635a(drawable);
            long m624b = m624b(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = m635a;
            this.f862K.m402a(m624b, Long.valueOf(j2 | j));
            if (z) {
                this.f862K.m402a(m624b(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m635a;
        }

        /* renamed from: b */
        public int m626b(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f863L.m426b(i, 0).intValue();
        }

        /* renamed from: b */
        public int m627b(int[] iArr) {
            int m643a = super.m643a(iArr);
            return m643a >= 0 ? m643a : super.m643a(StateSet.WILD_CARD);
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0185d.a, p000a.p006b.p025d.p031e.p032a.C0183b.c
        /* renamed from: d */
        public void mo628d() {
            this.f862K = this.f862K.m1891clone();
            this.f863L = this.f863L.m1892clone();
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0185d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0182a(this, null);
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0185d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0182a(this, resources);
        }
    }

    /* renamed from: a.b.d.e.a.a$d */
    public static class d extends g {

        /* renamed from: a */
        public final C0026c f864a;

        public d(C0026c c0026c) {
            super(null);
            this.f864a = c0026c;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: c */
        public void mo622c() {
            this.f864a.start();
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: d */
        public void mo623d() {
            this.f864a.stop();
        }
    }

    /* renamed from: a.b.d.e.a.a$e */
    public static class e extends g {

        /* renamed from: a */
        public final ObjectAnimator f865a;

        /* renamed from: b */
        public final boolean f866b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.f869c);
            ofInt.setInterpolator(fVar);
            this.f866b = z2;
            this.f865a = ofInt;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: a */
        public boolean mo629a() {
            return this.f866b;
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: b */
        public void mo630b() {
            this.f865a.reverse();
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: c */
        public void mo622c() {
            this.f865a.start();
        }

        @Override // p000a.p006b.p025d.p031e.p032a.C0182a.g
        /* renamed from: d */
        public void mo623d() {
            this.f865a.cancel();
        }
    }

    /* renamed from: a.b.d.e.a.a$f */
    public static class f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f867a;

        /* renamed from: b */
        public int f868b;

        /* renamed from: c */
        public int f869c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f868b = numberOfFrames;
            int[] iArr = this.f867a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f867a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f867a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f869c = i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f869c) + 0.5f);
            int i2 = this.f868b;
            int[] iArr = this.f867a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f869c : 0.0f);
        }
    }

    /* renamed from: a.b.d.e.a.a$g */
    public static abstract class g {
        public /* synthetic */ g(a aVar) {
        }

        /* renamed from: a */
        public boolean mo629a() {
            return false;
        }

        /* renamed from: b */
        public void mo630b() {
        }

        /* renamed from: c */
        public abstract void mo622c();

        /* renamed from: d */
        public abstract void mo623d();
    }

    public C0182a() {
        this(null, null);
    }

    public C0182a(c cVar, Resources resources) {
        super(null);
        this.f858r = -1;
        this.f859s = -1;
        c cVar2 = new c(cVar, this, resources);
        super.mo621a(cVar2);
        this.f856p = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(p038c.p039a.p040a.p041a.C0335a.m1133a(r19, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01f3, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01fa, code lost:
    
        return r5;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p006b.p025d.p031e.p032a.C0182a m619a(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p031e.p032a.C0182a.m619a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.b.d.e.a.a");
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0185d, p000a.p006b.p025d.p031e.p032a.C0183b
    /* renamed from: a */
    public C0183b.c mo620a() {
        return new c(this.f856p, this, null);
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0185d, p000a.p006b.p025d.p031e.p032a.C0183b
    /* renamed from: a */
    public C0185d.a mo620a() {
        return new c(this.f856p, this, null);
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0185d, p000a.p006b.p025d.p031e.p032a.C0183b
    /* renamed from: a */
    public void mo621a(C0183b.c cVar) {
        super.mo621a(cVar);
        if (cVar instanceof c) {
            this.f856p = (c) cVar;
        }
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0185d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0183b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f857q;
        if (gVar != null) {
            gVar.mo623d();
            this.f857q = null;
            m634a(this.f858r);
            this.f858r = -1;
            this.f859s = -1;
        }
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0185d, p000a.p006b.p025d.p031e.p032a.C0183b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f860t) {
            super.mutate();
            if (this == this) {
                this.f856p.mo628d();
                this.f860t = true;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00e2  */
    @Override // p000a.p006b.p025d.p031e.p032a.C0185d, p000a.p006b.p025d.p031e.p032a.C0183b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p031e.p032a.C0182a.onStateChange(int[]):boolean");
    }

    @Override // p000a.p006b.p025d.p031e.p032a.C0183b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f857q != null && (visible || z2)) {
            if (z) {
                this.f857q.mo622c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
