import java.util.*;

public class CLIMain {
  
  public static final TicTacToeBrett BRETT = new TicTacToeBrett();
  
  public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);
    boolean weiter = true;
    System.out.println("Erlaubte Aktionen:");
    System.out.println(" - Figur setzen: \"set (x) (y) ('x'/'y')\"; e.g.: \"set 1 1 x\"");  
    System.out.println(" - Figur erhalten: \"get (x) (y) ('x'/'y')\"; e.g.: \"get 1 1\""); 
    System.out.println(" - Abbrechen: \"stop\""); 
    while (weiter) {
      System.out.println("  Welche Aktion soll ausgeführt werden?");
      String line = scanner.nextLine();
      if (line.startsWith("set ")) {
        SetBefehl.ausfuehren(line.split(" "));
      } else if (line.equals("stop")) {
        weiter = false;
      } else if (line.startsWith("get ")) {
        GetBefehl.ausfuehren(line.split(" "));
      }
    }
  }
}
