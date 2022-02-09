/*
Escriba un programa que cree un objeto LinkedList de 10 caracteres;
después el programa debe crear un segundo objeto LinkedList que contenga una copia de la primera lista,
pero en orden inverso.
*/
import java.util.Collections;
import java.util.LinkedList;
public class Ejercicio2 {
    public static void main(String[] args) {
        LinkedList caracteres = new LinkedList<>();

        // a b c d e f g h i j
        caracteres.add('a');
        caracteres.add('b');
        caracteres.add('c');
        caracteres.add('d');
        caracteres.add('e');
        caracteres.add('f');
        caracteres.add('g');
        caracteres.add('h');
        caracteres.add('i');
        caracteres.add('j');

        System.out.println(caracteres);

        LinkedList copiaCaracteres = new LinkedList<>(caracteres);

        Collections.reverse(copiaCaracteres);
        System.out.println("Copia:\n" + copiaCaracteres);

    }
}
