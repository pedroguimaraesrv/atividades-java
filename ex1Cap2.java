import java.io.*;
public class ex1Cap2 {
    public static void main(String[] args){
        String s="";
        BufferedReader sc;
        Float area,base,altura;

        try{
        System.out.println("Digite o valor da base: ");
        sc=new BufferedReader(new InputStreamReader(System.in));
        s= sc.readLine();
        base=Float.parseFloat(s);

        System.out.println("Digite o valor da altura: ");
        sc=new BufferedReader(new InputStreamReader(System.in));
        s = sc.readLine();
        altura=Float.parseFloat(s);

        area=(base*altura)/2;

        System.out.println("O valor da area eh: "+area);
        }catch(IOException erro){
            System.out.println("Erro "+ erro.toString());
        }catch(NumberFormatException erro){
            System.out.println("Digite apenas numeros"+ erro.toString());
        }
    }
    
}
