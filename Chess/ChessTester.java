package Chess;

//import java.util.Vector;
public class ChessTester {
	public static void main(String[] args) throws InterruptedException {
		Queen q = new Queen();
		King k = new King();
		Pawn p=new Pawn();
		Rook r = new Rook();
		Knight n =new Knight();
		Bishop b = new Bishop ();
		
		/*Vector<Piece> pieces = new Vector <Piece>();
		
		pieces.add(q);
		pieces.add(k);
		pieces.add(p);
		pieces.add(r);
		pieces.add(n);
		pieces.add(b);
		
		for(Piece piece : pieces) {
    		pieces.isLegalMove();
    	}*/
		
		System.out.println("Queen Test:");
		q.isLegalMove(1, 1, 2, 2);
		System.out.println("");
		q.isLegalMove(1, 1, 5, 3);
		System.out.println("");
		System.out.println("");
		System.out.println("King Test:");
		k.isLegalMove(3, 3, 2, 2);
		System.out.println("");
		k.isLegalMove(1, 1, 4, 2);
		System.out.println("");
		System.out.println("");
		System.out.println("Pawn Test:");
		p.isLegalMove(1, 1, 2, 1);
		System.out.println("");
		p.isLegalMove(1, 1, 2, 5);
		System.out.println("");
		System.out.println("");
		System.out.println("Rook Test:");
		r.isLegalMove(1, 1, 5, 1);
		System.out.println("");
		r.isLegalMove(1, 1, 2, 5);
		System.out.println("");
		System.out.println("");
		System.out.println("Knight Test:");
		n.isLegalMove(1, 1, 3, 2);
		System.out.println("");
		n.isLegalMove(1, 1, 3, 5);
		System.out.println("");
		System.out.println("");
		System.out.println("Bishop Test:");
		b.isLegalMove(1, 1, 3, 3);
		System.out.println("");
		b.isLegalMove(1, 1, 4, 1);
		System.out.println("");
		System.out.println("");
	}
}
