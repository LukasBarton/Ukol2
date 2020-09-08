import java.util.Scanner;

public class NE{
    public static void main(String[] args) {
        Scanner cislo = new Scanner(System.in);
        System.out.println("zadej cislo:");
        int age = cislo.nextInt();
        int c = 7;
        int sum = age % c;
        if(sum == 0){
          System.out.println("cislo je delitelne sedmi");
        }else{
          System.out.println("cislo neni delitelne sedmi");
        }
    }
}

