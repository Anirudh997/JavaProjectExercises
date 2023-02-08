package recursion;

public class SudokoSolver {
    public static void main(String[] args) {
        String[][] board = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};

        solveBoard(board);
    }

    private static void solveBoard(String[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=="."){
                    for(char c ='1';c<='9';c++){
                        if(isValid())return;
                    }
                }
            }
        }
    }

    private static boolean isValid() {
        return false;
    }
}
