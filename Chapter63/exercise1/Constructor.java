class Weight {
    private int[] data;

    //Constructor
    

    //Print
    public static void toString(int[] init) {
        for(int i = 0; i < init.length; i++) {
            System.out.println(init[i]);
        }
    }

    public static double average(int[] init) {
        double sum = 0.0;

        for (int i = 0; i < init.length; i++) {
            sum = sum + init[i];
        }
        return sum / init.length;
    }

    public static double averageRange(int[] init, int start, int end) {
        double sum = 0.0;
        if (end > init.length) {
            return 0.0;
        }
        for (int i = start; i <= end; i++) {
            sum = sum + init[i];
        }

        return sum / (end - start + 1);
    }
}