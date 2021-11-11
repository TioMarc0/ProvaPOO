import java.util.Scanner;
public class PiramideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ent = new Scanner(System.in);
		
			Piramide piramide =  new Piramide();
			System.out.print("insira o tipo");
			piramide.setA1(ent.nextFloat());
			System.out.println(piramide);
	}
			
			
			
}		
