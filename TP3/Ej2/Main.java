package TP3.Ej2;

public class Main {
    public static void main(String[] args) {
        Personaje target = new Personaje();
        // Sanador otroHealer = new Sanador();
        // target.setTarget(otroHealer);
        // otroHealer.setTarget(target);
        Sanador healer = new Sanador(target);
        Orco dps = new Orco(target);
        // Thread oHeal = new Thread(otroHealer, "otro Sanador");
        Thread heal = new Thread(healer, "Sanador");
        Thread orco = new Thread(dps, "Orco");
        heal.start();
        orco.start();
        // oHeal.start(); //La idea es poder seleccionar personajes para que interactuen concurrentemente
    }                     //En este caso se sincroniza el mismo hilo que esta siendo objetivo, hace objetivo a si mismo pero podria hacer objetivo a otro "personaje"

}
