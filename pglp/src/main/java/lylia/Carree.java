
public class Carree extends Forme {
  
  public Point point;
  public int cote;
  
  public Carree (int cote, Point p) {
      super("carree");
      point = new Point(p.x, p.y);
      this.cote = cote; 
  }

  @Override
  public void affiche() {
      String message = this.name+" = Carre(cote:"+cote+", centre("
               +point.x+","+point.y+"))";
      
      Affichage A = new Affichage();
      A.Afficher(message);
  }

  @Override
  public void move(int a, int b) {
      this.point.move(a,b);

  }


}