import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) {
        System.out.print("TARIFA");
        System.out.print("-----------------");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Dias usados: ");
        float dia = Scanner.NextFloat;
        System.out.print("Km percorridos: ");
        float km = Scanner.NextFloat;
        
        float preco = dia*90f + km*0.20f;
        System.out.println("Preço Total: " + preco + " R$");
    }
}
