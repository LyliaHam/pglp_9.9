public class Triange extends Forme {

  private Point a;
  private Point b;
  private Point c;
  
  public Triange (Point a, Point b, Point c) {
      super("Triangle");
      this.a = new Point(a.x, a.y);
      this.b = new Point(b.x, b.y);
      this.c = new Point(c.x, c.y);
      
  }

  @Override
  public void affiche() {
      String message = this.name + " = Triangle (a:(" + a.y+ ","+a.y +")"
                                      + "(b:(" + b.x +","+b.y+")"
                                      + "(c:(" + c.x +","+c.y+")";
      Affichage A = new Affichage();
      A.Afficher(message);
  }
  @Override
  public void move(int x, int y) {
      this.a.move(x + this.a.x, y + this.a.y);
      this.b.move(x + this.b.x, y + this.b.y);
      this.c.move(x + this.c.x, y + this.c.y);
      

  }
  
  public Point getA() {
      return this.a;
  }
  
  public Point getB() {
      return this.b;
  }
  
  public Point getC() {
      return this.c;
  }

}