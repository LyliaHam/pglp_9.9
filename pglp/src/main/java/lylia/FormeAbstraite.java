public abstract class FormeAbstraite extends Forme {
	  

	public String groupeId;
	  public String type;
	  
	  public void Forme(String n, String g, String t) {
		super(n);
	    groupeId = g;  
	    type = t;
	  }
	  
	  public abstract void affiche();
	  

	  public abstract void move(int x, int y);

	    
	  public void setGroupeId(String g) {
	      groupeId = g;
	      
	  }

	  public void setType (String t) {
		  type = t;
	  }
	}