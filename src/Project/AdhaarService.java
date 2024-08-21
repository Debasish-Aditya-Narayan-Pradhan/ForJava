package Project;

import java.util.*;

public class AdhaarService {
    private static Map<String,Adhaar> aadharMap = new HashMap<>();
//    static
//    {
//        aadharMap.put("122324553",new Adhaar("122324553","Debasish","Manabhanjan Pradhan","bbst"));
//
//    }
    public void setAdhrInfo(String mobileNumber,String AdhaarNumber,String Name,String fName,String Address)
    {
        aadharMap.put(AdhaarNumber,new Adhaar(mobileNumber,AdhaarNumber,Name,fName,Address));
    }
    public Adhaar getAadharrByNumber(String mobileNumber)
    {
        for(Adhaar a:aadharMap.values())
        {
            if(a.getNumber().equals(mobileNumber))
            {
                return a;
            }
        }
        return null;
    }
}
