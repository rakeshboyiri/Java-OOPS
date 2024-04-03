class TrafficLightSimulation {
    private static final String[] COLORS = {"Red", "Yellow", "Green"};
    private volatile boolean isRunning = true;
    private int currentIndex = 0;

    public void simulateTrafficLight() {
        Thread lightThread = new Thread(() -> {
            while (isRunning) {
                String currentColor = COLORS[currentIndex];
                System.out.println("Traffic Light: " + currentColor);
                try {
                    Thread.sleep(1000); // Wait for 10 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                currentIndex = (currentIndex + 1) % COLORS.length;
            }
        });
        lightThread.start();

        // Let the simulation run for a certain time, for example, 40 seconds
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the simulation
        isRunning = false;
        try {
            lightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TrafficLightSimulation trafficLightSimulation = new TrafficLightSimulation();
        trafficLightSimulation.simulateTrafficLight();
    }
}
