public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("Caio", "Lopes", 1200);
        Funcionario f2 = new Funcionario("Roberto", "Costa", 900);
    
        f1.Output();
        f1.Aumento();
        f1.Output();
        System.out.println("\n= = = = = = = = = = = = = = =\n");
        f2.Output();
        f2.Aumento();
        f2.Output();
    }
}
