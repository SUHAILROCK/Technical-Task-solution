//11.How to convert string to date in java in yyyy-mm-dd format?
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dataFormat {
    public static void main(String[] args) {
        String dateString = "2023-04-02";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println(date);
    }
}
//               output:
//           2023-04-02 
