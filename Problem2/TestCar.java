package Problem2;

public class TestCar {

	    public static void main(String []args){
	        Car c1 = new Car();
	        Car c2 = new Car();

	        c1.setId(1);
	        c1.setModel("Model X");
	        c1.setCode("lolgas");

	        c2.setId(2);
	        c2.setModel("Model Y");
	        c2.setCode("fuelwho");

	        System.out.println(c1.toString());
	        System.out.println("Model X hash: " + c1.hashCode());
	        System.out.println("");

	        System.out.println(c2.toString());
	        System.out.println("Model Y hash: "+c2.hashCode());
	        System.out.println("Checking with equals: "+c2.equals(c2));
	        System.out.println("");
	    
	    }
	}
