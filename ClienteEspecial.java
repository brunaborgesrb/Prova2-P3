public class ClienteEspecial extends Cliente{

    //atributos
    private int pontos;
    private double saldoDeCompras;

    //construtor
    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente,
            Item[] carrinhoDeCompras, int pontos, double saldoDeCompras) {
        super(nome, idade, cpf, endereco, bomCliente, carrinhoDeCompras);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }
    
    //metodo
    public double finalizarCompra(int pontosPorItem){
        double total = super.finalizarCompra();
        double desconto = total * 0.05;
        saldoDeCompras += desconto;
        if (saldoDeCompras > 100) {
            pontos += 5;
            saldoDeCompras -= 100;
        }
        for (Item item : carrinhoDeCompras) {
            if (item != null) {
                if (pontos >= pontosPorItem) {
                    pontos -= pontosPorItem;
                } else {
                    total += item.getValor();
                }
                item.setQtdEstoque(item.getQtdEstoque() - 1);
            }
        return total;
    }
}

    //get e set
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }

    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }  
}
