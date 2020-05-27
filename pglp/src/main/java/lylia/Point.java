public class Point {
  
  public int x;
  public int y;
  
  public Point(int x, int y) {
	  x = x;
      y = y;
  }
  
  public void move (int a, int b) {
      this.x = x+a;
      this.y = y+b;
      
      System.out.println(a+" "+b);

}
}