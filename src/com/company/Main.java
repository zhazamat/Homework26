package com.company;

import com.company.entitiy.BackToTheFuture;
import com.company.entitiy.Fargo;
import com.company.entitiy.Film;
import com.company.entitiy.Survivor;
import com.company.interfaces.Comparable;
import com.company.service.FileService;

public class Main {
    static void Run() throws Exception {
        System.out.println("_______________________________________________");
BackToTheFuture backToTheFuture=new BackToTheFuture();

        backToTheFuture.openDatabase();
backToTheFuture.setName("3,ZZZ,5623");
backToTheFuture.setKey("K5");

        System.out.print(String.format("|%3s|", backToTheFuture.getKey()));
        System.out.println(String.format("%20s|", backToTheFuture.getName()));
backToTheFuture.comparator();
backToTheFuture.comedy();
backToTheFuture.count();
backToTheFuture.countKeyInBase();
        System.out.println("Is open ? "+backToTheFuture.isOpen());
backToTheFuture.closeDatabase();

        System.out.println("_______________________________________________");
     Survivor survivor=new Survivor();
     survivor.openDatabase();
      survivor.setName("Survive");
      survivor.setKey("K7");
        System.out.print(String.format("|%3s|", survivor.getKey()));
        System.out.println(String.format("%20s|", survivor.getName()));
      survivor.comparator();
      survivor.count();
      survivor.countKeyInBase();
      survivor.action();
      survivor.closeDatabase();

        System.out.println("_______________________________________________");

        Fargo fargo=new Fargo();
        fargo.openDatabase();
        fargo.setKey("K6");
        fargo.setName("FARGO");
        System.out.print(String.format("|%3s|", fargo.getKey()));
        System.out.println(String.format("%20s|",fargo.getName()));
        fargo.comparator();
        fargo.drama();
        fargo.count();
        fargo.countKeyInBase();
        fargo.closeDatabase();


    }
    public static void main(String[] args) throws Exception {

   Run();



    }
}
