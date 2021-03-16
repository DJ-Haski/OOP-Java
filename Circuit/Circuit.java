package Circuit;

abstract public class Circuit {
	public double Power;
	public double Current;
	public double Resistance;
	
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	public double getPower() {
		return 0;
		
	}
	public double getCurrent() {
		return 0;
		
	}
}
