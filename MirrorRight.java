public class MirrorRight {
    public static void main(String[] args) {
        int range = 5;
        for(int row = 0; row<=range-1; row++){
            // space
            for(int space = 1; space<=range-row; space++){
                System.out.print(" ");
            }
            int odd = row * 2 + 1;
            // STAR
            for(int star = 1; star<=odd; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        // int range = 5;
        // for(int row = 1; row<=range; row++){
        //     // space
        //     for(int space = 1; space<=range-row; space++){
        //         System.out.print(" ");
        //     }
        //     // STAR
        //     for(int star = 1; star<=row; star++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
