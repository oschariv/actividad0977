/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The precio of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible acumulados.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MaquinaTicket
{
    // The precio of a ticket from this machine.
    private int precio;
    // The acumulado of money entered by a customer so far.
    private int balance;
    // The total acumulado of money collected by this machine.
    private int total;

    /**
     * primer contructor sin parametro
     */
    public MaquinaTicket()
    {
        precio = 800;
        balance = 0;
        total = 0;
    }
    
    /**
     * segundo contructor con parametro       
       */
    public MaquinaTicket(int coste)
    {
        precio = coste;
        balance = 0;
        total = 0;
    }

    /**
     * Return the precio of a ticket.
     */
    public int obtenerPrecio()
    {
        return precio;
    }

    /**
     * Return the acumulado of money already inserted for the
     * next ticket.
     */
    public int obtenerBalance()
    {
        return balance;
    }

    /**
     * Receive an acumulado of money from a customer.
     */
    public void insertarDinero(int acumulado)
    {
        balance = balance + acumulado;
    }
    
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void imprimirTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + precio + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }

    /**
     * devuelve el total de monedas introducidas hasta el momento en la maquina
       */
    public int obtenerTotal()
    {
       return total; 
    }
    
    /**
     * establece un nuevo precio para el billete
       */
    public void establecerPrecio(int coste)
    {
        precio= coste;
    }
    
    /**
     * muestra un error de que se introduzca el dinero correcto
       */
    public void sugerencia()
    {
        System.out.println("Por favor, introduzca la cantidad de dinero correcta.");
    }
    
    /**
     * muestra el precio del ticket en el momento de ejecutarlo
       */
    public void mostrarPrecio()
    {
        System.out.println("El precio de un ticket es de " + precio + " Euros");
    }
    
    /**
       Vaciador del total de monedas acumuladas en la maquina
       */
    public void vaciarMaquina()
    {
        total = 0;
    }
}
