package br.com.modelo.poo;

public class Shows {
	private Eventos[] array = new Eventos[11];

	public void showsListados(String nome, int dia, int mes, int ano, int hora, int minuto, String artista,
			String local, String endereco, double ingresso, int capacidade) {
		for (Eventos eventos : array) { System.out.println(eventos);}
			
		}

	public void setArray(Eventos[] array) {
		this.array = array;
	}
}
