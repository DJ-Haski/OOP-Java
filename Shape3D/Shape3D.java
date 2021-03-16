package Shape3D;

 abstract public class Shape3D {

    public double volume;
    public double area;
    final double pi = 3.14;
    
	public Shape3D() {
		
	}
	abstract void volume();
	abstract void  surfaceArea();
	abstract void parameters();
	abstract void name();
}

