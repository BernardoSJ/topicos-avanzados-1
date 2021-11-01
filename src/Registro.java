/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {

    int ganancias;
    int contadorE = 0;
    int contadorC = 0;
    int contadorP = 0;
    public ArrayList<usuarios> empleados = new ArrayList();
    public ArrayList<clientes> clientes = new ArrayList();
    public ArrayList<productos> productos = new ArrayList();

    public Registro(boolean reinicio) {
        if (reinicio) {
            System.out.println("Reinicio");
        } else {
            Registro guardados;
            guardados = recuperarListas();
            if (guardados != null) { //Si logró recuperarse la información del archivo
                this.ganancias = guardados.ganancias;
                this.contadorE = guardados.contadorE;
                this.contadorC = guardados.contadorC;
                this.contadorP = guardados.contadorP;
                this.empleados = guardados.empleados;
                this.clientes = guardados.clientes;
                this.productos = guardados.productos;

                System.out.println("Listas recuperadas del registro");
            }
            //De otro modo ya están creados las Listas vacías
        }
    }

    public Registro recuperarListas() {
        FileInputStream fileInput = null;
        ObjectInputStream objectInput = null;
        try {
            fileInput = new FileInputStream("Registros.obj");
            objectInput = new ObjectInputStream(fileInput);
            Registro guardados = (Registro) objectInput.readObject();
            objectInput.close();
            fileInput.close();
            return guardados;
        } catch (FileNotFoundException error) {
            return null;
        } catch (IOException error) {
            return null;
        } catch (ClassNotFoundException error) {
            return null;
        }
    }

    public void guardar() {
        FileOutputStream fileOutput = null;
        ObjectOutputStream objectOutput = null;
        try {
            fileOutput = new FileOutputStream("Registros.obj");
        } catch (FileNotFoundException error) {
            System.out.println("Ocurrió un error");
        }
        try {
            objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(this);
            objectOutput.flush();
            objectOutput.close();
        } catch (IOException error) {
            System.out.println("Ocurrió un error");
        }
        System.out.println("Registro actualizado");
    }

    public String toString() {
        return "";
    }
}
