import java.util.Scanner;

import static java.lang.System.in;

public class p14_OnTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int ExamHour = Integer.parseInt(sc.nextLine());
        int ExamMin = Integer.parseInt(sc.nextLine());
        int ArrivalHour = Integer.parseInt(sc.nextLine());
        int ArrivalMin = Integer.parseInt(sc.nextLine());
        int differenceInMin = ((ExamHour * 60) + ExamMin) - ((ArrivalHour * 60) + ArrivalMin);
            //On time
            if (((ExamHour * 60) + ExamMin) >= ((ArrivalHour * 60) + ArrivalMin)) {
                if (differenceInMin == 0) {
                    System.out.println("On Time \n");
                } else if (differenceInMin <= 30) {
                    System.out.println("On Time");
                    System.out.printf("%d minutes before the start \n", differenceInMin);
                } else {
                    System.out.println("Early");
                    int HH = differenceInMin / 60;
                    int MM = differenceInMin % 60;
                    if (differenceInMin < 60) {
                        System.out.printf("%d minutes before the start \n", differenceInMin);
                    } else if (MM < 10) {
                        System.out.printf("%d:0%d hours before the start \n", HH, MM);
                    } else
                        System.out.printf("%d:%d hours before the start \n", HH, MM);
                }
            } else if (((ArrivalHour * 60) + ArrivalMin) > ((ExamHour * 60) + ExamMin)) {
                System.out.println("Late");
                int HH = Math.abs(differenceInMin) / 60;
                int MM = Math.abs(differenceInMin) % 60;
                if (Math.abs(differenceInMin) < 60) {
                    System.out.printf("%d minutes after the start \n", Math.abs(differenceInMin));
                } else if (MM < 10) {
                    System.out.printf("%d:0%d hours after the start \n", HH, MM);
                } else System.out.printf("%d:%d hours after the start \n", HH, MM);
            }
        }
    }