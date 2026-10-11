package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.CardView;
import p000a.p006b.p025d.p035g.C0265t0;

/* renamed from: a.b.d.g.c0 */
/* loaded from: classes.dex */
public class C0223c0 implements InterfaceC0229e0 {

    /* renamed from: a */
    public final RectF f1233a = new RectF();

    /* renamed from: a.b.d.g.c0$a */
    public class a implements C0265t0.a {
        public a() {
        }

        @Override // p000a.p006b.p025d.p035g.C0265t0.a
        /* renamed from: a */
        public void mo747a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0223c0.this.f1233a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C0223c0.this.f1233a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0223c0.this.f1233a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0223c0.this.f1233a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0223c0.this.f1233a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = (rectF.left + f3) - 1.0f;
                float f6 = rectF.top;
                canvas.drawRect(f5, f6, (rectF.right - f3) + 1.0f, f6 + f3, paint);
                float f7 = (rectF.left + f3) - 1.0f;
                float f8 = rectF.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF.right - f3) + 1.0f, f8, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public float mo749a(InterfaceC0226d0 interfaceC0226d0) {
        C0265t0 m773i = m773i(interfaceC0226d0);
        float f = m773i.f1450h;
        return (((m773i.f1450h * 1.5f) + m773i.f1443a) * 2.0f) + (Math.max(f, ((f * 1.5f) / 2.0f) + m773i.f1448f + m773i.f1443a) * 2.0f);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo746a() {
        C0265t0.f1442r = new a();
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo750a(InterfaceC0226d0 interfaceC0226d0, float f) {
        m773i(interfaceC0226d0).m901a(f);
        m774j(interfaceC0226d0);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo751a(InterfaceC0226d0 interfaceC0226d0, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0265t0 c0265t0 = new C0265t0(context.getResources(), colorStateList, f, f2, f3);
        CardView.C0304a c0304a = (CardView.C0304a) interfaceC0226d0;
        c0265t0.f1457o = c0304a.m1057a();
        c0265t0.invalidateSelf();
        c0304a.f1853a = c0265t0;
        CardView.this.setBackgroundDrawable(c0265t0);
        m774j(c0304a);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo752a(InterfaceC0226d0 interfaceC0226d0, ColorStateList colorStateList) {
        C0265t0 m773i = m773i(interfaceC0226d0);
        m773i.m903a(colorStateList);
        m773i.invalidateSelf();
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: b */
    public float mo753b(InterfaceC0226d0 interfaceC0226d0) {
        C0265t0 m773i = m773i(interfaceC0226d0);
        float f = m773i.f1450h;
        return ((m773i.f1450h + m773i.f1443a) * 2.0f) + (Math.max(f, (f / 2.0f) + m773i.f1448f + m773i.f1443a) * 2.0f);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: b */
    public void mo754b(InterfaceC0226d0 interfaceC0226d0, float f) {
        C0265t0 m773i = m773i(interfaceC0226d0);
        m773i.m902a(f, m773i.f1450h);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: c */
    public void mo755c(InterfaceC0226d0 interfaceC0226d0) {
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: c */
    public void mo756c(InterfaceC0226d0 interfaceC0226d0, float f) {
        C0265t0 m773i = m773i(interfaceC0226d0);
        m773i.m902a(m773i.f1452j, f);
        m774j(interfaceC0226d0);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: d */
    public void mo757d(InterfaceC0226d0 interfaceC0226d0) {
        C0265t0 m773i = m773i(interfaceC0226d0);
        CardView.C0304a c0304a = (CardView.C0304a) interfaceC0226d0;
        m773i.f1457o = c0304a.m1057a();
        m773i.invalidateSelf();
        m774j(c0304a);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: e */
    public float mo758e(InterfaceC0226d0 interfaceC0226d0) {
        return m773i(interfaceC0226d0).f1452j;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: f */
    public float mo759f(InterfaceC0226d0 interfaceC0226d0) {
        return m773i(interfaceC0226d0).f1448f;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: g */
    public float mo760g(InterfaceC0226d0 interfaceC0226d0) {
        return m773i(interfaceC0226d0).f1450h;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: h */
    public ColorStateList mo761h(InterfaceC0226d0 interfaceC0226d0) {
        return m773i(interfaceC0226d0).f1453k;
    }

    /* renamed from: i */
    public final C0265t0 m773i(InterfaceC0226d0 interfaceC0226d0) {
        return (C0265t0) ((CardView.C0304a) interfaceC0226d0).f1853a;
    }

    /* renamed from: j */
    public void m774j(InterfaceC0226d0 interfaceC0226d0) {
        Rect rect = new Rect();
        m773i(interfaceC0226d0).getPadding(rect);
        int ceil = (int) Math.ceil(mo753b(interfaceC0226d0));
        int ceil2 = (int) Math.ceil(mo749a(interfaceC0226d0));
        CardView.C0304a c0304a = (CardView.C0304a) interfaceC0226d0;
        CardView cardView = CardView.this;
        if (ceil > cardView.f1848d) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(ceil);
        }
        CardView cardView2 = CardView.this;
        if (ceil2 > cardView2.f1849e) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(ceil2);
        }
        ((CardView.C0304a) interfaceC0226d0).m1056a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
