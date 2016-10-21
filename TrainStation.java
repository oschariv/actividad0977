
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TrainStation
{
    private MaquinaTicket machine1;
    private MaquinaTicket machine2;
    private int dineroTotal;

  public TrainStation()
  {
        machine1 = new MaquinaTicket(300);
        machine2 = new MaquinaTicket(200);
        dineroTotal = 0;
  }
  
  public void printdineroTotal()
    {
        dineroTotal = machine1.getTotal();
        dineroTotal = dineroTotal + machine2.getTotal();
    System.out.println(dineroTotal);
    }
}


