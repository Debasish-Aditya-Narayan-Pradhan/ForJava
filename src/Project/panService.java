package Project;

import java.util.*;

public class panService {
    private static Map<String,Pan> panMap = new HashMap<>();
//    static
//    {
//        panMap.put("ABCD1432",new Pan("ABCD1432","122324553","HDFC BANK","Stock,ELSS<,FD"));
//    }
    public void setPanInfo(String mobileNumber,String Pan,String Adhar,String bank,String invest)
    {
        panMap.put(Pan,new Pan(mobileNumber,Pan,Adhar,bank,invest));
    }
    public Pan getPanByAddhar(String mobileNumber)
    {
        for(Pan pan:panMap.values())
        {
            if(pan.getMobileNumber().equals(mobileNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
