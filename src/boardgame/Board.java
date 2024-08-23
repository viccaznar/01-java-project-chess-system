package boardgame;

// Classe para a criação do tabuleiro.
public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	// CONSTRUTOR com os atributos para que se possa instanciar um novo tabuleiro com as coordenadas e peças informadas.
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	
}
