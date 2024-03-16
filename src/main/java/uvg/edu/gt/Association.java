package uvg.edu.gt;

public class Association<K extends Comparable<K>, V> implements Comparable<Association<K, V>> {
    private K key;
    private V value;

    @Override
    public int compareTo(Association<K, V> other) {
        return this.key.compareTo(other.key);
    }

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "(" + key + " " + value + ")";
    }
}
