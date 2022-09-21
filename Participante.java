package Ranking.Participantes;

import java.lang.Comparable;

public class Participante implements Comparable<Participante> {
	private int NumParticipante;
	private int Juegos;
	private int Puntos;
	
	
	public Participante(int pNumParticipante, int pJuegos, int pPuntos) {
		this.NumParticipante = pNumParticipante;
		this.Juegos = pJuegos;
		this.Puntos = pPuntos;
	}
	
	
	public int getNumParticipante() {
		return NumParticipante;
	}
	
	public void setNumParticipante(int pNumParticipante) {
		this.NumParticipante = pNumParticipante;
	}
	
	public int getJuegos() {
		return Juegos;
	}
	
	public void setJuegos(int pJuegos) {
		this.Juegos = pJuegos;
	}

	public int getPuntos() {
		return Puntos;
	}

	public void setPuntos(int pPuntos) {
		this.Puntos = pPuntos;
	}


	@Override
	public int compareTo(Participante o) {
		if(this.Juegos < o.Juegos) {
			return -1;
		}
		else if(this.Juegos > o.Juegos) {
			return 1;
		}
		else {
			if(this.Puntos < o.Puntos) {
				return 1;
			}
			else if(this.Puntos > o.Puntos) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
	}
	
	@Override
	public String toString() {
		int NumeroParticipante = this.getNumParticipante();
		int JuegosParticipante = this.getJuegos();
		int PuntosParticipante = this.getPuntos();
		String datosParticipante = "Participante " + NumeroParticipante + "        " + JuegosParticipante + "         " + PuntosParticipante;
		return datosParticipante;
	}
	

	
}
