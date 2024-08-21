package Project;

public class phoneNumber {
    private String mobileNumber;
    private String Addhar;
    private String name;
    private String isp;

    phoneNumber(String mobileNumber,String Addhar,String name,String isp)
    {
        this.mobileNumber = mobileNumber;
        this.Addhar = Addhar;
        this.name = name;
        this.isp = isp;
    }

    @Override
    public String toString() {
        return "phoneNumber{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", Addhar='" + Addhar + '\'' +
                ", name='" + name + '\'' +
                ", isp='" + isp + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddhar() {
        return Addhar;
    }

    public void setAddhar(String addhar) {
        Addhar = addhar;
    }
}
