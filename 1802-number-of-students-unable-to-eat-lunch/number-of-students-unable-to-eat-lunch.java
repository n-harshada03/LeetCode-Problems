class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentsWith0 = 0;
        int studentsWith1 = 0;

        for (int num : students) {
            if (num == 0) {
                studentsWith0++;
            } else {
                studentsWith1++; 
            }
        }

        for (int sandwich : sandwiches) {
            if (studentsWith0 == 0 && sandwich == 0) {
                return studentsWith1;
            } else if (studentsWith1 == 0 && sandwich == 1) {
                return studentsWith0;
            }
            if (sandwich == 0) {
                studentsWith0--;
            } else {
                studentsWith1--;
            }
        }

        return 0;
    }
}
