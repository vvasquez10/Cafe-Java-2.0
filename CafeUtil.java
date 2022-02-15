import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil{

    public int getStreakGoal(int numWeeks){
        /* Café Java quiere implementar un sistema de recompensas para los clientes que siempre compran más bebidas que la semana anterior. 
        Para calcular cuántos cafés necesitan después de 10 semanas, escribe un método que sume todos los números enteros consecutivos 
        del 1 al 10 y devuelva la suma. En otras palabras, suma 1 + 2 + 3... y así sucesivamente hasta 10, y devuelve el resultado.
        Bonus Ninja: agrega un parámetro, numWeeks para que un administrador pueda cambiar el número de 10 a lo que quiera.*/

        int suma=0;

        for(int i=1; i<=numWeeks; i++){
            suma = suma + i;
        }

        return suma;
    }

    
    public double getOrderTotal(double[] prices){
        /* Dado un arreglo de precios de artículos de un pedido, suma todos los precios del arreglo y devuelve el total. 
        ¡No olvides probar tu código! Busca las líneas de código de prueba para este método en TestCafe.java y quita los comentarios 
        antes de compilar y ejecutar. */
        double suma=0;

        for(double price : prices){
            suma = suma + price;
        }

        return suma;
    }

    public void displayMenu(ArrayList<String> menuItems){
        /*Dado un ArrayList de elementos de menú (cadenas), imprime cada índice y elemento del menú.*/

        for(int i=0; i<menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Por favor, escriba su nombre: ");
        String userName = System.console().readLine();
        System.out.println("¡Hola, "+ userName +"!");

        System.out.println("Hay "+ customers.size() +" personas frente a ti.");

        customers.add(userName);

        for(int i=0; i<customers.size(); i++){
            System.out.println(customers.get(i));
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product); 

        DecimalFormat decim = new DecimalFormat("#.0"); 

        for(int i=1; i<=maxQuantity; i++){           
            if (i>1){
                System.out.println(i+ " - $"+ Double.parseDouble(decim.format(((price*i)-(400.0*(i-1.0))))) );
            } 
            else{
                System.out.println(i+ " - $"+ Double.parseDouble(decim.format((price*i))));
            }
        }  
    }
    
}