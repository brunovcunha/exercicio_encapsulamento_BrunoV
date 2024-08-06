public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double aplicarImposto(Cliente cliente) {
        double imposto = 0.1;

        return cliente.aplicarDesconto(precoBase) * imposto;
    }

    public double aplicarTaxaAdicional(Cliente cliente) {
        double taxa = 50;

        return cliente.aplicarDesconto(precoBase) + taxa;
    }

    public double calcularPrecoFinal(Cliente cliente) {

        double precoFinal = cliente.aplicarDesconto(precoBase) + aplicarImposto(cliente)
                + aplicarTaxaAdicional(cliente);

        if (precoFinal < 0) {
            precoFinal = 0;
        }

        return precoFinal;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
