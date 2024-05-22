import java.util.*;

class SimpleCalc {
    public static void calc(){
 Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the First number");
    int a = sc.nextInt();
    
    System.out.println("Enter the Second number");
    int b = sc.nextInt();
    
    System.out.print("Enter the operator (+,-,*,/): ");
    char op = sc.next().charAt(0);
    
    switch (op) {
        case '+':
            System.out.println(a + " + " + b + " = " + (a + b));
            
            break;
            case '-':
            System.out.println(a + " - " + b + " = " + (a - b));
            break;
            case '*':
            System.out.println(a + " * " + b + " = " + (a * b));
            break;
            case '/':
            System.out.println(a + " / " + b + " = " + (a / b));
            break;
    
        default:
        System.out.println("UNKNOWN OPERATOR");
            break;
    }

    }


public static void main(String[] args) {
    calc();
}
}