package Day007.Chap06.sec12.ex04_import;

import Day007.Chap06.sec12.ex04_import.hankook.SnowTire;
import Day007.Chap06.sec12.ex04_import.hyundai.Engine;
import Day007.Chap06.sec12.ex04_import.kumho.BigWidthTire;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Day007.Chap06.sec12.ex04_import.hankook.Tire tire3 = new Day007.Chap06.sec12.ex04_import.hankook.Tire();
	Day007.Chap06.sec12.ex04_import.kumho.Tire tire4 = new Day007.Chap06.sec12.ex04_import.kumho.Tire();
}