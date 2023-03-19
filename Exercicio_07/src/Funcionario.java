public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSalarioMensal(salarioMensal);

    }
    public void Output(){
        System.out.println("===== FUNCIONÁRIO =====");
        System.out.println("Nome: " + this.getNome() + " " + this.getSobrenome());
        System.out.println("Salário Mensal: " + this.getSalarioMensal());
        System.out.println("Salário Anual: " + (this.getSalarioMensal() * 12));

    }   

    public void Aumento(){ 
        double aumento = this.salarioMensal * 0.1;   
        this.setSalarioMensal(getSalarioMensal() + aumento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal < 0){
            this.salarioMensal = 0;
        } else{
            this.salarioMensal = salarioMensal;
        }
        
    }

    
}
