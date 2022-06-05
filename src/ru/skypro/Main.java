package ru.skypro;

public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName + ".");

//        Task_2

        String fullNameUp = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + fullNameUp + ".");

//        Task_3

        fullName = "Иванов Семён Семёнович";
        String fullNameReplace = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullNameReplace + ".");
    }
}
