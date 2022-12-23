package com.ogury.p377ed.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ch */
public final class C9896ch {
    /* renamed from: a */
    public static final List<Fragment> m28578a(FragmentManager fragmentManager) {
        C10263mq.m29882b(fragmentManager, "<this>");
        List<Fragment> arrayList = new ArrayList<>();
        m28579a(arrayList, fragmentManager);
        return arrayList;
    }

    /* renamed from: a */
    private static final void m28579a(List<Fragment> list, FragmentManager fragmentManager) {
        List<Fragment> fragments = fragmentManager.getFragments();
        C10263mq.m29879a((Object) fragments, "fm.fragments");
        for (Fragment fragment : fragments) {
            if (fragment.getUserVisibleHint() && fragment.isResumed() && !fragment.isHidden()) {
                C10263mq.m29879a((Object) fragment, "it");
                list.add(fragment);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                C10263mq.m29879a((Object) childFragmentManager, "it.childFragmentManager");
                m28579a(list, childFragmentManager);
            }
        }
    }
}
