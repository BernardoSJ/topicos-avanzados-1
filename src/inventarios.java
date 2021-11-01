/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class inventarios extends JFrame implements ActionListener {

    JButton btnsalir = new JButton("Salir");
    JButton btnnike = new JButton("Nike");
    JButton btnpuma = new JButton("Puma");
    JButton btnwilson = new JButton("Wilson");
    JLabel clave = new JLabel("Clave de producto");
    JTextField tclave = new JTextField();
    JScrollPane scroll = new JScrollPane();
    JTable tabla = new JTable();
    JLabel titulo = new JLabel("Información y administración de productos");
    JButton btnUnidades = new JButton("Pedir unidades");
    DefaultTableModel modelo;
    JButton buscar = new JButton("Buscar");
    String marca;

    void cargar(String b) {
        limpiartabla();
        if (b.equals("")) {
            for (int i = 0; i < usuarios.registro.productos.size(); i++) {

                agregarTabla(usuarios.registro.productos.get(i).getClave(),
                         usuarios.registro.productos.get(i).getNombre(),
                         "" + usuarios.registro.productos.get(i).getCantidad(),
                         "" + usuarios.registro.productos.get(i).getPrecio(),
                         usuarios.registro.productos.get(i).getMarca());

            }
        } else {
            for (int i = 0; i < usuarios.registro.productos.size(); i++) {
                if (usuarios.registro.productos.get(i).getClave().equals(tclave.getText())) {
                    agregarTabla(usuarios.registro.productos.get(i).getClave(),
                             usuarios.registro.productos.get(i).getNombre(),
                             "" + usuarios.registro.productos.get(i).getCantidad(),
                             "" + usuarios.registro.productos.get(i).getPrecio(),
                             usuarios.registro.productos.get(i).getMarca());
                }
            }
        }
    }

    void limpiartabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    void agregarTabla(String cero, String uno, String dos, String tres, String cuatro) {
        String vector[] = new String[5];
        vector[0] = cero;
        vector[1] = uno;
        vector[2] = dos;
        vector[3] = tres;
        vector[4] = cuatro;
        modelo.addRow(vector);
    }

    public inventarios() {
        super("Vista proveedores");
        marca = "Nike";
        String nombre[] = {"Clave Producto", "Nombre", "Cantidad Existente", "Precio", "Marca"};
        modelo = new DefaultTableModel(null, nombre);
        cargar("");
        setSize(705, 500);
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/fondoI.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);

        tabla.setModel(modelo);
        scroll.setViewportView(tabla);

        getContentPane().add(scroll);
        scroll.setBounds(260, 70, 380, 400);
        btnsalir.setBounds(600, 10, 73, 23);
        getContentPane().add(btnsalir);
        btnsalir.addActionListener(this);
        btnnike.setBounds(10, 70, 60, 23);
        getContentPane().add(btnnike);
        btnnike.addActionListener(this);
        btnpuma.setBounds(10, 120, 70, 23);
        getContentPane().add(btnpuma);
        btnpuma.addActionListener(this);
        btnwilson.setBounds(10, 170, 76, 23);
        getContentPane().add(btnwilson);
        btnwilson.addActionListener(this);
        clave.setBounds(10, 240, 160, 14);
        getContentPane().add(clave);
        tclave.setBounds(130, 240, 110, 20);
        getContentPane().add(tclave);
        titulo.setBounds(100, 24, 500, 26);
        titulo.setFont(new Font("Tahoma", 0, 24));
        getContentPane().add(titulo);
        btnUnidades.setBounds(30, 270, 130, 23);
        getContentPane().add(btnUnidades);
        btnUnidades.addActionListener(this);
        buscar.setBounds(170, 270, 80, 23);
        getContentPane().add(buscar);
        buscar.addActionListener(this);
        show();
    }

    public void actionPerformed(ActionEvent e) {
        Object ev = e.getSource();
        if (ev == btnsalir) {
            this.dispose();
        }
        if (ev == btnnike) {
            marca = "Nike";
            limpiartabla();
            for (int i = 0; i < usuarios.registro.productos.size(); i++) {
                if (usuarios.registro.productos.get(i).getMarca().equals(marca)) {
                    agregarTabla(usuarios.registro.productos.get(i).getClave(),
                             usuarios.registro.productos.get(i).getNombre(),
                             "" + usuarios.registro.productos.get(i).getCantidad(),
                             "" + usuarios.registro.productos.get(i).getPrecio(),
                             usuarios.registro.productos.get(i).getMarca());
                }
            }
        }
        if (ev == btnpuma) {
            marca = "Puma";
            limpiartabla();
            for (int i = 0; i < usuarios.registro.productos.size(); i++) {
                if (usuarios.registro.productos.get(i).getMarca().equals(marca)) {
                    agregarTabla(usuarios.registro.productos.get(i).getClave(),
                             usuarios.registro.productos.get(i).getNombre(),
                             "" + usuarios.registro.productos.get(i).getCantidad(),
                             "" + usuarios.registro.productos.get(i).getPrecio(),
                             usuarios.registro.productos.get(i).getMarca());
                }
            }
        }
        if (ev == btnwilson) {
            marca = "Wilson";
            limpiartabla();
            for (int i = 0; i < usuarios.registro.productos.size(); i++) {
                if (usuarios.registro.productos.get(i).getMarca().equals(marca)) {
                    agregarTabla(usuarios.registro.productos.get(i).getClave(),
                             usuarios.registro.productos.get(i).getNombre(),
                             "" + usuarios.registro.productos.get(i).getCantidad(),
                             "" + usuarios.registro.productos.get(i).getPrecio(),
                             usuarios.registro.productos.get(i).getMarca());
                }
            }
        }
        if (ev == buscar) {
            if (tclave.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Asegurese de llenar la caja de texto de clave de producto", "Advertencia", JOptionPane.ERROR_MESSAGE);
            } else {
                int pos = 0;
                limpiartabla();
                for (int i = 0; i < usuarios.registro.productos.size(); i++) {
                    if (usuarios.registro.productos.get(i).getClave().equals(tclave.getText())) {
                        pos = i;
                    }
                }
                if (usuarios.registro.productos.get(pos).getClave().equals(tclave.getText())) {
                    limpiartabla();
                    agregarTabla(usuarios.registro.productos.get(pos).getClave(), usuarios.registro.productos.get(pos).getNombre(), "" + usuarios.registro.productos.get(pos).getCantidad(), "" + usuarios.registro.productos.get(pos).getPrecio(), usuarios.registro.productos.get(pos).getMarca());
                } else {
                    JOptionPane.showMessageDialog(null, "Ese producto no esta registrado", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    cargar("");
                }
            }
        }

        if (ev == btnUnidades) {
            if (tclave.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Asegurate de haber ingresado algo en la caja de texto", "Advertencia", JOptionPane.ERROR_MESSAGE);
            } else {
                int pos = 0;
                for (int i = 0; i < usuarios.registro.productos.size(); i++) {
                    if (usuarios.registro.productos.get(i).getClave().equals(tclave.getText())) {
                        pos = i;
                    }
                }
                if (usuarios.registro.productos.get(pos).getClave().equals(tclave.getText())) {
                    JFrame frame = new JFrame();
                    String numeros[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
                    int cantidad=0;
                    try{
                     cantidad = Integer.parseInt((String) JOptionPane.showInputDialog(frame, "¿Cuantas unidades quieres pedir?", "Unidades", JOptionPane.QUESTION_MESSAGE, null, numeros, numeros[0]));
                    }catch(HeadlessException | NumberFormatException er){
                        JOptionPane.showMessageDialog(null,"Asegurate de que pediste alguna cantidad valida por el momento se le añadiran 0 unidades al producto");
                    }
                    int cantidadnueva = usuarios.registro.productos.get(pos).getCantidad() + cantidad;
                    usuarios.registro.productos.get(pos).setCantidad(cantidadnueva);
                    usuarios.registro.guardar();
                    cargar("");
                    JOptionPane.showMessageDialog(null, "Las unidades han sido añadidas para ese producto");
                } else {
                    JOptionPane.showMessageDialog(null, "Ese producto no esta registrado", "Advertencia", JOptionPane.ERROR_MESSAGE);

                }
            }
        
        }
    }

}
