class Solution {
    public boolean isValidSudoku(char[][] board) {
         Map<Integer, Set<Character>> rows = new HashMap<>();
         Map<Integer, Set<Character>> cols = new HashMap<>();
         Map<String, Set<Character>> squares = new HashMap<>();
         
         for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                String squaredKey = (i/3) + "," + (j/3);
                if(rows.computeIfAbsent(i, a -> new HashSet<>()).contains(board[i][j]) || cols.computeIfAbsent(j, a -> new HashSet<>()).contains(board[i][j]) || squares.computeIfAbsent(squaredKey, a -> new HashSet<>()).contains(board[i][j])){
                    return false;
                }
                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                squares.get(squaredKey).add(board[i][j]);
            }
         }
         return true;
    }
}
