import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<String>l= new SinglyLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice;
        while (true)
        {
            System.out.printf("1 add first 2 add last 3 remove first 4 size 5 Is the list empty? -1 exit");
            System.out.println("input your choice: ");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input an element: ");
                    l.addFirst(in.next());
                    System.out.println(l.first()+" was added successfully");
                    break;
                case 2:
                    System.out.println("input an element: ");
                    l.addLast(in.next());
                    System.out.println(l.last()+" was added successfully");
                    break;
                case 3:
                    System.out.println(l.removeFirst()+" was deleted  successfully");
                    break;
                case 4:
                    System.out.println(l.size()+" is the size of the list");
                    break;
                case 5:
                    System.out.println(" Is the list empty? "+l.isEmpty());
                    break;
                case -1:
                    System.out.println("Good bye");
                    System.exit(0);
                    break;
            }
            System.out.println("List elements are : "+l.getAll());
        }

    }
}
