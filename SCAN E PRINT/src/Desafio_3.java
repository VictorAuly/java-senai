import javax.swing.JOptionPane;
public class Desafio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double temperatura;
		
		JOptionPane.showMessageDialog(null,"Este é um programa que converte graus Celsius para Fahrenheit e Kelvin.",
				"If Else",JOptionPane.INFORMATION_MESSAGE);
		
		temperatura = solicitarTemperatura();
		converteFahrenheit(temperatura);
	}
	public static Double solicitarTemperatura() {
		
		Double temperatura;
		
		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua temperatura(Graus Celcius) que vamos converter: "));
		
		return temperatura;
	}
	public static void converteFahrenheit(Double temperatura) {
		Double temperaturaFahrenheit;
		Double temperaturaKelvin;
		
		temperaturaKelvin = temperatura + 273;
		temperaturaFahrenheit = temperatura * 1.8 + 32;
		JOptionPane.showMessageDialog(null,"Temperatura em Fahrenheit: "+temperaturaFahrenheit+"\n"+"Temperatura em Kelvin: "+temperaturaKelvin,
				"If Else",JOptionPane.INFORMATION_MESSAGE);
	}
}
