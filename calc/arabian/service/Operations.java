package calc.arabian.service;

import java.util.List;

public class Operations {
    public int actions(List<String> values) throws Exception {

        String valueFirst, valueSecond, valueAction;
        valueFirst = values.get(0);
        valueAction = values.get(1);
        valueSecond = values.get(2);

        int result, num1, num2;

        try {
             num1 = Integer.parseInt(valueFirst);
             num2 = Integer.parseInt(valueSecond);
        } catch (Exception e) {
            throw new Exception("Ошибка : Некорректный ввод");
        }

        if (num1 > 10 || num2 > 10) {
            throw new Exception("Ошибка : Число больше 10");
        }

        switch (valueAction) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new Exception("Некорректный ввод");

        }
        return result;
    }

    public String result(int number) {
        return String.valueOf(number);
    }
}

