import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        Boolean czyPada = true;
        Boolean czySwieciSlonce = false;
        
        
        //jeśli chcemy zainicjować zmienne z konsoli
        
        //System.out.println("Czy pada?");
        //czyPada = sc.nextBoolean();
        //System.out.println("Czy świeci słonce?");
        //czySwieciSlonce = sc.nextBoolean();
        
        
        if(czyPada && czySwieciSlonce){
            System.out.println("tęcza");
        }
        else if(czyPada && !czySwieciSlonce) {
            System.out.println("plucha");
        }
        else if(!czyPada && czySwieciSlonce) {
            System.out.println("słonecznie");
        }
        else {
            System.out.println("pochmurno");
        }
    }
}