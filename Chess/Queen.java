package Chess;

public class Queen extends Piece {
	
	public Queen() {
		
	}
	Queen(int positionA, int positionB,boolean isWhite){
		this.positionA = positionA;
		this.positionB = positionB;
		this.isWhite = isWhite;
	}
	Queen(int positionA,int positionB,int newPositionA,int newPositionB){
		this.positionA = positionA;
		this.positionB = positionB;
		this.newPositionA = newPositionA;
		this.newPositionB = newPositionB;
	}
	@Override
	void isLegalMove(int positionA, int positionB, int newPositionA, int newPositionB) {
		if((positionA == newPositionA || positionB == newPositionB)||(newPositionA - positionA == newPositionB-positionB)) {
			System.out.print("Move is legal");
			}
			else {
				System.out.print("Move is illegal");
			}
	}

}
