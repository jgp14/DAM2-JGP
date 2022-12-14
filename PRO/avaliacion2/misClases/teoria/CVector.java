package misClases.teoria;

import java.util.Arrays;

public class CVector {
	
	private double[] vector; //matriz vector
	private int nElementos; //numero de elementos de la matriz
	
	public CVector() {	// numero de elementos por omision: 10
		nElementos = 10;
		vector = new double[nElementos];
	}
	
	public CVector(int ne) {
		if(ne < 1) {
			System.out.println("N de elementos no v�lido: " + ne);
			System.out.println("Se asignan 10 elementos");
			ne = 10;
		}
		nElementos = ne;
		vector = new double[nElementos];
	}
	
	public CVector(double[] m) {// crea un CVector desde una matriz
		nElementos = m.length;
		vector = new double[nElementos];
		//Copiar los elementos de la matriz m
		for(int i = 0; i < nElementos; i++)
			vector[i] = m[i];
	}
	
	public CVector(CVector v) {// constructor copia
		nElementos = v.nElementos;
		vector = v.vector;
		// Copiar el objeto v
		for (int i = 0; i < nElementos; i++)
			vector[i] = v.vector[i];
	}
	
	public CVector copiar(CVector v) {
		nElementos = v.nElementos;
		vector = new double[nElementos];
		// Copiar el objeto v
		for (int i = 0; i < nElementos; i++)
			vector[i] = v.vector[i];
		return this;
	}
	
	public void ponerValorEn(int i, double valor) {
		if(i >= 0 && i < nElementos)
			vector[i] = valor;
		else
			System.out.println("Indice fuera de limites");
	}
	
	public double valorEn(int i) {
		if(i >= 0 && i < nElementos)
			return vector[i];
		else {
			System.out.println("Indice fuera de limites");
			return Double.NaN;
		}
	}
	
	public int longitud() {
		return nElementos;
	}
	
	public boolean equals(CVector v) {
		return Arrays.equals(vector, v.vector);
	}
}

