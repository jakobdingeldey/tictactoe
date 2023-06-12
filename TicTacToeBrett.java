public class TicTacToeBrett {
  public final String[] tabelle = new String[9];
  
  public void setFigur(int x, int y, String wert) {
    if (x < 0 || x > 2 || y < 0 || y > 2) {
      return;
    }
    tabelle[x * 3 + y] = wert;
  }
  
  public String getFigur(int x, int y) {
    if (x < 0 || x > 2 || y < 0 || y > 2) {
      return null;
    }
    return tabelle[x * 3 + y];
  }
}
