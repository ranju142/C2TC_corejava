abstract class Bike{
	Bike()
	{
		System.out.println("bike is created");
	}
	abstract void run();
	void changegear() {
		System.out.println("gear changed");
	}
}
class Honda extends Bike{
	void run() {
		System.out.println("running safely");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Honda h= new Honda();
		h.run();
		h.changegear();

	}

}
