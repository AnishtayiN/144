package p000a.p006b.p010c.p011a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.b.c.a.x */
/* loaded from: classes.dex */
public class C0064x extends AbstractC0036b0 {

    /* renamed from: a.b.c.a.x$a */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f411a;

        public a(C0064x c0064x, Rect rect) {
            this.f411a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f411a;
        }
    }

    /* renamed from: a.b.c.a.x$b */
    public class b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f412a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f413b;

        public b(C0064x c0064x, View view, ArrayList arrayList) {
            this.f412a = view;
            this.f413b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f412a.setVisibility(8);
            int size = this.f413b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f413b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a.b.c.a.x$c */
    public class c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f414a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f415b;

        /* renamed from: c */
        public final /* synthetic */ Object f416c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f417d;

        /* renamed from: e */
        public final /* synthetic */ Object f418e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f419f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f414a = obj;
            this.f415b = arrayList;
            this.f416c = obj2;
            this.f417d = arrayList2;
            this.f418e = obj3;
            this.f419f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f414a;
            if (obj != null) {
                C0064x.this.mo147a(obj, this.f415b, (ArrayList<View>) null);
            }
            Object obj2 = this.f416c;
            if (obj2 != null) {
                C0064x.this.mo147a(obj2, this.f417d, (ArrayList<View>) null);
            }
            Object obj3 = this.f418e;
            if (obj3 != null) {
                C0064x.this.mo147a(obj3, this.f419f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: a.b.c.a.x$d */
    public class d extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f421a;

        public d(C0064x c0064x, Rect rect) {
            this.f421a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f421a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f421a;
        }
    }

    /* renamed from: a */
    public static boolean m317a(Transition transition) {
        return (AbstractC0036b0.m137a((List) transition.getTargetIds()) && AbstractC0036b0.m137a((List) transition.getTargetNames()) && AbstractC0036b0.m137a((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public Object mo139a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public void mo141a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public void mo142a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new d(this, rect));
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public void mo143a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public void mo144a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public void mo145a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public void mo146a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo146a(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m317a(transition) || !AbstractC0036b0.m137a((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public void mo147a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo147a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m317a(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: a */
    public boolean mo150a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: b */
    public Object mo151b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: b */
    public Object mo152b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: b */
    public void mo153b(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m140a(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: b */
    public void mo154b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            int size2 = targets.size();
            if (!AbstractC0036b0.m138a(targets, view2, size2)) {
                targets.add(view2);
                for (int i2 = size2; i2 < targets.size(); i2++) {
                    View view3 = targets.get(i2);
                    if (view3 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view3;
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (!AbstractC0036b0.m138a(targets, childAt, size2)) {
                                targets.add(childAt);
                            }
                        }
                    }
                }
            }
        }
        targets.add(view);
        arrayList.add(view);
        mo146a(transitionSet, arrayList);
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0036b0
    /* renamed from: b */
    public void mo155b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo147a((Object) transitionSet, arrayList, arrayList2);
        }
    }
}
