public class Activator {

    private int a = 2;
    private int b = 4;

    public void start() {
        int result = a;
        int i = 0;
        while (i < b-1)
        {
            result *= a;
            i++;
        }
        System.out.println("Starting the bundle");
        System.out.println(" " + a + "^" + b + " es: " + result);
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

