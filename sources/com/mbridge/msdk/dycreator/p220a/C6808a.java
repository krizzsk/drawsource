package com.mbridge.msdk.dycreator.p220a;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.mbridge.msdk.dycreator.a.a */
/* compiled from: MBLayoutInflate */
public final class C6808a {

    /* renamed from: f */
    private static final Class[] f17977f = {Context.class, AttributeSet.class};

    /* renamed from: g */
    private static final HashMap<String, Constructor> f17978g = new HashMap<>();

    /* renamed from: j */
    private static String f17979j = "com.mbridge.msdk.dycreator.baseview.MB";

    /* renamed from: a */
    protected final Context f17980a;

    /* renamed from: b */
    private final boolean f17981b = true;

    /* renamed from: c */
    private C6809a f17982c;

    /* renamed from: d */
    private C6810b f17983d;

    /* renamed from: e */
    private final Object[] f17984e = new Object[2];

    /* renamed from: h */
    private HashMap<String, Boolean> f17985h;

    /* renamed from: i */
    private long f17986i;

    /* renamed from: com.mbridge.msdk.dycreator.a.a$a */
    /* compiled from: MBLayoutInflate */
    public interface C6809a {
        /* renamed from: a */
        View mo37124a(String str, Context context, AttributeSet attributeSet);
    }

    /* renamed from: com.mbridge.msdk.dycreator.a.a$b */
    /* compiled from: MBLayoutInflate */
    public interface C6810b {
        /* renamed from: a */
        boolean mo37125a(Class cls);
    }

    public C6808a(Context context) {
        this.f17980a = context;
    }

    /* renamed from: a */
    public final View mo37122a(FileInputStream fileInputStream, ViewGroup viewGroup, boolean z) {
        this.f17986i = System.currentTimeMillis();
        return m20729a(m20730a(fileInputStream), viewGroup, z);
    }

