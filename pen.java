public class Pen {
    // Attributes (Fields)
    private String color;
    private String brand;
    private boolean isCapped;

    // Constructor
    public Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.isCapped = true; // pen starts capped
    }

    // Methods
    public void write() {
        if (!isCapped) {
            System.out.println("Writing with the " + color + " " + brand + " pen.");
        } else {
            System.out.println("Uncap the pen before writing.");
        }
    }

    public void cap() {
        isCapped = true;
        System.out.println("Pen is now capped.");
    }

    public void uncap() {
        isCapped = false;
        System.out.println("Pen is now uncapped.");
    }

    public void displayInfo() {
        System.out.println("Pen Brand: " + brand);
        System.out.println("Pen Color: " + color);
        System.out.println("Capped: " + (isCapped ? "Yes" : "No"));
    }

    // Main method to test the Pen class
    public static void main(String[] args) {
        Pen myPen = new Pen("Blue", "Parker");
        myPen.displayInfo();
        myPen.write();       // Should say "Uncap the pen"
        myPen.uncap();       
        myPen.write();       // Now it can write
        myPen.cap();         
        myPen.displayInfo(); // Shows current status
    }
}
