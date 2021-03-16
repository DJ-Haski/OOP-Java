package Chess;

public class King extends Piece {

	public King() {
		
	}
	
	King(int positionA, int positionB,boolean isWhite){
		this.positionA = positionA;
		this.positionB = positionB;
		this.isWhite = isWhite;
	}
	King(int positionA,int positionB,int newPositionA,int newPositionB ){
		this.positionA = positionA;
		this.positionB = positionB;
		this.newPositionA = newPositionA;
		this.newPositionB = newPositionB;
	}
	@Override
	void isLegalMove(int positionA, int positionB, int newPositionA, int newPositionB) {
	if(((newPositionA+1)>(positionA)) && ((newPositionB-1)>(positionB)) ||
		((newPositionA+1)==(positionA) &&( newPositionB+1)==(positionB)) ||
		((newPositionA+1)==(positionA) &&( newPositionB+1)>(positionB)) ||
		((newPositionA+1)>(positionA) &&( newPositionB+1)==(positionB))
			) {
		System.out.print("Move is legal");
	}
	else {
		System.out.print("Move is illegal");
	}
	
	}

}
