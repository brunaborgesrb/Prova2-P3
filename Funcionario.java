public class Funcionario {
    
    //atributos
    private String setor;
    private int id;
    private double salario;
    
    //construtor
    public Funcionario(String setor, int id, double salario) {
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    //metodos 
    public void renovarEstoque(Item item, int qtd){
        item.setQtdEstoque(item.getQtdEstoque() + qtd);

    }

    public void bloquearItem(Item item, boolean disponibilidade){
        item.setDisponibilidade(disponibilidade);
        
    }

    //get e set
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
