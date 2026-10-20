public class sensor {
    private String nombre;
    private double lectura;
    private double valorMinimo;
    private double valorMaximo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public double getValorMinimo() {
        return this.valorMinimo;
    }

    public void setValorMaximo(double valorMaximo) {
        if (valorMaximo >= this.valorMinimo) {
            this.valorMaximo = valorMaximo;
        }
    }

    public double getValorMaximo() {
        return this.valorMaximo;
    }

    public void setLectura(double lectura) {
        if (lectura >= this.valorMinimo && lectura <= this.valorMaximo) {
            this.lectura = lectura;
        }
    }

    public double getLectura() {
        return this.lectura;
    }

    public void actualizarLectura(double nuevaLectura) {
        if (nuevaLectura >= this.valorMinimo && nuevaLectura <= this.valorMaximo) {
            this.lectura = nuevaLectura;
        }
    }
}
