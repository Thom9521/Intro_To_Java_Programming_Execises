package Thom9521.Chapter_12.CaseStudies.WriteData;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);

        }

        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            // Write formatted output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
            output.print("Thomas M Christensen ");
            output.println(21);
            output.print("Marcus T Chris ");
            output.println(21);
        }
    }
}