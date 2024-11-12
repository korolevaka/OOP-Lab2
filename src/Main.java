import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите шестнадцатиричный код цвета (например, #FFFFFF):");
            String inputColor = scanner.nextLine();

            Pattern hexColorPattern = Pattern.compile("^#[0-9A-Fa-f]{6}$");
            Matcher matcher = hexColorPattern.matcher(inputColor);

            if (matcher.matches()) {
                System.out.println(inputColor + " - цвет валидный");
                break;
            } else {
                System.out.println(inputColor + " - цвет не валидный. Введите ещё раз:");
            }
        }
    }
}
