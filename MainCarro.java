package aula_05_11;

public class MainCarro {

	public static void main(String[] args) {
		Motor motor = new Motor("Fiasa");
		Carro carro = new Carro("Palio",motor);
		
		System.out.println("Carro: " + carro.getModelo() + 
							"\nMotor: " + motor.getTipo());
		

	}

}
