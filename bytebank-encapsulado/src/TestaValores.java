public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 43629);

        System.out.println(conta.getAgencia());

        Conta conta1 = new Conta(1337, 53281);

        Conta conta2 = new Conta(1337, 51902);

        System.out.println(Conta.getTotal());
    }
}
