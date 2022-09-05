import java.time.ZoneId;

public class ListTimeZone {
    public static void main(String[] args) {
        for (String s: ZoneId.getAvailableZoneIds())
            System.out.println(s);
    }
}
