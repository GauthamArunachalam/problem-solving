package blind75;

import utils.InputDataReader;

public class WordSearch {

    public static boolean check(char[][] board, int row, int col, String word, int stringIndex) {
        if (stringIndex == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        if (board[row][col] == word.charAt(stringIndex)) {
            char temp = board[row][col];
            board[row][col] = '0';
            System.out.println(row + " " + col + " " + board[row][col] + " " + word.charAt(stringIndex));
            boolean returnVal =  check(board, row, col-1, word, stringIndex+1) ||
                    check(board, row, col+1, word, stringIndex+1) ||
                    check(board, row-1, col, word, stringIndex+1) ||
                    check(board, row+1, col, word, stringIndex+1);
            board[row][col] = '0';
            return returnVal;
        }
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<=board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && check(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        char[][] board = inputDataReader.read2DCharArr();
        String word = inputDataReader.readSingleString();

        System.out.println(exist(board, word));
    }
}
