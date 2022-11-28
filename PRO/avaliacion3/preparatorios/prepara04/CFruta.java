package preparatorios.prepara04;

import java.io.Serializable;

public class CFruta implements Serializable  {
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String nombre;
	private int cantidad;
	private float precio;

	public CFruta(String cod, String nom, int can, float pre) {
		codigo = cod;
		nombre = nom;
		cantidad = can;
		precio = pre;
	}

	public void setCodigo(String cod) {
		codigo = cod;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCantidad(int can) {
		cantidad = can;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setPrecio(float pre) {
		precio = pre;
	}

	public float getPrecio() {
		return precio;
	}

	public void mostrar() {
		System.out.println(codigo + "\t\t" + nombre 
				+ "\t" + cantidad + "\t\t" + precio);
	}
}