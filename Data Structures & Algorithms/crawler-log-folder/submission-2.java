class Solution {
    public int minOperations(String[] logs) {
        int folder = 0;
        for (String log: logs) {
            if (log.equals("../")) {
                folder = Math.max(folder-1, 0);
                
            } else if (log.equals("./")) {
                continue;
            } else {
                folder++;
            }
            
        }
        return folder;
    }
}