public class BubbleSort {
    private Printer printer;

    public BubbleSort() {
        printer = new Printer();
    }

    public void sort(int[] objects) {
        int n = objects.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (objects[j] > objects[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = objects[j];
                    objects[j] = objects[j+1];
                    objects[j+1] = temp;
                    printer.print(objects);
                }
    }

}
