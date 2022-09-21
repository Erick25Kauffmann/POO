package Ranking;

import java.util.ArrayList;
import java.util.Collections;

import Ranking.Participantes.Participante;

public class Ranking {
	
	public static void main(String[] args) {
		ArrayList<Participante> participantes = new ArrayList<Participante>(); 
		
			for(int cont1=0; cont1<7; cont1++)
			{
				int NumJuegos = (int)(Math.random()*5+10);
				int NumPuntos = (int)(Math.random()*20+10);
				
				Participante participante = new Participante(cont1+1, NumJuegos, NumPuntos);
				participantes.add(participante);
			}
			
			System.out.println("Ranking sin ordenar");
			ImprimirLista(participantes);
			
			System.out.println(" ");
			
			System.out.println("Ranking ordenado");
			Collections.sort(participantes);
			ImprimirLista(participantes);
			
	}
	
	public static void ImprimirLista(ArrayList<Participante> participantes) {
		System.out.println("Participantes       Juegos    Puntos");
		for(int cont1=0; cont1<participantes.size(); cont1++)
		{
			Participante participanteActual = participantes.get(cont1);
			System.out.println(participanteActual);
		}
	}

}