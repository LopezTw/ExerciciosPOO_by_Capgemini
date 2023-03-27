import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jogador {
    
    private String nome;
    private String posicao;
    private String dataDeNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;
    
    public Jogador(String nome, String posicao, String dataDeNascimento, String nacionalidade, float altura,
            float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataDeNascimento = dataDeNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public void status(){
        System.out.println("========= INFORMAÇÕES DO JOGADOR =========");
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("Data de Nascimento: " +  this.dataDeNascimento);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Altura: " +  this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("==========================================");
    }

    public void calcularIdade(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(this.dataDeNascimento, formatter);
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(dataNasc, hoje).getYears();
        System.out.println("Idade: " +  idade);
    }

    public void aposentar(int idade){
        int tempoPraAposentar = 0;
        if(idade < 40 && idade > 18){
            if(this.posicao == "Defesa"){
                tempoPraAposentar = 40 - idade;
                System.out.println("Falta " + tempoPraAposentar + " anos para Aposentar");
            } else if(this.posicao == "Meio Campo"){
                tempoPraAposentar = 38 - idade;
                System.out.println("Falta " + tempoPraAposentar + " anos para Aposentar");
            } else if(this.posicao == "Atacante"){
                tempoPraAposentar = 35 - idade;
                System.out.println("Falta " + tempoPraAposentar + " anos para Aposentar");
            } else {
                System.out.println("Posição Inválida");
            }
        } else {
            System.out.println("Muito novo ou Aposentado!");
        }
         // Eu poderia aprimorar o IF ELSE a fim de filtrar ainda mais os dados inseridos.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    


}
