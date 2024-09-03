package findMyTrain;
import  java.util.*;

public class Station {
    private String stationId;
    private String stationNa,e;
    private List<PlatForm> platFormList;

    public Station(String stationId, String stationNa) {
        this.stationId = stationId;
        this.stationNa = stationNa;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationNa='" + stationNa + '\'' +
                ", platFormList=" + platFormList +
                '}';
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationNa() {
        return stationNa;
    }

    public void setStationNa(String stationNa) {
        this.stationNa = stationNa;
    }


    public List<PlatForm> getPlatFormList() {
        return platFormList;
    }

    public void setPlatFormList(List<PlatForm> platFormList) {
        this.platFormList = platFormList;
    }
}
