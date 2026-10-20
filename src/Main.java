public class Main{
    public static void main(String[] args) {
        sensor s = new sensor();
        s.setValorMinimo(0.0);
        s.setValorMaximo(100.0);

        s.actualizarLectura(45.5);
        System.out.println("Lectura válida: " + s.getLectura());

        s.actualizarLectura(150.0); // Fuera de rango, se ignora
        System.out.println("Lectura tras valor fuera de rango: " + s.getLectura());
    }
}