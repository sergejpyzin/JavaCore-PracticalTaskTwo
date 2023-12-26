public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 3, 4};
        System.out.println(countEvens(arr));
        System.out.println(diffMinMaxElements(arr));
    }

    public static int countEvens (int[] someArray){
        int count = 0;
        for (int j : someArray) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int diffMinMaxElements (int [] someArray) {
        int minElem = someArray[0], maxElem = someArray[0], result = 0;
        for (int i = 1; i < someArray.length; i++){
            if (someArray[i] < minElem){
                minElem = someArray[i];
            } else if (someArray[i] > maxElem){
                maxElem = someArray[i];
            }
        }
        result = maxElem - minElem;
        return result;
    }

}
