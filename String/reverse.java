class revese{
  static void revesestring(char[]arr){
    int n=arr.length;
    int i=0;
    int j=n-1;

  while(i<=j){

    char temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
  }
    return;
  }
  public static void main(String[]args){
    String str="sanket";
    char[]ch=str.toArray();
    reversestring(str);
    System.out.println(String.valueOf(ch));
  }
}
