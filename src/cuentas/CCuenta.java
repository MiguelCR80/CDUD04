package cuentas;

/**
 * 
 * @author Miguel
 * Esta clase define una cuenta que tendrá un titular, un número de cuenta asociado,
 * un saldo y un tipo de interés. El saldo se verá incrementado o disminuido
 * si hay ingresos o retiradas respectivamente.
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta el número de cuenta que sustituirá a la existente
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo que sustituirá al actual
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés el tipo de interes de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el tipo de interés que sustituirá al actual
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor vacío
     */
    
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom nombre del titular
     * @param cue número de cuenta
     * @param sal saldo de la cuenta
     * @param tipo a pesar de aldmitirlo como parámetro, no se usa en el constructor
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtiene el saldo de la cuenta
     * @return getSaldo() el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Realiza un ingreso en la cuenta.
     * @param cantidad cantidad a ingresar. Será una cantidad positiva.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

     /**
     * Realiza un reintegro en la cuenta.
     * @param cantidad cantidad a retirar. Será una cantidad positiva.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
