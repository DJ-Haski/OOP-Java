package Problem1;

public class Data {
private int counter;
private double sum;
private double maximum;
private double averg;

public Data(){
counter = 0;
sum = 0;
maximum=0;
}

public void addValue(int value) {
	sum += value;
	if(value > maximum) {
		maximum = value;
		
	}
	counter=counter+1;
}

public double getMaximum() {
	return maximum;
}

public double getAverage() {
	averg =((sum) / counter);
	return (averg);
}

}
