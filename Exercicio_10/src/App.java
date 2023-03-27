public class App {
    public static void main(String[] args) throws Exception {
        Jogador j1 = new Jogador("Caio Augusto", "Atacante", "28/09/1997", "Brasileiro", 1.75f, 62.0f);
        
        j1.status();
        j1.calcularIdade();
        j1.aposentar(25);
   
    }
}
