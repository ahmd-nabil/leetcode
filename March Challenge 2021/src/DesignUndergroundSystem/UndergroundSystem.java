package DesignUndergroundSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {
    Map<Integer, CheckIn> checkIns = new HashMap<>();
    Map<String, List<Integer>> distances = new HashMap<>();
    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn checkIn = checkIns.get(id);
        String route = checkIn.stationName + ':' + stationName;
        int time = t - checkIn.time;
        distances.computeIfAbsent(route, s -> new ArrayList<>()).add(time);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + ':' + endStation;
        List<Integer> list = distances.get(route);
        if(list == null) return 0;

        double sum = 0;
        for(int time: list) {
            sum += time;
        }
        return sum / list.size();
    }

    static class CheckIn {
        public CheckIn(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }

        String stationName;
        int time;
    }
}
