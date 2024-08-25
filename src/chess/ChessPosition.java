package chess;

import boardgame.Position;

// Classe com métodos para a conversão entre coordenadas de posição e posições de xadrez;
public class ChessPosition {

	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		// PROGRAMAÇÃO DEFENSIVA: Alerta caso o valor de colunas e linhas sejam inválido;
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instancing ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}
	
	// PROGRAMAÇÃO DEFENSIVA: SETTERS removidos para que os valores de linhas e colunas não possam ser alterados;
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}

	// MÉTODO: para converter ChessPosition para Position
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// MÉTODO: para converter Position para ChessPosition
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
	
}
