package Day017.Chap13.Example.ex03;

public class Container <T, V> {
	
	private T Key;
	private V Value;
	
	public T getKey() { return Key; }
	public V getValue() { return Value; }
	public void setKey(T key) { Key = key; }
	public void setValue(V value) { Value = value; }
	
	public void set (T Key, V Value) {
		this.Key = Key;
		this.Value = Value;
	}
}
