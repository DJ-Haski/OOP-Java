package Shape3D;



public class Sphere extends Shape3D {
double radius; 

public Sphere() {
	
}
public Sphere(double radius) {
	this.radius = radius;
}

void volume() {
	volume = 4/3 * pi * radius * radius * radius ;
	System.out.println(volume);
}
void  surfaceArea() {
	area = 4 * pi * radius * radius;
	System.out.println(area);
}

void parameters() {
	System.out.print("Radius of Sphere is ");
	System.out.println(radius);
}
void name() {
	System.out.print("Sphere");
}

}
