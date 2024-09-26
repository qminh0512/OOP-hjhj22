public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int minVal = Math.min(a, Math.min(b, c));
        int maxVal = Math.max(a, Math.max(b, c));

        System.out.println(minVal);
        if(a != minVal && a != maxVal) System.out.println(a);
        if(b != minVal && b != maxVal) System.out.println(b);
        if(c != minVal && c != maxVal) System.out.println(c);
        System.out.println(maxVal);
    }
}
