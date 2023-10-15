package org.example;

import java.util.Scanner;

public class TeacherView {
    static void start(){
        boolean status = true;
        TeacherController teacherController = new TeacherController();
        Scanner scan = new Scanner(System.in);
        while (status) {
            System.out.println("\n--------Меню--------\n\n" +

                    "1. Добавить нового учителя \n" +
                    "2. Вывести список учителей \n" +
                    "3. Редактировать данные\n" +
                    "0. Выход из меню");
            Integer process = scan.nextInt();

            switch (process) {

                case 0: status = false;
                    break;
                case 1: {
                    System.out.println("Введите Ф.И.О. учителя: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    System.out.println("Введите профильный предмет учителя: ");
                    String subject = scan.nextLine();
                    teacherController.teacherCreate(name, subject);
                    System.out.println();
                    break;
                }
                case 2:
                    teacherController.printGroupTeacher();
                    break;
                case 3:
                    System.out.println("Введите Ф.И.О. учителя для редактирования: ");
                    scan.nextLine();
                    String oldName = scan.nextLine();
                    System.out.println("Введите новые данные учителя (Ф.И.О.): ");
                    String newName = scan.nextLine();
                    System.out.println("Введите новые данные учителя (профильный предмет): ");
                    String newSubject = scan.nextLine();
                    teacherController.teacherCorrected(oldName,newName,newSubject);
                    System.out.println();
                    break;
            }
        }
        scan.close();
    }
    public static void main(String[] args) {
        start();
    }
}
