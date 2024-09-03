package findMyTrain;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Schedule {
    private train tran;
    private Station station;
    private String arrivalTime;
    private String departureTime;
    private PlatForm platForm;

    public Schedule(train tran, Station station, String arrivalTime, String departureTime, PlatForm platForm) {
        this.tran = tran;
        this.station = station;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.platForm = platForm;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "tran=" + tran +
                ", station=" + station +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", platForm=" + platForm +
                '}';
    }

    public train getTran() {
        return tran;
    }

    public void setTran(train tran) {
        this.tran = tran;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public PlatForm getPlatForm() {
        return platForm;
    }

    public void setPlatForm(PlatForm platForm) {
        this.platForm = platForm;
    }
}
