import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Forma cilindro = new Cilindro(10, 20, 5, 10);
        Forma circulo = new Circulo(1, 2, 3);

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(circulo);
        formas.add(cilindro);

        for(Forma f : formas){
            System.out.println(f.getClass().getSimpleName());
            System.out.println(f);
            System.out.println("Área = " + f.calcularArea());
            if(f instanceof Cilindro){
                System.out.println("Volume = "+ ((Cilindro)f).calcularVolume());
            }
            System.out.println("---------------------------------");
        }



    }
}
