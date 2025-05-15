package frq;

public class GridPath {
    private int[][] grid;

    public Location getNextLoc(int row, int col) {
        Location n1 = null;
        Location n2 = null;
        int rows = grid.length;
        int cols = grid[0].length;
        if (row+1 < rows) {
            n1 = new Location(row+1, col);
        }

        if (col+1 < cols) {
            n2 = new Location(row, col+1);
        }

        if (n1 == null || n2 == null) {
            if (n1 == null) {
                return n2;
            } else {
                return n1;
            }
        } else {
            if (grid[n1.getRow()][n1.getCol()] < grid[n2.getRow()][n2.getCol()]) {
                return n1;
            } else {
                return n2;
            }
        }

    }

    public int sumPath(int row, int col) {
        return 0;
    }
}
