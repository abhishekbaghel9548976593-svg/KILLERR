// * Que 1

// import java.util.Scanner;
// public class classwork {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         Integer objNum = num;
//         System.out.println("Primitive int: " + num);
//         System.out.println("Wrapped Integer Object:" + objNum);
//     }
// }



// Que 2

// public class classwork {
//     public static void main(String[] args) {
//         double num = 45.67;
//         Double objNum = num;

//         System.out.println("double: " + num);
//         System.out.println("int using casting: " + (int) num);
//         System.out.println("Wrapped Double Object: " + objNum);
//     }

// }


// Que 3

// import java.util.ArrayList;

// public class classwork {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         numbers.add(10);
//         numbers.add(11);
//         numbers.add(12);
//         numbers.add(13);
//         numbers.add(9);

//         int sum = 0;
//         for (Integer number : numbers) {
//             sum += number;
//         }

//         System.out.println("Sum of numbers = " + sum);
//     }
// }

// ---------------------------------------------------------

// public class classwork {
//     public static void main(String[] args) {
//         Integer a = 100;
//         Integer b = 100;
//         Integer c = 200;
//         Integer d = 200;

//         System.out.println("a == b: " + (a == b));
//         System.out.println("c == d: " + (c == d));
//         System.out.println("a.equals(b): " + (a.equals(b)));
//     }
// }

// --------------------------------------------------------

// public class classwork {
//     public static void main(String[] args) {
//         // Integer.parseInt("123")
//         int parsedInt = Integer.parseInt("123");
//         System.out.println("Integer.parseInt(\"123\"): " + parsedInt);

//         // Double.parseDouble("3.14")
//         double parsedDouble = Double.parseDouble("3.14");
//         System.out.println("Double.parseDouble(\"3.14\"): " + parsedDouble);

//         // Boolean.parseBoolean("true")
//         boolean parsedBoolean = Boolean.parseBoolean("true");
//         System.out.println("Boolean.parseBoolean(\"true\"): " + parsedBoolean);

//         // Integer.toBinaryString(10)
//         String binaryString = Integer.toBinaryString(10);
//         System.out.println("Integer.toBinaryString(10): " + binaryString);

//         // Character.isDigit('5')
//         boolean isDigit = Character.isDigit('5');
//         System.out.println("Character.isDigit('5'): " + isDigit);

//         // Character.toUpperCase('a')
//         char upperCaseChar = Character.toUpperCase('a');
//         System.out.println("Character.toUpperCase('a'): " + upperCaseChar);
//     }
// }

// -------------------------------------------------------

// public class classwork {
//     public static int safeParseInt(String input) {
//         try {
//             return Integer.parseInt(input);
//         } catch (NumberFormatException e) {
//             return -1;
//         }
//     }


//     public static void main(String[] args) {
//         System.out.println(safeParseInt("123"));
//         System.out.println(safeParseInt("abc"));
//         System.out.println(safeParseInt("45.6"));
//         System.out.println(safeParseInt("0"));
//     }
// }

// ------------------------------------------------------------

// import java.util.ArrayList;
// import java.util.Collections;

// public class classwork {
//     public static void main(String[] args) {

//         double[] prices = {10.5, 20.0, 35.75, 5.5};

//         ArrayList<Double> priceList = new ArrayList<>();
//         for (double price : prices) {
//             priceList.add(price);
//         }

//         double highestPrice = Collections.max(priceList);

//         double sum = 0;
//         for (double price : priceList) {
//             sum += price;
//         }
//         double averagePrice = sum / priceList.size();

//         System.out.println("Prices: " + priceList);
//         System.out.println("Highest Price: " + highestPrice);
//         System.out.println("Average Price: " + averagePrice);
//     }
// }

// -------------------------------------------------------

// import java.util.Scanner;

// public class classwork {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();

//         int letterCount = 0;
//         int digitCount = 0;
//         int specialCharCount = 0;

//         for (int i = 0; i < input.length(); i++) {
//             char ch = input.charAt(i);

