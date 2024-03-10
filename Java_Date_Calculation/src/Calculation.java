public class Calculation {
    public static int cal_Year(int y) {
        int sum = 0, num = 0, y1 = y - 1;
        for (int i = 0; i <= y1 - 1900; y1--) {
            if (y1 % 4 == 0) {
                if (y1 % 100 != 0 || y1 % 400 == 0) {
                    num++;
                }
            }
        }
        sum = (y * 365) + num;
        return (sum);
    }

    public static int cal_Mouth(int y, int m) {
        int sum = 0;
        int[] list = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for (int i = 0; i <= m - 1; i++) {
            sum += list[i];
        }

        if (m > 2 & y % 4 == 0) {
            if (y % 100 != 0 || y % 400 == 0) {
                sum += 1;
            }
        }
        return sum;
    }

    public static int debug_Day(int y, int m, int d) {
        int num = 0;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d > 31) {
                num = 0;
            } else {
                num = 4;
            }
        } else if (m == 4 || m == 6 | m == 9 || m == 11) {
            if (d > 30) {
                num = 1;
            } else {
                num = 4;
            }
        } else if (m == 2) {
            if (y % 4 == 0) {
                if (y % 100 != 0 || y % 400 == 0) {
                    if (d > 29) {
                        num = 2;
                    } else {
                        num = 4;
                    }
                } else if (d > 28) {
                    num = 3;
                } else {
                    num = 4;
                }
            } else if (d > 28) {
                num = 3;
            } else {
                num = 4;
            }
        }
        return (num);
    }
}

