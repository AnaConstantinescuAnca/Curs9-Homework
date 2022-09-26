package Ex2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HashSet<String> listaFlori = new HashSet<>();

        listaFlori.add("garoafa");
        listaFlori.add("trandafir");
        listaFlori.add("lalea");
        listaFlori.add("narcisa");
        listaFlori.add("papadie");

        Bucket bucket = new Bucket(listaFlori);

        System.out.println("Buchetul contine urmatoarele flori " + bucket.getListaFlori());

        System.out.println("Toate florile din buchet "  + bucket.getAll());

        //adaug inca o floare in buchet
        bucket.addFloare("margareta");
        System.out.println("Dupa adaugare buchetul contine " + bucket.getListaFlori());

        //adaug o floare deja existenta in buchet
        bucket.addFloare("garoafa");
        System.out.println("Buchetul contine " + bucket.getListaFlori());

        //scot o floare din buchet
        bucket.removeFloare("margareta");
        System.out.println("Buchetul s-a modificat prin scoaterea unei flori: " + bucket.getListaFlori());

    }
}
