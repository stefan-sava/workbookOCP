package ch13.ex2;

public class GridScanner {
    public static void main(String[] args) {

        char[][] grid = {
                {'.', '.', '#', '.'},
                {'a', '#', 'b', '2'},
                {'.', '.', '.', '.'}
        };
        boolean found = false;
        collumn: for (int i = 0; i < grid.length; i++)
        {
            row:
            for (int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == '#')
                {
                    continue row;
                }
                if(Character.isDigit(grid[i][j]))
                {
                    System.out.println("Found digit " + grid[i][j] + " at(row = " + i + ", col= " + j + ")");
                    found = true;
                    break collumn;
                }
            }
        }
        if(!found){
            System.out.println("No digits found");
        }
    }
}
