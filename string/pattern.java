import java.util.*;
import java.util.Scanner;
public class butterFly{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc,newxtInt();

//upper side
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
}
//space
int spaces=2*(n-1)
for(int j=1;j<=spaces;j++){
System.out.print(" ");
}

//2nd side
for(int j=1;j<=i;j++){
System.in.print("*");
}
System.out.println();
}
//lower side

//upper side
for(int i=n;i>=1;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
}
//space
int spaces=2*(n-1)
for(int j=1;j<=spaces;j++){
System.out.print(" ");
}

//2nd side
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.in.print("*);
}
System.out.println();
}
