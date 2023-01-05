import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
    

public class FamilyTree {
    
    
    public static void main(String[] args) {
    
        People person1 = new People();
        person1.id = 1;
        person1.personName = "Романов Николай Аександрович";
        person1.gender = "Мужской";
        person1.dateOfBitrh = "18.5.1868";
        person1.mother = "Романова Мария Федоровна";
        person1.father = "Романов Александр Александрович";
        person1.mariralStatus = "Женат";
        person1.partner = "Романова Александра Федоровна";
    
        People person2 = new People();
        person2.id = 2;
        person2.personName = "Романова Александра Федоровна";
        person2.gender = "Женский";
        person2.dateOfBitrh = "6.6.1872";
        person2.mother = "Гессенская Алиса";
        person2.father = "Гессенский Людвиг";
        person2.mariralStatus = "Замужем";
        person2.partner = "Романов Николай Аександрович";
    
        People person3 = new People();
        person3.id = 3;
        person3.personName = "Романова Ольга Николаевна";
        person3.gender = "Женский";
        person3.dateOfBitrh = "3.11.1895";
        person3.mother = "Романова Александра Федоровна";
        person3.father = "Романов Николай Аександрович";
        person3.mariralStatus = "Не замужем";
        person3.partner = "Нет";
               
        People person4 = new People();
        person4.id = 4;
        person4.personName = "Романова Татьяна Николаевна";
        person4.gender = "Женский";
        person4.dateOfBitrh = "10.6.1897";
        person4.mother = "Романова Александра Федоровна";
        person4.father = "Романов Николай Аександрович";
        person4.mariralStatus = "Не замужем";
        person4.partner = "Нет";
    
        People person5 = new People();
        person5.id = 5;
        person5.personName = "Романова Мария Николаевна";
        person5.gender = "Женский";
        person5.dateOfBitrh = "26.6.1899";
        person5.mother = "Романова Александра Федоровна";
        person5.father = "Романов Николай Аександрович";
        person5.mariralStatus = "Не замужем";
        person5.partner = "Нет";
    
        People person6 = new People();
        person6.id = 6;
        person6.personName = "Романова Анастасия Николаевна";
        person6.gender = "Женский";
        person6.dateOfBitrh = "18.6.1901";
        person6.mother = "Романова Александра Федоровна";
        person6.father = "Романов Николай Аександрович";
        person6.mariralStatus = "Не замужем";
        person6.partner = "Нет";
    
        People person7 = new People();
        person7.id = 7;
        person7.personName = "Романов Алексей Николаевич";
        person7.gender = "Мужской";
        person7.dateOfBitrh = "12.8.1904";
        person7.mother = "Романова Александра Федоровна";
        person7.father = "Романов Николай Аександрович";
        person7.mariralStatus = "Не женат";
        person7.partner = "Нет";
    
        People person8 = new People();
        person8.id = 8;
        person8.personName = "Романов Александр Александрович";
        person8.gender = "Мужской";
        person8.dateOfBitrh = "10.3.1845";
        person8.mother = "Романова Мария Александровна";
        person8.father = "Романов Александр Николаевич";
        person8.mariralStatus = "Женат";
        person8.partner = "Романова Мария Федоровна";
    
        People person9 = new People();
        person9.id = 9;
        person9.personName = "Романова Мария Федоровна";
        person9.gender = "Женский";
        person9.dateOfBitrh = "26.11.1847";
        person9.mother = "Глюксборг Луиза";
        person9.father = "Глюксборг Кристиан";
        person9.mariralStatus = "Замужем";
        person9.partner = "Романов Александр Александрович";

        People person10 = new People();
        person10.id = 10;
        person10.personName = "Гессенский Людвиг";
        person10.gender = "Мужской";
        person10.dateOfBitrh = "12.9.1837";
        person10.mother = "Прусская Елизавета";
        person10.father = "Гессенский Карл";
        person10.mariralStatus = "Женат";
        person10.partner = "Гессенская Алиса";
    
        People person11 = new People();
        person11.id = 11;
        person11.personName = "Гессенская Алиса";
        person11.gender = "Женский";
        person11.dateOfBitrh = "25.4.1843";
        person11.mother = "Александрина Виктория";
        person11.father = "Альберт Саксен-Кобург-Готского";
        person11.mariralStatus = "Замужем";
        person11.partner = "Гессенский Людвиг";

        People person12 = new People();
        person12.id = 12;
        person12.personName = "Романов Александр Аександрович";
        person12.gender = "Мужской";
        person12.dateOfBitrh = "26.5.1869";
        person12.mother = "Романова Мария Федоровна";
        person12.father = "Романов Александр Александрович";
        person12.mariralStatus = "Не женат";
        person12.partner = "Нет";

        People person13 = new People();
        person13.id = 13;
        person13.personName = "Романов Георгий Аександрович";
        person13.gender = "Мужской";
        person13.dateOfBitrh = "27.4.1871";
        person13.mother = "Романова Мария Федоровна";
        person13.father = "Романов Александр Александрович";
        person13.mariralStatus = "Не женат";
        person13.partner = "Нет";

        People person14 = new People();
        person14.id = 14;
        person14.personName = "Романова Ксения Аександровна";
        person14.gender = "Женский";
        person14.dateOfBitrh = "25.3.1875";
        person14.mother = "Романова Мария Федоровна";
        person14.father = "Романов Александр Александрович";
        person14.mariralStatus = "Замужем";
        person14.partner = "Романов Александр Михайлович";
        person14.partner = "Нет";
  
        List<People> tree = new ArrayList<People>(Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10, person11, person12, person13, person14));


        People user = new People();
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите ID человека из генеалогического древа (1-14): ");
        int id = in.nextInt();
        in.close();
    
        for (int i = 0; i < tree.size(); i++) {
            if (id == tree.get(i).id) {
                tree.get(i).info();
                user = tree.get(i);
                if ((tree.get(i).partner.equals("Не замужем")) || (user.partner.equals("Не женат"))) {
                    System.out.printf("Нет спутника жизни");
                }
                else {
                    if (tree.get(i).gender.equals("Женский")) {
                        System.out.printf("Муж : %s \n", tree.get(i).partner);
                    }
                    else{
                        System.out.printf("Жена : %s \n", tree.get(i).partner);
                    }
                }       
            }
        }
        System.out.println();
        
            
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
            if(children.size() == 0){
                System.out.println("Детей нет");
            }
            else{
                for (int i = 0; i < children.size(); i++) {
                    System.out.printf("Ребенок: %s \n", children.get(i).personName);
                }
                System.out.println();
            }
        }           
    }
