public class People {

    int id;
    String personName;
    String gender;
    String dateOfBitrh;
    String mother;
    String father;
    String mariralStatus;
    String partner;

    public void info() {
        System.out.println();
        System.out.printf("ФИО: %s \n", this.personName);
        System.out.printf("Пол: %s \n", this.gender);
        System.out.printf("Дата рождения: %s \n", this.dateOfBitrh);
        System.out.printf("Мать: %s \n", this.mother);
        System.out.printf("Отец: %s \n", this.father);
        System.out.printf("Семейное положение: %s \n", this.mariralStatus);
    }
}