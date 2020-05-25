/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.awt.Frame;
import java.util.Collection;
import java.util.Scanner;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class VistaUsuario {
        private Scanner leer;

    //Constructor
    public VistaUsuario() {
        leer = new Scanner(System.in);
    }

    //Obtiene los datos ingresado por teclado y genera un Usuario con dichos datos 
    public Usuario ingresarUsuario() {
        System.out.println("Ingrese los datos del usuario: \n");
        System.out.println("Cedula:  ");
        String cedula = leer.nextLine();
        System.out.println("Nombre:  ");
        String nombre = leer.nextLine();
        System.out.println("Apellido:  ");
        String apellido = leer.nextLine();
        System.out.println("Correo Electronico:  ");
        String correo = leer.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = leer.nextLine();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }

    //Obtiene algunos datos especificos ingresado por teclado y genera un Usuario con dichos datos
    public Usuario iniciarSecion() {
        System.out.println("Porfavor ingrese sus datos para verificar su identidad\n");
        System.out.println("Correo Electronico: ");
        String correo = leer.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = leer.nextLine();
        return new Usuario(null, null, null, correo, contraseña);
    }

    //Obtiene los datos ingresado por teclado y genera un Usuario con dichos datos y con la clave ingresada como parametro
    public Usuario actualizarUsuario(String cedula) {
        System.out.println("\nIngrese los nuevos datos\n");
        System.out.println("Nombre:  ");
        String nombre = leer.nextLine();
        System.out.println("Apellido:  ");
        String apellido = leer.nextLine();
        System.out.println("Correo Electronico:  ");
        String correo = leer.nextLine();
        System.out.println("Contraseña:  ");
        String contraseña = leer.nextLine();
        return new Usuario(cedula, nombre, apellido, correo, contraseña);
    }

    //Genera un Usuario con la clave ingresada como parametro
    public Usuario eliminarUsuario(String cedula) {
        return new Usuario(cedula, null, null, null, null);
    }

    //Muestra en pantalla un Usuario ingresado como parametro
    public void verUsuario(Usuario usuario) {
        System.out.println("Datos del Usuario: " + usuario);
    }

    //Muestra en pantalla una coleccion de Usuarios ingresada como parametro
    public void verUsuarios(Collection<Usuario> usuarios) {
        int aux = 0;
        System.out.println("");
        for (Usuario usuario : usuarios){
            System.out.println("Usuario #" + ++aux + ":");
            System.out.println("Datos del Usuario: " + usuario);
            System.out.println("------------------------------------------------------");
        }
    }
}
