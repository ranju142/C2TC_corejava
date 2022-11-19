abstract class Bank{
	abstract int rateOfInterest();
}
class SBI extends Bank{
	int rateOfInterest() {
		return 7;
	}
}
class HDFC extends Bank{
	int rateOfInterest() {
		return 8;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		SBI  s=new SBI();
		HDFC h=new HDFC();
		h.rateOfInterest();
		System.out.println("The rate of interest of SBI"+s.rateOfInterest());
		System.out.println("The rate of interest of HDFC"+h.rateOfInterest());
	}

}
