public class Maze3D
{
    private final int TRIED = 3;
    private final int PATH = 7;
    
    private int[][][] grid = { { {1,1,1,0,1,1,0,0,0,1,1,1,1},
                            {1,0,1,1,1,0,1,1,1,1,0,0,1},
                            {0,0,0,0,1,0,1,0,1,0,1,0,0},
                            {1,1,1,0,1,1,1,0,1,0,1,1,1},
                            {1,0,1,0,0,0,0,1,1,1,0,0,1},
                            {1,0,1,1,1,1,1,1,0,1,1,1,1},
                            {1,0,0,0,0,0,0,0,0,0,0,0,0},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1} },
                            
                            { {1,1,1,0,1,1,0,0,0,1,1,1,1},
                            {1,0,1,1,1,0,1,1,1,1,0,0,1},
                            {0,0,0,0,1,0,1,0,1,0,1,0,0},
                            {1,1,1,0,1,1,1,0,1,0,1,1,1},
                            {1,0,1,0,0,0,0,1,1,1,0,0,1},
                            {1,0,1,1,1,1,1,1,0,1,1,1,1},
                            {1,0,0,0,0,0,0,0,0,0,0,0,0},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1} }, 
                            
                            { {1,1,1,0,1,1,0,0,0,1,1,1,1},
                            {1,0,1,1,1,0,1,1,1,1,0,0,1},
                            {0,0,0,0,1,0,1,0,1,0,1,0,0},
                            {1,1,1,0,1,1,1,0,1,0,1,1,1},
                            {1,0,1,0,0,0,0,1,1,1,0,0,1},
                            {1,0,1,1,1,1,1,1,0,1,1,1,1},
                            {1,0,0,0,0,0,0,0,0,0,0,0,0},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1} } };
    
    public boolean traverse(int row, int column, int depth)
    {
        boolean done = false;
        if (valid(row, column, depth))
        {
            grid[row][column][depth] = TRIED; // this cell has been tried
            if (row == grid.length-1 && column == grid[0].length-1 && depth == grid.length-1)
            done = true; // the maze is solved
      
            else
            {
                done = traverse(row+1, column, depth); // down
                if (!done)
                    done = traverse(row, column+1, depth); // right
                if (!done)
                    done = traverse(row-1, column, depth); // up
                if (!done)
                    done = traverse(row, column-1, depth); // left
                if (!done)
                    done = traverse(row, column, depth+1); //deeper
                if (!done)
                    done = traverse(row, column, depth-1); //closer
            }
    
            if (done) // this location is part of the final path
            System.out.println("Path at\t " + row + " and " + column + " depth " + depth);
        }
    return done;
    }
    // Determines if a specific location is valid.
    private boolean valid(int row, int column, int depth)
    {
        boolean result = false;
        // check if cell is in the bounds of the matrix
        if (row >= 0 && row < grid.length && column >= 0 && column < grid[row].length && depth >= 0 && depth < grid[row][column].length)
        // check if cell is not blocked and not previously tried
        if (grid[row][column][depth] == 1)
            result = true;
        return result;
    }
    // Returns the maze as a string.
    public String toString()
    {
        String result = "\n";
        for (int row=0; row < grid.length; row++)
        {
            for (int column=0; column < grid[row].length; column++)
            {
                for (int depth=0; depth < grid[row][column].length; depth++)
                {
                    result += grid[row][column][depth] + "";
                }
                result += "\n";
            }
            result += "\n";
        }
    return result;
    }
}