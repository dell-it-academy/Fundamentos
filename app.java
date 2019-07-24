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
        int a = 0;

        int lineSize = board.length -1;
        int columnSize = board[lineSize].length -1;

        for(; line <= lineSize - line; line++){
            for(column = 0; column <= columnSize - line; column++){
                if(line < column) a = line + 1;
                else a = column + 1;
                board[line][column] = a;
                board[lineSize - line][columnSize - column] = a;
                
                if(line > 0 && column == columnSize - line){
                    for(int i = columnSize, j = line; i > columnSize - line; i--, j++){
                        a = board[line][i - (columnSize - line)];
                        Interface.toTerminal("line: "+line+" | i: "+i+" | a: "+ a +
                                             "\nGet by -> board[" + line + "]["+ (i - (columnSize - line))+"]\n"+
                                             "columnSize: "+columnSize+
                                             "\ncolumnSize - line: " + (columnSize - line)+"\n"+
                                             "i - (columnSize - line)"(i - (columnSize - line)));
                        board[line][i] = a;
                        board[lineSize - line][columnSize - i] = a;
                    }
                }
            }
        }

        paper.refresh();
        Interface.Finish();
    }
}

/*
Interface.toTerminal("board["+(lineSize -1 -line)+"]["+(columnSize -1 -i)+"]");
Interface.toTerminal("\n" + "board["+(line)+"]["+(column)+"]");
paper.refresh();
*/