public class Board{
private int[][] paper;
private String line;

    public Board(int[][] paper){
        this.paper = paper;
        line = "";
    }

    public void board(){
        Interface.toTerminal(line);
    }

    public void refresh(){
        String [][] board = matString();
        
        line += "\n";
        for(int i = 0; i < board.length; i++){

            line += "|";
            for(int j = 0; j < board[i].length; j++, line += "|"){
                line += " " + board[i][j] + " ";
            }

            if(i == board.length -1) break;
            line += "\n";
            for(int j = 0; j < board[i].length; j++)
                line += "----";
            line += "\n";
        }

        line += "\n";
        Interface.toTerminal(line);
    }


    private String[][] matString(){
        String[][] strM = new String[paper.length][paper[paper.length-1].length];
        int x;

        for(int i = 0; i < paper.length; i++)
            for(int j = 0; j < paper[i].length; j++){
                x = paper[i][j];
                if(x != 0)
                    strM[i][j] = "" + x;
                else
                    strM[i][j] = "" + x;
            }

        return strM;
    }
}