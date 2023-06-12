public class GetBefehl {
  public static void ausfuehren(String[] args) {
    if (args.length != 3) {
      System.err.println("Es werden zwei Argumente erwartet: (x) (y); Beispiel: 'get 1 2'");
      return;
    }
    System.out.println("Am Feld (" + args[1] + "," + args[2] + ") ist: " + CLIMain.BRETT.getFigur(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
  }
}
