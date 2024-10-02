// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int ans = 0;
		boolean ok = false;

		int maxValCol = -1;
		int minValCol = 100000;
		int maxValRow = -1;
		int minValRow = 100000;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == ch) {
					ok = true;
					maxValCol = Math.max(maxValCol, j);
					minValCol = Math.min(minValCol, j);
					maxValRow = Math.max(maxValRow, i);
					minValRow = Math.min(minValRow, i);
				}
			}
		}
		if(!ok) return 0;
		else{
			int h = maxValRow - minValRow + 1;
			int w = maxValCol - minValCol + 1;
			ans = h * w;
			return ans;
		}
		// YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int cnt = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[j].length; j++) {
				if(grid[i][j] == '+') {
					cnt++;
				}
			}
		}
		return cnt; // YOUR CODE HERE
	}
}
