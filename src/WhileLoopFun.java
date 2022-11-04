public class WhileLoopFun {
    /**This class has no instance variables, so we can either include no constructor,
     or this simple no-parameter constructor, which is actually preferred practice
     over omitting the constructor entirely
     */
    public WhileLoopFun() { }

    /**Prints the individual digits in number separately, starting with the rightmost digit first, on separate lines.
     Example:  If number is 361, this methods prints 1, then 6, then 3 (on separate lines)
     Example:  If number is 150856, this methods prints 6, then 5, then 8, then 0, then 5, then 1 (on separate
     lines)
     */
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

    /** Returns the number of times letter occurs in word.
     Example:  If word is "apple" and letter is "p",  this methods returns 2
     Example:  If word is "excellente" and letter is "e",  this methods returns 4

     PRECONDITION: letter has length 1
     Note!  This could arguably be done easier with a for loop, so if you already know how to use for loops,
     try it this time using a while loop!
     */
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
        int ogvalue = number;
        while(number < threshold && (threshold - number != ogvalue)){
            number *= 2;
            count++;
        }
        return count;
    }

    public boolean isPrime(int number) {
        if(number == 1){
            return false;
        }else{
            return true;
        }
    }





}
