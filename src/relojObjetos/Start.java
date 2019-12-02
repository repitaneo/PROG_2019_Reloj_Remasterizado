package relojObjetos;

public class Start {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * CREO DIFERENTES EJEMPLOS DE RELIJES Y OPERACIONES PARA PROBAR
		 * LO QUE HEMOS PROGRAMADO EN LA CLASE RELOJ
		 * 
		 * 
		 */
		
		
		
		Reloj reloj1 = new Reloj();
		reloj1.setHoraReal(1, 0, 23);
		System.out.print("El reloj1 tiene las ");
		System.out.println(	reloj1.getHoras()+":"
							+reloj1.getMinutos()+":"
							+reloj1.getSegundos());	
		
		
		Reloj reloj2 = new Reloj();
		reloj2.setHoras(23);
		reloj2.setMinutos(12);
		reloj2.setSegundos(12);
		Reloj unSegundoDespues = reloj2.addSegundo2Reloj();
		reloj2.addSegundo();
		
		
		System.out.print("El reloj2 tiene las ");
		System.out.println(	reloj2.getHoras()+":"
							+reloj2.getMinutos()+":"
							+reloj2.getSegundos());	
		
		System.out.print("El unSegundoDespues tiene las ");
		System.out.println(	unSegundoDespues.getHoras()+":"
							+unSegundoDespues.getMinutos()+":"
							+unSegundoDespues.getSegundos());	
		
		
	}
}
