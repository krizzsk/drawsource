package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: com.fyber.inneractive.sdk.util.x0 */
public class C5330x0 {
    /* renamed from: a */
    public static Integer m16554a(Node node, String str) {
        String b = m16556b(node, str);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            return Integer.valueOf(b);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m16556b(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    /* renamed from: c */
    public static List<Node> m16557c(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        if (node != null) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeName().equals(str)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Node m16558d(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str)) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m16555a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}
