//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int n = grid.length;
		int m = grid[0].length;
		boolean[][] newGrid = new boolean[n][m];
		int tmp = n - 1;
		for(int i = n - 1; i >= 0; i--){
			boolean filled = true;
			for(int j = 0; j < m; j++){
				if(!grid[i][j]){
					filled = false;
					break;
				}
			}
			if(!filled){
				newGrid[tmp--] = grid[i];
			}
		}
		for(int i = tmp; i >= 0; i--){
			newGrid[i] = new boolean[m];
		}
		grid = newGrid;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid;
		// YOUR CODE HERE
	}
}
