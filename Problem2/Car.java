package Problem2;

public class Car {

	    private int id;
	    private String model;
	    private String code;

	    Car(){ }

	    Car(int id, String model,String code){
	        this.id = id;
	        this.model = model;
	        this.code = code;
	    }

	    public void setId(int id){
	    	this.id = id;
	    	}

	    public int getId(){
	    	return this.id;
	    	}

	    public void setModel(String model){
	    	this.model = model;
	    	}

	    public String getModel(){
	    	return this.model; 
	    	}

	    public void setCode(String code){
	    	this.code = code;
	    }
	    public String getCode(){ 
	    	return this.code;
	    	}

	    @Override
	    public String toString() {
	        return "Car with id " + id + " has model name " + model + " and codeName is " + code;
	    }

	    @Override
	    public boolean equals(Object car){
	        if (car == this) return true;
	        if(car == null) return true;

	        Car car1 = (Car) car;
	        return Integer.compare(this.getId(), car1.id)
	        		== 0 && this.model.equals(car1.model) && this.code.equals(car1.code);
	    }

	    @Override
	    public int hashCode(){
	        int result = 37;
	        result =  127 * result + id;
	        result = 127 * result + model.hashCode();
	        result = 127 * result + code.hashCode();

	        return result;
	    }

	}

