package ro.jademy.phonebook;

import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
         displayMenu();
      PhoneBook phonebook = new PhoneBook();
      Scanner scan = new Scanner(System.in);
      boolean ok = false;
      do{
          displayMenu();
          int option = scan.nextInt();

      }
      while (!ok);





    }
    public static void displayMenu(){
        System.out.println("1.Show contact list");
        System.out.println("2.Add contact");
        System.out.println("3.Remove contact");
    }



}
