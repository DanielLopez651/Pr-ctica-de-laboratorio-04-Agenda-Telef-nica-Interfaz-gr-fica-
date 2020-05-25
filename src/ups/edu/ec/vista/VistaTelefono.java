/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;
import java.util.Collection;
import java.util.Scanner;
import ups.edu.ec.modelo.Telefono;
import ups.edu.ec.ventana.Ventana;

/**
 *
 * @author user
 */
public class VistaTelefono {
    private Scanner leer;

    //Constructor
    public VistaTelefono() {
        leer = new Scanner(System.in);
    }
    
    //Obtiene los datos ingresados por teclado y genera un Telefono con dichos datos
    public Telefono ingresarTelefono() {
        Ventana ventana1 = new Ventana("Agenda Telefonica", 600, 400);
            ventana1.setLocation(new Point(350, 190));
            //panel
            GridLayout layout = new GridLayout(2, 2);
            Panel panel = new Panel(layout);
         
        TextField codigo1=new TextField("codigo de telefono", 10);
         TextField num=new TextField("numero de telefono", 10);
          TextField ope=new TextField("operadora", 10);
          panel.add(new Label("ingrese datos de su telefono", Label.CENTER));
          Button salir = new Button("salir");
          Button volver = new Button("volver");
          panel.add(codigo1);
          panel.add(num);
          panel.add(ope);
          panel.add(salir);
          panel.add(volver);
          ventana1.add(panel);
          
          ventana1.setSize(500, 200);
          ventana1.setTitle("ingreso telefono");
          ventana1.setVisible(true);
        
        System.out.println("\nIngrese los datos del Telefono\n");
        System.out.println("Codigo:  ");
        String codigo = leer.nextLine();
        System.out.println("Numero:  ");
        String numero = leer.nextLine();
        System.out.println("Tipo:  ");
        String tipo = leer.nextLine();
        System.out.println("Operadora:  ");
        String operadora = leer.nextLine();
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    //Obtiene los datos ingresados por teclado y genera un Telefono con dichos datos
    public Telefono actualizarTelefono() {
         Ventana ventana2 = new Ventana( 500, 220);
            ventana2.setLocation(new Point(370, 195));
            //panel
            GridLayout layout2 = new GridLayout(2, 2);
            Panel panel1 = new Panel(layout2);
         TextField codigoT=new TextField("codigo de telefono a editar", 10);
        
         TextField num=new TextField("numero de telefono", 10);
          TextField ope=new TextField("operadora", 10);
          panel1.add(new Label("ingrese datos de su telefono", Label.LEFT));
           Button aceptar = new Button("aceptar");
          
          Button volver = new Button("volver");
          panel1.add(codigoT);
        
          panel1.add(num);
          panel1.add(ope);
          panel1.add(aceptar);
        
          panel1.add(volver);
          ventana2.add(panel1);
          
          
          ventana2.setTitle("A c t u a l i z a r  T e l e f o n o");
          ventana2.setVisible(true);
        System.out.print("Ingrese el codigo del telefono que decea editar:  ");
        String codigo = leer.nextLine();
        System.out.println("\nIngrese los nuevos datos del Telefono\n");
        System.out.println("Numero:  ");
        String numero = leer.nextLine();
        System.out.println("Tipo:  ");
        String tipo = leer.nextLine();
        System.out.println("Operadora:  ");
        String operadora = leer.nextLine();
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    //Obtiene la clave de un Telefono ingresado por teclado y genera un Telefono con dicha clave
    public Telefono eliminarTelefono() {
         Ventana ventana3 = new Ventana( 520, 250);
            ventana3.setLocation(new Point(370, 195));
            //panel
            GridLayout layout3 = new GridLayout(2, 2);
            Panel panel2 = new Panel(layout3);
         TextField codigoT=new TextField("codigo de telefono a eliminar", 10);
        
    
          panel2.add(new Label("ingrese datos de su telefono", Label.LEFT));
           Button aceptar = new Button("aceptar");
          
          Button volver = new Button("volver");
          panel2.add(codigoT);
        
        
          panel2.add(aceptar);
        
          panel2.add(volver);
          ventana3.add(panel2);
          
          
          ventana3.setTitle("E l i m i n a r   T e l e f o n o");
          ventana3.setVisible(true);
        
        System.out.println("Ingrese el codigo del telefono que decea eliminar:  ");
        String codigo = leer.nextLine();
        return new Telefono(codigo, null, null, null);
    }
    
    //Obtiene la clave de un Telefono ingresado por teclado
    public String buscarTelefono() {
        System.out.println("\nIngrese el codigo del Telefono buscado:  ");
        String codigo = leer.nextLine();
        return codigo;
    }

    //Muestra en pantalla una Coleccion de telefonos
    public void verTelefonos(Collection<Telefono> telefonos) {
        int aux = 0;
        System.out.println("");
        for (Telefono telefono : telefonos) {
            System.out.println("Telefono #" + ++aux + ":");
            System.out.println("Datos del Telefono: " + telefono);
            System.out.println("------------------------------------------------------");
        }
    }
    
    //Muestra en pantalla un Telefono
    public void verTelefono(Telefono telefono) {
        System.out.println("Telefono:  " + telefono);
    }
    
}
