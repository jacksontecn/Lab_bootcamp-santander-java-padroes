public class Main {
    public static void main(String[] args) {

        FabricaVeiculos fabricarCarros = new FabricarCarros();
        Veiculo meuCarro = fabricarCarros.criarVeiculo();
        meuCarro.mover();
        System.out.println();

        FabricaVeiculos fabricarBicicletas = new FabricarBicicletas();
        Veiculo minhaBicicleta = fabricarBicicletas.criarVeiculo();
        minhaBicicleta.mover();
        System.out.println();

        FabricaVeiculos fabricarOnibus = new FabricarOnibus();
        Veiculo meuBusao = fabricarOnibus.criarVeiculo();
        meuBusao.mover();



    }
}
