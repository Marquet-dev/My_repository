package Proyecto1;
import java.util.ArrayList;
public class ListaMultimedia {
	ArrayList<Multimedia>lista;
	
	public ListaMultimedia() {
		this.lista = new ArrayList();
	}
	public boolean annadir(Multimedia m) {
		return lista.add(m);
	}
	public int tamanno() {
		return lista.size();
	}
	public double duracionTotal() {
		double duracion_total_objetos = 0;
		for(int i=0; i<lista.size(); i++) {
			duracion_total_objetos += lista.get(i).dameDuracion(); 
		}
		return duracion_total_objetos;
	}
	public int cuentaGenero(String g) {
		  int cuentaGenero = 0;
		
		  for(int i=0; i<lista.size(); i++) {
			  if (lista.get(i) instanceof Disco) {
				  Disco d = (Disco)lista.get(i);
				  if(d.dameGenero().contains(g))
				  cuentaGenero++;
			  }
		  }
		return cuentaGenero;
	  }
	public int cuentaNoActrizPrincipal() {
		int cuenta_no_actriz = 0;
		
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i) instanceof Pelicula ) {
				Pelicula p = (Pelicula) lista.get(i);
				if(p.dameActriz()== null) {
					cuenta_no_actriz++;
				}
			}
		}
		return cuenta_no_actriz;
	}
	@Override
	public String toString() {
		
		String cadena = "\n Los elementos de la lista son: \n";
		System.out.println("");
		
		for(int i=0; i<lista.size(); i++) {
			cadena = cadena + lista.get(i)+"\n--------------------------------------------------------------------------------------------------------------\n";
		}
		return cadena;
	}	
}
