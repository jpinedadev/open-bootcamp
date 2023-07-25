public class Main{
    public static void main(String[] args){
        suma(2,3,4);

        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a,int b,int c){
        System.out.println("Suma es: "+ (a+b+c));
    }

}
class Coche{
    int puertas=0;
    public void agregarPuertas(){ 
            this.puertas++; 
        }
}