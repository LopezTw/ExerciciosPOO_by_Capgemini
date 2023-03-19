public class Invoice {
    private int numItemFaturado;
    private String descricaoItem;
    private int qtdComprada;
    private float precoUnitario;

    public Invoice(int numItemFaturado, String descricaoItem, int qtdComprada, float precoUnitario) {
        this.setNumItemFaturado(numItemFaturado);
        this.setDescricaoItem(descricaoItem);
        this.setQtdComprada(qtdComprada);
        this.setPrecoUnitario(precoUnitario);

    }

    public void Output(){
        System.out.println("==== Informações da Fatura ====");
        System.out.println("Item: " + this.numItemFaturado);
        System.out.println("Descrição: " + this.descricaoItem);
        System.out.println("Quantidade: " + this.qtdComprada);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Preço Total: " + getInvoiceAmount());
    }

    public double getInvoiceAmount(){
        return this.precoUnitario * this.qtdComprada;
    }



    public int getNumItemFaturado() {
        return numItemFaturado;
    }

    public void setNumItemFaturado(int numItemFaturado) {
        this.numItemFaturado = numItemFaturado;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        if(qtdComprada < 0){
            this.qtdComprada = 0;
        } else{
            this.qtdComprada = qtdComprada;
        }
        
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {   
        if(precoUnitario < 0){
            this.precoUnitario = 0;
        } else{
            this.precoUnitario = precoUnitario;
        }
    }

    
    
}
