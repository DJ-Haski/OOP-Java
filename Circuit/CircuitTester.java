package Circuit;

public class CircuitTester {

	public static void main(String[] args) throws InterruptedException {
		
		
		Circuit a = new Resistor();
		Circuit b = new Resistor();
		Circuit c = new Resistor();
		Circuit d = new Resistor();
		Circuit e = new Resistor();
		Circuit f = new Series();
		Circuit g = new Parallel();
		Circuit h = new Series();
		Circuit circuit = new Parallel();
		double R = circuit.getResistance();
		
		
	}
}
