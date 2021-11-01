/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bernardo SJ
 */
public class clientes extends usuarios {

    private String ultimaApartadoCompra;
    private float dineroApartadoUltimaCompra;

    public clientes(String noControl, String clave, String nombre, String apellidos, String sexo, String dia, String mes, String año, float sueldo, String tipoUsuario, float apartado, String ap) {
        super(noControl, clave, nombre, apellidos, sexo, dia, mes, año, sueldo, tipoUsuario);

        this.ultimaApartadoCompra = ap;
        this.dineroApartadoUltimaCompra = apartado;
    }

    public String getUltimaApartadoCompra() {
        return ultimaApartadoCompra;
    }

    public void setUltimaApartadoCompra(String ultimaApartadoCompra) {
        this.ultimaApartadoCompra = ultimaApartadoCompra;
    }

    public float getDineroApartadoUltimaCompra() {
        return dineroApartadoUltimaCompra;
    }

    public void setDineroApartadoUltimaCompra(float dineroApartadoUltimaCompra) {
        this.dineroApartadoUltimaCompra = dineroApartadoUltimaCompra;
    }

}
