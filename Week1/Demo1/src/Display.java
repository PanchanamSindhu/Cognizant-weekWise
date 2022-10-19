@FunctionalInterface
public interface Display {
	void show();//only one abstract method
	static void print(int a,int b) {
		System.out.println("Inside static method ,sum of two values:" +(a+b));
	}

}
