import java.time.LocalDate;

/** Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir 
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa p = new Pessoa("Caio", LocalDate.of(1997, 9, 28), 1.75f);
        p.Dados();
    }
}
