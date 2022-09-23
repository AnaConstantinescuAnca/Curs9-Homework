import java.util.HashSet;
import java.util.Iterator;

public class Fruits {
    HashSet<String> listaFructe;

    public Fruits(HashSet<String> listaFructe) {
        this.listaFructe = listaFructe;
    }

    public HashSet<String> getListaFructe() {
        return listaFructe;
    }

    public void setListaFructe(HashSet<String> listaFructe) {
        this.listaFructe = listaFructe;
    }

    public boolean isInListaFructe(String fruct) {
        return this.listaFructe.contains(fruct);
    }

    public boolean removeFromListaFructe(String fruct) {
        return this.listaFructe.remove(fruct);
    }

    public void addInListaFructe(String fruct) {
        this.listaFructe.add(fruct);
    }

    public int positionInListaFructe(String fruct) {
        int poz = 0;
        for (String val : this.listaFructe) {
            if (val == fruct) {
                poz = poz + 1;
                break;
            } else {
                poz++;
            }
        }
        //
        return poz;
    }

    public int customCount() {
        Iterator<String> it = this.listaFructe.iterator();
        int counter = 0;
        while (it.hasNext()) {
            it.next();
            counter++;
        }
        return counter;

    }

}
