public class cc {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 6; col++) {
                if (row%2!=0 && col%2==0) {
                    System.out.print("XO");
                }else if(row%2==0 && col%2==0) {
                    System.out.print("OX");
                }
            }
            System.out.println();
        }
    }
}