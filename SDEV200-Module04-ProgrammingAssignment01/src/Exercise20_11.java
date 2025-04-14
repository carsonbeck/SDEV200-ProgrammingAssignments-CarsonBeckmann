import java.io.*;
import java.util.Stack;

public class Exercise20_11 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Excercise20_11 filename");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        Stack<Character> stack = new Stack<>();
        boolean correctGrouping = true;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (ch == '(' || ch == '}' || ch == ']') {
                        stack.push(ch);
                    }

                    else if (ch == ')' || ch == '}' || ch == ']') {
                        if (stack.isEmpty()) {
                            System.out.println("Error at line " + lineNumber + ": CLosing '" + ch + "' without matching opening symbol");
                            correctGrouping = false;
                            break;
                        }

                        char top = stack.pop();
                        if (!isMatchingPair(top, ch)) {
                            System.out.println("Error at line " + lineNumber + ": Expected '" + getMatchingSymbol(top) + "' but found '" + ch + "'");
                            correctGrouping = false;
                            break;
                        }
                    }
                }

                lineNumber++;
            }

            if (!stack.isEmpty()) {
                System.out.println("Error: Unclosed symbols(s):");
                while (!stack.isEmpty()) {
                    char unclosed = stack.pop();
                    System.out.println(" - '" + unclosed + "'");
                }

                correctGrouping = false;
            }

            if (correctGrouping) {
                System.out.println("Correct grouping pairs");
            } else {
                System.out.println("Incorrect grouping pairs");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    private static char getMatchingSymbol(char symbol) {
        switch (symbol) {
            case '(': return ')';
            case '{': return '}';
            case '[': return ']';
            default: return ' ';
        }
    }
}