public class DayOFWeekMain {
    public static void main(String[] args) {


    getWorkingHours(DayOfWeek.Friday);

    }

    public static void getWorkingHours(DayOfWeek dayOfWeek){
       int countHours = 0;

        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
       for (int i = dayOfWeek.ordinal(); i < dayOfWeeks.length; i++) {
           if (dayOfWeek.getWorkHours() == 0) {
               System.out.println(dayOfWeeks[i] + " - выходной день!");
               return;
           }else {
               countHours += dayOfWeeks[i].getWorkHours();
           }
        }

        System.out.println("Сегодня " + dayOfWeek);
        System.out.println("Осталось " + countHours + " рабочих часов ");

    }
}
