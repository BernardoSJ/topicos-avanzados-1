/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import javax.swing.JLabel;

import javax.swing.JFrame;

import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Admin_inicio extends JFrame implements ActionListener {

    JLabel titulo = new JLabel("TIENDA DE DEPORTES");
    JLabel ganancias = new JLabel("Ganancias: ");
    JLabel numeros = new JLabel("0000000");

    JLabel labelnike = new JLabel(new ImageIcon(this.getClass().getResource("/nikelogo.png")));
    ImageIcon icon = new ImageIcon(this.getClass().getResource("/pumalogo.png"));
    JLabel labelpuma = new JLabel(icon);
    JLabel labelwilson = new JLabel(new ImageIcon(this.getClass().getResource("/wilsonlogo.jpg")));
    JMenuItem elemProvedores = new JMenuItem("Proveedores");
    JMenuItem elemClientes = new JMenuItem("Clientes");
    JMenuItem elemVendedores = new JMenuItem("Vendedores");
    JMenuItem salir = new JMenuItem("Salir");

    public Admin_inicio() {
        super("Administración de la tienda");
        setSize(600, 500);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Inicio n = new Inicio();
            }
        });
        elemProvedores.addActionListener(this);
        elemClientes.addActionListener(this);
        elemVendedores.addActionListener(this);
        salir.addActionListener(this);
        numeros.setText("$" + usuarios.registro.ganancias);
        JMenu menu = new JMenu("Administrar");
        menu.add(elemProvedores);
        menu.add(elemClientes);
        menu.add(elemVendedores);
        menu.add(salir);
        JMenuBar barra = new JMenuBar();
        barra.add(menu);
        this.setJMenuBar(barra);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        titulo.setBounds(120, 20, 380, 100);
        titulo.setFont(new java.awt.Font("Tahoma", 0, 36));
        getContentPane().setBackground(Color.WHITE);
        getContentPane().add(titulo);
        ganancias.setBounds(20, 140, 124, 20);
        ganancias.setFont(new java.awt.Font("Tahoma", 0, 24));
        getContentPane().add(ganancias);
        numeros.setBounds(160, 140, 110, 20);
        numeros.setFont(new java.awt.Font("Tahoma", 0, 24));
        getContentPane().add(numeros);
        labelnike.setBounds(10, 170, 180, 210);
        getContentPane().add(labelnike);
        labelpuma.setBounds(200, 170, 200, 210);
        getContentPane().add(labelpuma);
        labelwilson.setBounds(410, 170, 190, 210);
        getContentPane().add(labelwilson);
        show();
    }

    public void actionPerformed(ActionEvent e) {
        Object ev = e.getSource();
        if (ev == elemClientes) {
            Clientes_admin n = new Clientes_admin();
        }
        if (ev == elemProvedores) {
            inventarios n = new inventarios();
        }
        if (ev == elemVendedores) {
            Vendedores_admin n = new Vendedores_admin();
        }
        if (ev == salir) {
            this.dispose();
            Inicio n = new Inicio();
        }
    }

}
