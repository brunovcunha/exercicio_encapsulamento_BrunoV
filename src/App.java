public class App {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00);

        Cliente juridico = new ClienteJuridico("Joao", "clienteJuridico");

        Cliente fisico = new ClienteJuridico("Bruno", "clienteFisico");

        System.out.println("Preço final para " + juridico.getNome() + produto.calcularPrecoFinal(juridico));
        System.out.println("Preço final para " + fisico.getNome() + produto.calcularPrecoFinal(fisico));
    }
}
