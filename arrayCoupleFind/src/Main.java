import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] couple = {1, 6, 7, 2, 8, 9, 11, 33, 44};
        int[] coupleNumber = new int[couple.length];
        int coupleCounter = 0;
        for(int i = 0; i < couple.length; i++){
            if(couple[i] % 2 == 0){
                coupleNumber[coupleCounter++] = couple[i];
            }
        }
        for(int value: coupleNumber){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}