package com.mycompany.pp;

import java.util.Scanner;

public class SecretStudent {
    private String name = "Jan";
    private String surname = "Kowalski";
    private int number = 123;
    
    public void readFromScanner() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Wprowadz imie:");
       name = sc.nextLine();
       System.out.println("Wprowadz nazwisko:");
       surname = sc.nextLine();
       System.out.println("Wprowadz numer:");
       number = sc.nextInt();
    }

    public void Print() {
       System.out.println("Imie: " + name);
       System.out.println("Nazwisko: " + surname);
       System.out.println("Numer: " + number);
    }    
    
    public String getName() {
        return name;
    }
    public void setName(String value) {
        if(!value.isEmpty())
          name = value;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String value) {
        if(!value.isEmpty())
            surname = value;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int value) {
        number = value;
    }
}
