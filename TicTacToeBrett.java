public class TicTacToeBrett {
  public final String[] tabelle = new String[9];
  
  public void setFigur(int x, int y, String wert) {
    if (x < 1 || x > 3 || y < 1 || y > 3) {
      return;
    }
    tabelle[(x-1) * 3 + (y-1)] = wert;
  }
  
  public String getFigur(int x, int y) {
    if (x < 1 || x > 3 || y < 1 || y > 3) {
      return null;
    }
    return tabelle[(x-1) * 3 + (y-1)];
  }
}
