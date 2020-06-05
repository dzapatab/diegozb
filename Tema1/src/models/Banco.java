/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Diego
 */
public class Banco {
   private int numeroCuentaBanco;
    private String nombreClienteBanco;
    private double saldoBanco;
    private String claveBanco;
    private String tipoCuentaAhorros;
    private String tipoCuentaCorriente;

    public Banco(int numeroCuentaBanco, String nombreClienteBanco, double saldoBanco, String claveBanco, String tipoCuentaAhorros, String tipoCuentaCorriente) {
        this.numeroCuentaBanco = numeroCuentaBanco;
        this.nombreClienteBanco = nombreClienteBanco;
        this.saldoBanco = saldoBanco;
        this.claveBanco = claveBanco;
        this.tipoCuentaAhorros = tipoCuentaAhorros;
        this.tipoCuentaCorriente = tipoCuentaCorriente;
    }

   
    public int getNumeroCuentaBanco() {
        return numeroCuentaBanco;
    }

    public void setNumeroCuentaBanco(int numeroCuentaBanco) {
        this.numeroCuentaBanco = numeroCuentaBanco;
    }

    public String getNombreClienteBanco() {
        return nombreClienteBanco;
    }

    public void setNombreClienteBanco(String nombreClienteBanco) {
        this.nombreClienteBanco = nombreClienteBanco;
    }

    public double getSaldoBanco() {
        return saldoBanco;
    }

    public void setSaldoBanco(double saldoBanco) {
        this.saldoBanco = saldoBanco;
    }

    public String getClaveBanco() {
        return claveBanco;
    }

    public void setClaveBanco(String claveBanco) {
        this.claveBanco = claveBanco;
    }

    public String getTipoCuentaAhorros() {
        return tipoCuentaAhorros;
    }

    public void setTipoCuentaAhorros(String tipoCuentaAhorros) {
        this.tipoCuentaAhorros = tipoCuentaAhorros;
    }

    public String getTipoCuentaCorriente() {
        return tipoCuentaCorriente;
    }

    public void setTipoCuentaCorriente(String tipoCuentaCorriente) {
        this.tipoCuentaCorriente = tipoCuentaCorriente;
    }


   
    
}
