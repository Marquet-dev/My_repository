package Proyecto2;

public class Libro extends Escrito implements Prestable {
	private boolean prestado = false;
	
	public Libro(int codigo, String titulo, int anno) {
		super(codigo, titulo, anno);
	}
	public String toString() {
		return super.toString();
	}
	@Override
	public boolean prestar() {
	
		if(prestado == false) {
			prestado = true;
		}
		else {
			prestado = false;
		}
		return prestado;
	}
	@Override
	public boolean prestado() {
		
		if(prestar() == false) {
			prestado = true;
		}
		else {
			prestado = false;
		}
		return prestado;
	}
	@Override
	public boolean devolver() {
		return prestado;
	}
}
