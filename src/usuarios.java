
import java.io.Serializable;

public class usuarios implements Serializable {

    private String nombre;
    private String noControl;
    private String clave;
    private String apellidos;
    private String sexo;
    private String dia;
    private String mes;
    private String año;
    private float sueldo;
    private String tipoUsuario;

    public static Registro registro;

    public usuarios(String noControl, String clave, String nombre, String apellidos, String sexo, String dia, String mes, String año, float sueldo, String tipoUsuario) {
        this.noControl = noControl;
        this.clave = clave;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.sueldo = sueldo;
        this.tipoUsuario = tipoUsuario;
    }

    public static void recuperarListas() {
        registro = new Registro(false);

        if (usuarios.registro.empleados.isEmpty() && usuarios.registro.clientes.isEmpty() && usuarios.registro.productos.isEmpty()) {
            usuarios.registro.ganancias = 0;
            usuarios.registro.contadorP = 0;
            usuarios.registro.contadorE = 0;
            usuarios.registro.contadorC = 0;
            usuarios n = new usuarios("18980", "BSO", "BERNARDO", "SALINAS JAQUEZ", "Masculino", "3", "10", "1998", 1500f, "Adminitrador");
            usuarios.registro.empleados.add(n);
            usuarios n1 = new usuarios("18981", "CS1", "CARLOS", "SOSA AVAREZ", "Masculino", "3", "10", "1998", 1500f, "Vendedor");
            usuarios.registro.empleados.add(n1);
            clientes n2 = new clientes("18820", "MT0", "MIGUEL", "TORRES MARTINEZ", "Masculino", "3", "10", "1982", 0f, "Cliente", 0f, "");
            usuarios.registro.clientes.add(n2);
            productos n3 = new productos("NT1", "Tenis  Air Max", 4, 1000.50f, "Nike");
            usuarios.registro.productos.add(n3);
            productos n4 = new productos("NC2", "Cantimplora Big Mouth", 5, 100f, "Nike");
            usuarios.registro.productos.add(n4);
            productos n5 = new productos("NB3", "Balon Pitch Team", 5, 340f, "Nike");
            usuarios.registro.productos.add(n5);
            productos n6 = new productos("NM4", "Muñequeras Nike Swoosh", 5, 150f, "Nike");
            usuarios.registro.productos.add(n6);
            productos n7 = new productos("PT1", "Tenis Puma Dare", 5, 900f, "Puma");
            usuarios.registro.productos.add(n7);
            productos n8 = new productos("PC2", "Cantimplora negro/blanco", 5, 102f, "Puma");
            usuarios.registro.productos.add(n8);
            productos n9 = new productos("PB3", "Balon King Force", 5, 150f, "Puma");
            usuarios.registro.productos.add(n9);
            productos n10 = new productos("PM4", "Muñequeras Puma", 5, 100f, "Puma");
            usuarios.registro.productos.add(n10);

            productos n11 = new productos("WT1", "Tenis Wilson Tour Ceptor", 5, 1000f, "Wilson");
            usuarios.registro.productos.add(n11);
            productos n12 = new productos("WC2", "Cantimplora Wilson 2lts", 5, 202f, "Wilson");
            usuarios.registro.productos.add(n12);
            productos n13 = new productos("WB3", "Wilson NCAA", 5, 300f, "Wilson");
            usuarios.registro.productos.add(n13);
            productos n14 = new productos("WM4", "Muñequeras Wilson", 5, 100f, "Wilson");
            usuarios.registro.productos.add(n14);

            productos o1 = new productos("O1", "Tenis Air Max y Balon King force", 5, 200f, "Oferta");
            usuarios.registro.productos.add(o1);
            productos o2 = new productos("O2", "Muñequeras Nike Swoosh  y Cantimplora negro/blanco", 5, 200f, "Oferta");
            usuarios.registro.productos.add(o2);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

}
