package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5079f;
import com.fyber.inneractive.sdk.protobuf.C5147q;
import com.fyber.inneractive.sdk.protobuf.C5169t1;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s */
public final class C5159s extends C5152r<GeneratedMessageLite.C5052c> {
    /* renamed from: a */
    public boolean mo26152a(C5149q0 q0Var) {
        return q0Var instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* renamed from: b */
    public C5181u<GeneratedMessageLite.C5052c> mo26153b(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    /* renamed from: c */
    public void mo26154c(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.mo26214g();
    }

    /* renamed from: a */
    public C5181u<GeneratedMessageLite.C5052c> mo26146a(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* renamed from: a */
    public <UT, UB> UB mo26147a(C5078e1 e1Var, Object obj, C5147q qVar, C5181u<GeneratedMessageLite.C5052c> uVar, UB ub, C5135m1<UT, UB> m1Var) throws IOException {
        Object a;
        Object obj2;
        ArrayList arrayList;
        GeneratedMessageLite.C5053d dVar = (GeneratedMessageLite.C5053d) obj;
        GeneratedMessageLite.C5052c cVar = dVar.f13498d;
        int i = cVar.f13491b;
        if (!cVar.f13493d || !cVar.f13494e) {
            Object obj3 = null;
            C5169t1.C5171b bVar = cVar.f13492c;
            if (bVar != C5169t1.C5171b.ENUM) {
                switch (bVar.ordinal()) {
                    case 0:
                        obj2 = Double.valueOf(e1Var.mo25826h());
                        break;
                    case 1:
                        obj2 = Float.valueOf(e1Var.mo25832k());
                        break;
                    case 2:
                        obj2 = Long.valueOf(e1Var.mo25840o());
                        break;
                    case 3:
                        obj2 = Long.valueOf(e1Var.mo25822f());
                        break;
                    case 4:
                        obj2 = Integer.valueOf(e1Var.mo25818d());
                        break;
                    case 5:
                        obj2 = Long.valueOf(e1Var.mo25824g());
                        break;
                    case 6:
                        obj2 = Integer.valueOf(e1Var.mo25844q());
                        break;
                    case 7:
                        obj2 = Boolean.valueOf(e1Var.mo25846r());
                        break;
                    case 8:
                        obj2 = e1Var.mo25838n();
                        break;
                    case 9:
                        obj2 = e1Var.mo25807a(dVar.f13497c.getClass(), qVar);
                        break;
                    case 10:
                        obj2 = e1Var.mo25813b(dVar.f13497c.getClass(), qVar);
                        break;
                    case 11:
                        obj2 = e1Var.mo25805a();
                        break;
                    case 12:
                        obj2 = Integer.valueOf(e1Var.mo25816c());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj2 = Integer.valueOf(e1Var.mo25836m());
                        break;
                    case 15:
                        obj2 = Long.valueOf(e1Var.mo25848t());
                        break;
                    case 16:
                        obj2 = Integer.valueOf(e1Var.mo25830j());
                        break;
                    case 17:
                        obj2 = Long.valueOf(e1Var.mo25834l());
                        break;
                }
            } else {
                int d = e1Var.mo25818d();
                if (dVar.f13498d.f13490a.mo26241a(d) == null) {
                    Class<?> cls = C5092h1.f13561a;
                    if (ub == null) {
                        ub = m1Var.mo26089a();
                    }
                    m1Var.mo26100b(ub, i, (long) d);
                    return ub;
                }
                obj2 = Integer.valueOf(d);
            }
            obj3 = obj2;
            GeneratedMessageLite.C5052c cVar2 = dVar.f13498d;
            if (cVar2.f13493d) {
                uVar.mo26203a(cVar2, (Object) obj3);
            } else {
                int ordinal = cVar2.f13492c.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (a = uVar.mo26202a(dVar.f13498d)) != null) {
                    obj3 = C5194z.m16181a(a, (Object) obj3);
                }
                uVar.mo26206c(dVar.f13498d, obj3);
            }
        } else {
            switch (cVar.f13492c.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    e1Var.mo25831j(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    e1Var.mo25819d(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    e1Var.mo25833k(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    e1Var.mo25808a(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    e1Var.mo25841o(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    e1Var.mo25839n(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    e1Var.mo25821e(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    e1Var.mo25835l(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    e1Var.mo25828i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    e1Var.mo25843p(arrayList);
                    ub = C5092h1.m15473a(i, (List<Integer>) arrayList, dVar.f13498d.f13490a, ub, m1Var);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    e1Var.mo25823f(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    e1Var.mo25837m(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    e1Var.mo25817c(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    e1Var.mo25825g(arrayList);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type cannot be packed: ");
                    sb.append(dVar.f13498d.f13492c);
                    throw new IllegalStateException(sb.toString());
            }
            uVar.mo26206c(dVar.f13498d, arrayList);
        }
        return ub;
    }

    /* renamed from: a */
    public Object mo26148a(C5147q qVar, C5149q0 q0Var, int i) {
        return qVar.f13658a.get(new C5147q.C5148a(q0Var, i));
    }

    /* renamed from: a */
    public int mo26145a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C5052c) entry.getKey()).f13491b;
    }

    /* renamed from: a */
    public void mo26151a(C5184u1 u1Var, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C5052c cVar = (GeneratedMessageLite.C5052c) entry.getKey();
        if (cVar.f13493d) {
            switch (cVar.f13492c.ordinal()) {
                case 0:
                    C5092h1.m15485b(cVar.f13491b, (List<Double>) (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 1:
                    C5092h1.m15497f(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 2:
                    C5092h1.m15503h(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 3:
                    C5092h1.m15512n(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 4:
                    C5092h1.m15500g(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 5:
                    C5092h1.m15494e(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 6:
                    C5092h1.m15491d(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 7:
                    C5092h1.m15477a(cVar.f13491b, (List<Boolean>) (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 8:
                    C5092h1.m15483b(cVar.f13491b, (List<String>) (List) entry.getValue(), u1Var);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C5092h1.m15476a(cVar.f13491b, (List<?>) (List) entry.getValue(), u1Var, (C5083f1) C5066b1.f13524c.mo25762a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C5092h1.m15484b(cVar.f13491b, (List<?>) (List) entry.getValue(), u1Var, (C5083f1) C5066b1.f13524c.mo25762a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    C5092h1.m15475a(cVar.f13491b, (List<C5093i>) (List) entry.getValue(), u1Var);
                    return;
                case 12:
                    C5092h1.m15511m(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 13:
                    C5092h1.m15500g(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 14:
                    C5092h1.m15506i(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 15:
                    C5092h1.m15508j(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 16:
                    C5092h1.m15509k(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                case 17:
                    C5092h1.m15510l(cVar.f13491b, (List) entry.getValue(), u1Var, cVar.f13494e);
                    return;
                default:
                    return;
            }
        } else {
            switch (cVar.f13492c.ordinal()) {
                case 0:
                    ((C5133m) u1Var).mo26082a(cVar.f13491b, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    ((C5133m) u1Var).mo26083a(cVar.f13491b, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    ((C5133m) u1Var).f13640a.mo26057g(cVar.f13491b, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    ((C5133m) u1Var).f13640a.mo26057g(cVar.f13491b, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ((C5133m) u1Var).f13640a.mo26058h(cVar.f13491b, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    ((C5133m) u1Var).f13640a.mo26054f(cVar.f13491b, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    ((C5133m) u1Var).f13640a.mo26056g(cVar.f13491b, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    ((C5133m) u1Var).f13640a.mo26048b(cVar.f13491b, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    ((C5133m) u1Var).f13640a.mo26047b(cVar.f13491b, (String) entry.getValue());
                    return;
                case 9:
                    ((C5133m) u1Var).mo26087a(cVar.f13491b, entry.getValue(), C5066b1.f13524c.mo25762a(entry.getValue().getClass()));
                    return;
                case 10:
                    ((C5133m) u1Var).mo26088b(cVar.f13491b, entry.getValue(), C5066b1.f13524c.mo25762a(entry.getValue().getClass()));
                    return;
                case 11:
                    ((C5133m) u1Var).f13640a.mo26045b(cVar.f13491b, (C5093i) entry.getValue());
                    return;
                case 12:
                    ((C5133m) u1Var).f13640a.mo26060j(cVar.f13491b, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ((C5133m) u1Var).f13640a.mo26058h(cVar.f13491b, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    ((C5133m) u1Var).f13640a.mo26056g(cVar.f13491b, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    ((C5133m) u1Var).f13640a.mo26054f(cVar.f13491b, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    ((C5133m) u1Var).mo26084a(cVar.f13491b, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    ((C5133m) u1Var).mo26085a(cVar.f13491b, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo26149a(C5078e1 e1Var, Object obj, C5147q qVar, C5181u<GeneratedMessageLite.C5052c> uVar) throws IOException {
        GeneratedMessageLite.C5053d dVar = (GeneratedMessageLite.C5053d) obj;
        uVar.mo26206c(dVar.f13498d, e1Var.mo25813b(dVar.f13497c.getClass(), qVar));
    }

    /* renamed from: a */
    public void mo26150a(C5093i iVar, Object obj, C5147q qVar, C5181u<GeneratedMessageLite.C5052c> uVar) throws IOException {
        GeneratedMessageLite.C5053d dVar = (GeneratedMessageLite.C5053d) obj;
        GeneratedMessageLite b = ((GeneratedMessageLite.C5050a) dVar.f13497c.newBuilderForType()).mo25736b();
        ByteBuffer wrap = ByteBuffer.wrap(iVar.mo25916h());
        if (wrap.hasArray()) {
            C5079f.C5081b bVar = new C5079f.C5081b(wrap, true);
            C5066b1 b1Var = C5066b1.f13524c;
            b1Var.getClass();
            b1Var.mo25762a(b.getClass()).mo25869a(b, bVar, qVar);
            uVar.mo26206c(dVar.f13498d, b);
            if (bVar.mo25847s() != Integer.MAX_VALUE) {
                throw C5061a0.m15271a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
