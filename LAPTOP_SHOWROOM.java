import java.util.*;
class Laptop{
    int Balance,paid=0,enter;
  
    void Options(int user){
        switch(user){
            case 1:
                System.out.println("you have selected DELL!!");
                System.out.println("It costs you 50000");
                break;
            case 2:
                System.out.println("you have selected Acer!!");
                  System.out.println("It costs you 60000");
                break;
            case 3:
                System.out.println("you have selected Lenovo!!");
                 System.out.println("It costs you 70000");
                break;
            case 4:
                System.out.println("you have selected Asus!!");
                System.out.println("It costs you 80000");
                break;
            case 5:
                System.out.println("you have selected Apple");
                System.out.println("It costs you 90000");
                break;
            case 6:
                System.out.println("you have selected HP");
                System.out.println("It costs you 100000");
                break;
            case 7:
                System.out.println("you have selected MSI");
                System.out.println("It costs you 90000");
                break;
            case 8:
                System.out.println("you have selected Honor");
                System.out.println("It costs you 80000");
                break;
            case 9:
                System.out.println("you have selected Samsung");
                System.out.println("It costs you 70000");
                break;
            case 10:
                System.out.println("you have selected Infinix");
                System.out.println("It costs you 60000");
                break;
        }
                
    }
    void Operation(int function, int enter){
        switch(function){
            case 1:
                 paid=paid+enter;
                System.out.println("amount paid"+paid);
                break;
            case 2:
                 paid=paid+enter;
                 System.out.println("amount paid"+paid); 
                 break;
            case 3:
                 paid=paid+enter;
                 System.out.println("amount paid"+paid);
                 break;
            case 4:
                 paid=paid+enter;
                 System.out.println("amount paid"+paid);
                 break;
            case 5:
                 paid=paid+enter;
                 System.out.println("amount paid"+paid);
                 break;
            case 6:
                paid=paid+enter;
                System.out.println("amount paid"+paid);
                break;
            case 7:
                 paid=paid+enter;
                 System.out.println("amount paid"+paid);
                 break;
            case 8:
                paid=paid+enter;
                System.out.println("amount paid"+paid);
                break;
            case 9:
                paid=paid+enter;
                System.out.println("amount paid"+paid);
                break;
            case 10:
               paid=paid+enter;
               System.out.println("amount paid"+paid);
               break;
           }   
        }
    }
public class LAPTOP_SHOWROOM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int user;
         Laptop lap=new Laptop();
         do{
            System.out.println(" 1.DELL\n 2.ACER\n 3.Lenovo\n 4.Asus\n 5.Apple\n 6.HP\n 7.MSI\n 8.Honor\n 9.samsung\n 10.Infinix\n 11.EXIT\n");
                user=sc.nextInt();
                if(user==1||user==2||user==3||user==4||user==5||user==6||user==7||user==8||user==9||user==10){
                    lap.Options(user);
                System.out.println("enter the amount");
                int enter_amount=sc.nextInt();
                lap.Operation(user,enter_amount);
                }
         else if(user==11){
                System.out.println("Thank you");
            }
            }while(user<11);
            sc.close();
    }
}