/*Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e 
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios. */

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaCorrente cc = new ContaCorrente(1234, "Caio", 0);
        cc.alterarNome("Lopez");
        cc.Deposito(15);
        cc.Saque(2);
        cc.Status();
        
        
    }
}
