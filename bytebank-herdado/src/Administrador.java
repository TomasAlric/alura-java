public class Administrador extends Funcionario implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
