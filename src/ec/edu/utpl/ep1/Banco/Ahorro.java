package ec.edu.utpl.ep1.Banco;
/**
 * Esta clase esta creada para generar nuevas cuentas
 * @author Edgar Martínez y Richard Ojeda
 */
public class Ahorro extends Cuenta{

    private double interesAnual;

    /**
     * Esta determina los valores iniciales de la cuenta
     * @param saldo
     * @param numero
     * @param interesAnual
     */
    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    /**
     * Esta muestra el nÃºmero de la cuenta manipulado ya que tiene
     * iniciales de CTA referente a cuenta de ahorro
     * @return "CTA-AH".concat(super.getNumero())
     */
    @Override
    public String getNumero(){
        return "CTA-AH".concat(super.getNumero());
    }

    /**
     * ESta muestra el interes anual de la cuenta
     * @return interesAnual
     */
    public double getInteresAnual() {
        return interesAnual;
    }

    /**
     * ESte metodo determina si el monto el mayor a 0
     * @param monto
     * @return
     */
    private boolean isMontoValido(double monto){
        return monto>0;
    }

    /**
     * Este atributo se usa para validar que el atributo saldo sea valido
     * por lo que llama al metodo setsaldo
     * @param monto
     */
    public void retirar(double monto){
        if(isMontoValido(monto)){
            setSaldo(getSaldo()-monto);
        } else {
            throw new IllegalArgumentException("El monto no es valido");
        }
    }
}