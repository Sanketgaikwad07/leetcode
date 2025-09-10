class solution{
  public static void main(String[]args){
    int[]arr1={1,2,3,4,5};
    int arr2={5,4,3,21,3};

  int arr3[]=new int[1];
    int sum=0;

  for(int i:arr1){
    i+=sum;
  }
    for(int j:arr2){
      j+=sum;
    }
    arr3[]+=sum;
    System.out.print(arr3[0]);
  }
}
