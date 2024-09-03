package findMyTrain;

public class PlatForm {

    private int platFormNumber;
    private train tran;

    public PlatForm(int platFormNumber) {
        this.platFormNumber = platFormNumber;
    }

    @Override
    public String toString() {
        return "PlatForm{" +
                "platFormNumber=" + platFormNumber +
                ", tran=" + tran +
                '}';
    }

    public int getPlatFormNumber() {
        return platFormNumber;
    }

    public void setPlatFormNumber(int platFormNumber) {
        this.platFormNumber = platFormNumber;
    }

    public train getTran() {
        return tran;
    }

    public void setTran(train tran) {
        this.tran = tran;
    }
}
