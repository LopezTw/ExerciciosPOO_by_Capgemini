import java.time.LocalDate;
import java.time.Period;
public class Pessoa {
    
    //Atributos

    private String nome;
    private LocalDate dataNascimento;
    private float altura;


    

    public Pessoa(String nome, LocalDate dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }


    //Método p/ fazer o output das mensagens
    public void Dados(){
        System.out.println("=== Informações da Pessoa: ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.calcularIdade());
        System.out.println("Altura: " + this.altura);

    }

    // Utilizando a biblioteca de LocalDate, podemos encontrar a idade atraves da data de nascimento
    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, LocalDate.now()).getYears();

    }


    // Métodos Especiais
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public LocalDate getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){

        this.dataNascimento = dataNascimento;
    }
     
    public float getAltura() {

        return altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }


}

    


