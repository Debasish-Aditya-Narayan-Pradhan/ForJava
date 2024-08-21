package Project;

import java.util.Scanner;

        public class PanAdhaarMatchApp {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                mobileNumberService mns = new mobileNumberService();
                mns.setPhoneNumber("9045783456","845735743298","Debasish Pradhan","Airtel");
                AdhaarService adhaarService = new AdhaarService();
                panService panservice = new panService();
                adhaarService.setAdhrInfo("9045783456","845735743298","Debasish Pradhan","Manabhnanjan Pradha","Odisha");
                panservice.setPanInfo("9045783456","ABCDEBA","845735743298","UNION BANK","Stock");
                System.out.print("Enter the mobile Number: ");
                String phoneNumber = sc.nextLine();

        phoneNumber pn = mns.getNumber(phoneNumber) ;
        Adhaar adhar = adhaarService.getAadharrByNumber(phoneNumber);
        Pan pan = panservice.getPanByAddhar(phoneNumber);
        if(pn != null)
        {
            System.out.println("Mobile Details = "+pn);
            System.out.println("Aadhaar Details = "+adhar);
            System.out.println("Pan details = "+pan);
        }
        else
        {
            System.out.println("Not found!");
        }
    }
}
