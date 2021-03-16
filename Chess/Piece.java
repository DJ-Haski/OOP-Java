package Chess;

abstract public class Piece {
	int positionA;
	int positionB;
	
	int newPositionA;
	int newPositionB;
	
	boolean isWhite;
	
	public Piece(){
		
	}
	
	abstract void isLegalMove( int positionA, int positionB, int newPositionA, int newPositionB);

	
}
