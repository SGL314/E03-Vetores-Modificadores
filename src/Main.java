public class Main{
    public static void main(String[] args){
        Conta objA = new Conta();

        objA.dono.nome = "Lobato";
        objA.saldo = 2300;
        objA.agencia = "101-2";
        objA.numero = 314159265;

        objA.imprimir();
    }
}