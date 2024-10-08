package Evaluacion2Recuperacion;

public class Hora {
	
	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora() {
		
	}

	public void incrementarSegundo() {
		this.segundos++;
		if(this.segundos == 60) {
			this.segundos = 0;
			this.minutos++;
			if(this.minutos == 60) {
				this.hora++;
				this.minutos = 0;
				if(this.hora == 24) {
					this.hora = 0;
				}
			}
		}
	}
	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		if(hora < 0 || hora > 24) {
			this.hora = 0;
		}
		else {
			this.hora = hora;
		}
	}

	public int getMinutos() {
		return this.minutos;
	}

	public void setMinutos(int minutos) {
		if(minutos < 0 || minutos > 60) {
			this.minutos = 0;
		}
		else {
			this.minutos = minutos;
		}
	}

	public int getSegundos() {
		return this.segundos;
	}

	public void setSegundos(int segundos) {
		if(segundos < 0 || segundos > 60) {
			this.segundos = 0;
		}
		else {
			this.segundos = segundos;
		}
	}	
}