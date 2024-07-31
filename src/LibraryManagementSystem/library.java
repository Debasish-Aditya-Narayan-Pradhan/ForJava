package LibraryManagementSystem;

import java.util.*;

public class library {
    static  Scanner sc = new Scanner(System.in);
    static class Book
    {
        String Name;
        String Authore;
        String publication;
    }
    static  Map<String,Book> bk = new HashMap<>();
    public static void addBook()
    {
        Book b = new Book();
        System.out.print("Enter Name of Book: ");
        b.Name= sc.nextLine();
        System.out.print("Enter Authore Name: ");
        b.Authore = sc.nextLine();
        System.out.print("Enter the publication Date: ");
        b.publication = sc.nextLine();

        bk.put(b.Name,b);
        System.out.println("Book Successfully Added!");
    }
    public static void searchBook()
    {
        if(bk.size() == 0)
        {
            System.out.println("There is no book!!");
        }
        else
        {
            boolean chBkNm = true;
            while(chBkNm) {
                System.out.print("Enter the Book Name: ");
                String bookNm = sc.nextLine();
                if (bk.containsKey(bookNm)) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Name: "+bk.get(bookNm).Name);
                    System.out.println("Authore: "+bk.get(bookNm).Authore);
                    System.out.println("Publication: "+bk.get(bookNm).publication);
                    System.out.println("-----------------------------------------");
                    chBkNm = false;
                } else {
                    System.out.println("Either the book name is not correct or The book is not here!");
                }
            }
        }
    }
    public static void deleteBook()
    {
        if(bk.size() == 0)
        {
            System.out.println("There is no book to delete");
        }
        else
        {
            System.out.println("Enter the book name: ");
            String bkName = sc.nextLine();
            if(bk.containsKey(bkName))
            {
                bk.remove(bkName);
                System.out.println("Book is successfully deleted");
            }
            else
            {
                System.out.println("Book is not here");
            }
        }
    }
    public static  void viewBook()
    {
        if(bk.size() == 0)
        {
            System.out.println("There is no books:)");
        }
        else
        {
            for(String s :bk.keySet())
            {
                System.out.println("--------------------------------------------");
                System.out.println("Name: "+bk.get(s).Name);
                System.out.println("Authore: "+bk.get(s).Authore);
                System.out.println("Publication Date: "+bk.get(s).publication);
                System.out.println("--------------------------------------------");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pass = "12345";
        String AdmPass = "Adm555";
        System.out.print("Enter the password: ");
        String passStr = sc.nextLine();
        if(pass.equals(passStr))
        {
            int ch;
            do {
                System.out.print("Are you \n1:Admin\n2:Student\n0:Exit\nEnter your choice: ");
                ch = sc.nextInt();
                sc.nextLine();
                if (ch == 1) {
                    System.out.println("Enter the Admin Pass: ");
                    String adP = sc.nextLine();

                    if(adP.equals(AdmPass))
                    {
                        int AdCho= 0;
                        do {

                            System.out.println("0:Exit\n1:AddBook\n2:DeleteBook\n3:SearchBook\n4:ViewBook\nEnter your choice: ");
                            AdCho = sc.nextInt();
                            switch (AdCho) {
                                case 1:
                                    addBook();
                                    break;
                                case 2:
                                   deleteBook();
                                    break;
                                case 3:searchBook();
                                     break;
                                case 4:viewBook();
                                    break;
                                default: if(AdCho != 0) System.out.println("Invalid choice!");

                            }
                        }while(AdCho != 0);
                    }
                    else
                    {
                        System.out.println("Wrong Password!!");
                    }
                } else if (ch == 2) {
                    viewBook();
                } else {
                   if(ch != 0) System.out.println("Worng choice: ");
                }
            }while (ch!= 0);
        } else
        {
            System.out.println("Password is wrong!");
        }
    }
}
