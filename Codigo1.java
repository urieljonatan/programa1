/*
 * Relizar un programa que realize la serie dada
 * 
 * @27/5/20
 */
package codigo1;
import javax.swing.JOptionPane;

/**
 *
 * @author Uriel Solano
 */
public class Codigo1 {

    /**Metodo principal que ejecuta el programa
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Inicio del main
        // TODO code application logic here
        int n=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));//Solicitando un numero
        String r=cadenaNumeros(n);//Asignar a r el valor retornado del metodo
        System.out.print(r);//Imprimir el valor de r
    }//Cierre del main
    public static String cadenaNumeros(int n) {//Inicio del metodo
        String cadena="";//Asignando el valor de cadena
        String cadenas="";//Asignando el valor de cadenas
        if(n>0){//Inicio del if
            System.out.print(n+" ");//Impresion del n mas un espacio
            while(n>1){//Inicio del while
            if(n%2==0){//Verifica si el valor de n es par
                n=n/2;//Asigna el nuevo valor de n diviendolo entre de dos        
            }else{//Inicio del else
                n=(n*3)+1;//Asigna el nuevo valor de n multiplicandolo por 3 y sumandole 1          
              }
            cadenas=Integer.toString(n);//Convierte el valor de n a entero
            cadena=cadena+cadenas;//Asigna a cadena el valor de cadena+cadenas
            cadena=cadena+" ";//Asigna a cadena el valor de cadena mas un espacio
            }     
        }else{
            System.out.println(n);//Imprimir el valor de n 
        }
        return cadena;//retorna el valor de cadena
    }
    
}
