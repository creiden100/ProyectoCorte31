/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SERGIO
 */
public class NoAsegurado extends Vehiculo{
    
    private int idAsegurado;

    public NoAsegurado(int idAsegurado, int idVehiculo, String matricula, String cilindraje, String marca, String color, int Cliente_idCliente, int Poliza_idPoliza, int RegistroSiniestro_idRegistroSiniestro) {
        super(idVehiculo, matricula, cilindraje, marca, color, Cliente_idCliente, Poliza_idPoliza, RegistroSiniestro_idRegistroSiniestro);
        this.idAsegurado = idAsegurado;
    }

    public int getIdAsegurado() {
        return idAsegurado;
    }

    public void setIdAsegurado(int idAsegurado) {
        this.idAsegurado = idAsegurado;
    }

    @Override
    public String toString() {
        return "NoAsegurado{" + "idAsegurado=" + idAsegurado + '}';
    }
    
}
