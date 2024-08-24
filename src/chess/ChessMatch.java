package chess;

import boardgame.Board;

//É nessa classe que estão as regras do jogo de Xadrez;
public class ChessMatch {

	private Board board;

	// Essa é a classe responsável por determinar o tamanho do tabuleiro. Então, ele será informado aqui;
	public ChessMatch() {
		board = new Board(8, 8);
	}

	// MÉTODO para retornar uma matriz de peças de xadrez correspondente a partida;
	// Os atributos são acessados a partir dos GETTERS de linhas e colunas do tabuleiro
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
