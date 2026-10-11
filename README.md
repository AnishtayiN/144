# 144Hz — بازسازی سورس (decompiled with jadx 1.5.1)

اپ تغییر رفرش‌ریت نمایشگر به 144Hz — پکیج `com.rootify`، نسخه اصلی 2.1.9 (code 15).

⚠️ این سورس با مهندسی معکوس (jadx decompile) بازسازی شده — اسم بعضی کلاس‌ها/متغیرها خودکار تولید شده و کامنت‌ها از بین رفتن. برای تغییرات کوچک کاملاً قابل استفاده است.

## ساخت APK

پیش‌نیاز: JDK 17

```bash
./gradlew assembleRelease
```

خروجی: `app/build/outputs/apk/release/app-release.apk`

## Release خودکار با GitHub Actions

1. ریپو را بساز و push کن
2. به **Actions** برو → «Build & Release APK» → **Run workflow**
3. دو مقدار ازت پرسیده می‌شه:
   - **نسخه برنامه** (مثلاً 2.1.9)
   - **کد نسخه** (عدد صحیح، مثلاً 15)
4. بعد از build موفق، APK در بخش **Releases** با تگ `v<نسخه>` آپلود می‌شه

### امضا (اختیاری)

اگر APK با کلید خودت امضا شه، این secrets را در ریپو تنظیم کن:
- `KS_B64` — فایل keystore.jks به‌صورت base64: `base64 -w0 keystore.jks`
- `KS_PASS` — رمز keystore
- `KS_ALIAS` — نام alias
- `KS_KEY_PASS` — رمز کلید

بدون این secrets، workflow با یک کلید موقت می‌سازد (مناسب تست).

## ساختار

```
app/src/main/java/     — کد جاوا (decompiled)
app/src/main/res/      — ریسورس‌ها
app/src/main/AndroidManifest.xml
```

کلاس‌های فریمورک اندروید (compileOnly) در اولین بیلد خودکار از Maven Central دانلود می‌شوند — نیازی به آپلود آن‌ها در گیت نیست.
