package ec.edu.utpl.ep1.Banco;


/**
 * Esta clase sirve para determinar componentes propios de una cuenta de banco corriente
 * @author Edgar Martínez y Richard Ojeda
 */

public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secuenciaCh;

    /**
     * @param saldo
     * @param numero
     * Constructor para la inicializar una cuenta de banco corriente
     */
    public Corriente(double saldo, String numero) {
        super(saldo, numero);
    }

    /**
     * Se encarga de mostrar el valor de nroMaxCheques
     * @return nroMaxCheques
     */
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    /**
     *Se encarga de asignar un valor a nroMaxCheques
     * @param nroMaxCheques
     */
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }

    /**
     *Se encarga de mostrar la secuencia de los cheques de secuenciaCh
     * @return secuenciaCh
     */
    public SecuencialCheque getSecuenciaCh() {
        return secuenciaCh;
    }

    /**
     *Se encarga de asignar un valor a la secuencia de cheques de secuenciaCh
     * @param secuenciaCh
     */
    public void setSecuenciaCh(SecuencialCheque secuenciaCh) {
        this.secuenciaCh = secuenciaCh;
    }
}