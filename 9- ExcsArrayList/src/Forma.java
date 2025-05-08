public abstract class Forma {
    private int coordenadaX;
    private int coordenadaY;
    private double raio;

    public Forma(int coordenadaX, int coordenadaY, double raio) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.raio = raio;
    }

    public abstract double calcularArea();
    public abstract double calcularVolume();

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }



    @Override
    public String toString() {
        String aux = "";
        aux += "Coordenada X: " + coordenadaX + "\n";
        aux += "Coordenada Y: " + coordenadaY + "\n";
        aux += "Raio: " + raio;
        return aux;


    }
}
