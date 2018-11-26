package p2lp2.intro;


public class Pessoa {
	String nome;
	int idade;
	double peso;
	boolean existe;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(String nome, int idade, double peso, boolean existe) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.existe = existe;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public boolean isExiste() {
		return existe;
	}



	public void setExiste(boolean existe) {
		this.existe = existe;
	}

	public String toString() {
		return "A pessoa " + nome + " tem " + idade + " anos" + ", tem " + peso + "kg";
	}
	
	public void imprimir() {
		System.out.println(this); //pessoa3
	}

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Aroldo", 20, 76.7, true);
		Pessoa pessoa2 = new Pessoa("Maria");
		Pessoa pessoa3 = new Pessoa("João", 55);
		
		pessoa1.imprimir();
		pessoa2.imprimir();
		pessoa3.imprimir();
		System.out.println(pessoa1);
		
//		System.out.println(pessoa1.getNome());
//		System.out.println(pessoa1.getIdade());
//		System.out.println(pessoa1.getPeso());
//		System.out.println(pessoa1.isExiste());
//		
//		System.out.println(pessoa2.getIdade());
//		System.out.println(pessoa3.getIdade());
		
		
	}
	
}
