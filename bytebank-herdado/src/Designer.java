public class Designer extends Funcionario {

    @Override
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do desinger");
        return 200;
    }
}
