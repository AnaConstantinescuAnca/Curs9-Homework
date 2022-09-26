package Ex1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

       HashSet<String> listaFructe = new HashSet<>();
       listaFructe.add("mere");
       listaFructe.add("pere");
       listaFructe.add("cirese");
        listaFructe.add("gutui");

       Basket basket = new Basket(new Fruits(listaFructe));
       basket.listaFructe.setListaFructe(listaFructe);
       System.out.println("Cosul contine urmatoarele fructe adaugate: " +basket.listaFructe.getListaFructe());

        System.out.println("Exista in cos fructul cautat ? " +  basket.listaFructe.isInListaFructe("mere"));
        //basket.listaFructe.isInListaFructe("mere");

        System.out.println("Am scos din cos fructul adaugat ? " + basket.listaFructe.removeFromListaFructe("mere"));

        System.out.println("in cos au ramas urmatoarele fructe: " + basket.listaFructe.getListaFructe());

        System.out.println(basket.listaFructe.positionInListaFructe("cirese"));

        System.out.println(basket.listaFructe.positionInListaFructe("pere"));

        listaFructe.add("prune");
        basket.setListaFructe(new Fruits(listaFructe));
        System.out.println("cos actualizat cu un fruct: " + basket.listaFructe.getListaFructe());

        System.out.println(String.format("In cos avem %d fructe. ", basket.listaFructe.getListaFructe().size()));

        System.out.println(String.format("Folosind metoda customCount, in cos avem %d fructe.",
                basket.listaFructe.customCount()));
    }



}
