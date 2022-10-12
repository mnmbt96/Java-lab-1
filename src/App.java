

import Birds.Eagle;
import Fish.Eel;
import Reptile.Crocodile;

public class App {
  public static void main(String[] args) throws Exception {
    Crocodile Crocodile = new Crocodile(200,100,"Reptile", "A", true, true, "Hard-shelled eggs");
    Eel Eel = new Eel(1,1,"Fish", "A",true, true, false);
    Eagle Eagle = new Eagle(2,5,"Bird", "A",true,true,true);
    
    
System.out.println("=== Crocodile ===");
Crocodile.showInfo();

System.out.println("=== Eel ===");
Eel.showInfo();

System.out.println("=== Eagle ===");
Eagle.showInfo();

  }
  
}
