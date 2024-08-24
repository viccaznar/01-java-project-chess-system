package chess;

import boardgame.Board;
import boardgame.Piece;

//SUBCLASSE que extende a classe Piece ou seja, ela herda caracteristicas da Classe Piece;
public class ChessPiece extends Piece {

	private Color color;

	//SUPERCONSTRUTOR: Como uma subclasse da Piece, é necessário inserir um construtor que faça a chamada para o construtor da SUPERCLASSE;
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Só é possível acessar a cor, mas não modificá-la;
	public Color getColor() {
		return color;
	}
	
	
	
	
}
