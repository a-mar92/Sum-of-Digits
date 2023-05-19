// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int liczba = 5874;
        int wynik  = squareDigits(liczba);
        System.out.println(wynik);
    }
    public static int squareDigits (int n) {
    String number = String.valueOf(n);
    StringBuilder finalValue = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            int squere = digit * digit;
            finalValue.append(squere);

        }



return  Integer.valueOf(finalValue.toString());
    }


}
