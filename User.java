import java.awt.*; 
import java.applet.*; 
public class User extends Applet 
{ 
      public void init()
    {
       String str;
       str = getParameter("username"); 
       str = "Hello "+ str; 
    }
      public void paint(Graphics g) 
    { 
	super.paint(g);
   g.drawString("str",10,100); 
    } 
} // import java.util.*;

// class User {
//     String name;
//     String email;
//     String password;
//     List<Email> inbox;
//     List<Email> sentItems;

//     // Constructor
//     User(String name, String email, String password) {
//         this.name = name;
//         this.email = email;
//         this.password = password;
//         inbox = new ArrayList<>();
//         sentItems = new ArrayList<>();
//     }

//     // Method to send an email
//     void sendEmail(User recipient, String subject, String body) {
//         Email email = new Email(this, recipient, subject, body);
//         recipient.receiveEmail(email);
//         sentItems.add(email);
//     }

//     // Method to receive an email
//     void receiveEmail(Email email) {
//         inbox.add(email);
//     }
// }

// class Email {
//     User sender;
//     User recipient;
//     String subject;
//     String body;

//     // Constructor
//     Email(User sender, User recipient, String subject, String body) {
//         this.sender = sender;
//         this.recipient = recipient;
//         this.subject = subject;
//         this.body = body;
//     }
// }

// public class EmailSystem {
//     static Scanner scanner = new Scanner(System.in);
//     static List<User> users = new ArrayList<>();
//     static User currentUser;

//     public static void main(String[] args) {
//         while (true) {
//             System.out.println("1. Register\n2. Login\n3. Exit");
//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume newline
//             switch (choice) {
//                 case 1:
//                     register();
//                     break;
//                 case 2:
//                     login();
//                     break;
//                 case 3:
//                     System.out.println("Exiting...");
//                     System.exit(0);
//                 default:
//                     System.out.println("Invalid choice");
//             }
//         }
//     }

//     static void register() {
//         System.out.println("Enter your name:");
//         String name = scanner.nextLine();
//         System.out.println("Enter your email:");
//         String email = scanner.nextLine();
//         System.out.println("Enter your password:");
//         String password = scanner.nextLine();
//         User newUser = new User(name, email, password);
//         users.add(newUser);
//         System.out.println("Registration successful!");
//     }

//     static void login() {
//         System.out.println("Enter your email:");
//         String email = scanner.nextLine();
//         System.out.println("Enter your password:");
//         String password = scanner.nextLine();
//         for (User user : users) {
//             if (user.email.equals(email) && user.password.equals(password)) {
//                 currentUser = user;
//                 System.out.println("Login successful!");
//                 emailSystemMenu();
//                 return;
//             }
//         }
//         System.out.println("Invalid email or password.");
//     }

//     static void emailSystemMenu() {
//         while (true) {
//             System.out.println("\n1. Compose Email\n2. Inbox\n3. Sent Items\n4. Logout");
//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume newline
//             switch (choice) {
//                 case 1:
//                     composeEmail();
//                     break;
//                 case 2:
//                     viewInbox();
//                     break;
//                 case 3:
//                     viewSentItems();
//                     break;
//                 case 4:
//                     System.out.println("Logging out...");
//                     return;
//                 default:
//                     System.out.println("Invalid choice");
//             }
//         }
//     }

//     static void composeEmail() {
//         System.out.println("Enter recipient's email:");
//         String recipientEmail = scanner.nextLine();
//         User recipient = getUserByEmail(recipientEmail);
//         if (recipient == null) {
//             System.out.println("Recipient not found.");
//             return;
//         }
//         System.out.println("Enter subject:");
//         String subject = scanner.nextLine();
//         System.out.println("Enter body:");
//         String body = scanner.nextLine();
//         currentUser.sendEmail(recipient, subject, body);
//         System.out.println("Email sent!");
//     }

//     static void viewInbox() {
//         System.out.println("\nInbox:");
//         for (Email email : currentUser.inbox) {
//             System.out.println("From: " + email.sender.name);
//             System.out.println("Subject: " + email.subject);
//             System.out.println("Body: " + email.body);
//             System.out.println("-------------");
//         }
//     }

//     static void viewSentItems() {
//         System.out.println("\nSent Items:");
//         for (Email email : currentUser.sentItems) {
//             System.out.println("To: " + email.recipient.name);
//             System.out.println("Subject: " + email.subject);
//             System.out.println("Body: " + email.body);
//             System.out.println("-------------");
//         }
//     }

//     static User getUserByEmail(String email) {
//         for (User user : users) {
//             if (user.email.equals(email)) {
//                 return user;
//             }
//         }
//         return null;
//     }
// }
