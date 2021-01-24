package boardgame;

public class Position {
	private Integer row, column;

	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(row + ", " + column);
		return sb.toString();
	}
}
