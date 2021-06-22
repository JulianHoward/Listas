import primero.Lista;

import java.util.ArrayList;
import java.util.Iterator;


public class TestArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList();
        palabras.add("Hugo");
        palabras.add("Paco");
        palabras.add("Luis");

        System.out.println(palabras);

        Lista testLista = new Lista();
        testLista.insertar("hugo");
        testLista.insertar("Paco");
        testLista.insertar("Luis");
        System.out.println("Lista con Contenedor: " + testLista);

        oficial.Lista<String> a = new oficial.Lista<String>();
        a.insertar("hugo");
        a.insertar("Paco");
        a.insertar("Luis");
        System.out.println("Nuestea Lista: " + a);
        System.out.println("Tamano: " + a.tamano());

        oficial.Lista<String> b = new oficial.Lista<String>();
        b.add("hugo");
        b.add("Paco");
        b.add("Luis");
        System.out.println("Nuestea Lista: " + b);
        System.out.println("Tamano: " + b.tamano());

        Iterator<String> iterator = b.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();

            System.out.println("Desde while: " + s);
        }

        for (String s : b) {
            System.out.println("Desde for abreviado: " + s);
        }

    }
}
