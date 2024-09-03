package findMyTrain;
import java.util.*;
public class FindMyTrainSystem {
    private Map<String,Station> stations = new HashMap<>();
    private Map<String,train>  trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStation(Station station)
    {
        stations.put(station.getStationId(),station);
    }

    public void addTrain(train tran)
    {
        trains.put(tran.getTrainId(),tran);
    }

    public void addSchedule(Schedule schedule)
    {
        schedules.add(schedule);
    }

    public List<Schedule> findMyTrain(String startStation,String endStationId)
    {
        List<Schedule> res = new ArrayList<>();
        for(Schedule schedule:schedules)
        {
            if(schedule.getTran().getSrcStation().equals(startStation) ||
               schedule.getTran().getDestStation().equals(endStationId))
            {
                res.add(schedule);
            }
        }
        return res;
    }
}
