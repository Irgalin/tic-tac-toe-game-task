package com.cyberspeed.task;

public class TicTacToeGameTask {


    public static void main(String[] args) {
        try {
            int[][] board = {
                    {2, 1, 2},
                    {1, 2, 1},
                    {2, 0, 1}
            };
            int winner = findWinner(board);
            System.out.println("Winner: " + winner);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    private static int findWinner(int[][] board) {
        validateBoardSizes(board);
        // Check rows and columns if they have the same values
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                if (board[i][0] != 0) {
                    return board[i][0];
                }
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                if (board[0][i] != 0) {
                    return board[0][i];
                }
            }
        }
        // Check diagonals if they have the same values
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] != 0) {
                return board[0][0];

            }
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] != 0) {
                return board[0][2];
            }
        }
        return 0;
    }

    private static void validateBoardSizes(int[][] board) {
        if (board.length != 3) {
            throw new IllegalArgumentException("Board must be 3x3.");
        }

        for (int i = 0; i < 3; i++) {
            if (board[i].length != 3) {
                throw new IllegalArgumentException("Board must be 3x3.");
            }
        }
    }

}
