import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Float liczbaPierwsza;
        Float liczbaDruga;
        String nazwaOperacji;
        
        System.out.println("Wprowadz nazwe operacji:");
        nazwaOperacji = sc.nextLine();
        System.out.println("Wprowadz pierwszą liczbe:");
        liczbaPierwsza = absoluteValue(sc.nextFloat());
        System.out.println("Wprowadz drugą liczbe:");
        liczbaDruga = absoluteValue(sc.nextFloat());
        
        switch(nazwaOperacji) {
            case "ADD":
              System.out.println(ADD(liczbaPierwsza, liczbaDruga));
              break;
            case "SUB":
              System.out.println(SUB(liczbaPierwsza, liczbaDruga));
              break;
            case "DIV":
              System.out.println(DIV(liczbaPierwsza, liczbaDruga));
              break;
            case "MUL":
              System.out.println(MUL(liczbaPierwsza, liczbaDruga));
              break;
            default:
              System.out.println("Brak takiej operacji");
          }
    }
    
    public static Float ADD(Float a, Float b) {
        return a+b;
    }
    public static Float SUB(Float a, Float b) {
        return a-b;
    }
    public static Float DIV(Float a, Float b) {
        return a/b;
    }
    public static Float MUL(Float a, Float b) {
        return a*b;
    }
    public static Float absoluteValue(Float liczba) {
       return Math.abs(liczba);
    }
}