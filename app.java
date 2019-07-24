public class app{
    public static int[][] board;
    public static Board paper;

    public static void main(String args[]){
        
        Interface.getNew();
        board = new int[Interface.linha][Interface.coluna];
        paper = new Board(board);
        Interface.begin();
    }

    public static void main(){
        int column = 0;
        int line = 0;

        int value = 1;

        for(int i = 0; line < board.length; line++, i++){
            for(int j = 0; j < board.length - column; j++){
                board[line][column] = line + 1;
                Interface.toTerminal("Line: "+line+" / Column: "+column);
            }
            column++;

        i = 0;
        Interface.toTerminal("\n\n Final -> Line: "+line+" / Column: "+column);
        }
        

        paper.refresh();
        Interface.Finish();
    }
}