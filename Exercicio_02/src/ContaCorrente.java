public class ContaCorrente {
    
    //Atributos
    private int numConta;
    private String correntista;
    private float saldo;


    
    // Método Construtor
    public ContaCorrente(int numConta, String correntista, float saldo) {
        this.numConta = numConta;
        this.correntista = correntista;
        this.saldo = 0;
    }

    public void Status(){
        System.out.println("=== INFORMAÇÕES ===");
        System.out.println("Correntista: " + this.getCorrentista());
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("======================");
    }


    public void alterarNome(String nome){
        setCorrentista(nome);
    }

    public void Deposito(int d){
       this.setSaldo(this.getSaldo() + d);
    }

    public void Saque(int s){
        this.setSaldo(this.getSaldo() - s);
    }

    //Métodos Especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
}
