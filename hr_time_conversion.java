import java.util.Scanner;
public class hr_time_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] time_split = time.split(":");
        String am_pm = time_split[2].substring(2, 4);
        int hour = Integer.parseInt(time_split[0]);
        int min = Integer.parseInt(time_split[1]);
        int sec = Integer.parseInt(time_split[2].substring(0, 2));
        if(am_pm.equals("AM") && hour == 12)
                hour = 0;
        else if (am_pm.equals("PM") && hour != 12)
                hour = hour + 12;
        System.out.printf("%02d:%02d:%02d",hour,min,sec);
    }
}
