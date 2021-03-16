package Shape3D;



public class Cube extends Shape3D {
double a;

public Cube() {
	
}

public Cube(double a) {
	this.a=a;
}

void volume() {
	volume = a * a * a;
	System.out.println(volume);
}
void  surfaceArea() {
	area = 6 * a * a;
	System.out.println(area);
}

void parameters() {
	System.out.print("All Sides of cube is ");
	System.out.println(a);
}
void name() {
	System.out.print("Cube");
}

}
