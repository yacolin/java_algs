package leetcode;

public class ReformatDate {
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] dates = date.split(" ");
        String d = dates[0].replace("th", "").replace("rd", "").replace("nd", "").replace("st", "");
        int m = 0;
        for (int i = 0; i < months.length; i++) {
            if (dates[1].equals(months[i])) {
                m = i + 1;
            }
        }
        return String.format("%s-%s-%s", dates[2], m < 10 ? ("0" + m) : m + "", Integer.parseInt(d) < 10 ? ("0" + d) : d);
    }

    public static void main(String[] args) {
        System.out.println("Reformate Date");

        ReformatDate rd = new ReformatDate();
        String Date = "20th Oct 2052";

        String date = rd.reformatDate(Date);
        System.out.println(date);
    }
}
