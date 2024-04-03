import java.util.Date;

public class Operacao {

    /* Data de realização da operação */
    public Date data;

    /* Tipo da operação */
    public char tipo;

    /* Valor da operação */
    public double valor;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
    }

}