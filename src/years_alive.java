import javax.swing.JOptionPane;

public class years_alive {
	public static void main(String[] args) {
		String born = JOptionPane.showInputDialog("what year where you born");
		int born2 = Integer.parseInt(born);
		System.out.println(born);
		for (int years = 2018 - born2; years > 0; years--) {
			System.out.println(born2 += 1);
			
		}

	}
}
