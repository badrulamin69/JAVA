package searchinginarray;

public class LinuxSearchInArray {

    public static void main(String[] args) {

        int numbers[] = {50, 60, 22, 45, 78, 52, 63, 9, 52};

        int search = 10;
//
//        boolean status = false;
//
//        for (int index = 0; index < numbers.length; index++) {
//
//            if (numbers[index] == search) {
//                System.out.println("Your searching number found in index " + index);
//                status = true;
//                break;
//            }
//        }
//        if (!status) {
//            System.out.println("Your number is not in this list");
//        }

        System.out.println(        linearSearch(numbers, search));

    }

    //    2nd practice....
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


