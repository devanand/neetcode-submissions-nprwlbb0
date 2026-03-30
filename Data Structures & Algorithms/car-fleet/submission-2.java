class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int carCount = position.length;
        double[][] cars = new double[carCount][2];
        
        for (int i = 0; i < carCount; i++) {
            int carPosition = position[i];
            int carSpeed = speed[i];

            cars[i][0] = carPosition;
            cars[i][1] = (double)(target - carPosition) / carSpeed;
        }
        
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        
        int fleets = 0;
        double slowestTime = 0;
        for (int i = 0; i < carCount; i++) {
            double carTime = cars[i][1];
            if (carTime > slowestTime) {
                fleets++;
                slowestTime = carTime;
            }
        }
        return fleets;   
    }
}
