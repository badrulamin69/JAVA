
package linearsearchinarray2;

public class LinearSearchInArray2 {

    public static void main(String[] args) {

        int numbers[] = {50, 60, 22, 45, 78, 52, 63, 9, 52};

        int search = 50;

        System.out.println(linearSearch(numbers, search));

    }

    public static int linearSearch(int[] array, int searchNumber) {

        int result = -1;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == searchNumber) {
                result = index;
                break;
            }
        }
        return result;
    }
}
