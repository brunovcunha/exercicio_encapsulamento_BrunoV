public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double aplicarImposto(Cliente cliente) {
        double imposto = 0.1;
        double precoComDesconto = cliente.aplicarDesconto(precoBase);

        return precoComDesconto + (precoComDesconto * imposto);
    }

    public double aplicarTaxaAdicional() {
        double taxa = 50;

        return taxa;
    }

    public double calcularPrecoFinal(Cliente cliente) {

        double precoFinal = aplicarImposto(cliente)
                + aplicarTaxaAdicional();

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
