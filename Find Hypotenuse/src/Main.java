import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side a"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter length of side b"));
		double c = Math.sqrt(a*a+b*b);
		JOptionPane.showMessageDialog(null, "Side c is "+c);

	}

}
