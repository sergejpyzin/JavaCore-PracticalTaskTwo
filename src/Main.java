import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 3, 4};
        System.out.println(countEvens(arr));
        System.out.println(diffMinMaxElements(arr));
        System.out.println(hasAdjacentZeros(arr));
    }

    public static int countEvens(int[] someArray) {
        return (int) Arrays.stream(someArray)
                .filter(i -> i % 2 == 0)
                .count();
    }

    public static int diffMinMaxElements(int[] someArray) {
        // Преобразование массива в поток данных, нахождение минимального и максимального элементов
        int minElem = Arrays.stream(someArray).min().orElse(0);
        int maxElem = Arrays.stream(someArray).max().orElse(0);

        return maxElem - minElem;
    }

    public static boolean hasAdjacentZeros(int[] someArray) {
        if (someArray.length < 2 || someArray == null){
            return false;
        }
        for (int i = 0; i < someArray.length -1; i++){
            if (someArray[i] == 0 && someArray[i+1] == 0){
                return true;
            }
        }
        return false;
    }

}
