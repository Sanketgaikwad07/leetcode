class quick{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the the value a: );
    double a=sc.nextdouble();
    System.out.println(Enter the value the of b:);
    double b=sc.nextdouble();
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();

    //check condition

    if(n%3!=0){
      System.out.println("should occur error");
    }
    //formula

    double h=a-b/n;

    double resule=f(a)+f(b);//simpson rule

    for(int i=0;i<n;i++){
      double x=a+i*h;
      if(i%3==0){
        result+=2*f(x);
      }else{
        result+=3*f(x);
      }
    }
    result=((3*h)/8)*result;
    System.out.println("The final result is:" result);
  }
}

    
    
    
