package Shape3D;

import java.util.Vector;

public class Shape3dTester {

	public static void main(String[] args) throws InterruptedException {
		
		Cube c = new Cube(5);
		Sphere s = new Sphere(5);
		Cylinder cy = new Cylinder(5,4);
		
		
		Vector<Shape3D> shapes3d = new Vector <Shape3D>();
		
		shapes3d.add(c);
    	shapes3d.add(s);
    	shapes3d.add(cy);
    	
    	
    	for(Shape3D shape3d : shapes3d) {
    		System.out.print("Checking for ");
    		shape3d.name();
    		System.out.println("");
    		System.out.print("Area of ");
    		shape3d.name();
    		System.out.print(" is ");
    		shape3d.surfaceArea();
    		System.out.print("Volume of ");
    		shape3d.name();
    		System.out.print(" is ");
    		shape3d.volume();
    		System.out.println("");
    	}
		
    }
}
