public class Main {
    public static void main(String args[]) {
        Printer printer = new Printer();

        System.out.println("Bubblesort");
        BubbleSort bs = new BubbleSort();
        int bubblArr[] = {64, 34, 25, 12, 22, 11, 90};
        bs.sort(bubblArr);
        printer.print(bubblArr);

        System.out.println("HeapSort");
        HeapSort hs = new HeapSort();
        //int heapArr[] = {12, 11, 13, 5, 6, 7};
        int heapArr[] = {64, 34, 25, 12, 22, 11, 90};
        hs.sort(heapArr);
        printer.print(heapArr);

        System.out.println("CycleSort");
        CycleSort cs = new CycleSort();
        int cycleArr[] = {64, 34, 25, 12, 22, 11, 90};
        cs.sort(cycleArr);
        printer.print(cycleArr);
    }
}
