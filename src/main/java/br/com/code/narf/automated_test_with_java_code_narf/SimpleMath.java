package br.com.code.narf.automated_test_with_java_code_narf;

public class SimpleMath {
    public Double sum(Double fistNumber, Double secondNumber){
        return fistNumber + secondNumber;
    }
    public Double subtraction(Double fistNumber, Double secondNumber){
        return fistNumber - secondNumber;
    }
    public Double multiplication(Double fistNumber, Double secondNumber) {
        return fistNumber * secondNumber;
    }
    public Double division(Double fistNumber, Double secondNumber) {
        if (secondNumber.equals(0D)) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return fistNumber / secondNumber;
    }
    public Double median(Double[] numbers) {
        int length = numbers.length;
        if (length == 0) {
            return 0D;
        }
        Double[] sortedNumbers = numbers.clone();
        java.util.Arrays.sort(sortedNumbers);
        if (length % 2 == 1) {
            return sortedNumbers[length / 2];
        } else {
            Double middle1 = sortedNumbers[(length / 2) - 1];
            Double middle2 = sortedNumbers[length / 2];
            return (middle1 + middle2) / 2;
        }
    }

}
