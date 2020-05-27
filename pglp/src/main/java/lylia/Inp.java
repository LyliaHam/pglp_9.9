import java.util.Scanner;

public class Inp implements InputInterface {
  
  
  public String readValue() {
    Scanner sc = new Scanner(System.in, "UTF-8");
    String s = sc.nextLine();
    return s.replace("\n", "").replace("\r", "");
  }

}