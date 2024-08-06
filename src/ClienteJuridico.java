public class ClienteJuridico extends Cliente {

    public ClienteJuridico(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public double aplicarDesconto(Double valor) {
        double desconto = 0.2;

        return valor * (1 - desconto);
    }

}
