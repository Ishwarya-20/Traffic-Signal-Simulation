
public class TrafficSignal {

    public static void main(String[] args) {

        String[] signals = {"RED", "YELLOW", "GREEN"};
        int[] duration = {5, 2, 5};

        System.out.println("================================");
        System.out.println("     TRAFFIC SIGNAL SIMULATION");
        System.out.println("================================");

        for (int cycle = 1; cycle <= 3; cycle++) {

            System.out.println("\nCycle: " + cycle);

            for (int i = 0; i < signals.length; i++) {

                System.out.println("\n------------------------");
                System.out.println("Signal: " + signals[i]);

                if (signals[i].equals("RED")) {
                    System.out.println("STOP!");
                }
                else if (signals[i].equals("YELLOW")) {
                    System.out.println("WAIT!");
                }
                else {
                    System.out.println("GO!");
                }

                for (int time = duration[i]; time > 0; time--) {

                    System.out.println("Time remaining: " + time + " seconds");

                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) {
                        System.out.println("Simulation interrupted.");
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }

        System.out.println("\nSimulation Completed!");
    }
}
