package test.collection;

import java.util.*;
import java.util.Set;

public class MyMap extends AbstractMap {

    static class Entry implements Map.Entry {
        protected Object key, value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public Object getKey() {
            return key;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public Object setValue(Object value) {
            this.value = value;
            return value;
        }

        public boolean equals(Object o) {
            if (!(o instanceof Map.Entry)) return false;
            Map.Entry entry = (Map.Entry) o;
            return (key == null ? entry.getKey() == null : entry.equals(key)) && (value == null ? entry == null : entry.getValue().equals(value));
        }
    }

    private Set entries = null;
    private ArrayList list;

    public MyMap() {
        list = new ArrayList();
    }

    public MyMap(Map map) {
        list = new ArrayList();
        putAll(map);
    }

    public MyMap(int initCapacity) {
        list = new ArrayList(initCapacity);
    }

    @Override
    public Set<Entry> entrySet() {
        if (entries == null) {
            entries = new AbstractSet() {

                public void clear() {
                    list.clear();
                }

                @Override
                public Iterator iterator() {
                    return list.iterator();
                }

                @Override
                public int size() {
                    return list.size();
                }
            };
        }
        return entries;
    }

    public Object put(Object key, Object value) {

        int size = list.size();
        Entry entry = null;
        int i;

        for (i = 0; i < size; i ++) {
            entry = (Entry) list.get(i);
            if (key == null && entry.getKey() == null) break;
            if (key.equals(entry.getKey())) break;
        }

        Object oldValue = null;
        if (i < size) {
            oldValue = entry.getValue();
            entry.setValue(value);
        } else {
            list.add(new Entry(key, value));
        }
        return oldValue;
    }
}
