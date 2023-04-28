import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    //1. Array unidimensional de Strings
    public static void arrayUni(){
        String[] textos = new String[3];
        textos[0]= "primer String";
        textos[1] = "Segundo String";
        textos[2] = "tercer String";
        for (String texto : textos) {
            System.out.println(texto);
        }
    }
    //2.Array bidimensional
    public static void arrayBidi(){
        int[][]  matrizNumerica = {
                {10,12,14},
                {20,20,34}
        };
      for(int i = 0; i < matrizNumerica.length; i++){
          for (int j = 0; j < matrizNumerica[i].length; j++){
              System.out.println(matrizNumerica[i][j]);
          }
      }
    }

    //3-4. Vector
    public static void vector(){
        Vector<Integer> vec = new Vector<Integer>(5);
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);


        vec.remove(2);
        vec.remove(1);
        System.out.println(vec);
    }

    //5. LinkedList
    public static void linkedList(){
        String[] lista = new String[4];
        lista[0]= "primer String";
        lista[1] = "Segundo String";
        lista[2] = "tercer String";
        lista[3] = "Cuarto texto";
        LinkedList<String> cLista = new LinkedList<String>();

        for(String item: lista){
            cLista.add(item);
        }
        System.out.println(cLista);
    }

    //6. Array int + bucle

    public static void rellenarArray(){
        Integer[] numeros = new Integer[11];
        for(int i = 1; i < numeros.length; i++){
            numeros[i] = i;
            if(numeros[i] % 2 != 0){
                System.out.println(numeros[i]);
            }
        }
    }

    public static int DividePorCero (int a, int b)throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = a/b;
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }

        return resultado;
    }

    public static void inpPrint(InputStream fileIn, PrintStream fileOut){
        
    }

    public static void main(String[] args){
        //arrayUni();
        //arrayBidi();
        //vector();
        //linkedList();
        //rellenarArray();
        //DividePorCero(2,0);

    }



    public static String reverse(String texto){
        return texto;
    }
}
