package ud2_boletin3;

public class HiloEjer4Run implements Runnable{
	
	private int comienzo, fin;
	private String nombre;
	static int contador = 0;
	
	public HiloEjer4Run(int comienzo, int fin, String nombre) {
		this.comienzo = comienzo;
		this.fin = fin;
		this.nombre = nombre;
	}

	public void run() {
		System.out.println(nombre+" empieza...");
		for(int i = comienzo; i <= fin; i++)
			System.out.println(nombre+" dice: "+i);
		System.out.println(nombre+" acaba.");
	}
	
}
