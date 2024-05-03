import java.util.Scanner;

class MainPaciente {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        String nombre, apellido;
        int nss;
        Paciente x = new Paciente();
        System.out.println("cual es tu nombre");
        nombre = op.next();
        x.setNombre(nombre);

        System.out.println("cual es tu apellido");
        apellido = op.next();
        x.setApellido(apellido);

        System.out.println("cual es tu nss");
        nss = op.nextInt();
        x.setNss(nss);

        System.out.println(x);

    }

}