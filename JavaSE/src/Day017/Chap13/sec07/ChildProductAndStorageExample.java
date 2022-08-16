package Day017.Chap13.sec07;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setCompany("Samsung");
		product.setKind(new Tv());
		product.setModel("SmartTv");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
			storage.add(new Tv(), 0);
			Tv tv = storage.get(0);
	}
}
