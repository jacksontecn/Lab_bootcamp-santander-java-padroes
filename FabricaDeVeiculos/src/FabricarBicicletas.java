public class FabricarBicicletas implements FabricaVeiculos{
    @Override
    public Veiculo criarVeiculo() {
        System.out.println("Bicicleta Criada");
        return new Bicicleta();
    }
}
