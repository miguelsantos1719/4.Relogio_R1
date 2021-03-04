
public class Principal {

	public static void main(String[] args) {
		
		int horas=10, minutos=59, segundos=36;
		
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);
		
		horas = avancarHoras(horas);
		
		System.out.println("Avançar Horas ");
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);
		
		int[] minHor = avancarMinutos(minutos, horas);
		horas = minHor[1];
		minutos = minHor[0];
		
		System.out.println("Avançar Minutos ");
		System.out.printf("%d:%2d:%d %n", horas, minutos, segundos);
		
		
		int[] segMinHor = avancarSegundos(segundos, minutos, horas);
		horas = segMinHor[2];
		minutos = segMinHor[1];
		segundos = segMinHor[0];
		
		System.out.println("Avançar Segundos ");
		System.out.printf("%d:%2d:%d %n", horas, minutos, segundos);
		
	}
	
	
	
	public static int avancarHoras( int horas ) {
		
		if( horas == 23 )
			horas = 0;
		else
			horas = horas + 1;
		
		return horas;
	}
	
	public static int recuarHoras( int horas ) {
		
		if( horas == 0 )
			horas = 23;
		else
			horas = horas - 1;
		
		return horas;
	}
	
	public static int[] avancarMinutos( int minutos, int horas ) {
		
		if( minutos == 59 ) {
			minutos = 0;
			horas = avancarHoras(horas);
		}
		else
			minutos = minutos + 1;
		
		int[] minutosHoras = { minutos, horas };
		
		return minutosHoras;
	}
	
	public static int[] recuarMinutos( int minutos, int horas ) {
		
		if( minutos == 0 ) {
			minutos = 59;
			horas = recuarHoras(horas);
		}
		else
			minutos = minutos - 1;
		
		int[] minutosHoras = { minutos, horas };
		
		return minutosHoras;
		
	}
	
	public static int[] avancarSegundos( int segundos, int minutos, int horas ) {
		
		if( segundos == 59 ) {
			segundos = 0;
			int[] minutosHoras = avancarMinutos(minutos, horas);
			minutos = minutosHoras[0];
			horas = minutosHoras[1];
		}
		else
			segundos = segundos + 1;
		
		int[] segundosMinutosHoras = { segundos, minutos, horas };
		
		return segundosMinutosHoras;
		
	}
	
	public static int[] recuarSegundos( int segundos, int minutos, int horas ) {
		
		if( segundos == 0 ) {
			segundos = 59;
			int[] minutosHoras = recuarMinutos(minutos, horas);
			minutos = minutosHoras[0];
			horas = minutosHoras[1];
		}
		else
			segundos = segundos - 1;
		
		int[] segundosMinutosHoras = { segundos, minutos, horas };
		
		return segundosMinutosHoras;
	}
	
	
}