    /* renamed from: a */
    private XmlPullParser m20731a(String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(new FileInputStream(str), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newPullParser;
    }

    /* renamed from: a */
    private XmlPullParser m20730a(FileInputStream fileInputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        if (fileInputStream != null) {
            try {
                newPullParser.setInput(fileInputStream, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return newPullParser;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r9 = new android.view.InflateException(r7.getPositionDescription() + ": " + r8.getMessage());
        r9.initCause(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        r8 = new android.view.InflateException(r7.getMessage());
        r8.initCause(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        throw r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[SYNTHETIC, Splitter:B:33:0x00a0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m20729a(org.xmlpull.v1.XmlPullParser r7, android.view.ViewGroup r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object[] r0 = r6.f17984e
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r7)     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r2 = r6.f17984e     // Catch:{ all -> 0x00ef }
            r3 = 0
            android.content.Context r4 = r6.f17980a     // Catch:{ all -> 0x00ef }
            r2[r3] = r4     // Catch:{ all -> 0x00ef }
        L_0x000e:
            int r2 = r7.next()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r3 = 2
            if (r2 == r3) goto L_0x0019
            r4 = 1
            if (r2 == r4) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r2 != r3) goto L_0x00a0
            java.lang.String r2 = r7.getName()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r4 = "**************************"
            r3.println(r4)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r5 = "Creating root view: "
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r4 = r4.toString()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r3.println(r4)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r4 = "**************************"
            r3.println(r4)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r3 = "merge"
            boolean r3 = r3.equals(r2)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            if (r3 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x0053
            if (r9 == 0) goto L_0x0053
            r6.m20732a((org.xmlpull.v1.XmlPullParser) r7, (android.view.View) r8, (android.util.AttributeSet) r1)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            goto L_0x009e
        L_0x0053:
            android.view.InflateException r8 = new android.view.InflateException     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r9 = "<merge /> can be used only with a valid ViewGroup root and attachToRoot=true"
            r8.<init>(r9)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            throw r8     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
        L_0x005b:
            android.view.View r2 = r6.m20727a((java.lang.String) r2, (android.util.AttributeSet) r1)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r3 = 0
            if (r8 == 0) goto L_0x0081
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r5 = "Creating params from root: "
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r4.append(r8)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r4 = r4.toString()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r3.println(r4)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            android.view.ViewGroup$LayoutParams r3 = r8.generateLayoutParams(r1)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            if (r9 != 0) goto L_0x0081
            r2.setLayoutParams(r3)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
        L_0x0081:
            java.io.PrintStream r4 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r5 = "-----> start inflating children"
            r4.println(r5)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r6.m20732a((org.xmlpull.v1.XmlPullParser) r7, (android.view.View) r2, (android.util.AttributeSet) r1)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r4 = "-----> done inflating children"
            r1.println(r4)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            if (r8 == 0) goto L_0x0099
            if (r9 == 0) goto L_0x0099
            r8.addView(r2, r3)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
        L_0x0099:
            if (r8 == 0) goto L_0x009d
            if (r9 != 0) goto L_0x009e
        L_0x009d:
            r8 = r2
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00ef }
            return r8
        L_0x00a0:
            android.view.InflateException r8 = new android.view.InflateException     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r1 = r7.getPositionDescription()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r9.append(r1)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r1 = ": No start tag found!"
            r9.append(r1)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            java.lang.String r9 = r9.toString()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            r8.<init>(r9)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
            throw r8     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00bb }
        L_0x00bb:
            r8 = move-exception
            android.view.InflateException r9 = new android.view.InflateException     // Catch:{ all -> 0x00ef }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r1.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r7.getPositionDescription()     // Catch:{ all -> 0x00ef }
            r1.append(r7)     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = ": "
            r1.append(r7)     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r8.getMessage()     // Catch:{ all -> 0x00ef }
            r1.append(r7)     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x00ef }
            r9.<init>(r7)     // Catch:{ all -> 0x00ef }
            r9.initCause(r8)     // Catch:{ all -> 0x00ef }
            throw r9     // Catch:{ all -> 0x00ef }
        L_0x00e1:
            r7 = move-exception
            android.view.InflateException r8 = new android.view.InflateException     // Catch:{ all -> 0x00ef }
            java.lang.String r9 = r7.getMessage()     // Catch:{ all -> 0x00ef }
            r8.<init>(r9)     // Catch:{ all -> 0x00ef }
            r8.initCause(r7)     // Catch:{ all -> 0x00ef }
            throw r8     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ef }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.p220a.C6808a.m20729a(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View");
    }

    /* renamed from: a */
    private View m20728a(String str, String str2, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        String str3;
        String str4;
        String str5;
        Constructor<?> constructor = f17978g.get(str);
        Class cls = null;
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.f17980a.getClassLoader();
                if (str2 != null) {
                    str5 = str2 + str;
                } else {
                    str5 = str;
                }
                Class<?> loadClass = classLoader.loadClass(str5);
                if (!(this.f17983d == null || loadClass == null || this.f17983d.mo37125a(loadClass))) {
                    m20733b(str, str2, attributeSet);
                }
                constructor = loadClass.getConstructor(f17977f);
                f17978g.put(str, constructor);
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(attributeSet.getPositionDescription());
                sb.append(": Error inflating class ");
                if (str2 != null) {
                    str = str2 + str;
                }
                sb.append(str);
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            } catch (ClassNotFoundException e2) {
                throw e2;
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Error inflating class ");
                if (cls == null) {
                    str4 = "<unknown>";
                } else {
                    str4 = cls.getName();
                }
                sb2.append(str4);
                InflateException inflateException2 = new InflateException(sb2.toString());
                inflateException2.initCause(e3);
                throw inflateException2;
            }
        } else if (this.f17983d != null) {
            Boolean bool = this.f17985h.get(str);
            if (bool == null) {
                ClassLoader classLoader2 = this.f17980a.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                Class<?> loadClass2 = classLoader2.loadClass(str3);
                boolean z = loadClass2 != null && this.f17983d.mo37125a(loadClass2);
                this.f17985h.put(str, Boolean.valueOf(z));
                if (!z) {
                    m20733b(str, str2, attributeSet);
                }
            } else if (bool.equals(Boolean.FALSE)) {
                m20733b(str, str2, attributeSet);
            }
        }
        Object[] objArr = this.f17984e;
        objArr[1] = attributeSet;
        return (View) constructor.newInstance(objArr);
    }

    /* renamed from: b */
    private void m20733b(String str, String str2, AttributeSet attributeSet) {
        StringBuilder sb = new StringBuilder();
        sb.append(attributeSet.getPositionDescription());
        sb.append(": Class not allowed to be inflated ");
        if (str2 != null) {
            str = str2 + str;
        }
        sb.append(str);
        throw new InflateException(sb.toString());
    }

    /* renamed from: a */
    private View m20727a(String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        PrintStream printStream = System.out;
        printStream.println("******** Creating view: " + str);
        try {
            View a = this.f17982c == null ? null : this.f17982c.mo37124a(str, this.f17980a, attributeSet);
            if (a == null) {
                if (-1 == str.indexOf(46)) {
                    if (!str.equals("MBStarLevelLayoutView")) {
                        if (!str.equals("LuckPan")) {
                            a = m20728a(str, f17979j, attributeSet);
                        }
                    }
                    a = m20728a(str, "", attributeSet);
                } else {
                    a = m20728a(str, (String) null, attributeSet);
                }
            }
            PrintStream printStream2 = System.out;
            printStream2.println("Created view is: " + a);
            return a;
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* renamed from: a */
    private void m20732a(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int next;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next2 = xmlPullParser.next();
            if ((next2 == 3 && xmlPullParser.getDepth() <= depth) || next2 == 1) {
                return;
            }
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    view.requestFocus();
                    int depth2 = xmlPullParser.getDepth();
                    do {
                        next = xmlPullParser.next();
                        if (next == 3 && xmlPullParser.getDepth() <= depth2) {
                            break;
                        }
                    } while (next != 1);
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        m20734b(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    View a = m20727a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    m20732a(xmlPullParser, a, attributeSet);
                    viewGroup.addView(a, generateLayoutParams);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r8 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.setLayoutParams(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r7.generateLayoutParams(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r8 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        m20732a((org.xmlpull.v1.XmlPullParser) r0, r2, r1);
        r7.addView(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053 A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b A[Catch:{ all -> 0x00b6 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20734b(org.xmlpull.v1.XmlPullParser r6, android.view.View r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00bb
            r0 = 0
            r1 = 0
            java.lang.String r2 = "layout"
            int r0 = r8.getAttributeResourceValue(r1, r2, r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r6 = r8.getAttributeValue(r1, r2)
            if (r6 != 0) goto L_0x001c
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />"
            r6.<init>(r7)
            throw r6
        L_0x001c:
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "You must specifiy a valid layout reference. The layout ID "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = " is not valid."
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L_0x0038:
            android.content.Context r1 = r5.f17980a
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.XmlResourceParser r0 = r1.getLayout(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch:{ all -> 0x00b6 }
        L_0x0046:
            int r2 = r0.next()     // Catch:{ all -> 0x00b6 }
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L_0x0051
            if (r2 == r3) goto L_0x0051
            goto L_0x0046
        L_0x0051:
            if (r2 != r4) goto L_0x009b
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "merge"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x00b6 }
            if (r4 == 0) goto L_0x0063
            r5.m20732a((org.xmlpull.v1.XmlPullParser) r0, (android.view.View) r7, (android.util.AttributeSet) r1)     // Catch:{ all -> 0x00b6 }
            goto L_0x0082
        L_0x0063:
            android.view.View r2 = r5.m20727a((java.lang.String) r2, (android.util.AttributeSet) r1)     // Catch:{ all -> 0x00b6 }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x00b6 }
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r8)     // Catch:{ RuntimeException -> 0x0075 }
            if (r8 == 0) goto L_0x007c
        L_0x006f:
            r2.setLayoutParams(r8)     // Catch:{ all -> 0x00b6 }
            goto L_0x007c
        L_0x0073:
            r6 = move-exception
            goto L_0x009a
        L_0x0075:
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r1)     // Catch:{ all -> 0x0073 }
            if (r8 == 0) goto L_0x007c
            goto L_0x006f
        L_0x007c:
            r5.m20732a((org.xmlpull.v1.XmlPullParser) r0, (android.view.View) r2, (android.util.AttributeSet) r1)     // Catch:{ all -> 0x00b6 }
            r7.addView(r2)     // Catch:{ all -> 0x00b6 }
        L_0x0082:
            r0.close()
            int r7 = r6.getDepth()
        L_0x0089:
            int r8 = r6.next()
            r0 = 3
            if (r8 != r0) goto L_0x0096
            int r0 = r6.getDepth()
            if (r0 <= r7) goto L_0x0099
        L_0x0096:
            if (r8 == r3) goto L_0x0099
            goto L_0x0089
        L_0x0099:
            return
        L_0x009a:
            throw r6     // Catch:{ all -> 0x00b6 }
        L_0x009b:
            android.view.InflateException r6 = new android.view.InflateException     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r7.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = r0.getPositionDescription()     // Catch:{ all -> 0x00b6 }
            r7.append(r8)     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = ": No start tag found!"
            r7.append(r8)     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b6 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b6 }
            throw r6     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r6 = move-exception
            r0.close()
            throw r6
        L_0x00bb:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "<include /> can only be used inside of a ViewGroup"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.p220a.C6808a.m20734b(org.xmlpull.v1.XmlPullParser, android.view.View, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final View mo37123a(String str, ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        this.f17986i = System.currentTimeMillis();
        PrintStream printStream = System.out;
        printStream.println("INFLATING from resource: " + str);
        return m20729a(m20731a(str), viewGroup, z);
    }
}
