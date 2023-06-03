public class Task3 {

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        int[] array3 = { 1, 2, 3 };
        int[] array4 = { 1, 2, 3, 0, 5 };
        int[] newArray = createArray(array1, array3);
        // try {
        // int[] newArray = createArray(array1, array2);
        // } catch (RuntimeException e) {
        // System.out.println(e.getMessage());
        // }

        // try {
        // int[] newArray = createArray(array1, array3);
        // } catch (RuntimeException e) {
        // System.out.println(e.getMessage());
        // }

        // try {
        // int[] newArray = createArray(array1, array4);
        // } catch (RuntimeException e) {
        // System.out.println(e.getMessage());
        // }
    }

    public static int[] createArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Разные размеры у массивов!");
        }
        int[] newArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("На ноль делить нельзя.");
            }
            newArray[i] = arr1[i] / arr2[i];
        }
        return newArray;
    }
}