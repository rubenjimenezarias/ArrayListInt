
/**
 * Write a description of class ArraylistInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArraylistInt
{
    //lista array
    private int[] lista;

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
        int[] nuevalista = new int[lista.length + 1];
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
        if (index >= 0 && index <= lista.length)
        {
            int[] nuevalista = new int[lista.length + 1];
            boolean introducido = false;
            int cont = 0;
            while (cont < nuevalista.length)
            {
                if (cont == index)
                {
                    introducido = true;
                    nuevalista[cont]= elemento;
                }
                else
                {
                    if (introducido == true)// añade a la posicion menos una
                    {
                        nuevalista[cont] = lista[cont - 1];
                    }
                    else // añade normal
                    {
                        nuevalista[cont] = lista[cont];
                    }
                }
                cont++;
            }
            lista = nuevalista;
        }
    }
    /**
     * Vaciar la lista
     */
    public void clear()
    {
        lista = new int[0];
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
    /**
     * devuelve el valor de la posicion indicada.
     * Si no es una posicion correcta devuelve -1.
     */
    public int get(int index)
    {
        int cont = 0;
        boolean encontrado = false;
        int elemento = -1;
        while (cont < lista.length && encontrado == false)
        {
            if (index == cont)
            {
                elemento = lista[cont];
                encontrado = true;
            }
            cont ++;
        }
        return elemento;
    }
    /**
     * devuelve el indice del elemento indicado
     * Si el valor no esta en la lista devuelve -1.
     */
    public int indexOff(int elemento)
    {
        int cont = 0;
        boolean encontrado = false;
        int index = -1;
        while (cont < lista.length && encontrado == false)
        {
            if (elemento == lista[cont])
            {
                index = cont;
                encontrado = true;
            }
            cont ++;
        }
        return index;
    }
    /**
     * devuelve true o false dependiendo si la lista esta llena o vacia
     */
    public boolean isEmpty()
    {
        boolean vacia = false;
        if (lista.length == 0)
        {
            vacia = true;
        }
        return vacia;
    }
    /**
     * Introducir un elemento int a la array en la posicion que quieras
     */
    public void remove(int index)
    {
        if (index >= 0 && index < lista.length)
        {
            int[] nuevalista = new int[lista.length - 1];
            boolean borrado = false;
            int cont = 0;
            while (cont < lista.length)
            {
                if (cont == index)
                {
                    borrado = true;
                }
                else
                {
                    if (borrado == true)// añade a la posicion menos una
                    {
                        nuevalista[cont-1] = lista[cont];
                    }
                    else // añade normal
                    {
                        nuevalista[cont] = lista[cont];
                    }
                }
                cont++;
            }
            lista = nuevalista;
        }
    }
    /**
     * Introducir un elemento int a la array en la posicion que quieras
     */
    public int size()
    {
        int size = lista.length;
        return size;
    }
     /**
     * Reemplaza el indice que indiques por el elemento indicado
     */
    public void set(int index, int elemento)
    {
        if (index >= 0 && index < lista.length)
        {
            lista[index] = elemento;
        }
    }
}
