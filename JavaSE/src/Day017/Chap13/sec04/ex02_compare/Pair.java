package Day017.Chap13.sec04.ex02_compare;

public class Pair <K, V> {
	//변수
	private K key;
	private V value;
	//생성자
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
