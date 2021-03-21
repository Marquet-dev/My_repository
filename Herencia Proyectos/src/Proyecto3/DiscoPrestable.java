package Proyecto3;
import Proyecto1.Disco;
import Proyecto2.Prestable;
public class DiscoPrestable extends Disco implements Prestable{
	private boolean prestado = false;
	
	public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero) {
		super(titulo, autor, formato, duracion, genero);
	}

	@Override
	public boolean prestar() {
		if(prestado == false ) {
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
