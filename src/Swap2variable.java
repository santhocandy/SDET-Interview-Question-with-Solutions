
public class Swap2variable {
    public static void main(String[] args) {
        int x = 201;
        int y = 529;

        System.out.println("Before Swap");
        System.out.print("X = "+x+" ");
        System.out.println("Y = "+y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap ");
        System.out.print("X = "+x+" ");
        System.out.println("Y ="+y);
    }
}
