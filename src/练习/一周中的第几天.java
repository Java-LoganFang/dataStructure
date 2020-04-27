package 练习;

/**
 * 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
 * <p>
 * 输入为三个整数：day、month 和 year，分别表示日、月、年。
 * <p>
 * 您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
 * <p>
 * 输入：day = 31, month = 8, year = 2019
 * 输出："Saturday"
 * <p>
 * 给出的日期一定是在 1971 到 2100 年之间的有效日期。
 * <p>
 * 蔡勒（Zeller）公式
 * w = (d + 2*m+3*(m+1）/5+y+y/4-y/100+y/400)%7;
 * 1970年1月1 周五
 */
public class 一周中的第几天 {
    public static void main(String[] args) {

        int year= 2020;
        int mouth = 4;
        int day = 27;
        int mainyear = 1971;





        System.out.println(dayOfTheWeek(year,mouth,day));


    }


    public static String dayOfTheWeek(int day, int month, int year) {
        int sum = 4;
        if(year!=1971) {
            for(int i = 1971;i<year;i++) {
                sum+=Tianshu(i);
            }
        }



        String[] arr = new String[7];
        arr[0]="Sunday";
        arr[1]="Monday";
        arr[2]="Tuesday";
        arr[3]="Wednesday";
        arr[4]="Thursday";
        arr[5]="Friday";
        arr[6]="Saturday";
        int[] brr = new int[12];
        brr[0] = 31;
        brr[2] = 31;
        brr[3] = 30;
        brr[4] = 31;
        brr[5] = 30;
        brr[6] = 31;
        brr[7] = 31;
        brr[8] = 30;
        brr[9] = 31;
        brr[10] = 30;
        brr[11] = 31;



        if(year%4==0&&year%100!=0||year%400==0) {
            brr[1]=29;
            if(month==1) {
                return arr[(day+sum)%7];
            }
            for(int i = 0;i<month-1;i++) {
                sum+=brr[i];
            }
            sum+=day;
            return arr[sum%7];
        }else {
            brr[1]=28;
            if(month==1) {
                return arr[(day+sum)%7];
            }
            for(int i = 0;i<month-1;i++) {
                sum+=brr[i];
            }
            sum+=day;
            return arr[sum%7];
        }


    }

    public static int Tianshu(int a) {
        if(a%4==0&&a%100!=0||a%400==0) {
            return 366;
        }
        return 365;
    }


}
