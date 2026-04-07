package Day1.DSA;

public class AttendanceCount {
    
    public static void main(String[] args) {
        int[] attendance = {1, 1, 0, 1, 0, 1};
        int present = 0;
        int absent = 0;
        for (int i : attendance) {
            present += i;
        }
        System.out.println("Total number of students present: " + present);
    }
    
}

