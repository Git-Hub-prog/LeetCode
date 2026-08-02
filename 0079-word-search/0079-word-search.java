class Solution {

    public boolean exists(char[][] brd, int i, int j, char[] word, int idx) {

        // Base case: all characters matched
        if (idx == word.length) {
            return true;
        }

        // Boundary check + visited check + character mismatch
        if (i < 0 || i >= brd.length ||
            j < 0 || j >= brd[0].length ||
            brd[i][j] == '*' ||
            brd[i][j] != word[idx]) {
            return false;
        }

        // Mark current cell as visited
        char ch = brd[i][j];
        brd[i][j] = '*';

        // Explore all 4 directions
        boolean res =
                exists(brd, i + 1, j, word, idx + 1) ||
                exists(brd, i - 1, j, word, idx + 1) ||
                exists(brd, i, j + 1, word, idx + 1) ||
                exists(brd, i, j - 1, word, idx + 1);

        // Backtrack
        brd[i][j] = ch;

        return res;
    }

    public boolean exist(char[][] board, String word) {

        char[] wordArr = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == wordArr[0] &&
                    exists(board, i, j, wordArr, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}