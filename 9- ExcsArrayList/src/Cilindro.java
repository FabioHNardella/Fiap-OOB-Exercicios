public class Cilindro extends Forma implements Volume{
    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 1;
    }

    @Override
    public double calcularVolume() {
        return 1;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Altura: "+ altura;
        return aux;
    }
}

