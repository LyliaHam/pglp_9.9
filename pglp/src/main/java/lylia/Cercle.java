public class Cercle extends Forme {
  
  public int rayon;
  public Point centre;
  
  public Cercle ( int rayon, Point p) {
	 super ("Cercle");
	  rayon = rayon; 
      centre = new Point(p.x, p.y);
  }

  @Override
  public void affiche() {
      String message =  this.name+" = Cercle (Rayon=" + rayon +", centre=("
               + centre.x+ ","+centre.y+"))";
      Affichage A = new Affichage();
      A.Afficher(message);
  }

  @Override
  public void move(int a, int b) {
      centre.move(a,b);

  }

}
