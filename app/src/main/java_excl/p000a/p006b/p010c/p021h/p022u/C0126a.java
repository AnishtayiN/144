package p000a.p006b.p010c.p021h.p022u;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import p000a.p006b.p025d.p027b.C0175j;

/* renamed from: a.b.c.h.u.a */
/* loaded from: classes.dex */
public class C0126a {

    /* renamed from: a */
    public final AccessibilityNodeInfo f624a;

    public C0126a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f624a = accessibilityNodeInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0126a.class != obj.getClass()) {
            return false;
        }
        C0126a c0126a = (C0126a) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f624a;
        if (accessibilityNodeInfo == null) {
            if (c0126a.f624a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0126a.f624a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f624a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f624a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f624a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f624a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f624a.getClassName());
        sb.append("; text: ");
        sb.append(this.f624a.getText());
        sb.append("; contentDescription: ");
        sb.append(this.f624a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(Build.VERSION.SDK_INT >= 18 ? this.f624a.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(this.f624a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f624a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f624a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f624a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f624a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f624a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f624a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f624a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f624a.isPassword());
        sb.append("; scrollable: " + this.f624a.isScrollable());
        sb.append("; [");
        int actions = this.f624a.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ (-1);
            if (numberOfTrailingZeros == 1) {
                str = "ACTION_FOCUS";
            } else if (numberOfTrailingZeros != 2) {
                switch (numberOfTrailingZeros) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case C0175j.AppCompatTheme_activityChooserViewStyle /* 32 */:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case C0175j.AppCompatTheme_dropDownListViewStyle /* 64 */:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    default:
                        str = "ACTION_UNKNOWN";
                        break;
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            sb.append(str);
            if (actions != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
