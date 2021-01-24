package boardgame;

public class Position {
	private Integer row, column;

	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		
	}
	
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(row + ", " + column);
		return sb.toString();
	}
}
