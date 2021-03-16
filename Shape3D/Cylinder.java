package Shape3D;



public class Cylinder extends Shape3D {
	double height;
	double radius;

	public Cylinder() {
		
	}
	
	public Cylinder(double height, double radius) {
		this.height= height;
		this.radius = radius;
	}
	
	void volume() {
		volume =  pi * radius * radius * height ;
		System.out.println(volume);
	}
	void  surfaceArea() {
		area = pi * radius * radius;
		System.out.println(area);
	}
	void parameters() {
		System.out.print("Height of Cylinder is ");
		System.out.print(height);
		System.out.print(" and radius is ");
		System.out.println(radius);
	}
	void name() {
		System.out.print("Cylinder");
	}
}
