public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<String> lines = new ArrayList<>();
    int counter = 0;

    while(input.hasNext()){
        counter++;
        String unKnownLine = input.nextLine();

        lines.add(counter + " " + unKnownLine) ;
    }
    input.close();

    for (String n : lines) {
        System.out.println(n);
    }

}  
