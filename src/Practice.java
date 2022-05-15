public class Practice {
    public double mphToKph(double mph) {
        double kph = mph * 1.60934;
        return kph;
    }
    public int printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        return megaBytes;
    }
    public boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay < 8) {
                return true;
            }
        }
        return false;
    }
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    public boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if (firstNumber == secondNumber) {
            return true;
        }
        return false;
    }
    public boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber + secondNumber == thirdNumber) {
            return true;
        }
        return false;
    }
    public boolean hasTeen (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= 13 && firstNumber <= 19) {
            return true;
        }
        if (secondNumber >= 13 && secondNumber <= 19) {
            return true;
        }
        if (thirdNumber >= 13 && thirdNumber <= 19) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        System.out.println(obj.hasTeen(13, 20, 10));
        System.out.println(obj.hasEqualSum(1, 2, 3));
        System.out.println(obj.areEqualByThreeDecimalPlaces(1.0, 1.000));
        System.out.println(obj.isLeapYear(2020));
        System.out.println(obj.shouldWakeUp(true, 9));
        System.out.println(obj.mphToKph(100));
        System.out.println(obj.printMegaBytesAndKiloBytes(2048));
    }
}
