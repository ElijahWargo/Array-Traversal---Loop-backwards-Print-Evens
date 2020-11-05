class Main {
  public static void main(String[] args) {
   //Create an array of 10 int values (must have both even & odd numbers)
   int[] numbers = {5,10,15,20,25,30,35,40,45,50};
   //Use a For or While loop to loop backwards through array
   for(int i = 9; i>= 0; i--){
     if(numbers[i] % 2 == 0){
       //Only print the value if it is even
       System.out.println(numbers[i]);
      }
    }
  }
}  