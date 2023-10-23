public class FabricarOnibus implements FabricaVeiculos{
    @Override
    public Veiculo criarVeiculo() {
        System.out.println("Ônibus Criado");
        return new Onibus();
    }
}
