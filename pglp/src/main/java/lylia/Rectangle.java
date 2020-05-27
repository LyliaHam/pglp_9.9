public class Rectangle extends Forme {
	int x,y;
    int h,z;
    
    public Rectangle(int x,int y,int h,int z) {
    	super ("Rectangle");
    	x = x;
    	y = y;
    	z = z;
    	h = h;
    	
    }
    public String getRectangle() {
    	if(h>z) {
    		return "Longueur "+h+", Largeur "+z;
    	}else {
    		return "Longueur ="+z+", Largeur ="+h;
    	}
    	 
    }
    
    public String getCentre() {
   	 return "("+x+","+y+")";
    }
	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
    