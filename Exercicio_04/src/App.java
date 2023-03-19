/** Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um 
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o 
térreo), capacidade do elevador e quantas pessoas estão presentes nele. 
A classe deve também disponibilizar os seguintes métodos:

a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no 
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);

*/

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
