package Proyecto1;

public class Pelicula extends Multimedia {
	private String actor;
	private String actriz;
	
	public Pelicula(String titulo, String autor, String formato, double duracion, String actor, String actriz) throws Exception {
		super(titulo, autor, formato, duracion);
		//this.actor = autor;
		//this.actriz = actriz;
		
		
		if(actor != null && actriz != null) {
			this.actor = actor;
			this.actriz = actriz;
		}
		else if(actor != null && actriz == null) {
				this.actor = actor;	
			}
		 else if(actor == null && actriz != null) {
			 this.actriz = actriz;
		 }
		 
		 else if(actriz == null && actor == null) {
		throw new Exception("No se permiten que los actores sean nulos");
		
		}
		
	}
	public String dameActor() {
		return this.actor;
	}
	public String dameActriz() {
		return this.actriz;
	}
	@Override
	public String toString() {
		return "Pelicula actor=" + actor + ", actriz=" + actriz + super.toString() + "";
		}	
	}
	
	

