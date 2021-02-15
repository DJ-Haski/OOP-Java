package Problem2;

public class Any {
	
	 public enum Hobbies{
		Eat,
		Sleep,
		Code,
		Repeat
	}

	
	public static void staticMethod() {
		System.out.println("Пример 1");
	}
	public void unstaticMethod() {
		System.out.println("Пример 2");
	}
	
	final double pi = 3.14;
	//pi = 3.15;
	
	private int age;
	private int height;
	private int weight;
	public void Student(int age,int height,int weight){
	this.age=age;
	this.height=height;
	this.weight=weight;
	}
	
	/*
	public static void staticMethod() {
		System.out.println("Пример 3");
	}*/
	int x1=10;
	int x2=15;
	int x3=20;
	public int sum(int x1,int x2) {
		return x1+x2;
	}
	public int sum(int x1,int x2,int x3) {
		return x1+x2+x3;
	}
	
}
