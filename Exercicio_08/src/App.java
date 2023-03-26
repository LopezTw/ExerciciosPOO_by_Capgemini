

/** Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos 
seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a 
data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e 
retorne: 

i. 0 se as datas forem iguais; 
ii. 1 se a data corrente for maior que a do parâmetro; 
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os 
mesmos valores de atributos e retorna sua referência pelo método
*/

public class App {
    public static void main(String[] args) throws Exception {
        
       Data d1 = new Data(1997, 12, 17);
       Data d2 = new Data(1998, 12, 17);
       Data d3 = d1.clone();
      
       d1.Formatador();
       d2.Formatador(); 
       d2.Compara(d1);
       System.out.println("==============");

       d1.GetDia();
       d1.GetMes();
       d1.GetAno();
       d1.mesPorExtenso(0);
       d1.anoBissexto();
       
       System.out.println("==============");
        d3.clone();
        d3.Formatador();
    
    }


}
