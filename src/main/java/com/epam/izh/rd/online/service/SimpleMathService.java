package com.epam.izh.rd.online.service;

import java.util.Arrays;

public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     *
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {
        if(value1 == value2) {
            return 0;
        }else if(value1 < value2) {
            return -1;
        }else if(value1 > value2) {
            return 1;
        }
        return -2;
    }



    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        return value1 > value2 ? value1 : value2;
       // return -1;
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max = values[0];
        for(int i = 0; i < values.length; i++) {
            if(max < values[i]) {
                max = values[i];
            }
        }
        return max;
        //return -1;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
        //return -1;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int count = 0;
        int ind = 0;
        for(int i = 0; i < values.length; i++) {
            if(values[i] % 2 == 0) {
                count++;
            }
        }

        int res[] = new int[count];
        for(int i = 0; i < values.length; i++) {
            if(values[i] % 2 == 0) {
                res[ind++] = values[i];
            }
        }
        return res;
        //return new int[]{};
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {

        long fact = 1;
        for(long i = 1; i <= initialVal; i++) {
            fact *= i;
        }
        return fact;
        //return -1L;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     *
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     *
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        int a = 0;
        int b = 1;
        for(int i = 0; i < number; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
        //return -1L;
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {

        int[] res = new int[values.length];

        for(int i = 0; i < values.length - 1; i++) {
            for(int j = 0; j < values.length - 1; j++) {

                if(values[j] > values[j + 1]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
        }

        res = Arrays.copyOf(values, res.length);
        return res;
    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        for(int d = 2; d <= number / d; d++) {
            if(number % d == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int[] res = new int[values.length];

        for (int i = 0, j = res.length - 1; i < values.length; i++, j--) {
            res[j] = values[i];
        }
        return res;
        //return new int[]{};
    }
}
