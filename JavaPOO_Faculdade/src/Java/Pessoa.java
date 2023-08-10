package Java;

public class Pessoa {
	 	private String nome;
	    private String dataNasc;
	    private int idade;

	    public Pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }

	    public Pessoa(String dataNasc) {
	        this.dataNasc = dataNasc;
	    }

	    public Pessoa(int idade) {
	        this.idade = idade;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return this.nome;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public int getIdade() {
	        return this.idade;
	    }

	    public void setDataNasc(String dataNasc) {
	        this.dataNasc = dataNasc;
	    }

	    public String getDataNasc() {
	        return this.dataNasc;
	    }
}

