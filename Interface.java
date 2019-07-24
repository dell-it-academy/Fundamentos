import java.util.Scanner;
public class Interface{
    public static final Scanner in = new Scanner(System.in);
    public static int numero;
    public static int coluna;
    public static int linha;

    public static void begin(){
    //Não precisaria iniciar agora, mas pra evitar que ALGUÉM chame antes do getNew, né...
        numero = 0;
        coluna = 0;
        linha = 0;
        app.main();
    }
    
    public static void toTerminal(String msg){ System.out.println(msg);}
    public static void Finish(){ in.close(); System.exit(0); }
    public static void getNew(){
        
        while(linha < 1){
        toTerminal("Informe a quantidade de linhas: ");
        linha = in.nextInt();
        }

        while(coluna < 1){
        toTerminal("Informe a quantidade de colunas: ");
        coluna = in.nextInt();
        }
    }

    private int getRandom(){ return (int) (Math.random()*9) + 1; }
}