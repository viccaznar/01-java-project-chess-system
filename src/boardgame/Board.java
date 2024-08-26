package boardgame;

// Classe para a criação do tabuleiro.
public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	// CONSTRUTOR com os atributos para que se possa instanciar um novo tabuleiro
	// com as coordenadas e peças informadas.
	public Board(int rows, int columns) {
		// PROGRAMAÇÃO DEFENSIVA: Alerta caso o tamanho das linhas e colunas seja
		// inferior a 1;
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	// PROGRAMAÇÃO DEFENSIVA: SETTERS removidos para que o tamanho das linhas e
	// colunas do tabuleiro não possa ser alterado;
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// MÉTODO: Retorna uma peça a partir de ATRIBUTOS SIMPLES de linha e coluna em
	// uma matriz;
	public Piece piece(int row, int column) {
		// PROGRAMAÇÃO DEFENSIVA: Alerta caso a posição não exista no tabuleiro;
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}

	// SBRECARGA DO MÉTODO: Retorna uma peça a partir dos ATRIBUTOS DO OBJETO do
	// tipo Position, utilizando os GETTERS;
	public Piece piece(Position position) {
		// PROGRAMAÇÃO DEFENSIVA: Alerta caso a posição não exista no tabuleiro;
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	// MÉTODO: para colocar a peça escolhida em uma dada posição;
	public void placePiece(Piece piece, Position position) {
		// PROGRAMAÇÃO DEFENSIVA: Alerta caso já exista uma peça na posição dada;
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		// Essa linha informa que, após a chamada do método, a posição da peça em
		// questão não é mais NULL;
		piece.position = position;
	}

	// MÉTODO: para remover uma peça da posição dada;
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	// MÉTODO: para confirmar se a posição dada existe no tabuleiro com atributos de
	// um tipo convencional (int);
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	// MÉTODO: para confirmar se a posição dada existe no tabuleiro com atributos de
	// objeto (Position);
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		// PROGRAMAÇAO DEFENSIVA: Alerta caso a posição dada não exista no tabuleiro;
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}

}