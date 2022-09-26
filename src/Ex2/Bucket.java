package Ex2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;

public class Bucket {

    HashSet<String> listaFlori;

    public Bucket(HashSet<String> listaFlori) {
        this.listaFlori = listaFlori;
    }

    public HashSet<String> getListaFlori() {
        return listaFlori;
    }

    public void setListaFlori(HashSet<String> listaFlori) {
        this.listaFlori = listaFlori;
    }

    public HashSet<String> getAll() {
        HashSet<String> toateFlorile = new HashSet<>();
        toateFlorile.addAll(this.listaFlori);
        return toateFlorile;
    }

    public void addFloare(String flower) {
        this.listaFlori.add(flower);
        if (this.listaFlori.contains(flower)) {
            System.out.println("S-a incercat adaugarea florii " + flower + " care deja exista in buchet.");
        }
    }

    public void removeFloare(String flower) {
        if (this.listaFlori.contains(flower)) {
            this.listaFlori.remove(flower);
        } else {
            System.out.println("Floarea " + flower + " nu a fost scoasa din buchet, pt ca nu exista");
        }
    }
}