//             if (Character.isLetter(ch)) {
//                 letterCount++;
//             } else if (Character.isDigit(ch)) {
//                 digitCount++;
//             } else if (!Character.isWhitespace(ch)) {
//                 specialCharCount++;
//             }
//         }

//         System.out.println("Total letters: " + letterCount);
//         System.out.println("Total digits: " + digitCount);
//         System.out.println("Total special characters: " + specialCharCount);

//         scanner.close();
//     }
// }


// -------------------------------------------------------------

// public class classwork {
//     public static void main(String[] args) {
//         String[] priceStrings = {"250", "499", "99", "abc", "150"};

//         int totalPrice = 0;

//         for (String price : priceStrings) {
//             try {
//                 int value = Integer.parseInt(price);
//                 totalPrice += value;
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid price: \"" + price + "\" (ignored)");
//             }
//         }

//         System.out.println("Total price of valid items: " + totalPrice);
//     }
// }

// --------------------------------------------------------------

// import java.util.ArrayList;
// import java.util.Collections;

// public class classwork {
//     public static void main(String[] args) {
//         int[] ages = {25, 32, 40, 28, 50, 22};

//         ArrayList<Integer> ageList = new ArrayList<>();
//         for (int age : ages) {
//             ageList.add(age);
//         }

//         int youngest = Collections.min(ageList);
//         int oldest = Collections.max(ageList);

//         System.out.println("Employee ages: " + ageList);
//         System.out.println("Youngest employee age: " + youngest);
//         System.out.println("Oldest employee age: " + oldest);
//     }
// }

// ------------------------------------------------------

// public class classwork {

//     public static boolean isValidAge(String ageInput) {
//         try {
//             int age = Integer.parseInt(ageInput);
//             return age >= 18;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(isValidAge("20"));
//         System.out.println(isValidAge("17"));
//         System.out.println(isValidAge("abc"));
//         System.out.println(isValidAge("18"));
//     }
// }

// ------------------------------------------------------

// public class classwork {
//     public static void main(String[] args) {
//         String[] prices = {"250", "499", "99", "abc", "150"};

//         int totalPrice = 0;
//         for (String price : prices) {
//             try {
//                 int value = Integer.parseInt(price);
//                 totalPrice += value;
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid price: \"" + price + "\" (ignored)");
//             }
//         }

//         System.out.println("Total price of valid items: " + totalPrice);
//     }
// }


// ---------------------------------------------------------------

// import java.util.ArrayList;
// import java.util.Collections;

// public class classwork {
//     public static void main(String[] args) {
//         int[] employeeAges = {25, 32, 40, 28, 50, 22, 35};


//         ArrayList<Integer> ageList = new ArrayList<>();
//         for (int age : employeeAges) {
//             ageList.add(age);
//         }


//         int youngest = Collections.min(ageList);
//         int oldest = Collections.max(ageList);


//         System.out.println("Employee ages: " + ageList);
//         System.out.println("Youngest employee age: " + youngest);
//         System.out.println("Oldest employee age: " + oldest);
//     }
// }

// ---------------------------------------------------------------

// public class classwork {

//     public static double getRemainingLimit(Double limit, double amountWithdrawn) {
//         if (limit == null) {
//             return 0.0;
//         }
//         return limit - amountWithdrawn;
//     }

//     public static void main(String[] args) {
//         // Test cases
//         Double limit1 = 1000.0;
//         double limit2 = 500.0;
//         Double limit3 = null;

//         double withdrawn = 200.0;


//         System.out.println("Remaining limit (new account): " + getRemainingLimit(limit1, withdrawn));
//         System.out.println("Remaining limit (old account): " + getRemainingLimit(limit2, withdrawn));
//         System.out.println("Remaining limit (null account): " + getRemainingLimit(limit3, withdrawn));
//     }
// }

// -----------------------------------------------------------

// import java.util.ArrayList;

// public class classwork {
//     private static ArrayList<Double> temperatureLog = new ArrayList<>();

//     public static void logTemperature(Double temperature) {
//         temperatureLog.add(temperature);
//         System.out.println("Logged temperature: " + temperature);
//     }

//     public static double calculateAverage() {
//         if (temperatureLog.isEmpty()) {
//             return 0.0;
//         }

