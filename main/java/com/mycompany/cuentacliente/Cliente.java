package com.mycompany.cuentacliente;

import java.io.Serializable;

public class Cliente implements Serializable{
    private int ID;
    private String Nombre;
    private String Telefono;
    private int NumeroCuenta;
    private double Saldo;

    public Cliente() {
    }

    public Cliente(int ID, String Nombre, String Telefono, int NumeroCuenta, double Saldo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ID=" + ID + ", Nombre=" + Nombre + ", Telefono=" + Telefono + ", NumeroCuenta=" + NumeroCuenta + ", Saldo=" + Saldo + '}';
    }
    
    public void Consignar(double Valor){
        this.Saldo+=Valor;
    }
        public void Retirar(double Valor){
        this.Saldo-=Valor;
    }
}
