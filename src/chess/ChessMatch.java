package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//É nessa classe que estão as regras do jogo de Xadrez;
public class ChessMatch {

	private Board board;

	// Essa é a classe responsável por determinar o tamanho do tabuleiro. Então, ele será informado aqui;
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	//MÉTODO responsável por iniciar a partida de Xadrez colocando as peças no tabuleiro;
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
