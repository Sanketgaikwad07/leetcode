int number = 25;
StringBuilder binary = new StringBuilder();

while (number > 0) {
    binary.insert(0, number % 2);
    number = number / 2;
}

System.out.println("Binary: " + binary.toString());
