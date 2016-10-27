
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TrainStation
{
    private MaquinaTicket maquina1;
    private MaquinaTicket maquina2;
    private int dineroTotal;

  public TrainStation()
  {
       maquina1 = new MaquinaTicket(300);
       maquina2 = new MaquinaTicket(200);
       dineroTotal = 0;
  }
  
  public void imprimirDineroTotal()
  {
       dineroTotal = maquina1.obtenerTotal();
       dineroTotal = dineroTotal + maquina2.obtenerTotal();
       System.out.println(dineroTotal);
  }
    
  public void ventaBillete()
  {
       maquina1.insertarDinero(300);
       maquina1.imprimirTicket();
       maquina2.insertarDinero(200);
       maquina2.imprimirTicket();
  }
  
}


