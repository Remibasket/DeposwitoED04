package cuentas;

/**
 * Clase que representa una cuenta bancaria simple.
 * Permite consultar el saldo, ingresar y retirar dinero.
 */
public class CCuenta {

    /** Titular de la cuenta. */
    private String nombre;
    /** Número de cuenta. */
    private String cuenta;
    /** Saldo actual. */
    private double saldo;
    /** Tipo de interés aplicado. */
    private double tipoInteres;

    /** Constructor por defecto. */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     * @param nom nombre del titular
     * @param cue número de cuenta
     * @param sal saldo inicial
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo; 
    }

    // GETTERS / SETTERS 
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuenta() { return cuenta; }
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getTipoInteres() { return tipoInteres; }
    public void setTipoInteres(double tipoInteres) { this.tipoInteres = tipoInteres; }

    /**
     * Devuelve el saldo actual.
     * @return saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad) throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}