package Lesson_3;

import java.io.FileWriter;
import java.util.Scanner;

public class Task {
    String firstName;
    String lastName;
    String patronymic;
    String birthDate;
    int telephoneNum;
    String gender;
    
    

    public Task( String lastName, String firstName, String patronymic, String birthDate, int telephoneNum, String gender) {
        
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.telephoneNum = telephoneNum;
        this.gender = gender;
        
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите данные в формате:\n Фамилия Имя Отчество Дата_рождения(dd.mm.yyyy) "
                +           "Номер_телефона Пол(символ латиницей f или m)");
        try (FileWriter writer = new FileWriter("UserData")) {
            Task user = new Task(sc.nextLine(),  sc.nextLine(),  sc.nextLine(), sc.nextLine(),
                    sc.nextInt(), sc.nextLine());
            writer.write(user.toString());
            
        } catch (Exception e) {
            throw new Exception("Некорректный ввод данных!");
        }
        
    }
    
    @Override
    public String toString() {
        return "<" + lastName + "><" + firstName + "><" + patronymic + "><"
                + birthDate + "><" + telephoneNum + "><" + gender + '>';
    }
}