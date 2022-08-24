package sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gamestate, int[][] gridState){
        this.gameState = gamestate;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    // Making gridState immutable, stopping the Sudoku game object
    // from being altered overtime
    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
