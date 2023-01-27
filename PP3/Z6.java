import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Double a;
        Double b;
        
        System.out.println("Wprowadz pierwszą liczbe:");
        a = sc.nextDouble();
        System.out.println("Wprowadz drugą liczbe:");
        b = sc.nextDouble();
        if(a > b) {
            Double zmiennaTymczasowa = a;
            a = b;
            b = zmiennaTymczasowa;
        }
        System.out.println("Wybrany przedział: [" + a + ", " + b + "]");
        
        
        double pierwszaLosowa = a + ((new Random().nextDouble()) * (b - a));
        double drugaLosowa = a + ((new Random().nextDouble()) * (b - a));
        double trzeciaLosowa = a + ((new Random().nextDouble()) * (b - a));
        System.out.println("Wartości generowane losowo:");
        System.out.println(pierwszaLosowa);
        System.out.println(drugaLosowa);
        System.out.println(trzeciaLosowa);
        
        
       double[] arr = { pierwszaLosowa, drugaLosowa, trzeciaLosowa };
       Arrays.sort(arr);
       
       System.out.println("Gdzie: " +arr[0]+ " < " + arr[1]+ " < " +arr[2]);
   }
}