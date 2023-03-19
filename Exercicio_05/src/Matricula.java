import javax.print.attribute.standard.Media;

public class Matricula {
    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float notaTrabalho;

    

    public Matricula(int matricula, String nome, float nota1, float nota2, float notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }



    public void Media(){
        float media = ((getNota1() * 2.5f) + (getNota2() * 2.5f) + (getNotaTrabalho() * 2)) / 3;
        System.out.println("A média do aluno " + this.getNome() + " é: " + media);
    }

    public void Final(){
        float media = ((getNota1() * 2.5f) + (getNota2() * 2.5f) + (getNotaTrabalho() * 2)) / 3;
        if(media < 6){
            System.out.println("O Aluno " + this.getNome() + " foi REPROVADO!");
        } else{
            System.out.println("O Aluno " + this.getNome() + " foi APROVADO!");
        }
    }



    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

}




