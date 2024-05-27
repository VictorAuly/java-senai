import javax.swing.JOptionPane;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valores[][]= new int [2][2];
		int contador =0;
		String menorZero="";
		String maiorZero = "";
		
		JOptionPane.showMessageDialog(null, "Informe 4(quatro) valores e saiba  quais são maiores ou menores que zero!",
				"Matriz> Matrix", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				contador++;
				valores [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+contador+"° valor: "));
				
				if (valores[i][j]<= 0) {
					if(menorZero == "") {
						menorZero = "Valor(es) menores ou igaul a zero: ";
					} else {
						menorZero += ", ";
					}
					
					menorZero+= valores[i][j];
					
				}else {
					if(maiorZero == "") {
						maiorZero = "Valor(es) maior que zero: ";
					} else {
						maiorZero += ", ";
					}
					
					maiorZero+= valores[i][j];
				}
			}
		}
		JOptionPane.showMessageDialog(null, menorZero+"\n"+maiorZero,
				"Matriz> Matrix",JOptionPane.INFORMATION_MESSAGE);
	}

}
