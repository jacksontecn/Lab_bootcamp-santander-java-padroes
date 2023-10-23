public class FabricarCarros implements FabricaVeiculos{
    @Override
    public Veiculo criarVeiculo() {
        System.out.println("Carro Criado");
        return new Carro();
    }
}
