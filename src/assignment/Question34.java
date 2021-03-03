package assignment;

public class Question34 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9};

        //array reverse
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[arr.length-1-i] = arr[i];
        }

        //print the array
        for(int num: result)
            System.out.println(num);
    }
}
