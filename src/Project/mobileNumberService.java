package Project;
import  java.util.*;

public class mobileNumberService {
    private Map<String,phoneNumber> numMp = new HashMap<>();
    public void setPhoneNumber(String number,String AdhaarNumber,String name,String isp)
    {
        numMp.put(number,new phoneNumber(number,AdhaarNumber,name,isp));
    }

    public phoneNumber getNumber(String phoneNumber)
    {
        if(numMp.containsKey(phoneNumber))
        {
            return numMp.get(phoneNumber);
        }
        else
        {
            return null;
        }
    }

}
