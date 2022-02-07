package Pilhas;
import java.util.*;
import java.util.List;

public class Pilhas {
    public static void main(String[] args) {

        Fila objetos = new Fila();

        System.out.println(objetos.getLista());
        System.out.println("\n");

    }
}

class Fila{
    Queue<Integer> lista = new LinkedList<>();

    public Queue<Integer> getLista() {
        for (int i = 0 ; i < 5 ; i++)
            lista.add(i);
        return lista;
    }


}