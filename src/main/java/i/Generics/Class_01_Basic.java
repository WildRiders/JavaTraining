package i.Generics;

public class Class_01_Basic<K,V> implements Pair<K,V> {

    private K key;
    private V value;

    public Class_01_Basic(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}


interface Pair<K, V> {
    public K getKey();
    public V getValue();
}