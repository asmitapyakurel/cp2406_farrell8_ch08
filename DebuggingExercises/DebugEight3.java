
// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import javax.swing.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'};
      int[] pricesInThousands = {145, 190, 235};
      char plan = ' ';
      int x, fp = 99;
      char Option;
      String prompt = "Please select a floor plan\n" +
          "Our floorPlanss are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floorPlans letter";
      entry = JOptionPane.showInputDialog(null, prompt.toLowerCase());
      Option=entry.charAt(0);
      for(x = 0; x < floorPlans.length; x++) {
         if (Option == floorPlans[x]) {
            fp = x;
            JOptionPane.showMessageDialog(null,
                    "Valid floor plan code entered");
         }


      }

       JOptionPane.showMessageDialog(null,
           "Invalid floor plan code entered");
   }
}

