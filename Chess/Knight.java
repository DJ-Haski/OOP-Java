package Chess;

public class Knight extends Piece {
	
	public Knight() {
		
	}
	Knight(int positionA, int positionB,boolean isWhite){
		this.positionA = positionA;
		this.positionB = positionB;
		this.isWhite = isWhite;
	}
	Knight(int positionA,int positionB,int newPositionA,int newPositionB ){
		this.positionA = positionA;
		this.positionB = positionB;
		this.newPositionA = newPositionA;
		this.newPositionB = newPositionB;
	}
	
	@Override
	void isLegalMove(int positionA, int positionB, int newPositionA, int newPositionB) {
		//top
		if((newPositionA==positionA+2 && newPositionB==positionB+1)||(newPositionA==positionA+2 && newPositionB==positionB-1)) {
			System.out.print("Move is legal");
		}
		//bottom
		else if((newPositionA==positionA-2 && newPositionB==positionB+1)||(newPositionA==positionA-2 && newPositionB==positionB-1)) {
			System.out.print("Move is legal");
		}
		else if((newPositionB==positionB+2 && newPositionA==positionA+1)||(newPositionB==positionB+2 && newPositionA==positionA-1)) {
			System.out.print("Move is legal");
		}
		else if((newPositionB==positionB-2 && newPositionA==positionA+1)||(newPositionB==positionB-2 && newPositionA==positionA-1)) {
			System.out.print("Move is legal");
		}
		else {
			System.out.print("Move is illegal");
		}
	}

}
