class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String, HashSet> hm = new HashMap();
        HashSet<Character> hs1 = new HashSet<Character>();
        HashSet<Character> hs2 = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]+",");
                if (board[i][j] != '.' && hs1.contains(board[i][j])) {
                    System.out.print("this went wrong");
                    return false;
                }
                hs1.add(board[i][j]);
                if (board[j][i] != '.' && hs2.contains(board[j][i])) 
                    return false;
                hs2.add(board[j][i]);
                String key = i / 3 + "," + j / 3;
                hm.putIfAbsent(key, new HashSet());
                if (hm.get(key).contains(board[i][j]))
                    return false;
                if (board[i][j] != '.') {
                    hm.get(key).add(board[i][j]);
                }
            }
            hs1.clear();
            hs2.clear();
        }
        return true;
    }
}