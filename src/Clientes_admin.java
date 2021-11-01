
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Clientes_admin extends JFrame implements ActionListener {

    JLabel titulo1 = new JLabel("Registrar");
    JLabel nombre = new JLabel("Nombre: ");
    JTextField tNombre = new JTextField();
    JLabel apellidos = new JLabel("Apellidos: ");
    JTextField tApellidos = new JTextField();
    JLabel sexo = new JLabel("Sexo: ");
    JRadioButton sMasculino = new JRadioButton("Maculino", true);
    JRadioButton sFemenino = new JRadioButton("Femenino", false);

    DefaultTableModel modelo;
    JLabel fecha = new JLabel("Fecha: ");
    JComboBox cdia, cmes, caño;
    JLabel dia = new JLabel("Dia");
    JLabel mes = new JLabel("Mes");
    JLabel año = new JLabel("Año");
    JButton btnRegistrar = new JButton("Registrar");
    JButton btnLimpiar = new JButton("Limpiar");
    JButton btnSalir = new JButton("Salir");
    JScrollPane scroll = new JScrollPane();
    JTable tabla = new JTable();
    JLabel informacion = new JLabel("Información de clientes");
    JLabel clave = new JLabel("Clave: ");
    JTextField tclave = new JTextField();
    JButton btnBuscar = new JButton("Buscar");
    JButton btnEliminar = new JButton("Eliminar");
    JLabel informacion2 = new JLabel("Operaciones que se pueden efectuar");

    void agregarTabla(String cero, String uno, String dos, String tres, String cuatro, String cinco, String seis, String siete) {
        String vector[] = new String[8];
        vector[0] = cero;
        vector[1] = uno;
        vector[2] = dos;
        vector[3] = tres;
        vector[4] = cuatro;
        vector[5] = cinco;
        vector[6] = seis;
        vector[7] = siete;

        modelo.addRow(vector);
    }

    void cargar(String buscar) {

        limpiartabla();
        if (buscar.equals("")) {
            System.out.println("Entra");
            for (int i = 0; i < usuarios.registro.clientes.size(); i++) {
                if (usuarios.registro.clientes.get(i).getTipoUsuario().equals("Cliente")) {
                    agregarTabla(usuarios.registro.clientes.get(i).getNoControl(),
                            usuarios.registro.clientes.get(i).getClave(),
                            usuarios.registro.clientes.get(i).getNombre(),
                            usuarios.registro.clientes.get(i).getApellidos(),
                            usuarios.registro.clientes.get(i).getSexo(),
                            usuarios.registro.clientes.get(i).getDia(),
                            usuarios.registro.clientes.get(i).getMes(),
                            usuarios.registro.clientes.get(i).getAño()
                    );
                }
            }
        } else {
            int pos = 0;
            for (int i = 0; i < usuarios.registro.clientes.size(); i++) {
                if ((tclave.getText().equals(usuarios.registro.clientes.get(i).getNoControl())) && usuarios.registro.clientes.get(i).getTipoUsuario().equals("Cliente")) {
                    pos = i;
                    break;
                }
            }
            if (usuarios.registro.clientes.get(pos).getNoControl().equals(tclave.getText()) && usuarios.registro.clientes.get(pos).getTipoUsuario().equals("Cliente")) {
                agregarTabla(usuarios.registro.clientes.get(pos).getNoControl(),
                        usuarios.registro.clientes.get(pos).getClave(),
                        usuarios.registro.clientes.get(pos).getNombre(),
                        usuarios.registro.clientes.get(pos).getApellidos(),
                        usuarios.registro.clientes.get(pos).getSexo(),
                        usuarios.registro.clientes.get(pos).getDia(),
                        usuarios.registro.clientes.get(pos).getMes(),
                        usuarios.registro.clientes.get(pos).getAño());
            } else {
                JOptionPane.showMessageDialog(null, "Ese NoControl no esta registrado con los vendedores", "Advertencia", JOptionPane.ERROR_MESSAGE);
                cargar("");
            }
        }
    }

    void limpiartabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public Clientes_admin() {
        super("Administracion Clientes");
        String dias[] = new String[31];
        for (int i = 0; i < 31; i++) {
            dias[i] = Integer.toString(i + 1);
        }
        String mess[] = new String[12];
        for (int i = 0; i < 12; i++) {
            mess[i] = Integer.toString(i + 1);
        }
        String años[] = new String[39];
        for (int i = 0; i < 39; i++) {
            años[i] = Integer.toString(i + 1960);
        }
        cdia = new JComboBox(dias);
        cmes = new JComboBox(mess);
        caño = new JComboBox(años);

        setSize(850, 500);
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/fondoC.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        btnRegistrar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnSalir.addActionListener(this);
        String nombres[] = {"NoControl", "Clave", "Nombre", "Apellidos", "Sexo", "Dia", "Mes", "Año"};
        modelo = new DefaultTableModel(null, nombres);
        cargar("");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(sMasculino);
        grupo.add(sFemenino);

        titulo1.setBounds(90, 20, 54, 14);
        getContentPane().add(titulo1);
        nombre.setBounds(30, 70, 54, 14);
        getContentPane().add(nombre);
        tNombre.setBounds(90, 70, 120, 20);
        getContentPane().add(tNombre);
        apellidos.setBounds(30, 110, 60, 14);
        getContentPane().add(apellidos);
        tApellidos.setBounds(90, 110, 120, 20);
        getContentPane().add(tApellidos);
        sexo.setBounds(30, 150, 38, 14);
        getContentPane().add(sexo);
        sFemenino.setBounds(180, 150, 93, 23);
        sFemenino.setOpaque(false);
        getContentPane().add(sFemenino);
        sMasculino.setBounds(80, 150, 93, 23);
        sMasculino.setOpaque(false);
        getContentPane().add(sMasculino);

        fecha.setBounds(30, 250, 110, 14);
        getContentPane().add(fecha);
        cdia.setBounds(150, 250, 56, 20);
        getContentPane().add(cdia);
        cmes.setBounds(220, 250, 56, 20);
        getContentPane().add(cmes);
        caño.setBounds(290, 250, 56, 20);
        getContentPane().add(caño);
        dia.setBounds(160, 230, 19, 14);
        getContentPane().add(dia);
        mes.setBounds(220, 230, 26, 14);
        getContentPane().add(mes);
        año.setBounds(290, 230, 23, 14);
        getContentPane().add(año);
        btnRegistrar.setBounds(50, 320, 100, 23);
        getContentPane().add(btnRegistrar);
        btnLimpiar.setBounds(160, 320, 85, 23);
        getContentPane().add(btnLimpiar);
        btnSalir.setBounds(270, 320, 63, 23);
        getContentPane().add(btnSalir);

        tabla.setModel(modelo);
        scroll.setViewportView(tabla);
        scroll.setBounds(380, 110, 452, 348);
        getContentPane().add(scroll);

        informacion.setBounds(520, 84, 250, 14);
        getContentPane().add(informacion);
        clave.setBounds(480, 50, 51, 14);
        getContentPane().add(clave);
        informacion2.setBounds(510, 10, 210, 14);
        getContentPane().add(informacion2);
        tclave.setBounds(520, 50, 130, 20);
        getContentPane().add(tclave);
        btnBuscar.setBounds(680, 30, 85, 23);
        getContentPane().add(btnBuscar);
        btnEliminar.setBounds(680, 70, 89, 23);
        getContentPane().add(btnEliminar);

        this.show();
    }

    public void actionPerformed(ActionEvent e) {
        Object ev = e.getSource();
        if (ev == btnBuscar) {
            if (tclave.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Asegurate de ingresar algo en la caja de texto", "Advertencia", JOptionPane.ERROR_MESSAGE);
            } else {
                cargar(tclave.getText());
            }
        }
        if (ev == btnEliminar) {
            if (tclave.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Asegurate de ingresar algo en la caja de texto", "Advertencia", JOptionPane.ERROR_MESSAGE);
            } else {
                int pos = 0;
                boolean esta=true;
                for (int i = 0; i < usuarios.registro.clientes.size(); i++) {
                    if (usuarios.registro.clientes.get(i).getNoControl().equals(tclave.getText()) && usuarios.registro.clientes.get(i).getTipoUsuario().equals("Cliente")) {
                        pos = i;
                        int op = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar este usuario?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (op == 0) {
                            usuarios.registro.clientes.remove(pos);
                            cargar("");
                            usuarios.registro.guardar();
                            JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
                            esta=true;
                            break;
                        }else{
                            esta=true;
                            break;
                        }
                    } else {
                            esta=false;
                        }
                }
                 if(esta==false){
                     JOptionPane.showMessageDialog(null,"Esee registro no esta registrado","Advertencia",JOptionPane.ERROR_MESSAGE);
                 }
            }
        }
        if (ev == btnLimpiar) {
            tNombre.setText("");
            tApellidos.setText("");
            tclave.setText("");
        }
        if (ev == btnRegistrar) {
            if (tNombre.getText().equals("") || tApellidos.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Te falto introducir o seleccionar algún dato", "Advertencia", JOptionPane.ERROR_MESSAGE);
            } else {
                String nombre = tNombre.getText().toUpperCase();
                String apellidos = tApellidos.getText().toUpperCase();
                String sexo = "";
                if (sMasculino.isSelected()) {
                    sexo = sMasculino.getText();
                }
                if (sFemenino.isSelected()) {
                    sexo = sFemenino.getText();
                }
                String dia = cdia.getSelectedItem().toString();
                String mes = cmes.getSelectedItem().toString();
                String año = caño.getSelectedItem().toString();
                Calendar cal = Calendar.getInstance();
                usuarios.registro.contadorC++;
                String subnocontrol = "" + (Integer.toString(cal.get(Calendar.YEAR)).substring(2, 4)) + "" + (año.substring(2, 4)) + usuarios.registro.contadorC;
                String subclave = "" + nombre.charAt(0) + "" + apellidos.charAt(0) + usuarios.registro.contadorC;

                clientes n1 = new clientes(subnocontrol, subclave, nombre, apellidos, sexo, dia, mes, año, 0f, "Cliente", 0f, "");
                usuarios.registro.clientes.add(n1);
                usuarios.registro.guardar();

                cargar("");
                JOptionPane.showMessageDialog(null, "Usuario guardado con exito");
                tNombre.setText("");
                tApellidos.setText("");
            }
        }
        if (ev == btnSalir) {
            this.dispose();
        }
    }
}
