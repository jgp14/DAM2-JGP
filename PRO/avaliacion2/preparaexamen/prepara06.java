package preparaexamen;

import java.io.IOException;

import misClases.avaliacion2.CCadena;

public class prepara06 {

	public static void main(String[] args) throws IOException {
		CCadena cadena = new CCadena();
		System.out.print("Dame cadena: ");
		cadena.recolleCadena();
		cadena.eliminaNumerosEnCadena();
		cadena.amosaCadena();
	}
}
