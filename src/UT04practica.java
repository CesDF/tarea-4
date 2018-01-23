
public class UT04practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int valor = (Math.random * 6) + 1
		double dado1=(Math.random()*6)+1;
		double dado2=(Math.random()*6)+1;
				
		System.out.println("El primer jugador hace su tirada: " + (int)Math.floor(dado1) + " y " + (int)Math.floor(dado2));
		double tirada1=dado1+dado2;
				
		double dado3=(Math.random()*6)+1;
		double dado4=(Math.random()*6)+1;
				
		System.out.println("El segundo jugador hace su tirada: " + (int)Math.floor(dado3) + " y " + (int)Math.floor(dado4));
		double tirada2=dado3+dado4;
				
		System.out.println("La tirada mayor es " + (int)Math.floor(Math.max(tirada1, tirada2)));
		
		if(tirada1>tirada2) {
			System.out.println("El ganador es el primer jugador");
		}
		System.out.println("El ganador es el segundo jugador");
		System.out.println("La media de los 4 dados es " + Math.round(dado1+dado2+dado3+dado4)/4);
	}

}

