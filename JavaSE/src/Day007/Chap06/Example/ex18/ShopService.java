package Day007.Chap06.Example.ex18;

public class ShopService {
	//μμ± μμΉ
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}
