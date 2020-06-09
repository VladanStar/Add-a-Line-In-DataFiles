package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    // upis linije u fajl sa brisanjem svega sto je u fajlu do sada
    public Main() {
        PrintWriter upisUFajl;
        try {
            upisUFajl = new PrintWriter("novifajl.txt");
            upisUFajl.println("Ovo je jedna linija u fajlu");
            upisUFajl.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        // dodavanje linije na postojeci fajl
        try {
            upisUFajl = new PrintWriter(new FileWriter("novifajl.txt", true));
            upisUFajl.println("Ovo je jos jedna dodata linija na proslu liniju u fajlu");
            upisUFajl.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        // write your code here
        new Main();

    }

}
