package pessoas;

// classe Pessoa
public class Pessoa {
	
	// atributos da classe Pessoa
    private String nome;
    
    private String cpf;
    
    private double peso;
    
    private double altura;

  // construtor classe Pessoa
    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    // metodos getters e setters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
    

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setAltura(double altura) { this.altura = altura; }
}