class Paciente {
    private String nombre, apellido;
    private int nss;

    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", nss=" + nss + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        if (nss > 0) {
            this.nss = nss;
        } else {
            System.out.println("nss invalido");
        }

    }

    public void mostrarNombre() {
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public void mostrarApellido() {
        System.out.println("Mi apellido es: " + this.apellido);
    }

    public void mostrarNss() {
        System.out.println("Mi nss es: " + this.nss);
    }
}