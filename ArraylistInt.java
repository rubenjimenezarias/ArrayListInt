
/**
 * Write a description of class ArraylistInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArraylistInt
{
    // instance variables - replace the example below with your own
    private int[] lista;
    private int[] nuevalista;

    /**
     * Constructor for objects of class ArraylistInt
     */
    public ArraylistInt()
    {
        // initialise instance variables
        lista = new int[0];
    }

    /**
     * Introducir un elemento int a la array
     */
    public void add(int elemento)
    {
        nuevalista = new int[lista.length + 1];
        for (int cont = 0;cont < lista.length; cont++)
        {
            nuevalista[cont] = lista[cont];
        }
        nuevalista[lista.length] = elemento;
        lista = nuevalista;
    }
    /**
     * Introducir un elemento int a la array en la posicion que quieras
     */
    public void add(int index, int elemento)
    {
        int cont = 0;
        boolean modificado = false;
        while (cont < lista.length && modificado == false)
        {
            if (index == cont)
            {
                lista[cont] = elemento;
                modificado = true;
            }
            cont ++;
        }
        nuevalista = lista;
    }
    /**
     * Vaciar la lista
     */
    public void clear()
    {
        lista = new int[0];
        nuevalista = new int [0];
    }
    /**
     * devuelve true o false dependiendo si contiene el elemento pasado por parametro
     */
    public boolean contains(int elemento)
    {
        int cont = 0;
        boolean encontrado = false;
        while (cont < lista.length && encontrado == false)
        {
            if (elemento == lista[cont])
            {
                encontrado = true;
            }
            cont ++;
        }
        return encontrado;
    }
}
