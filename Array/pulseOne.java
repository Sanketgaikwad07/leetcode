class pluse{
  public static void main(String[]args){
 int [] digit={1,2,3};
    System.out.println(Arrays.toString(pulseOne(digit)));
  }
  
  static int []pulseOne(int[] digit){
    int n=digit.length;
    for(int i=n-1;i>=0;i--){
      if(digit[i]<9{//check the array no geater then 9
        digit[i]++;//so is incrumnet the 9+1=10 but 1,0 
        return digit;
      }
      digit[1]=0;
    }
    int NewNumbwer=new int [n+1];
    NewNumber[0]=1;
    return NewNumbwer;
  }
}
