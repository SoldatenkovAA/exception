public class Task2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
/*
Варианты исключения в коде:
1) NullPointerException (если массив равен null):
если arr = null
2) NullPointerException:
может возникнуть, если вложенные массивы равны null
3) IndexOutOfBoundsException (выход за пределы массива):
for (int j = 0; j < 5; j++)
4) Переполнение значения int :
sum += val;
5) ClassCastException (неверное преобразование типов):
int val = Integer.parseInt(arr[i][j]);
 */
