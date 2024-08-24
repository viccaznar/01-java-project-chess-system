package boardgame;

// Classe para a criação das peças do jogo.
public class Piece {
	
	/*
	 * O atributo POSITION deve ser PROTECTED, pois representa apenas uma posição de matriz.
	 * E não será acessível pela camada Chees.
	 */ 
	protected Position position;
	private Board board;
	
	// CONSTRUTOR com os atributos para que se possa criar uma nova peça.
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	/*
	 * GETs and SETTERS: SET deve ser deletado, pois não será possível alterar o atributo BOARD.
	 * O atributo BOARD deve ser PROTECTED para que não possa ser acessado por outras classes.
	 * Seu uso é exclusivo para a camada BOARD.
	 */
	protected Board getBoard() {
		return board;
	}
	
	
	
	
}
