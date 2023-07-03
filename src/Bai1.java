public class Bai1 {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if (i < 7) {
                for (int j = 0; j < 39; j++) {
                    if (j < 11) {
                        if (i % 2 == 0 && j % 2 == 0) {
                            System.out.print("*");
                        } else if (i % 2 != 0 && j % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print("=");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < 39; j++) {
                    System.out.print("=");
                }
                System.out.println();
            }
        }
    }
}
