package findMyTrain;

public class train {
    private String trainId;
    private String trainName;
    private String trainType;
    private String srcStation;
    private String destStation;

    public train(String trainId, String trainName, String trainType,String src,String dest) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.trainType = trainType;
        this.srcStation = src;
        this.destStation = dest;
    }

    @Override
    public String toString() {
        return "train{" +
                "trainId='" + trainId + '\'' +
                ", trainName='" + trainName + '\'' +
                ", trainType='" + trainType + '\'' +
                '}';
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getSrcStation() {
        return srcStation;
    }

    public String getDestStation() {
        return destStation;
    }


}
