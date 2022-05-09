package Cuentas;

/**
 * @author Fabio Yamuza Gonzalez
 * clase CCuenta en la que estaran los metodos y los parametros para crear y usar una cuenta bancaria
 * una excepción.
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public CCuenta() {
    }

    /**
     * @param nom le da un valor al atributo nombre
     * @param cue le da un valor al atributo ceunta
     * @param sal le da un valor al atributo saldo
     * @param tipo le daria valor a tipoInteres en caso de que se llegara a implementar en el constructor
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * @param cantidad se mete la cantidad que se quiere ingresar al parámetro saldo
     * @throws Exception para no ingresar cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad se mete la cantidad que se quiere retirar al parámetro saldo
     * @throws Exception para no retirar cantidades negativas o mayores que el saldo actual
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * @return nos devuelve el atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return nos devuelve el atributo cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return nos devuelve el atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return nos devuelve el atributo tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
