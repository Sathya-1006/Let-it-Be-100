//46.Leetcode
//1700. Number of Students Unable to Eat Lunch
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int st_sq=0,st_cir=0;

        for(int i=0;i<students.length;i++)
        {
            if(students[i]==1) 
            st_sq++;
            else 
            st_cir++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 1) {
                if (st_sq > 0) {
                    st_sq--;
                } else {
                    break;
                }
            } else {
                if (st_cir > 0) {
                    st_cir--; 
                } else {
                    break; 
                }
            }
        }
        return Math.abs(st_sq+st_cir);
    }
}
