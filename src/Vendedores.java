
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class Vendedores extends JFrame implements ActionListener {

    JLabel cantidad = new JLabel("Cantidad");
    JLabel producto = new JLabel("Producto");
    JCheckBox tenisnike = new JCheckBox("Tenis Air Max\n$" + usuarios.registro.productos.get(0).getPrecio(), true);
    JCheckBox cantimploranike = new JCheckBox("Cantimplora Big Mouth  \n$" + usuarios.registro.productos.get(1).getPrecio(), false);
    JCheckBox balonnike = new JCheckBox("Balon Pitch Team\n$" + usuarios.registro.productos.get(2).getPrecio(), false);
    JCheckBox muñequerasnike = new JCheckBox("Muñequeras Nike Swoosh\n$" + usuarios.registro.productos.get(3).getPrecio(), false);
    String numeros[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    JComboBox ctenisnike = new JComboBox(numeros);
    JComboBox ccantimploranike = new JComboBox(numeros);
    JComboBox cbalonnike = new JComboBox(numeros);
    JComboBox cmuñequerasnike = new JComboBox(numeros);
    JLabel proceso = new JLabel("Proceso de compra");
    JButton btnAñadir = new JButton("Añadir productos");
    JTextArea area = new JTextArea();
    JScrollPane scroll = new JScrollPane();
    JButton btnRegistrar = new JButton("Registar compra");
    JButton btnLimpiar = new JButton("Limpiar");
    JLabel lblNike = new JLabel("NIKE");

    JLabel labeltnike = new JLabel(new ImageIcon(this.getClass().getResource("/tenisNike.png")));
    JLabel labelcnike = new JLabel(new ImageIcon(this.getClass().getResource("/cantimploraNike.png")));
    JLabel labelbnike = new JLabel(new ImageIcon(this.getClass().getResource("/balonNike.png")));
    JLabel labelmnike = new JLabel(new ImageIcon(this.getClass().getResource("/muñequerasNike.png")));
    JLabel producto2 = new JLabel("Producto");
    JLabel cantidad2 = new JLabel("Cantidad");
    JCheckBox tenispuma = new JCheckBox("Tenis Puma Dare\n$" + usuarios.registro.productos.get(4).getPrecio(), true);
    JCheckBox cantimplorapuma = new JCheckBox("Cantimplora negro/blanco\n$" + usuarios.registro.productos.get(5).getPrecio());
    JCheckBox balonpuma = new JCheckBox("Balon King Force\n$" + usuarios.registro.productos.get(6).getPrecio());
    JCheckBox muñequeraspuma = new JCheckBox("Muñequeras Puma\n$" + usuarios.registro.productos.get(7).getPrecio());
    JComboBox cmuñequeraspuma = new JComboBox(numeros);
    JLabel lblpuma = new JLabel("PUMA");
    JLabel labeltpuma = new JLabel(new ImageIcon(this.getClass().getResource("/tenisPuma.png")));
    JLabel labelcpuma = new JLabel(new ImageIcon(this.getClass().getResource("/cantimploraPuma.png")));
    JLabel labelbpuma = new JLabel(new ImageIcon(this.getClass().getResource("/balonpuma.png")));
    JLabel labelmpuma = new JLabel(new ImageIcon(this.getClass().getResource("/muñequerasPuma.png")));
    JComboBox ctenispuma = new JComboBox(numeros);
    JComboBox ccantimplorapuma = new JComboBox(numeros);
    JComboBox cbalonpuma = new JComboBox(numeros);
    JLabel cantidad3 = new JLabel("Cantidad");
    JLabel producto3 = new JLabel("Producto");
    JCheckBox teniswilson = new JCheckBox("Tenis Wilson Tour Ceptor\n$" + usuarios.registro.productos.get(8).getPrecio());
    JCheckBox cantimplorawilson = new JCheckBox("Cantimplora Wilson 2lts\n$" + usuarios.registro.productos.get(9).getPrecio());
    JCheckBox balonwilson = new JCheckBox("Wilson NCAA\n$" + usuarios.registro.productos.get(10).getPrecio());
    JCheckBox muñequeraswilson = new JCheckBox("Muñequeras Wilson\n$" + usuarios.registro.productos.get(11).getPrecio());
    JComboBox cmuñequeraswilson = new JComboBox(numeros);
    JLabel lblwilson = new JLabel("WILSON");
    JLabel labeltwilson = new JLabel(new ImageIcon(this.getClass().getResource("/tenisWilson.png")));
    JLabel labelcwilson = new JLabel(new ImageIcon(this.getClass().getResource("/cantimploraWilson.png")));
    JLabel labelbwilson = new JLabel(new ImageIcon(this.getClass().getResource("/balonWilson.png")));
    JLabel labelmwilson = new JLabel(new ImageIcon(this.getClass().getResource("/muñequerasWilson.png")));
    JComboBox cteniswilson = new JComboBox(numeros);
    JComboBox ccantimplorawilson = new JComboBox(numeros);
    JComboBox cbalonwilson = new JComboBox(numeros);
    JLabel cantidadtenisnike = new JLabel("Cantidad:");
    JLabel cantidadcantimploranike = new JLabel("Cantidad:");
    JLabel cantidadbalonnike = new JLabel("Cantidad:");
    JLabel cantidadmuñequerasnike = new JLabel("Cantidad:");

    JLabel cantidadtenispuma = new JLabel("Cantidad:");
    JLabel cantidadcantimplorapuma = new JLabel("Cantidad:");
    JLabel cantidadbalonpuma = new JLabel("Cantidad:");
    JLabel cantidadmuñequeraspuma = new JLabel("Cantidad:");

    JLabel cantidadteniswilson = new JLabel("Cantidad:");
    JLabel cantidadcantimplorawilson = new JLabel("Cantidad:");
    JLabel cantidadbalonwilson = new JLabel("Cantidad:");
    JLabel cantidadmuñequeraswilson = new JLabel("Cantidad:");

    void cargarCantidades() {
        cantidadtenisnike.setText("Cantidad: " + usuarios.registro.productos.get(0).getCantidad());
        cantidadcantimploranike.setText("Cantidad: " + usuarios.registro.productos.get(1).getCantidad());
        cantidadbalonnike.setText("Cantidad: " + usuarios.registro.productos.get(2).getCantidad());
        cantidadmuñequerasnike.setText("Cantidad: " + usuarios.registro.productos.get(3).getCantidad());

        cantidadtenispuma.setText("Cantidad: " + usuarios.registro.productos.get(4).getCantidad());
        cantidadcantimplorapuma.setText("Cantidad: " + usuarios.registro.productos.get(5).getCantidad());
        cantidadbalonpuma.setText("Cantidad: " + usuarios.registro.productos.get(6).getCantidad());
        cantidadmuñequeraspuma.setText("Cantidad: " + usuarios.registro.productos.get(7).getCantidad());

        cantidadteniswilson.setText("Cantidad: " + usuarios.registro.productos.get(8).getCantidad());
        cantidadcantimplorawilson.setText("Cantidad: " + usuarios.registro.productos.get(9).getCantidad());
        cantidadbalonwilson.setText("Cantidad: " + usuarios.registro.productos.get(10).getCantidad());
        cantidadmuñequeraswilson.setText("Cantidad: " + usuarios.registro.productos.get(11).getCantidad());
    }

    public Vendedores() {
        super("Vista vendedores");
        setSize(1350, 500);
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/fondoVV.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        btnLimpiar.addActionListener(this);
        btnRegistrar.addActionListener(this);
        btnAñadir.addActionListener(this);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Inicio n = new Inicio();
            }
        });
        getContentPane().add(cantidad);
        cantidad.setBounds(230, 70, 60, 14);
        getContentPane().add(producto);
        producto.setBounds(30, 70, 60, 14);
        getContentPane().add(tenisnike);
        tenisnike.setBounds(80, 120, 180, 23);
        tenisnike.setOpaque(false);
        getContentPane().add(cantimploranike);
        cantimploranike.setBounds(80, 190, 200, 23);
        cantimploranike.setOpaque(false);
        getContentPane().add(balonnike);
        balonnike.setBounds(80, 260, 180, 23);
        balonnike.setOpaque(false);
        getContentPane().add(muñequerasnike);
        muñequerasnike.setBounds(80, 350, 215, 23);
        muñequerasnike.setOpaque(false);
        getContentPane().add(ctenisnike);
        ctenisnike.setBounds(260, 120, 56, 20);
        getContentPane().add(ccantimploranike);
        ccantimploranike.setBounds(280, 190, 56, 20);
        getContentPane().add(cbalonnike);
        cbalonnike.setBounds(260, 260, 56, 20);
        getContentPane().add(cmuñequerasnike);
        cmuñequerasnike.setBounds(300, 350, 56, 20);
        getContentPane().add(proceso);
        proceso.setBounds(1100, 20, 220, 14);
        getContentPane().add(btnAñadir);
        btnAñadir.setBounds(1090, 60, 200, 23);
        area.setColumns(20);
        area.setRows(5);
        scroll.setViewportView(area);

        getContentPane().add(scroll);
        scroll.setBounds(1080, 100, 230, 270);
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(1080, 390, 130, 23);
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(1220, 390, 80, 23);
        getContentPane().add(lblNike);
        lblNike.setBounds(130, 20, 40, 14);
        getContentPane().add(labeltnike);
        labeltnike.setBounds(20, 110, 50, 50);
        getContentPane().add(labelcnike);
        labelcnike.setBounds(20, 170, 50, 50);
        getContentPane().add(labelbnike);
        labelbnike.setBounds(20, 250, 50, 50);
        getContentPane().add(labelmnike);
        labelmnike.setBounds(20, 340, 50, 50);
        getContentPane().add(cantidad2);
        cantidad2.setBounds(580, 70, 70, 14);
        getContentPane().add(producto2);
        producto2.setBounds(360, 70, 70, 14);
        getContentPane().add(tenispuma);
        tenispuma.setBounds(420, 120, 190, 23);
        tenispuma.setOpaque(false);
        getContentPane().add(cantimplorapuma);
        cantimplorapuma.setBounds(410, 190, 220, 23);
        cantimplorapuma.setOpaque(false);
        getContentPane().add(balonpuma);
        balonpuma.setBounds(420, 260, 200, 23);
        balonpuma.setOpaque(false);
        getContentPane().add(muñequeraspuma);
        muñequeraspuma.setBounds(420, 350, 200, 23);
        muñequeraspuma.setOpaque(false);
        getContentPane().add(cmuñequeraspuma);
        cmuñequeraspuma.setBounds(625, 350, 56, 20);
        getContentPane().add(lblpuma);
        lblpuma.setBounds(480, 20, 40, 14);
        getContentPane().add(labeltpuma);
        labeltpuma.setBounds(350, 100, 50, 50);
        getContentPane().add(labelcpuma);
        labelcpuma.setBounds(350, 170, 50, 50);
        getContentPane().add(labelbpuma);
        labelbpuma.setBounds(350, 250, 50, 50);
        getContentPane().add(labelmpuma);
        labelmpuma.setBounds(359, 340, 50, 50);
        getContentPane().add(ctenispuma);
        ctenispuma.setBounds(610, 120, 56, 20);
        getContentPane().add(ccantimplorapuma);
        ccantimplorapuma.setBounds(640, 190, 56, 20);
        getContentPane().add(cbalonpuma);
        cbalonpuma.setBounds(615, 260, 56, 20);
        getContentPane().add(cantidad3);
        cantidad3.setBounds(920, 70, 70, 14);
        getContentPane().add(producto3);
        producto3.setBounds(700, 70, 70, 14);
        getContentPane().add(teniswilson);
        teniswilson.setBounds(770, 120, 220, 23);
        teniswilson.setOpaque(false);
        getContentPane().add(cantimplorawilson);
        cantimplorawilson.setBounds(750, 190, 200, 23);
        cantimplorawilson.setOpaque(false);
        getContentPane().add(balonwilson);
        balonwilson.setBounds(760, 260, 200, 23);
        balonwilson.setOpaque(false);
        getContentPane().add(muñequeraswilson);
        muñequeraswilson.setBounds(760, 350, 200, 23);
        muñequeraswilson.setOpaque(false);
        getContentPane().add(cmuñequeraswilson);
        cmuñequeraswilson.setBounds(970, 350, 56, 20);
        getContentPane().add(lblwilson);
        lblwilson.setBounds(820, 20, 50, 14);
        getContentPane().add(labeltwilson);
        labeltwilson.setBounds(690, 100, 50, 50);
        getContentPane().add(labelcwilson);
        labelcwilson.setBounds(699, 170, 50, 50);
        getContentPane().add(labelbwilson);
        labelbwilson.setBounds(690, 250, 50, 50);
        getContentPane().add(labelmwilson);
        labelmwilson.setBounds(690, 340, 50, 50);
        getContentPane().add(cteniswilson);
        cteniswilson.setBounds(990, 120, 56, 20);
        getContentPane().add(ccantimplorawilson);
        ccantimplorawilson.setBounds(970, 190, 56, 20);
        getContentPane().add(cbalonwilson);
        cbalonwilson.setBounds(970, 260, 56, 20);
        getContentPane().add(cantidadcantimploranike);
        cantidadcantimploranike.setBounds(100, 210, 80, 14);
        getContentPane().add(cantidadtenisnike);
        cantidadtenisnike.setBounds(100, 140, 80, 14);
        getContentPane().add(cantidadbalonnike);
        cantidadbalonnike.setBounds(100, 280, 80, 14);
        getContentPane().add(cantidadmuñequerasnike);
        cantidadmuñequerasnike.setBounds(100, 370, 90, 14);
        getContentPane().add(cantidadtenispuma);
        cantidadtenispuma.setBounds(440, 140, 80, 14);
        getContentPane().add(cantidadcantimplorapuma);
        cantidadcantimplorapuma.setBounds(430, 210, 90, 14);
        getContentPane().add(cantidadbalonpuma);
        cantidadbalonpuma.setBounds(440, 280, 80, 14);
        getContentPane().add(cantidadmuñequeraspuma);
        cantidadmuñequeraspuma.setBounds(440, 370, 90, 14);
        getContentPane().add(cantidadteniswilson);
        cantidadteniswilson.setBounds(770, 140, 90, 14);
        getContentPane().add(cantidadcantimplorawilson);
        cantidadcantimplorawilson.setBounds(770, 210, 90, 14);
        getContentPane().add(cantidadbalonwilson);
        cantidadbalonwilson.setBounds(780, 280, 80, 14);
        getContentPane().add(cantidadmuñequeraswilson);
        cantidadmuñequeraswilson.setBounds(780, 370, 90, 14);
        cargarCantidades();
        show();

    }
    float total;
    int unidadesT;

    public void actionPerformed(ActionEvent e) {
        Object ev = e.getSource();
        if (ev == btnRegistrar) {
            if (area.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de presionar el boton de añadir para poder ejecutar una compra");
            } else {
                if (tenisnike.isSelected()) {
                    int unidades = Integer.parseInt(ctenisnike.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(0).getCantidad();
                    usuarios.registro.productos.get(0).setCantidad(unidadesac - unidades);
                }
                if (cantimploranike.isSelected()) {
                    int unidades = Integer.parseInt(ccantimploranike.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(1).getCantidad();
                    usuarios.registro.productos.get(1).setCantidad(unidadesac - unidades);
                }
                if (balonnike.isSelected()) {
                    int unidades = Integer.parseInt(cbalonnike.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(2).getCantidad();
                    usuarios.registro.productos.get(2).setCantidad(unidadesac - unidades);
                }
                if (muñequerasnike.isSelected()) {
                    int unidades = Integer.parseInt(cmuñequerasnike.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(3).getCantidad();
                    usuarios.registro.productos.get(3).setCantidad(unidadesac - unidades);
                }

                if (tenispuma.isSelected()) {
                    int unidades = Integer.parseInt(ctenispuma.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(4).getCantidad();
                    usuarios.registro.productos.get(4).setCantidad(unidadesac - unidades);
                }
                if (cantimplorapuma.isSelected()) {
                    int unidades = Integer.parseInt(ccantimplorapuma.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(5).getCantidad();
                    usuarios.registro.productos.get(5).setCantidad(unidadesac - unidades);
                }
                if (balonpuma.isSelected()) {
                    int unidades = Integer.parseInt(cbalonpuma.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(6).getCantidad();
                    usuarios.registro.productos.get(6).setCantidad(unidadesac - unidades);
                }
                if (muñequeraspuma.isSelected()) {
                    int unidades = Integer.parseInt(cmuñequeraspuma.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(7).getCantidad();
                    usuarios.registro.productos.get(7).setCantidad(unidadesac - unidades);
                }

                if (teniswilson.isSelected()) {
                    int unidades = Integer.parseInt(cteniswilson.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(8).getCantidad();
                    usuarios.registro.productos.get(8).setCantidad(unidadesac - unidades);
                }
                if (cantimplorawilson.isSelected()) {
                    int unidades = Integer.parseInt(ccantimplorawilson.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(9).getCantidad();
                    usuarios.registro.productos.get(9).setCantidad(unidadesac - unidades);
                }
                if (balonwilson.isSelected()) {
                    int unidades = Integer.parseInt(cbalonwilson.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(10).getCantidad();
                    usuarios.registro.productos.get(10).setCantidad(unidadesac - unidades);
                }
                if (muñequeraswilson.isSelected()) {
                    int unidades = Integer.parseInt(cmuñequeraswilson.getSelectedItem().toString());
                    int unidadesac = usuarios.registro.productos.get(11).getCantidad();
                    usuarios.registro.productos.get(11).setCantidad(unidadesac - unidades);
                }

                cargarCantidades();
                JOptionPane.showMessageDialog(null, "Tu total es " + total);
                area.setText("");
                float sueldoan = usuarios.registro.empleados.get(Inicio.pos).getSueldo();
               
                usuarios.registro.ganancias += (unidadesT * 50);
                usuarios.registro.empleados.get(Inicio.pos).setSueldo(sueldoan + 100);
                usuarios.registro.guardar();
            }
        }
        if (ev == btnAñadir) {
            String res = "";
            total = 0;
            unidadesT = 0;
            boolean sePuede = true;
            if (tenisnike.isSelected()) {
                int unidades = Integer.parseInt(ctenisnike.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(0).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(0).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(0).getNombre() + "Total " + (usuarios.registro.productos.get(0).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(0).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (cantimploranike.isSelected()) {
                int unidades = Integer.parseInt(ccantimploranike.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(1).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(1).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(1).getNombre() + "Total " + (usuarios.registro.productos.get(1).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(1).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (balonnike.isSelected()) {
                int unidades = Integer.parseInt(cbalonnike.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(2).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(2).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(2).getNombre() + "Total " + (usuarios.registro.productos.get(2).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(2).getPrecio() * unidades);
                    unidadesT += unidades;
                }

            }
            if (muñequerasnike.isSelected()) {
                int unidades = Integer.parseInt(cmuñequerasnike.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(3).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(3).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(3).getNombre() + "Total " + (usuarios.registro.productos.get(3).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(3).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (tenispuma.isSelected()) {
                int unidades = Integer.parseInt(ctenispuma.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(4).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(4).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(4).getNombre() + "Total " + (usuarios.registro.productos.get(4).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(4).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (cantimplorapuma.isSelected()) {
                int unidades = Integer.parseInt(ccantimplorapuma.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(5).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(5).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(5).getNombre() + "Total " + (usuarios.registro.productos.get(5).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(5).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (balonpuma.isSelected()) {
                int unidades = Integer.parseInt(cbalonpuma.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(6).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(6).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(6).getNombre() + "Total " + (usuarios.registro.productos.get(6).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(6).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (muñequeraspuma.isSelected()) {
                int unidades = Integer.parseInt(cmuñequeraspuma.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(7).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(7).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(7).getNombre() + "Total " + (usuarios.registro.productos.get(7).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(7).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (teniswilson.isSelected()) {
                int unidades = Integer.parseInt(cteniswilson.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(8).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(8).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(8).getNombre() + "Total " + (usuarios.registro.productos.get(8).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(8).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (cantimplorawilson.isSelected()) {
                int unidades = Integer.parseInt(ccantimplorawilson.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(9).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(9).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(9).getNombre() + "Total " + (usuarios.registro.productos.get(9).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(9).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (balonwilson.isSelected()) {
                int unidades = Integer.parseInt(cbalonwilson.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(10).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(10).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(10).getNombre() + "Total " + (usuarios.registro.productos.get(10).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(10).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (muñequeraswilson.isSelected()) {
                int unidades = Integer.parseInt(cmuñequeraswilson.getSelectedItem().toString());
                if (unidades > usuarios.registro.productos.get(11).getCantidad()) {
                    JOptionPane.showMessageDialog(null, "Estas pidieno mas unidades de las que tenemos del producto " + usuarios.registro.productos.get(11).getNombre());
                    sePuede = false;
                } else {
                    res += "Producto " + usuarios.registro.productos.get(11).getNombre() + "Total " + (usuarios.registro.productos.get(11).getPrecio() * unidades) + "\n";
                    total += (usuarios.registro.productos.get(11).getPrecio() * unidades);
                    unidadesT += unidades;
                }
            }
            if (sePuede) {
                area.setText(res);
            } else {
                area.setText("");
            }
        }
        if (ev == btnLimpiar) {
            area.setText("");
        }
    }
}
