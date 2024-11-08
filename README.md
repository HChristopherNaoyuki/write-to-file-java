# WriteToFile

## Overview

The WriteToFile project is a simple Java program that demonstrates how to write an array of book titles to a text file (`book.txt`) using the `BufferedWriter` class. The program highlights file handling techniques with automatic resource management (`try-with-resources`) and exception handling.

## Features

- **Write Book Titles to File:** Stores an array of book titles in `book.txt`.
- **Automatic Resource Management:** Utilizes `try-with-resources` to ensure resources are closed properly.
- **Error Handling:** Catches and displays error messages in case of `IOException`.

## Prerequisites

- Java Development Kit (JDK) installed
- A text editor or an Integrated Development Environment (IDE) for Java development

## Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/HChristopherNaoyuki/write-to-file-java.git
   ```
2. Navigate to the project directory:
   ```sh
   cd WriteToFile
   ```

## Usage

1. Open the project in your preferred text editor or IDE.
2. Compile the `WriteToFile` class:
   ```sh
   javac Solution/WriteToFile.java
   ```
3. Run the program:
   ```sh
   java Solution.WriteToFile
   ```
4. Check the `book.txt` file in the project directory to see the list of book titles.

## Book Titles

The following book titles are written to the `book.txt` file:

- Effective Java
- Clean Code
- The Pragmatic Programmer
- Design Patterns

---
