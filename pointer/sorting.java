import java.util.Arrays;
class sorting{
public static void main(String[]args){
int[] arr={2,4,5,6,7,3,2};
Arrays.sort(arr);
System.out.print(Arrays.toString(arr));
  List<String> names = new ArrayList<>(List.of("Zara", "Bob", "Alice"));
names.sort((a, b) -> b.compareTo(a)); // descending order
System.out.println(names); // [Zara, Bob, Alice]

}
}
