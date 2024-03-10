import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入開始日期：YYYY/MM/DD");
        String text_First = sc.next();
        System.out.println("請輸入結束日期：YYYY/MM/DD");
        String text_Second = sc.next();

        int startYear = Integer.parseInt(text_First.substring(0, 4));
        int endYear = Integer.parseInt(text_Second.substring(0, 4));
        int startMonth = Integer.parseInt(text_First.substring(5, 7));
        int endMonth = Integer.parseInt(text_Second.substring(5, 7));
        int startDay = Integer.parseInt(text_First.substring(8, 10));
        int endDay = Integer.parseInt(text_Second.substring(8, 10));

        int sum_startYear = Calculation.cal_Year(startYear);
        int sum_endYear = Calculation.cal_Year(endYear);
        int sum_startMouth = Calculation.cal_Mouth(startYear, startMonth);
        int sum_endMouth = Calculation.cal_Mouth(endYear, endMonth);
        int check_start = Calculation.debug_Day(startYear, startMonth, startDay);
        int check_end = Calculation.debug_Day(endYear, endMonth, endDay);

        if (check_start == 0) {
            System.out.println("開始日期輸入錯誤！ \n" + startYear + "的" + startMonth + "只有0-31天");
            System.out.println("請重新輸入 \n");
        } else if (check_start == 1) {
            System.out.println("開始日期輸入錯誤！ \n" + startYear + "的" + startMonth + "只有0-30天");
            System.out.println("請重新輸入 \n");
        } else if (check_start == 2) {
            System.out.println("開始日期輸入錯誤！ \n" + startYear + "的" + startMonth + "只有0-28天");
        } else if (check_start == 3) {
            System.out.println("開始日期輸入錯誤！ \n" + startYear + "的" + startMonth + "只有0-29天");
            System.out.println("請重新輸入 \n");
        }

        if (check_end == 0) {
            System.out.println("結束日期輸入錯誤！ \n" + endYear + "的" + endMonth + "只有0-31天");
            System.out.println("請重新輸入 \n");
        } else if (check_end == 1) {
            System.out.println("結束日期輸入錯誤！ \n" + endYear + "的" + endMonth + "只有0-30天");
            System.out.println("請重新輸入 \n");
        } else if (check_end == 2) {
            System.out.println("結束日期輸入錯誤！ \n" + endYear + "的" + endMonth + "只有0-29天");
            System.out.println("請重新輸入 \n");
        } else if (check_end == 3) {
            System.out.println("結束日期輸入錯誤！ \n" + endYear + "的" + endMonth + "只有0-28天");
            System.out.println("請重新輸入 \n");
        }

        if (check_start == 4 && check_end == 4) {
            int sum = (sum_startYear + sum_startMouth + startDay) - (sum_endYear + sum_endMouth + endDay);
            if (sum < 0) {
                sum *= -1;
            }
            System.out.println("總共相差：" + sum + "天");
        }
    }
}