public class Activator {

    private int a = 5;
    private int b = 9;

    public void start() {
        int result = a * b;
        System.out.println("Starting the bundle");
        System.out.println("La multiplicación de " + a + "x" + b + " es: " + result);
    }

    public void stop() {
        System.out.println("Stopping the bundle");
    }

    public static void main(String[] args) {
        Activator activator = new Activator();
        activator.start();
        activator.stop();
    }
}
