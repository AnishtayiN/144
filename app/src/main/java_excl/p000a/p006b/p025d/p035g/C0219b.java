package p000a.p006b.p025d.p035g;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* renamed from: a.b.d.g.b */
/* loaded from: classes.dex */
public class C0219b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f1202a;

    public C0219b(ActionBarContainer actionBarContainer) {
        this.f1202a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1202a;
        if (actionBarContainer.f1775i) {
            Drawable drawable = actionBarContainer.f1774h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1772f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1202a;
        Drawable drawable3 = actionBarContainer2.f1773g;
        if (drawable3 == null || !actionBarContainer2.f1776j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1202a;
        if (actionBarContainer.f1775i) {
            Drawable drawable = actionBarContainer.f1774h;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1772f;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
