package calculator;

import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CalculatorApp {
    private static final Map<String, Operation> operations = new HashMap<>();
    //private ile kapsülleme yapmış olduk
    //static ile tüm nesneleri yani "AddOperation,SubstractOperation" gibi işlemler operations ile tutulsun.
    //yani her bir işlem yeni bir nesnede tutulmasın.
    //final ise operations değişkeni başka bir map ile kullanılamaz operations = new TreeMap<>(); gibi"

    static {
        operations.put("+", new AddOperation());
        operations.put("-", new SubtractOperation());
        operations.put("*", new MultiplyOperation());
        operations.put("/", new DivideOperation());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        double num1 = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = sc.nextDouble();

        System.out.print("İşlem giriniz (+, -, *, /): ");
        String symbol = sc.next();

        Operation operation = operations.get(symbol); // kullanıcı + girdi → operations.get("+") → AddOperation çalışır
        double result =  operation.calculate(num1, num2);

        System.out.println("Sonuç "+result);
    }
}
