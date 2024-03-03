import java.util.Random;

//import javax.swing.JOptionPane;

public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name= JOptionPane.showInputDialog(" Enter your name");
		JOptionPane.showMessageDialog(null," Hello" + name);
		
		  int age= Integer.parseInt(JOptionPane.showInputDialog(" Enter your age"));
		JOptionPane.showMessageDialog(null,"Your age" + age);*/
		
		//generate Random values
			Random random= new Random();
			int x= random.nextInt(40);
			boolean z=random.nextBoolean();
         System.out.println(x);
         System.out.println(z);
	}

}
