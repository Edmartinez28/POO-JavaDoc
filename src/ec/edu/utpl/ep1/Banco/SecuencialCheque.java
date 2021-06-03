package ec.edu.utpl.ep1.Banco;

/**
 *  ESta clase es para validar componentes
 *  @author Edgar Martínez y Richard Ojeda
 */
public class SecuencialCheque {
    private String inicio;
    private String fin;

    /**
     * Se encarga de mostrar el valor de inicio
     * @return incio
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * Se encarga de asiganr un valor a inicio
     * @param inicio
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * Se encarga de mostrar en valor de fin
     * @return fin
     */
    public String getFin() {
        return fin;
    }

    /**
     * Se encarga se asignar un valor a fin
     * @param fin
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
}