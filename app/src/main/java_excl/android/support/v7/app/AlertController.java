package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p000a.p006b.p025d.p026a.DialogC0162v;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0175j;

/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f1638A;

    /* renamed from: C */
    public Drawable f1640C;

    /* renamed from: D */
    public ImageView f1641D;

    /* renamed from: E */
    public TextView f1642E;

    /* renamed from: F */
    public TextView f1643F;

    /* renamed from: G */
    public View f1644G;

    /* renamed from: H */
    public ListAdapter f1645H;

    /* renamed from: J */
    public int f1647J;

    /* renamed from: K */
    public int f1648K;

    /* renamed from: L */
    public int f1649L;

    /* renamed from: M */
    public int f1650M;

    /* renamed from: N */
    public int f1651N;

    /* renamed from: O */
    public int f1652O;

    /* renamed from: P */
    public boolean f1653P;

    /* renamed from: R */
    public Handler f1655R;

    /* renamed from: a */
    public final Context f1657a;

    /* renamed from: b */
    public final DialogC0162v f1658b;

    /* renamed from: c */
    public final Window f1659c;

    /* renamed from: d */
    public final int f1660d;

    /* renamed from: e */
    public CharSequence f1661e;

    /* renamed from: f */
    public CharSequence f1662f;

    /* renamed from: g */
    public ListView f1663g;

    /* renamed from: h */
    public View f1664h;

    /* renamed from: i */
    public int f1665i;

    /* renamed from: j */
    public int f1666j;

    /* renamed from: k */
    public int f1667k;

    /* renamed from: l */
    public int f1668l;

    /* renamed from: m */
    public int f1669m;

    /* renamed from: o */
    public Button f1671o;

    /* renamed from: p */
    public CharSequence f1672p;

    /* renamed from: q */
    public Message f1673q;

    /* renamed from: r */
    public Drawable f1674r;

    /* renamed from: s */
    public Button f1675s;

    /* renamed from: t */
    public CharSequence f1676t;

    /* renamed from: u */
    public Message f1677u;

    /* renamed from: v */
    public Drawable f1678v;

    /* renamed from: w */
    public Button f1679w;

    /* renamed from: x */
    public CharSequence f1680x;

    /* renamed from: y */
    public Message f1681y;

    /* renamed from: z */
    public Drawable f1682z;

    /* renamed from: n */
    public boolean f1670n = false;

    /* renamed from: B */
    public int f1639B = 0;

    /* renamed from: I */
    public int f1646I = -1;

    /* renamed from: Q */
    public int f1654Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f1656S = new ViewOnClickListenerC0286a();

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f1683b;

        /* renamed from: c */
        public final int f1684c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.RecycleListView);
            this.f1684c = obtainStyledAttributes.getDimensionPixelOffset(C0175j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1683b = obtainStyledAttributes.getDimensionPixelOffset(C0175j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m1012a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1683b, getPaddingRight(), z2 ? getPaddingBottom() : this.f1684c);
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public class ViewOnClickListenerC0286a implements View.OnClickListener {
        public ViewOnClickListenerC0286a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view != alertController.f1671o || (message3 = alertController.f1673q) == null) {
                AlertController alertController2 = AlertController.this;
                if (view != alertController2.f1675s || (message2 = alertController2.f1677u) == null) {
                    AlertController alertController3 = AlertController.this;
                    obtain = (view != alertController3.f1679w || (message = alertController3.f1681y) == null) ? null : Message.obtain(message);
                } else {
                    obtain = Message.obtain(message2);
                }
            } else {
                obtain = Message.obtain(message3);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController4 = AlertController.this;
            alertController4.f1655R.obtainMessage(1, alertController4.f1658b).sendToTarget();
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    public static class C0287b {

        /* renamed from: A */
        public int f1686A;

        /* renamed from: B */
        public int f1687B;

        /* renamed from: C */
        public int f1688C;

        /* renamed from: D */
        public int f1689D;

        /* renamed from: F */
        public boolean[] f1691F;

        /* renamed from: G */
        public boolean f1692G;

        /* renamed from: H */
        public boolean f1693H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1695J;

        /* renamed from: K */
        public Cursor f1696K;

        /* renamed from: L */
        public String f1697L;

        /* renamed from: M */
        public String f1698M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f1699N;

        /* renamed from: a */
        public final Context f1700a;

        /* renamed from: b */
        public final LayoutInflater f1701b;

        /* renamed from: d */
        public Drawable f1703d;

        /* renamed from: f */
        public CharSequence f1705f;

        /* renamed from: g */
        public View f1706g;

        /* renamed from: h */
        public CharSequence f1707h;

        /* renamed from: i */
        public CharSequence f1708i;

        /* renamed from: j */
        public Drawable f1709j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1710k;

        /* renamed from: l */
        public CharSequence f1711l;

        /* renamed from: m */
        public Drawable f1712m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1713n;

        /* renamed from: o */
        public CharSequence f1714o;

        /* renamed from: p */
        public Drawable f1715p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1716q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1718s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1719t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1720u;

        /* renamed from: v */
        public CharSequence[] f1721v;

        /* renamed from: w */
        public ListAdapter f1722w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1723x;

        /* renamed from: y */
        public int f1724y;

        /* renamed from: z */
        public View f1725z;

        /* renamed from: c */
        public int f1702c = 0;

        /* renamed from: e */
        public int f1704e = 0;

        /* renamed from: E */
        public boolean f1690E = false;

        /* renamed from: I */
        public int f1694I = -1;

        /* renamed from: r */
        public boolean f1717r = true;

        public C0287b(Context context) {
            this.f1700a = context;
            this.f1701b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    public static final class HandlerC0288c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f1726a;

        public HandlerC0288c(DialogInterface dialogInterface) {
            this.f1726a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1726a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$d */
    public static class C0289d extends ArrayAdapter<CharSequence> {
        public C0289d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0162v dialogC0162v, Window window) {
        this.f1657a = context;
        this.f1658b = dialogC0162v;
        this.f1659c = window;
        this.f1655R = new HandlerC0288c(dialogC0162v);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0175j.AlertDialog, C0166a.alertDialogStyle, 0);
        this.f1647J = obtainStyledAttributes.getResourceId(C0175j.AlertDialog_android_layout, 0);
        this.f1648K = obtainStyledAttributes.getResourceId(C0175j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1649L = obtainStyledAttributes.getResourceId(C0175j.AlertDialog_listLayout, 0);
        this.f1650M = obtainStyledAttributes.getResourceId(C0175j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1651N = obtainStyledAttributes.getResourceId(C0175j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1652O = obtainStyledAttributes.getResourceId(C0175j.AlertDialog_listItemLayout, 0);
        this.f1653P = obtainStyledAttributes.getBoolean(C0175j.AlertDialog_showTitle, true);
        this.f1660d = obtainStyledAttributes.getDimensionPixelSize(C0175j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0162v.m591a().mo550a(1);
    }

    /* renamed from: a */
    public static void m1004a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: a */
    public static boolean m1005a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1005a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int m1006a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1657a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public final ViewGroup m1007a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public void m1008a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1655R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f1680x = charSequence;
            this.f1681y = message;
            this.f1682z = drawable;
        } else if (i == -2) {
            this.f1676t = charSequence;
            this.f1677u = message;
            this.f1678v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1672p = charSequence;
            this.f1673q = message;
            this.f1674r = drawable;
        }
    }

    /* renamed from: a */
    public final void m1009a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void m1010a(CharSequence charSequence) {
        this.f1661e = charSequence;
        TextView textView = this.f1642E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public void m1011b(int i) {
        this.f1640C = null;
        this.f1639B = i;
        ImageView imageView = this.f1641D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f1641D.setImageResource(this.f1639B);
            }
        }
    }
}
