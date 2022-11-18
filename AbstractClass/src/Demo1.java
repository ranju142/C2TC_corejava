abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	void draw() {
		System.out.println("Drawing rectangle");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		shape s=new rectangle();
s.draw();
	}

}
