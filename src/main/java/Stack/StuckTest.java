package Stack;

import java.util.Scanner;

public class StuckTest {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        StackOrganization so = new StackOrganization();

        int size = so.SetSize(5);
        int count= 0;
        while (count<=size){
            if (count<size){
            System.out.println("put in String:");
            String x = san.next();
            so.push(new Node(x));

            }else {
                System.out.println("Stack Overflow");
            }
            count++;
        }

        so.printList();
        so.pop();
        so.pop();
        so.printList();

    }
}
