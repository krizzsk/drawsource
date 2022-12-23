package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetaData {

    /* renamed from: a */
    private String f17292a;

    /* renamed from: b */
    private List<String> f17293b;

    /* renamed from: c */
    private List<MetaDataValueTypes> f17294c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f17292a = str;
        this.f17293b = list;
        this.f17294c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f17294c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f17292a = str;
        this.f17293b = list;
        this.f17294c = list2;
    }

    public String getMetaDataKey() {
        return this.f17292a;
    }

    public List<String> getMetaDataValue() {
        return this.f17293b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f17294c;
    }
}
