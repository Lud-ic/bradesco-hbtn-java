public class Consumidor extends Thread {
    private final Fila fila;

    public Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int numero = fila.retirar();
                System.out.println("Consumidor " + this.getId() + " consumiu: " + numero);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumidor interrompido");
        }
    }
}
