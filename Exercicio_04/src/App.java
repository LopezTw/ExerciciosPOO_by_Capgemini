public class App {
    public static void main(String[] args) throws Exception {
        
        Elevador e = new Elevador(0, 0, 0, 0);
    
        e.Inicializa();
        e.Sobe(10);
        e.Status();
        e.Desce(1);
        e.Status();
        e.Entra();
        e.Status();
        e.Desce(2);
        e.Status();
        
    }
}
