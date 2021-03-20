package Lab_Methods.Exercises_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] finalArray = array;

        String command = scan.nextLine();

        final boolean haveEven = Array.Get.evenNumbersCount(finalArray) > 0;
        final boolean haveOdd = Array.Get.oddNumbersCount(finalArray) > 0;

        while (!command.equals("end")) {
            String[] commandAsArray = command.split(" ");

            if ((commandAsArray[0].equals("exchange"))) {

                int exchangeIndex = Integer.parseInt(commandAsArray[1]);

                /** Проверка дали индексът е извън рейнджа на масива **/
                /** Печатане на невалиден индекс **/
                if (exchangeIndex >= finalArray.length || exchangeIndex < 0) {
                    System.out.println("Invalid index");
                    command = scan.nextLine();
                    continue;
                }

                finalArray = Array.exchange(array, exchangeIndex);
                array = finalArray;

            } else if (commandAsArray[0].equals("first") || commandAsArray[0].equals("last")) {

                int count = Integer.parseInt(commandAsArray[1]);
                int[] currentArray;


                if (count > finalArray.length || count < 0) {
                    System.out.println("Invalid count");
                    command = scan.nextLine();
                    continue;
                }

                if (commandAsArray[0].equals("first")) {

                    if (commandAsArray[2].equals("even")) {
                        currentArray = Array.Get.First.evenNumbers(finalArray, count);
                    } else {
                        currentArray = Array.Get.First.oddNumbers(finalArray, count);
                    }

                } else {

                    if (commandAsArray[2].equals("even")) {
                        currentArray = Array.Get.Last.evenNumbers(finalArray, count);
                    } else {
                        currentArray = Array.Get.Last.oddNumbers(finalArray, count);
                    }

                }

                Array.printFormatted(currentArray);

            } else if (commandAsArray[1].equals("even")) {

                if (!haveEven) {
                    System.out.println("No matches");
                } else {

                    if (commandAsArray[0].equals("min")) {
                        System.out.println(Array.printIndex(finalArray, Array.Get.Min.even(finalArray)));
                    } else {
                        System.out.println(Array.printIndex(finalArray, Array.Get.Max.even(finalArray)));
                    }

                }

            } else if (command.contains("odd")) {

                if (!haveOdd) {
                    System.out.println("No matches");

                } else {

                    if (commandAsArray[0].equals("min")) {
                        System.out.println(Array.printIndex(finalArray, Array.Get.Min.odd(finalArray)));
                    } else {
                        System.out.println(Array.printIndex(finalArray, Array.Get.Max.odd(finalArray)));
                    }

                }

            }

            command = scan.nextLine();
        }

        Array.printFormatted(finalArray);
    }



    static class Array {

        // TODO Exchange
        static int[] exchange(int[] a, int b) {

            if (b == a.length - 1) {
                return a;
            }

            int currentIndex = b + 1;


            int[] finalA = new int[a.length];


            for (int i = 0; ; currentIndex++, i++) {

                finalA[i] = a[currentIndex];
                if (currentIndex == finalA.length - 1) {
                    currentIndex = i + 1;
                    break;
                }

            }

            for (int i = 0; currentIndex < finalA.length; i++, currentIndex++) {
                finalA[currentIndex] = a[i];
            }

            return finalA;
        }


        static class Get {

            // TODO count even/odd numbers
            // Even
            static int evenNumbersCount(int[] a) {
                int evenNumbersCount = 0;
                for (int j : a) {
                    if (j % 2 == 0) {
                        evenNumbersCount++;
                    }
                }
                return evenNumbersCount;
            }

            // Odd
            static int oddNumbersCount(int[] a) {
                int oddNumbersCount = 0;
                for (int j : a) {
                    if (j % 2 != 0) {
                        oddNumbersCount++;
                    }
                }
                return oddNumbersCount;
            }


            // TODO max even/odd
            static class Max {

                static int even(int[] a) {

                    int maxEven = Integer.MIN_VALUE;
                    for (int j : a) {
                        if (j % 2 == 0) {
                            if (j > maxEven) {
                                maxEven = j;

                            }
                        }
                    }
                    return maxEven;
                }
                // Odd

                static int odd(int[] b) {
                    int maxOdd = Integer.MIN_VALUE;
                    for (int j : b) {
                        if (j % 2 != 0) {
                            if (j > maxOdd) {
                                maxOdd = j;

                            }
                        }
                    }
                    return maxOdd;
                }
            }


            // TODO min even / odd
            static class Min {
                // Even
                static int even(int[] a) {
                    int minEven = Integer.MAX_VALUE;
                    for (int j : a) {

                        if (j % 2 == 0) {
                            if (j < minEven) {
                                minEven = j;

                            }
                        }

                    }

                    return minEven;
                }

                // Odd
                static int odd(int[] b) {
                    int minOdd = Integer.MAX_VALUE;

                    for (int j : b) {
                        if (j % 2 != 0) {
                            if (j < minOdd) {
                                minOdd = j;
                            }
                        }
                    }
                    return minOdd;
                }

            }


            static class First {

                static int[] evenNumbers(int[] a, int b) {
                    int[] firstEvenNumbers = new int[b];
                    if (b > Array.Get.evenNumbersCount(a)) {
                        firstEvenNumbers = new int[Array.Get.evenNumbersCount(a)];
                    }

                    if (Array.Get.evenNumbersCount(a) == 0) {
                        firstEvenNumbers = new int[0];
                        return firstEvenNumbers;
                    }

                    for (int i = 0, j = 0; j < firstEvenNumbers.length; i++) {
                        if (a[i] % 2 == 0) {
                            firstEvenNumbers[j] = a[i];
                            j++;
                        }
                    }
                    return firstEvenNumbers;

                }

                static int[] oddNumbers(int[] a, int b) {
                    int[] firstOddNumbers = new int[b];
                    if (b > Array.Get.oddNumbersCount(a)) {
                        firstOddNumbers = new int[Array.Get.oddNumbersCount(a)];
                    }

                    if (Array.Get.oddNumbersCount(a) == 0) {
                        firstOddNumbers = new int[0];
                        return firstOddNumbers;
                    }

                    for (int i = 0, j = 0; j < firstOddNumbers.length; i++) {
                        if (a[i] % 2 != 0) {
                            firstOddNumbers[j] = a[i];
                            j++;
                        }
                    }
                    return firstOddNumbers;
                }

            }

            static class Last {

                static int[] evenNumbers(int[] a, int b) {
                    int[] lastEvenNumbers = new int[b];
                    if (b > Array.Get.evenNumbersCount(a)) {
                        lastEvenNumbers = new int[Array.Get.evenNumbersCount(a)];
                    }

                    if (Array.Get.evenNumbersCount(a) == 0) {
                        lastEvenNumbers = new int[0];
                        return lastEvenNumbers;
                    }

                    for (int i = a.length - 1, j = lastEvenNumbers.length - 1; j >= 0; i--) {
                        if (a[i] % 2 == 0) {
                            lastEvenNumbers[j] = a[i];
                            j--;
                        }
                    }
                    return lastEvenNumbers;
                }

                static int[] oddNumbers(int[] a, int b) {
                    int[] lastOddNumbers = new int[b];
                    if (b > Array.Get.oddNumbersCount(a)) {
                        lastOddNumbers = new int[Array.Get.oddNumbersCount(a)];
                    }

                    if (Array.Get.oddNumbersCount(a) == 0) {
                        lastOddNumbers = new int[0];
                        return lastOddNumbers;
                    }

                    for (int i = a.length - 1, j = lastOddNumbers.length - 1; j >= 0; i--) {
                        if (a[i] % 2 != 0) {
                            lastOddNumbers[j] = a[i];
                            j--;
                        }
                    }
                    return lastOddNumbers;
                }
            }


        }

        static int printIndex(int[] a, int b) {
            /** Цикъл намиращ индекса на четното число **/
            for (int i = a.length - 1; i >= 0; i--) {
                /** Проверка дали текущия индекс е на най- голямото четно **/
                if (a[i] == b) {
                    return (i);
                }
            }
            return 0;
        }

        static void printFormatted(int[] a) {
            if (a.length == 0) {
                System.out.println("[]");
                return;
            }
            System.out.print("[");
            for (int i = 0; i < a.length; i++) {
                if (i == a.length - 1) {
                    System.out.printf("%d]%n", a[i]);
                    return;
                }
                System.out.print(a[i] + ", ");
            }
        }
    }

}
