package findMyTrain;

import java.util.*;

public class findMyTrainApp {
    public static void main(String[] args) {
        FindMyTrainSystem fms = new FindMyTrainSystem();

        // adding new station
        Station station1 = new Station("S00333","Agra");
        Station station2 = new Station("S00444","Lucknow");

        Station station3 = new Station("S00555","kolkata");
        Station station4 = new Station("S00666","Banglore");

        // adding new trains

        train train1 = new train("12408","Duranto Exp","Express","S00333","S00444");
        train train2 = new train("12608","Intercity","Passenger","S00555","S00666");
        train train3 = new train("12708","Prasanti Exp","Express","S00333","S00444");


        PlatForm p1 = new PlatForm(1);
        PlatForm p2 = new PlatForm(2);
        PlatForm p3 = new PlatForm(3);

        p1.setTran(train1);
        p2.setTran(train2);
        p3.setTran(train3);

        List<PlatForm> platFormList = new ArrayList<>();
        platFormList.add(p1);
        platFormList.add(p2);
        platFormList.add(p3);

        station1.setPlatFormList(platFormList);

        Schedule s1 = new Schedule(train1,station1,"9AM","9:05AM",p1);
        Schedule s2 = new Schedule(train2,station2,"10AM","10:03AM",p2);
        Schedule s3 = new Schedule(train3,station1,"11AM","10:05AM",p3);

        fms.addStation(station1);
        fms.addStation(station2);
        fms.addStation(station3);
        fms.addStation(station4);


        fms.addTrain(train1);
        fms.addTrain(train2);
        fms.addTrain(train3);

        fms.addSchedule(s1);
        fms.addSchedule(s2);
        fms.addSchedule(s3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source: ");
        String src = sc.nextLine();
        System.out.print("Enter the destination: ");
        String dest =sc.nextLine();

        List<Schedule> myTrains = fms.findMyTrain(src,dest);
        System.out.println("-------------------------------------------------------------------");
        for(Schedule schedule:myTrains)
        {
            System.out.println(schedule.getPlatForm());
            System.out.println("Arrival Time: "+schedule.getArrivalTime());
            System.out.println("Departure Time: "+schedule.getDepartureTime());
            System.out.println("-------------------------------------------------------------------");
        }


    }
}
