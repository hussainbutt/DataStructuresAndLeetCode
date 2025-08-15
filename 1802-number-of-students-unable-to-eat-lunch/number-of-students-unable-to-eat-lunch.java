class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
    int[] count = new int[2]; // count[0] = # of students who like type 0, count[1] for type 1
    for (int s : students) count[s]++;
    
    for (int sandwich : sandwiches) {
        if (count[sandwich] == 0) break; // no student wants this sandwich
        count[sandwich]--;
    }
    return count[0] + count[1];
}

}