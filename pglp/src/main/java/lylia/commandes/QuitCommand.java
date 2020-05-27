public class QuitCommand implements Command {

	public void Quit() {
	    Runtime.getRuntime().exit(0);	
	  }
}
