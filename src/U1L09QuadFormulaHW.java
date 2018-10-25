import javax.swing.JOptionPane;

//Genna Barge- Quadratic Formula Homework
public class U1L09QuadFormulaHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("Enter an 'a' value");
		String b = JOptionPane.showInputDialog("Enter a 'b' value");
		String c = JOptionPane.showInputDialog("Enter a 'c' value");
		
		double aVal = Double.parseDouble(a);
		double bVal = Double.parseDouble(b);
		double cVal = Double.parseDouble(c);
		
		double answer1 = positiveRoot(aVal, bVal, cVal);
		System.out.println(answer1);
		
		double answer2 = negativeRoot(aVal, bVal, cVal);
		System.out.println(answer2);
		
		
		
		

	}
	public static double positiveRoot(double aVal, double bVal, double cVal) {
		double bSq = (bVal * bVal);
		double underSqrt = Math.sqrt(bSq - 4 * aVal * cVal);
		double topFunction = ((bVal * -1) + underSqrt);
		double wholeFunction = topFunction/(2 * aVal);
		return wholeFunction;

		
	}
	public static double negativeRoot(double aVal, double bVal, double cVal) {
		double bSq = (bVal * bVal);
		double underSqrt = Math.sqrt(bSq - 4 * aVal * cVal);
		double topFunction = ((bVal * -1) - underSqrt);
		double wholeFunction = topFunction/(2 * aVal);
		return wholeFunction;
		
		
	}
}
		


