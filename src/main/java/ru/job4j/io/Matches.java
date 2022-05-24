package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 5;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            boolean rightMove = (matches >= 1) && (matches <= 3) && (matches <= count);
            if (!rightMove) {
                System.err.println("""
                        Ошибка:
                        Нужно ввести число от 1 до 3, но не больше чем осталось спичек на столе
                        """
                );
            } else {
                turn = !turn;
                count -= matches;
                System.out.println("Спичек на столе осталось: " + count);
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
