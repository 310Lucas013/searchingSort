public class Printer {

    public void print(int[] objects) {
        int n = objects.length;
        for (int i=0; i<n; ++i)
            System.out.print(objects[i] + " ");
        System.out.println();
    }
}
