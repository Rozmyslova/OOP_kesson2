import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FamilyTree { 

    /**
     * @param args
     */
    public static void main(String[] args) {

        final List<People> tree = new ArrayList<People>(RomanovFamily.membersOfFamily());

        // По ID выбираем человека, у которого будем рассматривать генеологическое древо
        People user = new People();
        System.out.println("1 - Романов Николай Аександрович");
        System.out.println("2 - Романова Александра Федоровна");
        System.out.println("3 - Романова Ольга Николаевна");
        System.out.println("4 - Романова Татьяна Николаевна");
        System.out.println("5 - Романова Мария Николаевна");
        System.out.println("6 - Романова Анастасия Николаевна");
        System.out.println("7 - Романов Алексей Николаевич");
        System.out.println("8 - Романов Александр Александрович");
        System.out.println("9 - Романова Мария Федоровна");
        System.out.println("10 - Гессенский Людвиг");
        System.out.println("11 - Гессенская Алиса");
        System.out.println("12 - Романов Александр Аександрович");
        System.out.println("13 - Романов Георгий Аександрович");
        System.out.println("14 - Романова Ксения Аександровна");   
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите ID человека из генеалогического древа (1-14): ");
        int id = in.nextInt();
        in.close();

        //Выводим данные о выбранном человеке
        for (int i = 0; i < tree.size(); i++) {
            if (id == tree.get(i).id) {
                tree.get(i).info();
                user = tree.get(i);
                if ((tree.get(i).partner.equals("Не замужем")) || (user.partner.equals("Не женат"))) {
                    System.out.printf("Нет спутника жизни");
                } else {
                    if (tree.get(i).gender.equals("Женский")) {
                        System.out.printf("Муж : %s \n", tree.get(i).partner);
                    } else {
                        System.out.printf("Жена : %s \n", tree.get(i).partner);
                    }
                }
            }
        }
        System.out.println();

        //Проверяем родственные связи
        List<People> children = new ArrayList<People>();
        for (int i = 0; i < tree.size(); i++) {
            if (user.personName != tree.get(i).personName & user.dateOfBitrh != tree.get(i).dateOfBitrh) {
                if (user.mother.equals(tree.get(i).mother) || user.father.equals(tree.get(i).father)) {
                    if (tree.get(i).gender.equals("Женский")) {
                        System.out.printf("Сестра: %s \n", tree.get(i).personName);
                    }
                    if (tree.get(i).gender.equals("Мужской")) {
                        System.out.printf("Брат: %s \n", tree.get(i).personName);
                    }
                }
                if (user.partner.equals(tree.get(i).personName)) {
                    if (user.gender.equals("Мужской")) {
                        System.out.printf("Теща: %s \n", tree.get(i).mother);
                        System.out.printf("Тесть: %s \n", tree.get(i).father);
                    }
                    if (user.gender.equals("Женский")) {
                        System.out.printf("Свекровь: %s \n", tree.get(i).mother);
                        System.out.printf("Свекор: %s \n", tree.get(i).father);
                    }
                }
                if (user.personName.equals(tree.get(i).father) || user.personName.equals(tree.get(i).mother)) {
                    children.add(tree.get(i));
                }
            }
        }
        if (children.size() == 0) {
            System.out.println("Детей нет");
        } else {
            for (int i = 0; i < children.size(); i++) {
                System.out.printf("Ребенок: %s \n", children.get(i).personName);
            }
            System.out.println();
        }
    }
}
