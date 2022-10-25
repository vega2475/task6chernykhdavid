public class Solution {
    //function for set values
    public static void solution(double x, double e, int n, Storage storage){
        storage.sumE = 0;
        storage.sumN = 0;
        storage.sumE10 = 0;
        int numerator = 1;
        int denominator = 2;
        int elementIndex = 0;
        double currentElement = 0;


        while(true){
            if(elementIndex == 0) {
                // 1-st element = 1 (const)
                currentElement = 1;
            } else {
                // determine the next term based on the past
                currentElement = currentElement * (x) * numerator / denominator * (x);//next term: (previous term) * fraction * x²
                numerator += 2;
                denominator += 2;
            }
            if(elementIndex < n) {
                storage.sumN += currentElement;
            }
            if(Math.abs(currentElement) > e) {
                storage.sumE += currentElement;
            }
            if (Math.abs(currentElement) > e/10) {
                storage.sumE10 += currentElement;
            }
            if (elementIndex >= n && Math.abs(currentElement) < e/10) {
                break;
            }
            elementIndex++;
        }
    }
}