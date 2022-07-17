import java.util.Scanner;

public class SortedColor {

    static void sortColor(int[] colors) {
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] >= colors[j]) {
                    int tempVar = colors[i];
                    colors[i] = colors[j];
                    colors[j] = tempVar;
                }
            }
        }

        for(int color:colors)
        {
            System.out.print(color+" ");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scan.nextInt();
        int color[] = new int[n];
        System.out.println("Enter array of color code");
        for (int index = 0; index < n; index++) {
            color[index] = scan.nextInt();
        }
        System.out.println("After sorting");
        sortColor(color);
    }
}
