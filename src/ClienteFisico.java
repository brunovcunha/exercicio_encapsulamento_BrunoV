public class ClienteFisico extends Cliente {

    public ClienteFisico(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public double aplicarDesconto(Double valor) {

        double desconto = 0.1;

        if (super.getTipo().equals("clienteFisico")) {
            return valor * (1 - desconto);
        }
        return valor;
        
    }

}
