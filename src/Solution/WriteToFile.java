package Solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile
{
    public static void main(String[] args)
    {
        // Path to the file where book titles will be written
        String filePath = "book.txt";
        
        // Array of book titles to be written to the file
        String[] bookTitles = {
            "Effective Java",
            "Clean Code",
            "The Pragmatic Programmer",
            "Design Patterns"
        };

        // Use try-with-resources for automatic resource management
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            // Iterate through each book title in the array
            for (String title : bookTitles)
            {
                // Write each book title to the file and move to the next line
                writer.write(title);
                writer.newLine();
            }

            // Confirmation message for successful file writing
            System.out.println("Book titles have been successfully written to " + filePath);
        }
        catch (IOException e)
        {
            // Print an error message if file writing fails
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
