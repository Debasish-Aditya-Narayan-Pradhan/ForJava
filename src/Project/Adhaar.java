package Project;

public class Adhaar {

    private String adhaarNo;
    private  String mobileNumber;
    private String name;
    private String fatherName;
    private String Address;

    public Adhaar(String number,String adhaarNo, String name, String fatherName, String address) {
        this.adhaarNo = adhaarNo;
        this.name = name;
        this.fatherName = fatherName;
        this.mobileNumber= number;
        this.Address = address;
    }

    @Override
    public String toString() {
        return "Adhaar{" +
                "adhaarNo='" + adhaarNo + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public String getAdhaarNo() {
        return adhaarNo;
    }

    public String getNumber() {
        return mobileNumber;
    }

    public void setNumber(String number) {
        this.mobileNumber = number;
    }

    public void setAdhaarNo(String adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
