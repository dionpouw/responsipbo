package responsi3;

public class HiddenData {
    public static void main(String[] args) {
        // akses ke private class
        DayWeek dw = new DayWeek();
        int Day;
        String strDay;

        Day = dw.Get(); // Day = 1
        strDay = dw.GetName(); // strDay = "Monday"

        System.out.println("Day = " + Day);
        System.out.println("strDay = " + strDay);

        // setel hari baru
        dw.Set(3);

        // check
        Day = dw.Get(); // Day = 3
        strDay = dw.GetName(); // strDay = "Wednesday"

        System.out.println("Day = " + Day);
        System.out.println("strDay = " + strDay);
    }
}