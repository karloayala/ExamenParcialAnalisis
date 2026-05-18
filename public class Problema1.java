public class Problema1 {
    public static boolean estaOrdenado(int[] arr, int i) {
        if (i== arr.length - 1) {
        return true;}

        if (arr[i] > arr[i+1]) {
            return false;
    }
        return estaOrdenado(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 8};
        int[] arr2 = {1, 4, 2, 8};

        System.out.println(estaOrdenado(arr1, 0));
        System.out.println(estaOrdenado(arr2, 0));
    }
}
