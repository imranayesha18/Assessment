import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {

    void TicketCreation() {
        System.out.print("please enter your Emp id : ");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.print("please enter your name : ");
        String name = sc.next();
        System.out.print("please enter your issue in detail : ");
        String issue = sc.next();
        //System.out.println("Ticket is created by Id "+ id  +" name "+ name +" having " +  issue +" issues");
        System.out.println("please enter the type of department");
        String depart = sc.next();

    }

    void Department(String dp) {
        System.out.println("Enter the department name");
    }
    if(dp.equals("IT"))

    {
        System.out.println("Inside IT Team ");
        Scanner sc = new Scanner(System.in);
        String status = sc.nextLine();
        if (status.equals("work done")) {
            System.out.println("no current issue");
        } else {
            System.out.println("issue found");
        }
    }
    else if(dp.equals("Finance"))

    {
        System.out.println("Inside Finance Team ");
        Scanner sc = new Scanner(System.in);
        String status = sc.nextLine();
        if (status.equals("work done")) {
            System.out.println("issue fixed");
        } else {
            System.out.println("will be fixed");
        }
    }
    else if(dp.equals("HR"))

    {
        System.out.println("Inside HR Team ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("work done")) {
            System.out.println("fixed issue");
        } else {
            System.out.println("will be fixed");
        }
    }
    else

    {
        System.out.println("Inside Facility Team ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("work done")) {
            System.out.println("fixed issue");
        } else {
            System.out.println("will be fixed");
        }
        System.out.println(" Press 1 for IT Team");
        System.out.println(" Press 2 for Finance Team");
        System.out.println(" Press 3 for HR Team");
        System.out.println(" Press 4 for Facility Team");
        System.out.println(" Press 5 for Exit");
        sc = new Scanner(System.in);
        int type=sc.nextInt();
        switch (type) {
            case 1:
                System.out.println(" IT Team");
                System.out.println("press 1 for raising a ticket ");
                int options1 = sc.nextInt();
                Ticket t1 = new Ticket();
                t1.TicketCreation();
                System.out.println("Ticket created");
                String sent=sc.next();
                System.out.println("ticket is created with the ticket number " + ticketNumber );
                break;
            case 2:
                System.out.println("inside HR Team");
                System.out.println("press 1 for raising ticket");
                int result2 = sc.nextInt();
                Ticket t2 = new Ticket();
                if (result2==1) {
                    t2.TicketCreation();
                    System.out.println("To whom the ticket is sent");
                    String dp=sc.next();
                    System.out.println("ticket is created with the ticket number "
                }
                break;
            case 3:
                System.out.println("Hello This is Finance Team");
                System.out.println("press 1 for raising a ticket");
                int result3 = sc.nextInt();
                Ticket t3 = new Ticket();
                if (result3==1) {
                    t3.TicketCreation();
                    System.out.println("To whom the ticket is sent");
                    String dp=sc.next();
                    System.out.println("ticket is created with the ticket number " +ticketNumber );
                }
                break;
            case 4:
                System.out.println("Hello This is Facility Team");
                System.out.println("press 1 for raising a ticket");
                int options4 = sc.nextInt();
                Ticket t4 = new Ticket();
                if (result4==1) {
                    t4.TicketCreation();
                    System.out.println("To whom the ticket is sent");
                    String dp=sc.next();
                    System.out.println("ticket is created with the ticket number " + +ticketNumber );
                }
                break;

        }
    } }


}

