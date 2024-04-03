public class Main{
    public static void main(String[] args){
        Conta c1 = new Conta();

        c1.dono.nome = "Lobato";
        c1.saldo = 2300;
        c1.agencia = "101-2";
        c1.numero = 314159265;

        //c1.imprimir();
        c1.saque(100);
        c1.deposito(600);
        c1.imprimir();
        c1.extrato();
    }
}