//         double sum = 0.0;
//         for (Double temp : temperatureLog) {
//             sum += temp;
//         }
//         return sum / temperatureLog.size();
//     }

//     public static void main(String[] args) {

//         double sensorReading1 = 25.6;
//         logTemperature(sensorReading1);


//         Double sensorReading2 = 27.3;
//         logTemperature(sensorReading2);


//         logTemperature(24.9);

//         System.out.println("All logged temperatures: " + temperatureLog);
//         System.out.println("Average temperature: " + calculateAverage());
//     }
// }

// -----------------------------------------------------------

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Objects;

// public class classwork {
//     public static void main(String[] args) {

//         int[] oldRatings = {4, 5, 3, 4};

//         ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 2, null, 3));

//         ArrayList<Integer> allRatings = new ArrayList<>();

//         for (int rating : oldRatings) {
//             allRatings.add(rating);
//         }


//         allRatings.addAll(newRatings);

//         System.out.println("All Ratings (raw): " + allRatings);

//         double sum = 0;
//         int count = 0;

//         for (Integer rating : allRatings) {
//             if (Objects.nonNull(rating)) {
//                 sum += rating;
//                 count++;
//             }
//         }

//         double average = (count > 0) ? (sum / count) : 0.0;

//         System.out.println("Valid ratings count: " + count);
//         System.out.println("Average rating: " + average);
//     }
// }

// ----------------------------------------------------------

// import java.util.Arrays;

// public class classwork {
//     public static void main(String[] args) {

//         Integer[] scores = {100, null, 250, 300, null, 150};

//         int notPlayedCount = 0;
//         int totalScore = 0;

//         for (Integer score : scores) {
//             if (score == null) {
//                 notPlayedCount++;
//             } else {
//                 totalScore += score;
//             }
//         }

//         System.out.println("Number of players who haven't played: " + notPlayedCount);
//         System.out.println("Total of valid scores: " + totalScore);
//     }
// }


// -----------------------------------------------------------------

// import java.util.ArrayList;

// public class classwork {
//     public static void main(String[] args) {

//         Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc", 76};

//         ArrayList<Integer> validMarks = new ArrayList<>();
//         int sum = 0;

//         for (Object mark : marks) {
//             Integer value = null;

//             if (mark instanceof Integer) {
//                 value = (Integer) mark;
//             } else if (mark instanceof String) {
//                 try {
//                     value = Integer.parseInt((String) mark);
//                 } catch (NumberFormatException e) {

//                 }
//             }

//             if (value != null) {
//                 validMarks.add(value);
//                 sum += value;
//             }
//         }

//         double average = (validMarks.size() > 0) ? (double) sum / validMarks.size() : 0.0;

//         System.out.println("Valid marks: " + validMarks);
//         System.out.println("Average of valid marks: " + average);
//     }
// }

// -----------------------------------------------------------------

// import java.util.ArrayList;

// public class classwork {
//     public static void main(String[] args) {
//         final int SIZE = 1_000_000;

//         int[] primitiveArray = new int[SIZE];
//         for (int i = 0; i < SIZE; i++) {
//             primitiveArray[i] = i;
//         }

//         long startTime = System.nanoTime();
//         long sumPrimitive = 0;
//         for (int value : primitiveArray) {
//             sumPrimitive += value;
//         }
//         long endTime = System.nanoTime();
//         System.out.println("Primitive int[] sum: " + sumPrimitive);
//         System.out.println("Time taken for int[]: " + (endTime - startTime) / 1_000_000 + " ms\n");

//         ArrayList<Integer> wrapperList = new ArrayList<>();
//         for (int i = 0; i < SIZE; i++) {
//             wrapperList.add(i);
//         }

//         startTime = System.nanoTime();
//         long sumWrapper = 0;
//         for (Integer value : wrapperList) {
//             sumWrapper += value;
//         }
//         endTime = System.nanoTime();
//         System.out.println("Wrapper ArrayList<Integer> sum: " + sumWrapper);
//         System.out.println("Time taken for ArrayList<Integer>: " + (endTime - startTime) / 1_000_000 + " ms");
//     }
// }
//  */

