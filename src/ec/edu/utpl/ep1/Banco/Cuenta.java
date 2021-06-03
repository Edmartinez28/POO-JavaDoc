package ec.edu.utpl.ep1.Banco;
import java.time.LocalDate;

/**
 * Esta clase  manipula datos de tipo decimal y  cadenas
 * @author Edgar Martínez y Richard Ojeda
 */
public class Cuenta {
    private double saldo;
    private String numero;
    private LocalDate fechaApertura;

    /**
     * Este constructor  inicialia  al atributo  Sal
     * @param saldo
     * @param numero
     */
    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        this.fechaApertura = LocalDate.now();
    }

    /**
     * Este metodo get es un metodo que usamos en las clases para mostar el valor de un atributo
     * agrega un  valor  inicial al atributo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * El metodo get es un metodo que usamos en las clases para mostar el valor de un atributo
     * @return numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * El metodo set es un metodo que usamos en las clases para modificar el valor de un getsaldo atributo
     * @param saldo
     */
    public final void setSaldo(double saldo) {
        if(! validarSaldoNoNegativo(saldo)){
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("Saldo negativo");
        }
    }

    /**
     * El metodo set es un metodo que usamos en las clases para modificar el valor de un atributo
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * El metodo ayuda a determinar que los valores sean superiores a 0
     * @param saldo
     * @return
     */
    public boolean validarSaldoNoNegativo(double saldo){
        return saldo < 0;
    }

    /**
     * Un constructor es un elemento de una clase cuyo atributo (depositar) coincide
     * con una clase corriespondiente y que tiene por objetivo obligar a
     * y controlar cómo se inicializa una instancia de una determinada clase
     * @param monto
     */
    public void depositar(double monto){
        if(monto > 0){
            this.saldo = this.saldo + monto;
        } else {
            throw new IllegalArgumentException("Monto negativo");
        }
    }
}