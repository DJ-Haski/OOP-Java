package Chess;

public class Pawn extends Piece {
	public boolean isFirstMove;
	
	public Pawn() {
		
	}
	
	Pawn(int positionA, int positionB,boolean isWhite){
		this.positionA = positionA;
		this.positionB = positionB;
		this.isWhite = isWhite;
	}
	Pawn(int positionA,int positionB,int newPositionA,int newPositionB, boolean isFirstMove){
		this.positionA = positionA;
		this.positionB = positionB;
		this.newPositionA = newPositionA;
		this.newPositionB = newPositionB;
		this.isFirstMove = isFirstMove;
	}
	@Override
	void isLegalMove(int positionA, int positionB, int newPositionA, int newPositionB) {
		if(isFirstMove == true) {
			if(((newPositionA-positionA)<=2) && (newPositionB==positionB)) {
				System.out.print("Move is legal");
			}
			else {
				System.out.print("Move is illegal");
			}
		}
		else {
			if(((newPositionA-positionA)<=1) && (newPositionB==positionB)){
				System.out.print("Move is legal");
		}
			else {
				System.out.print("Move is illegal");
			}
		
	}

}
}
