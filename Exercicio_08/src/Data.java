import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Data implements Cloneable{

    private int dia;
    private int mes;
    private int ano;

    public Data(int ano, int mes, int dia) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void Formatador() {
        String dataFormatada;
        try {
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.of(this.ano, this.mes, this.dia);
            dataFormatada = data.format(formatador);
        } catch (Exception e) {
            dataFormatada = "01/01/0001";
        }

        System.out.println(dataFormatada);

    }

    public void Compara(Data outraData) {
        LocalDate data1 = LocalDate.of(this.ano, this.mes, this.dia);
        LocalDate data2 = LocalDate.of(outraData.ano, outraData.mes, outraData.dia);

        System.out.println(data1.compareTo(data2));

    }

    public void GetDia() {

        System.out.println("Dia: " + this.dia);

    }

    public void GetMes() {

        System.out.println("Mês: " + this.mes);

    }

    public void GetAno() {
        System.out.println("Ano: " + this.ano);
    }

    public void mesPorExtenso(int mesExt) {

        
        mesExt = this.mes;

        switch (mesExt) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês Inválido!");
                break;
        }

    }

    public void anoBissexto(){
        if(this.ano % 4 == 0 && (this.ano % 100 != 0 || ano % 400 == 0)){
            System.out.println(this.ano + " é Bissexto");
        } else {
            System.out.println(this.ano + " não é Bissexto");
        }
    }

    

    @Override
    public Data clone() {
        try {
            return (Data) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    

    

}
