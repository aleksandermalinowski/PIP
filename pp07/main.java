package com.mycompany.pp07;

import com.mycompany.pp.SecretStudent;
import com.mycompany.pp.Student;


public class PP07 {

    public static void main(String[] args) {
       //Zadanie pierwsze
       Student studentPierwszy = new Student();
       Student studentDrugi = new Student();
       studentDrugi.name = "Aleksander Malinowski";
       System.out.println(studentPierwszy.name);
       System.out.println(studentDrugi.name);
       
       studentDrugi.number = 456;
       System.out.println(studentPierwszy.number);
       System.out.println(studentDrugi.number);
       
       //Zadanie drugie
       SecretStudent sekretnyStudent = new SecretStudent();
       System.out.println(sekretnyStudent.getName());
       System.out.println(sekretnyStudent.getSurname());
       System.out.println(sekretnyStudent.getNumber());
       
       //zadanie trzecie
       System.out.println("Sprawdzam ustawianie pustej wartości");
       sekretnyStudent.setName("");
       System.out.println("Ustawiam wartosci");
       sekretnyStudent.setName("Jaś");
       sekretnyStudent.setSurname("Nowak");
       sekretnyStudent.setNumber(455);
       System.out.println(sekretnyStudent.getName());
       System.out.println(sekretnyStudent.getSurname());
       System.out.println(sekretnyStudent.getNumber());
       
       //zadanie czwarte
       SecretStudent sekretnyStudentDwa = new SecretStudent();
       SecretStudent sekretnyStudentTrzy = new SecretStudent();
       sekretnyStudentDwa.readFromScanner();
       sekretnyStudentDwa.Print();
       
       sekretnyStudentTrzy.readFromScanner();
       sekretnyStudentTrzy.Print();
       
    }
}
