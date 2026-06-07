public class Strings {
    public static void main(String[] args){

        // print length of the string
        String name = "Aman Shrivastava";
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());

        // print the character at a specific index
        char letter = name.charAt(5);
        System.out.println("Character at index 5: " + letter);

        // print the index of a specific character
        int index = name.indexOf('S');
        System.out.println("Index of 'S': " + index);

        // print the substring of the string
        String substring = name.substring(5, 15);
        System.out.println("Substring from index 5 to 15: " + substring);

        // print the string in uppercase
        String uppercase = name.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        // print the string in lowercase
        String lowercase = name.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        // print the string with leading and trailing spaces removed
        String nameWithSpaces = "   " + name + "   ";
        String trimmed = nameWithSpaces.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // print the string with a specific character replaced
        String replaced = name.replace('a', '@');
        System.out.println("Replaced 'a' with '@': " + replaced);

        // print the string split into an array of substrings
        String[] parts = name.split(" ");
        System.out.println("Split into parts:");

        for (String part : parts) {
            System.out.println(part);
        }
        // print the string concatenated with another string
        String fullName = name + " Kumar";
        System.out.println("Full Name: " + fullName);
        // print the string formatted with placeholders
        String formatted = String.format("My name is %s and I am learning Java.", name);
        System.out.println(formatted);
    }
}
