public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 43629);

        conta.setAgencia(-50);
        conta.setNumero(-350);

        System.out.println(conta.getAgencia());
    }
}
