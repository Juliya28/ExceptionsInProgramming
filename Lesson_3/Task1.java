package Lesson_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите через пробел данные в формате:\n Фамилия Имя Отчество Дата_рождения(dd.mm.yyyy) Номер_телефона Пол(символ латиницей f или m)");
        String userInput = sc.nextLine();
        try (FileWriter writer = new FileWriter("UserData")) {
            if (userInput.split(" ").length < 6 ) {
                System.out.println("Вы ввели меньше данных, чем требуется.");
            }
            else if (userInput.split(" ").length > 6 ) {
                System.out.println("Вы ввели больше данных, чем требуется.");
            }
     
                
            else   writer.write(userInput);
        }
        System.out.println(userInput);
        
        
    }

}

   
