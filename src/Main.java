public class Main {
    public static void main(String[] args) {


        System.out.println("Задание №1");

        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);


        System.out.println("Задание №2");

        System.out.println();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());


        System.out.println("Задание №3");

        System.out.println();

        fullName = "Иванов Семён Семёнович";

        String changedLetterInFullName = fullName.replace("ё", "е");

        System.out.println(changedLetterInFullName);


    }
}