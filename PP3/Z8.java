import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Integer waluta;
        Double kwota;
        Double kursPLJY = 0.033;
        Double kursJYPL = 29.99;
        
        System.out.println("Witamy w kalkulatorze");
        System.out.println("Wybierz walutę:");
        waluta = sc.nextInt();
        System.out.println("Wprowadz kwote:");
        kwota = sc.nextDouble();
        System.out.println(kwota);
        switch(waluta){
            case 1:
                System.out.println(kwota + " zł +> " + (kwota * kursJYPL) + " ¥"); 
            break;
            case 2:
                System.out.println(kwota + " ¥ +> " + (kwota * kursPLJY) + " zł"); 
            break;
            default:
                System.out.println("Błędna waluta"); 
            break;
        }
    }
}