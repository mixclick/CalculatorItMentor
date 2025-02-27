package calc.arabian.service;

import java.util.List;

public class Operations {
    public int actions(List<String> values) throws Exception {

        String valueFirst, valueSecond, valueAction;
        valueFirst = values.get(0);
        valueAction = values.get(1);
        valueSecond = values.get(2);

        int result;

        int num1 = Integer.parseInt(valueFirst);
        int num2 = Integer.parseInt(valueSecond);
        if (num1 > 10 || num2 > 10) {
            throw new Exception("Ошибка : т.к. число больше 10");
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
            default:
                result = num1 / num2;
                break;
        }
        return result;
    }

    public String result(int number) {
        return String.valueOf(number);
    }
}

