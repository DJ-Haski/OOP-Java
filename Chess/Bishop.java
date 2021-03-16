package Chess;

public class Bishop extends Piece {

	public Bishop() {
		
	}
	Bishop(int positionA, int positionB,boolean isWhite){
		this.positionA = positionA;
		this.positionB = positionB;
		this.isWhite = isWhite;
	}
	Bishop(int positionA,int positionB,int newPositionA,int newPositionB ){
		this.positionA = positionA;
		this.positionB = positionB;
		this.newPositionA = newPositionA;
		this.newPositionB = newPositionB;
	}
	
	@Override
	void isLegalMove(int positionA, int positionB, int newPositionA, int newPositionB) {
	if(newPositionA - positionA == newPositionB-positionB) {
		System.out.print("Move is legal");
	}
	else {
		System.out.print("Move is illegal");
	}
	}
}
