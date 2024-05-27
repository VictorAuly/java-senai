import javax.swing.JOptionPane;
public class Desafio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double primeiroLado;
		Double segundoLado;
		Double terceiroLado;
		
		JOptionPane.showMessageDialog(null,"Este é um programa onde você da as medidas e nós retornamos"+"\n"+
				" se é possivel fazer um triangulo e qual tipo de tringulo vai ser.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		primeiroLado = solicitarPrimeiroLado();
		segundoLado = solicitarSegundoLado();
		terceiroLado = solicitarTerceiroLado();
		verificarLados(primeiroLado,segundoLado,terceiroLado);
	}
	public static Double solicitarPrimeiroLado() {
		
		Double primeiroLado;
		
		primeiroLado = Double.parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do primeiro lado do triangulo? "));
		
		return primeiroLado;
	}
	public static Double solicitarSegundoLado() {
		
		Double segundoLado;
		
		segundoLado = Double.parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do segundo lado do triangulo? "));
		
		return segundoLado;
	}
	public static Double solicitarTerceiroLado() {
	
		Double terceiroLado;
		
		terceiroLado = Double.parseDouble(JOptionPane.showInputDialog("Qual é o comprimento do terceiro lado do triangulo? "));
	
	return terceiroLado;
	}
	public static void verificarLados(Double primeiroLado, Double segundoLado, Double terceiroLado) {

		if(((primeiroLado + segundoLado)> terceiroLado) && ((primeiroLado + terceiroLado)> segundoLado) && ((terceiroLado + segundoLado)> primeiroLado)) {
			
			if((primeiroLado.equals(terceiroLado) && segundoLado.equals(terceiroLado))){
				JOptionPane.showMessageDialog(null,"Essas retas formam um triangulo equilátero",
						"If Else",JOptionPane.INFORMATION_MESSAGE);
			}
			else if (primeiroLado.equals(terceiroLado) ||  segundoLado.equals(terceiroLado) ||  terceiroLado.equals(terceiroLado)){
				JOptionPane.showMessageDialog(null,"Essas retas formam um triangulo isósceles",
						"If Else",JOptionPane.INFORMATION_MESSAGE);
			}
			else if (primeiroLado != segundoLado &&  terceiroLado != primeiroLado &&  terceiroLado != segundoLado){
				JOptionPane.showMessageDialog(null,"Essas retas formam um triangulo escaleno",
						"If Else",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"Essas retas não formam um triangulo!!!",
					"If Else",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
