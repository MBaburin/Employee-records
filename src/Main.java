import java.util.Scanner;

class Main{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        Greetings greetings = new Greetings();

        for(int i = 0; i < 999; i++){
               System.out.println(" ");
               greetings.greetings();
               switch (sc.nextInt()){
                   case (1):
                       System.out.println("Укажите имя");
                       employee.setName(sc.next());
                       System.out.println("Укажите возраст");
                       employee.setAge(sc.nextInt());
                       System.out.println("Укажите отдел");
                       employee.setDepartment(sc.next());
                       System.out.println("Укажите  должность");
                       employee.setJob_title(sc.next());
                       System.out.println("Укажите номер удостоверения");
                       employee.setCertificate_number(sc.next());
                       break;
                   case (2):
                       System.out.println("Информация о сотруднике");
                       employee.info();
                       break;
                   case (3):
                       System.out.println("Смена имени");
                       employee.changeName(sc.next());
                       System.out.println("Смена возраста");
                       employee.changeAge(sc.nextInt());
                       break;
                   case (4):
                       System.out.println("Смена отдела");
                       employee.changeDepartment(sc.next());
                       System.out.println("Смена дожности");
                       employee.changeJob_title(sc.next());
                       System.out.println("Смена Номера удостоверения");
                       employee.changeCertificate_number(sc.next());
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

