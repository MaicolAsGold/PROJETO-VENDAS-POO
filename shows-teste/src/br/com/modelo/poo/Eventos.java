package br.com.modelo.poo;

public class Eventos {
	private String nome;
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private String artista;
	private String local;
	private String endereco;
	private int qtdingresso;
	private int ingresso;
	private int capacidade;

	public Eventos(String nome, int dia, int mes, int ano, int hora, int minuto, String artista, String local,
			String endereco, int ingresso,int qtdingresso, int capacidade) {
		this.artista = artista;
		this.capacidade = capacidade;
		this.endereco = endereco;
		this.ingresso = ingresso;
		this.qtdingresso=qtdingresso;
		this.local = local;
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public int getHora() {
		return hora;
	}



	public void setHora(int hora) {
		this.hora = hora;
	}



	public int getMinuto() {
		return minuto;
	}



	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}



	public String getArtista() {
		return artista;
	}



	public void setArtista(String artista) {
		this.artista = artista;
	}



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public int getIngresso() {
		return ingresso;
	}



	public void setIngresso(int ingresso) {
		this.ingresso = ingresso;
	}



	public int getqtdingresso() {
		return qtdingresso;
	}



	public void setQtdingresso(int qtdingresso) {
		this.qtdingresso = qtdingresso;
	}



	public int getCapacidade() {
		return capacidade;
	}



	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}



	@Override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Evento: ");
		dados.append(nome);
		dados.append("******************************************");
		dados.append("\n");
		dados.append("Data: ");
		dados.append("\n");
		dados.append(dia);
		dados.append("/");
		dados.append(mes);
		dados.append("/");
		dados.append(ano);
		dados.append("\n");
		dados.append(hora);
		dados.append(":");
		dados.append(minuto);
		dados.append("******************************************");
		dados.append("\n");
		dados.append("Local: ");
		dados.append(endereco);
		dados.append("******************************************");
		dados.append("\n");
		dados.append("Artista: ");
		dados.append(artista);
		dados.append("******************************************");
		dados.append("\n");
		dados.append(local);
		dados.append("******************************************");
		dados.append("\n");
		dados.append("Cpacidade: ");
		dados.append(capacidade);
		dados.append("\n");
		dados.append("Pessoas");
		dados.append("\n");
		dados.append("R$: ");
		dados.append(ingresso);
		return dados.toString();
	}

}
