package TeachMeSkills;

public class MultiArrays21 {
    public static void main(String[] args) {
        String B = "B";
        String W = "W";

        String[][] mas = new String[8][8];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if ((i + j) % 2 == 0 ){ mas[i][j] = B;
                 System.out.print(" " + mas[i][j]);}
                else { mas[i][j] = W;

                System.out.print(" " + mas[i][j]);}

            }
            System.out.println();
        }
    }
}