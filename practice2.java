public class practice2 {
    public static void main(String[] args) {
        int total=0;
        for (int row = 1; row <= 7; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
                total++;
            }
            System.out.println();
        }
        System.out.print("the total number of the stars is: "+total);
    }
}

