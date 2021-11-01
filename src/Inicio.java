
import com.sun.prism.paint.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inicio extends JFrame implements ActionListener {

    JLabel titulo = new JLabel("Tienda de deportes", (int) JFrame.CENTER_ALIGNMENT);
    JLabel usuario = new JLabel("Tipo de Usuario");
    JButton entrar = new JButton("Entrar");
    JButton limpiar = new JButton("Limpiar");
    JButton salir = new JButton("Salir");
    JLabel noC = new JLabel("No Control:");
    JLabel clave = new JLabel("Clave:          ");
    JTextField tNoControl = new JTextField(10);
    JPasswordField tclave = new JPasswordField(10);
    String nombre[] = {"Administrador", "Cliente", "Vendedor"};
    JComboBox combo = new JComboBox(nombre);

    public Inicio() {
        super("Inicio");
        usuarios.recuperarListas();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        entrar.addActionListener(this);
        limpiar.addActionListener(this);
        salir.addActionListener(this);
        setSize(240, 180);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(titulo, BorderLayout.NORTH);
        titulo.setForeground(java.awt.Color.WHITE);
        titulo.setFont(new Font("Tahoma", 0, 24));

        JPanel panel2 = new JPanel();
        panel2.add(usuario);
        usuario.setForeground(java.awt.Color.WHITE);
        panel2.add(combo);
        panel2.add(noC);
        noC.setForeground(java.awt.Color.WHITE);
        panel2.add(tNoControl);
        panel2.add(clave);
        clave.setForeground(java.awt.Color.WHITE);
        panel2.add(tclave);
        entrar.setSize(200, 200);
        panel2.add(entrar);
        panel2.add(limpiar);
        panel2.add(salir);
        panel.add(panel2, BorderLayout.CENTER);
        panel.setBackground(java.awt.Color.BLACK);
        panel2.setBackground(java.awt.Color.BLACK);
        setContentPane(panel);

        show();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Inicio n = new Inicio();
    }
    public static int pos;

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == entrar) {
            String tusuario = combo.getSelectedItem().toString();

            if (tusuario.equals("Administrador")) {

                if (tNoControl.getText().equals("") || tclave.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Te falto llenar algun campo", "Advertencia", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (usuarios.registro.empleados.get(0).getNoControl().equals(tNoControl.getText())) {
                        System.out.println(usuarios.registro.empleados.get(0).getClave());
                        if (usuarios.registro.empleados.get(0).getClave().equals(tclave.getText())) {
                            Admin_inicio llamar = new Admin_inicio();
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "La Clave no es la correcta para ese usuario", "Advertencia", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ese NoControl no esta registrado", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            if (tusuario.equals("Vendedor")) {
                if (tNoControl.getText().equals("") || tclave.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Te falto llenar algun campo");
                } else {

                    for (int i = 0; i < usuarios.registro.empleados.size(); i++) {
                        if ((usuarios.registro.empleados.get(i).getNoControl().equals(tNoControl.getText())) && usuarios.registro.empleados.get(i).getTipoUsuario().equals("Vendedor")) {
                            pos = i;
                        }
                    }
                    if (usuarios.registro.empleados.get(pos).getNoControl().equals(tNoControl.getText()) && usuarios.registro.empleados.get(pos).getTipoUsuario().equals("Vendedor")) {
                        System.out.println(usuarios.registro.empleados.get(pos).getClave());
                        if (usuarios.registro.empleados.get(pos).getClave().equals(tclave.getText())) {
                            Vendedores llamar = new Vendedores();
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "La Clave no es la correcta para ese usuario", "Advertencia", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ese NoControl no esta registrado", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            if (tusuario.equals("Cliente")) {
                if (tNoControl.getText().equals("") || tclave.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Te falto llenar algun campo");
                } else {

                    for (int i = 0; i < usuarios.registro.clientes.size(); i++) {
                        if (usuarios.registro.clientes.get(i).getNoControl().equals(tNoControl.getText())) {
                            pos = i;
                        }
                    }
                    if (usuarios.registro.clientes.get(pos).getNoControl().equals(tNoControl.getText())) {
                        System.out.println(usuarios.registro.clientes.get(pos).getClave());
                        if (usuarios.registro.clientes.get(pos).getClave().equals(tclave.getText())) {
                            Clientes_vista llamar = new Clientes_vista();
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "La Clave no es la correcta para ese usuario", "Advertencia", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ese NoControl no esta registrado", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        if (obj == salir) {
            int op = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas Salir", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (op == 0) {
                System.exit(0);
            }
        }
        if (obj == limpiar) {
            tNoControl.setText("");
            tclave.setText("");
        }
    }

}
