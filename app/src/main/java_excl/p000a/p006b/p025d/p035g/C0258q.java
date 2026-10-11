package p000a.p006b.p025d.p035g;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p000a.p006b.p010c.p014c.p015i.C0087c;
import p000a.p006b.p010c.p014c.p015i.InterfaceC0086b;

/* renamed from: a.b.d.g.q */
/* loaded from: classes.dex */
public class C0258q {

    /* renamed from: c */
    public static final int[] f1416c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final ProgressBar f1417a;

    /* renamed from: b */
    public Bitmap f1418b;

    public C0258q(ProgressBar progressBar) {
        this.f1417a = progressBar;
    }

    /* renamed from: a */
    public final Drawable m893a(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0086b) {
            C0087c c0087c = (C0087c) drawable;
            Drawable drawable2 = c0087c.f471g;
            if (drawable2 == null) {
                return drawable;
            }
            c0087c.m358a(m893a(drawable2, z));
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1418b == null) {
                this.f1418b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m893a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
        }
        return layerDrawable2;
    }

    /* renamed from: a */
    public void mo894a(AttributeSet attributeSet, int i) {
        C0224c1 m775a = C0224c1.m775a(this.f1417a.getContext(), attributeSet, f1416c, i, 0);
        Drawable m783c = m775a.m783c(0);
        if (m783c != null) {
            ProgressBar progressBar = this.f1417a;
            if (m783c instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m783c;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable m893a = m893a(animationDrawable.getFrame(i2), true);
                    m893a.setLevel(10000);
                    animationDrawable2.addFrame(m893a, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                m783c = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m783c);
        }
        Drawable m783c2 = m775a.m783c(1);
        if (m783c2 != null) {
            this.f1417a.setProgressDrawable(m893a(m783c2, false));
        }
        m775a.f1236b.recycle();
    }
}
