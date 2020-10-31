package leetcode;

public class DayOfYear {
    public int dayOfYear(String date) {
        int day = 0;
        boolean isLeapYear = false;

        // 非闰年每月天数
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] dateArr;
        int[] temp = new int[3];
        String delimeter = "-";

        dateArr = date.split(delimeter);

        for (int i = 0; i < dateArr.length; i++)
            temp[i] = Integer.parseInt(dateArr[i]);


        isLeapYear = leapYear(temp[0]);
        if (isLeapYear) {
            monthDays[1] = 29;
        }

        for (int i = 0; i < temp[1] - 1; i++) {
            day += monthDays[i];
        }
        day += temp[2];

        return  day;
    }

    public boolean leapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println("Day of Year");

        DayOfYear DOY = new DayOfYear();

        int day = 0;
        String date = "2020-08-20";

        day = DOY.dayOfYear(date);
        System.out.println(day);
    }
}
