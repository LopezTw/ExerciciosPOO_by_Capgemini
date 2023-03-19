public class Elevador {
    
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int qtdPessoasDentro;

    
    public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int qtdPessoasDentro) {
        this.andarAtual = 0;
        this.totalAndares = 11;
        this.capacidadeElevador = 5;
        this.qtdPessoasDentro = qtdPessoasDentro;
    }
    
    public void Status(){
        System.out.println("====== ELEVADOR ======");
        System.out.println("Andar Atual: " + this.andarAtual);
        System.out.println("Capacidade Máxima: " + this.capacidadeElevador);
        System.out.println("Pessoas no elevador: " + this.qtdPessoasDentro);
        System.out.println("Total Andares: " + this.totalAndares);
    }

    public void Inicializa(){
        System.out.println("====== ELEVADOR ======");
        System.out.println("Capacidade Máxima: " + this.capacidadeElevador + " Pessoas");
        System.out.println("Total andares: " + (this.totalAndares -= 1));
        System.out.println("Andar Atual: Térreo");
        System.out.println("Pessoas no elevador: " + this.qtdPessoasDentro);

    }

    public void Entra(){
        if(qtdPessoasDentro == 5){
            System.out.println("\nElevador Lotado !\n");
        } else{
            System.out.println("\nEntrou uma pessoa!\n");
            qtdPessoasDentro++;
        }
    }

    public void Sai(){
        if(qtdPessoasDentro < 1){
            System.out.println("\nElevador está vazio!\n");
        } else{
            System.out.println("\nSaiu uma pessoa!\n");
            qtdPessoasDentro--;
        }
    }

    public void Sobe(int sobe){ // Quantos andares quer subir
        
        if(sobe >= 11){
            System.out.println("\nAndar Inválido!\n");
        } else {
            System.out.println("\nElevador Subindo...\n");
            andarAtual += sobe;
        }
        
    }

    public void Desce(int desce){ // Quantos andares quer descer
        if(desce < 0){
            System.out.println("\nAndar Inválido!\n");
        } else {
            System.out.println("\nElevador Descendo...\n");
            andarAtual -= desce;
        }
    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtdPessoasDentro() {
        return qtdPessoasDentro;
    }

    public void setQtdPessoasDentro(int qtdPessoasDentro) {
        this.qtdPessoasDentro = qtdPessoasDentro;
    }


}
