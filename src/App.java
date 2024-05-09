import java.util.Scanner;
public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        System.out.println("Product ID Generator: ");
        System.out.println("----------------------");
        System.out.println("Please Enter Product Information");
        System.out.println("Product Category (only letters with a length more than 2):");
        checker input = new ProductCategory();
        loopChecker(input);
        sb.append(input.getOutput());
        sb.append("-");



        System.out.println("Product Code (consist only of 3 digits): ");
        input = new ProductCode();
        loopChecker(input);
        sb.append(input.getOutput());
        sb.append("-");

        System.out.println("Manufacturing Year: ");
        input = new ManufacturingYear();
        loopChecker(input);
        sb.append(input.getOutput());
        sb.append("-");


        System.out.println("Stock Reference Number: ");
        input = new ReferenceNumber();
        loopChecker(input);
        sb.append(input.getOutput());

        System.out.println(sb.toString());
    }
    public static void loopChecker(checker checkClass) {
        while(true){
            String input = sc.nextLine();
            if(checkClass.check(input)){
                checkClass.setOutput(input);
                break;
            }
            else{
                System.out.println("Invalid input, please try again: ");
                continue;
            }
        }
    }
}
