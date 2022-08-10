package Day007.Chap06.Example.ex18;

public class ShopService {
	//작성 위치
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}
