package p000a.p006b.p010c.p011a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000a.p006b.p007a.C0022b;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.c.a.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC0036b0 {
    /* renamed from: a */
    public static boolean m137a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public static boolean m138a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo139a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public void m140a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    /* renamed from: a */
    public abstract void mo141a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo142a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo143a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo144a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo145a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo146a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo147a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public void m148a(ArrayList<View> arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (Build.VERSION.SDK_INT >= 21) {
                z = viewGroup.isTransitionGroup();
            } else {
                Boolean bool = (Boolean) viewGroup.getTag(C0022b.tag_transition_group);
                z = ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0119n.m470e(viewGroup) == null) ? false : true;
            }
            if (z) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m148a(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: a */
    public void m149a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m470e = C0119n.m470e(view);
            if (m470e != null) {
                map.put(m470e, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m149a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo150a(Object obj);

    /* renamed from: b */
    public abstract Object mo151b(Object obj);

    /* renamed from: b */
    public abstract Object mo152b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo153b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo154b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo155b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
