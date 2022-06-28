package com.company.entitiy;

import com.company.entitiy.Film;
import com.company.interfaces.Actionable;
import com.company.interfaces.Comparable;
import com.company.interfaces.Countable;
import com.company.service.FileService;

public class Survivor extends Film implements Comparable, Actionable, Countable {
    //action movie
    @Override
    public String getKey() {
        return super.getKey();
    }

    @Override
    public void setKey(String key) {
        super.setKey(key);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return
                String.format("|%3s|",getKey() )+ ' ' +
                        String.format("%20s|",getName());
    }
    @Override
    public void comparator() throws Exception{

        Film [] films= FileService.readFile();
        if(isOpen()) {
            for (var film : films) {
                if (film.getKey().equals(getKey()))
                {   System.out.println(" it's in the base  ");}

                else new Survivor();

            }

        }
        else throw new Exception("Not connected");
    }
    @Override
    public boolean isOpen() {
        return Comparable.super.isOpen();
    }
    @Override
    public void openDatabase() throws Exception{

        Film [] films= FileService.readFile();
        if(isOpen()) {
            System.out.println("Database opened as read only");
            System.out.println("_________________________________");
            System.out.print(String.format("|%3s|", "Key"));
            System.out.println(String.format("%20s|", "Value"));
            System.out.println("_________________________________");
            for (var film : films) {
                System.out.println(film);
            }

        } else throw new  Exception("Not connected");


    }

    @Override
    public void closeDatabase() {
        if(!isOpen())
            System.out.println("Database closed ");


    }

    @Override
    public void count() throws Exception {

        Film[] films = FileService.readFile();
        if(isOpen()) {
            int a=0;
            for (var film : films) {
                if(film.getKey().equals(getKey()))
                    a++;

            }
            System.out.println("Key value: " + a);
        } else throw new  Exception("Not connected");
    }

    @Override
    public void countKeyInBase() throws Exception {
        Film[] films = FileService.readFile();
        if(isOpen()) {
            int a=0;
            for (var film : films) {
                a++;

            }
            System.out.println("Key value in Base: " + a);
        } else throw new  Exception("Not connected");
    }

    @Override
    public void action() {
        System.out.println("It's action film");
    }
}
