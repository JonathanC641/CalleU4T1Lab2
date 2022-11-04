public class WhileLoopFun {
    /**This class has no instance variables, so we can either include no constructor,
     or this simple no-parameter constructor, which is actually preferred practice
     over omitting the constructor entirely
     */
    public WhileLoopFun() { }

    public void printDigits(int number) {
        String numbers = "" + number;
        int count = numbers.length();
        int count2 = count -1;
        while (count != 0){
            System.out.print(numbers.substring(count2,count) + "\n");
            count--;
            count2--;
        }
    }


    public int countLetter(String word, String letter) {
        int count = 0;
        while(word.contains(letter)){
            word = word.substring(0,word.lastIndexOf(letter));
            count++;
        }
        return count;
    }

    /*Precondition: number > 0, threshold > 0*/
    public int maxDoubles(int number, int threshold) {
        int count = 0;
        while(number <= threshold) {
            number *= 2;
            count++;
        }
        if (count == 0){
            return count;
        }else{
            return count-1;
        }
    }

    public boolean isPrime(int number) {
        int result = 0;
        int count = 0;
        int value = 1;
        while(value <= number){
            result = number % value;
            if(result == 0){
                count++;
            }
            value++;
        }
        return count == 2;
    }
}
