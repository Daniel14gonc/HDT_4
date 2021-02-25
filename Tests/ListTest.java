/**@author Daniel Gonzalez 20293
 * Modificacion: 02/24/2021
 * Clase: ListTest
 *
 * Descripcion:
 *  Clase que permite realizar los tests de las listas.
 */

import org.junit.Assert;

import static org.junit.Assert.*;

public class ListTest {

    @org.junit.Test
    public void size() {
        //Post: Se obtienen dos listas, una simplemente encadenada y otra doblemente encadenada.
        //      Luego se valida que al agregar un elemento, el tamaño de la lista aumente a 1.
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3); //Obtiene una lista simplemente encadenada.
        list.add(2);
        assertEquals("No funciona el metodo porque el tamaño no es el esperado", list.size(), 1);

        list = listFactory.getList(4); //Obtiene una lista doblemente encadenada.
        list.add(10);
        list.add(3);
        assertEquals("No funciona el metodo porque el tamaño no es el esperado", list.size(), 2);
    }

    @org.junit.Test
    public void isEmpty() {
        //Post: Se crean dos listas, una simplemente encadenada y una doblemente encadenada.
        //      Luego se determina si están vacías, al no haberles agregado ningún elemento.
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3); //Obtiene una lista simplemente encadenada.
        assertTrue("La lista debe estar vacia pero no lo esta", list.isEmpty());

        list = listFactory.getList(4); //Obtiene una lista doblemente encadenada.
        assertTrue("La lista debe estar vacia pero no lo esta", list.isEmpty());
    }

    @org.junit.Test
    public void add() {
        //Post: Se crean dos listas, una simplemente encadenada y una doblemente encadenada.
        //      Se ingresa un numero a la lista y se aplica el método, el cual debe retornar el valor ingresado.
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3); //Obtiene una lista simplemente encadenada.
        list.add(3);
        assertEquals("El resultado no es el esperado por lo que el metodo no funciona", (int)list.getLast(), 3);

        list = listFactory.getList(4); //Obtiene una lista doblemente encadenada.
        list.add(200);
        assertEquals("El resultado no es el esperado por lo que el metodo no funciona", (int)list.getLast(), 200);
    }

    @org.junit.Test
    public void getLast() {
        //Post: Se crean dos listas, una simplemente encadenada y una doblemente encadenada.
        //      Se agregan múltiples elementos a la lista y se saca el último para saber si fue el último ingresado.
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3); //Obtiene una lista simplemente encadenada.
        list.add(3);
        list.add(5);
        list.add(20);
        assertEquals("El metodo no devuevle el ultimo elemento ingresado", (int)list.getLast(), 20);

        list = listFactory.getList(4); //Obtiene una lista doblemente encadenada.
        list.add(200);
        list.add(90);
        list.add(10);
        list.add(304);
        assertEquals("El metodo no devuevle el ultimo elemento ingresado", (int)list.getLast(), 304);
    }

    @org.junit.Test
    public void remove() {
        //Post: Se crean dos listas, una simplemente encadenada y una doblemente encadenada.
        //      Se ingresan múltiples elementos y se remueve el último. Se verifica que el tamaño de la lista
        //      se reduzca en 1 y que se haya eliminado el elemento correcto.
        List<Integer> list;
        ListFactory<Integer> listFactory = new ListFactory<Integer>();
        list = listFactory.getList(3); //Obtiene una lista simplemente encadenada.
        list.add(3);
        list.add(90);
        int tempSize = list.size();
        int result = list.remove();
        assertEquals("El metodo no elimina", list.size(), tempSize-1);
        assertEquals("El metodo no devuelve el elemento eliminado", 90, result);

        list = listFactory.getList(3); //Obtiene una lista doblemente encadenada.
        list.add(2);
        list.add(300);
        tempSize = list.size();
        result = list.remove();
        assertEquals("El metodo no elimina", list.size(), tempSize-1);
        assertEquals("El metodo no devuelve el elemento eliminado", 300, result);
    }
}