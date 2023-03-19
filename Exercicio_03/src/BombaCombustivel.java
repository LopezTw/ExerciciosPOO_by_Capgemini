public class BombaCombustivel {
    
    //Atributos
    private String tipoCombustivel;
    private float valorPorLitro;
    private float qtdCombustivel;
    private float totalPago;


    public BombaCombustivel(String tipoCombustivel, float valorPorLitro, float qtdCombustivel, float totalPago) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.qtdCombustivel = qtdCombustivel;
        this.totalPago = totalPago;
    }

    public void Output(){
        System.out.println("=== Posto de Gasolina ===");
        System.out.println("Quantidade de Combustivel: " + getQtdCombustivel() + "L");
        System.out.println("Tipo de Combustivel: " + getTipoCombustivel());
        System.out.println("Valor por Litro: R$" + getValorPorLitro());
        System.out.println("Total Pago: " + getTotalPago());
    }

    public void abastecerPorValor(float av){
        setTotalPago(getTotalPago() + av);
        this.qtdCombustivel = this.getTotalPago() / this.getValorPorLitro();
        
    }

    public void abastecerPorLitro(float apl){
        setTotalPago(apl * this.valorPorLitro);   
        setQtdCombustivel(this.totalPago / this.valorPorLitro);     
          
    }

    public void alterarValor(float av){
        setValorPorLitro(getValorPorLitro() + av);
        
    }

    public void alterarCombustivel(String ac){
        if(ac == "Gasolina"){
            this.setTipoCombustivel(ac);
        } else if(ac == "Gás"){
            this.setTipoCombustivel(ac);
        } else if (ac == "Diesel"){
            this.setTipoCombustivel(ac);
        }
    }

    public void alterarQuantidadeCombustivel(float aqc){
        setQtdCombustivel(aqc);
    }



    //Métodos Especiais

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }   

    
}
