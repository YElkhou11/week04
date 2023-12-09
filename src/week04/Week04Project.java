package week04;

public class Week04Project {
	
	public static void main(String[] args) {
	// Question 1
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    
    // a.
    int result = ages[ages.length - 1] - ages[0];
    System.out.println("Result of subtraction: " + result);
    
    // b.
    int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 1};
    // ii.
    result = ages2[ages2.length - 1] - ages2[0];
    System.out.println("Result of subtraction for ages2: " + result);
    
    // c.
    double averageAge = calculateAverage(ages);
    System.out.println("Average age: " + averageAge);
    
    // Question 2
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    // a.
    double averageLetters = calculateAverageLetters(names);
    System.out.println("Average number of letters per name: " + averageLetters);
    
    // b.
    String concatenatedNames = concatenateNames(names);
    System.out.println("Concatenated names: " + concatenatedNames);
    
    // Question 3
    // To access the last element of any array, you use arrayName[arrayName.length - 1]
    
    // Question 4
    // To access the first element of any array, you use arrayName[0]
    
    // Question 5
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
    }
    
    // Question 6
    int sumOfNameLengths = calculateSum(nameLengths);
    System.out.println("Sum of name lengths: " + sumOfNameLengths);
    
    // Question 7
    System.out.println(concatenateWordNTimes("Hello", 3));
    
    // Question 8
    System.out.println(getFullName("John", "Doe"));
    
    // Question 9
    System.out.println(isSumGreaterThan100(ages));
    
    // Question 10
    double[] array = {2.5, 7.8, 4.3, 6.1};
    System.out.println(calculateAverage(array));
    
    // Question 11
    double[] array1 = {3.5, 8.2, 5.9};
    double[] array2 = {1.5, 6.7, 4.2};
    System.out.println(isFirstAvgGreaterThanSecond(array1, array2));
    
    // Question 12
    System.out.println(willBuyDrink(true, 12.75));
    
    System.out.println(findMaxValue(ages));
} // end of main

// c. method for calculating average age
public static double calculateAverage(int[] ages) {
    int sum = 0;
    for (int age : ages) {
        sum += age;
    }
    return (double) sum / ages.length;
}

// a. method for calculating average number of letters per name
public static double calculateAverageLetters(String[] names) {
    int totalLetters = 0;
    for (String name : names) {
        totalLetters += name.length();
    }
    return (double) totalLetters / names.length;
}

// b. method for concatenating names
public static String concatenateNames(String[] names) {
    StringBuilder concatenated = new StringBuilder();
    for (String name : names) {
        concatenated.append(name).append(" ");
    }
    return concatenated.toString().trim();
}

// c. method for calculating sum of array elements
public static int calculateSum(int[] array) {
    int sum = 0;
    for (int value : array) {
        sum += value;
    }
    return sum;
}

// Question 7: Method to concatenate a word n times
public static String concatenateWordNTimes(String word, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
        result.append(word);
    }
    return result.toString();
}

// Question 8: Method to get full name
public static String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
}

// Question 9: Method to check if sum of array elements is greater than 100
public static boolean isSumGreaterThan100(int[] array) {
    int sum = calculateSum(array);
    return sum > 100;
}

// Question 10: Method to calculate average of elements in double array
public static double calculateAverage(double[] array) {
    double sum = 0;
    for (double value : array) {
        sum += value;
    }
    return sum / array.length;
}

// Question 11: Method to check if average of first array is greater than second array
public static boolean isFirstAvgGreaterThanSecond(double[] array1, double[] array2) {
    double avg1 = calculateAverage(array1);
    double avg2 = calculateAverage(array2);
    return avg1 > avg2;
}

// Question 12: Method to check if it's hot outside and money is greater than 10.50
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    return isHotOutside && moneyInPocket > 10.50;
}

// Question 13: Method to find the maximum value in an array of integers


public static int findMaxValue(int[] array) {
int max = Integer.MIN_VALUE;
for (int value : array) {
    if (value > max) {
        max = value;
    }
}
return max;
}


}
