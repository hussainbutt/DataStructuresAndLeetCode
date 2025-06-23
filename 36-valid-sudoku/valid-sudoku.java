class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String, HashSet> hm = new HashMap();
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && hs.contains(board[i][j])) {
                    
                    return false;
                }
                hs.add(board[i][j]);
                String key = i / 3 + "," + j / 3;
                hm.putIfAbsent(key, new HashSet());
                if (hm.get(key).contains(board[i][j]))
                    return false;
                if (board[i][j] != '.') {
                    hm.get(key).add(board[i][j]);
                }
            }
        hs.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.' && hs.contains(board[j][i])) {

                    return false;
                }
                hs.add(board[j][i]);
                String key = (i / 3 + "," + j / 3);
                
            }
            hs.clear();
        }
        hs.clear();
        return true;
    }
}