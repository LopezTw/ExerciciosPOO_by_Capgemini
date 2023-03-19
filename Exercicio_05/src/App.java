/**Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa 
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
Escreva os seguintes métodos para esta classe:

a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Matricula a1 = new Matricula(01, "João", 2.1f, 3, 4.2f);

        a1.Media();
        a1.Final();
    }
}
