import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2
        Test Data:
        array = 50, -20, 0, 30, 40, 60, 10

        Sample Output:
        false
        */
        int[] arr1 = {50, -20, 0, 30, 40, 60, 10};
        if (arr1[0] == arr1[arr1.length - 1]) {
            System.out.println("true");
        } else System.out.println("false");

        /*
        2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
            Original Array:
            [1, 4, 17, 7, 25, 3, 100]

            Expected Output:
            3 largest elements of the said array are: 100 25 17
         */
        int[] arr2 = {1, 4, 17, 7, 25, 3, 100};
        Arrays.sort(arr2);
        int one = arr2[arr2.length - 1];
        int two = arr2[arr2.length - 2];
        int three = arr2[arr2.length - 3];
        System.out.println("3 largest elements of the said array are:" + one + " " + two + " " + three);

        /*
        3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
            Original Array:
            [1, 4, 17, 7, 25, 3, 100]

            Expected Output:
            The average of the said array is: 22.0 The numbers in the said array that are greater than the average are: 25 100
         */
        int[] arr3 = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        ArrayList<Integer> avgArr = new ArrayList<Integer>();
        for (int i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }
        float avg = sum / arr3.length;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > avg) {
                avgArr.add(arr3[i]);
            }
        }
        System.out.println("The average of the said array is:" + avg + " The numbers in the said array that are greater than the average are: " + avgArr.toString());

        /*
        4.Write a Java program to get the larger value between first and last element of an array of integers.
            Original Array:
            [20, 30, 40]

            Sample Output:
            Larger value between first and last element: 40
         */
        int[] arr4 = {20, 30, 40};
        if (arr4[0] > arr4[arr4.length - 1]) {
            System.out.println("Larger value between first and last element: " + arr4[0]);
        } else {
            System.out.println("Larger value between first and last element: " + arr4[arr4.length - 1]);
        }

        /*
        5.Write a Java program to swap the first and last elements of an array and create a new array.
            Original Array:
            [20, 30, 40]

            Sample Output:
            New array after swapping the first and last elements: [40, 30, 20]
         */
        int[] arr5 = {20, 30, 40};
        int temp = 0;
        temp = arr5[0];
        arr5[0] = arr5[arr5.length - 1];
        arr5[arr5.length - 1] = temp;
        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(arr5));

            /*
            6.Write a Java program to find all of the longest word in a given dictionary.
                Example:
                { "cat", "dog", "red", "is", "am" }

                Result: "cat", "dog", "red"
             */
        String[] arr6 = {"cat", "dog", "red", "is", "am"};
        int counter = 0;
        ArrayList<String> longArr = new ArrayList<String>();
        int max = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (i + 1 >= arr6.length) {
                break;
            } else if (arr6[i].length() > arr6[i + 1].length()) {
                max = arr6[i].length();
            }

        }
        System.out.println("Max " + max);
        for (int i = 0; i < arr6.length; i++) {
//            for (int j = 0; j < arr6[i].length(); j++) {
//                counter++;
//            }
            if (arr6[i].length() >= max) {
                longArr.add(arr6[i]);
            }
        }
        System.out.println("Result: " + longArr.toString());

        /*
        7.Write a menu driven Java program with following option:
            a. Accept elements of an array

            b. Display elements of an array

            c. Search the element within array

            d. Sort the array

            the size of the array should be entered by the user.
                     */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arrMenu = new int[size];
        boolean inWhile = true;
        boolean arrIsUsed = false;
        while (inWhile) {
            System.out.println("Menu:");
            System.out.println("a. Accept elements of an array");
            System.out.println("b. Display elements of an array");
            System.out.println("c. Search the element within array");
            System.out.println("d. Sort the array");
            System.out.println("0 to exit");
            System.out.print("Enter your choice: ");
            char choice = input.next().toCharArray()[0];
            switch (choice) {
                case '0':
                    inWhile = false;
                    break;
                case 'a':

                    if(!arrIsUsed) {
                        System.out.println("Enter " + arrMenu.length + " elements:");
                        for (int i = 0; i < arrMenu.length; i++) {
                            arrMenu[i] = input.nextInt();
                        }
                        arrIsUsed = true;
                        break;
                    }else {
                     System.out.println("Array is already filled");
                        break;
                    }
                case 'b':
                    if(arrMenu.length == 0){
                        System.out.println("Array is empty ");
                        break;
                    }else {
                        System.out.print("Elements of the array are: ");
                        for (int i : arrMenu) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 'c':
                    if(arrMenu.length == 0){
                        System.out.println("Array is empty ");
                        break;
                    }else {
                        System.out.print("Enter the element to search: ");
                        int element = input.nextInt();
                        boolean found = false;
                        for (int i : arrMenu) {
                            if (i == element) {
                                found = true;
                                break;
                            }
                        }

                        if (found) {
                            System.out.println("Element found in the array.");
                        } else {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;
                case 'd':
                    if(arrMenu.length == 0){
                        System.out.println("Array is empty ");
                        break;
                    }else {
                        Arrays.sort(arrMenu);
                        System.out.println("Array has been sorted.");
                        break;
                    }
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


          /*
        8. Write a program thats displays the number of occurrences of an element in the array.
                Original Array:
                [1,1,1,3,3,5]

                Sample Output:
                3 occurs 2 times

                1 occurs 3 times

                9 occurs 0 time
         */
        System.out.println();
        int[] arr7 = {1,1,1,3,3,5};
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : arr7) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
        }
        for (int key : count.keySet()) {
            System.out.println(key + " occurs " + count.get(key) + " times");
        }

        /*
        9. Write a program that places the odd elements of an array before the even elements.
                Original Array:
                [2,3,40,1,5,9,4,10,7]

                Sample Output:
                [3,1,5,9,7,2,40,4,10]
         */
        int[] arr8 = {2,3,40,1,5,9,4,10,7};
        int left = 0;
        int right = arr8.length - 1;
        while (left < right) {
            while (arr8[left] % 2 != 0 && left < right) {
                left++;
            }
            while (arr8[right] % 2 == 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp2 = arr8[left];
                arr8[left] = arr8[right];
                arr8[right] = temp2;
                left++;
                right--;
            }
        }
        System.out.println("Array after separating odd and even elements: ");
        System.out.println(Arrays.toString(arr8));

        /*
        10. Write a program that test the equality of two arrays.
                [2,3,6,6,4] [2,3,6,6,4]

                Sample Output:
                true
         */
        int[] arr9 = {2, 3, 6, 6, 4};
        int[] arr10 = {2, 3, 6, 6, 4};
        if(arr9.length != arr10.length){
            System.out.println("They don't have the same size can't compare");
        }
        else if(Arrays.equals(arr9, arr10)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
    }




