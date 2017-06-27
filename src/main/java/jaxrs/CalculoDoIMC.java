
public class CalculaModel {
	private double altura;
	private double peso;

	public CalculaModel(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public double calculo() {
		return (peso/(altura*altura));
	}

	public String resultado() {
		if(calculo()<18.5){
			return "Voc� est� magro com esse indice: " +calculo();
		}
		else if(calculo()>=18.5 && calculo()<24.9){
			return "Voc� est� normal com esse indice: " +calculo();
		}
		else if(calculo()>=24.9 && calculo()<29.9) {
			return "Voc� est� com sobre peso com esse indice: " +calculo();
		}
		else if(calculo()>=29.9 && calculo()<39.9) {
			return "Voc� est� com obesidade com esse indice: " +calculo();
		}
		else if (calculo()>39.9) {
			return "Voc� est� com obesidade grave com esse indice: " +calculo();
		}
		return null;
	}

}