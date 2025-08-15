class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for(int i = sandwiches.length-1; i>=0; i--){
            s.push(sandwiches[i]);
        }
        for(int x: students){
            q.add(x);
        }
        int rotations = 0;
        while(!s.isEmpty() && !q.isEmpty()){
            if(s.peek() == q.peek()){
                rotations = 0;
                s.pop();
                q.poll();
            }
            else{
                rotations++;
                int temp = q.poll();
                q.add(temp);
            }
            if(q.size()<=rotations){
                return q.size();
            }
        }
        return 0;
    }
}