class solution{
  public static void main(String[]args){
    rever(213);
    System.out.println(revse(123));
  }
  static int revse(int x){
    int i=0;
    while(x!=0){
      
      
      int digit=x%10;
      
if(i>Integer.Max_value/10|| i<Integer.Min_Value/10){
  return  0;
}
      
    i=(i*10)+digit;
      x=x/10;
    }
    retrun i;
  }
}
