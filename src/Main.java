import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        for(int i = 0; i < 999; i++){
               System.out.println("1) Создание персонажа");
               System.out.println("2) Просмотр персонажа");
               System.out.println("3) Смена имени");
               System.out.println("4) Смена возраста");
               System.out.println("5) Выход");
               switch (sc.nextInt()){
                   case (1):
                       System.out.println("Укажите имя");
                       person1.setName(sc.next());
                       System.out.println("Укажите возраст");
                       person1.setAge(sc.nextInt());
                       break;
                   case (2):
                       System.out.println("Информация о персонаже");
                       person1.info();
                       break;
                   case (3):
                       System.out.println("Смена имени");
                       person1.changeName(sc.next());
                       break;
                   case (4):
                       System.out.println("Смена возраста");
                       person1.changeAge(sc.next());
                       break;
                   case (5):
                       System.exit(1);
                   default:
                       System.out.println("Неверное значение");
                       System.out.println(" ");
               }
        }
    }
}

