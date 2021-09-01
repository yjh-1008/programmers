class Solution {
    public int solution(String skill, String[] skill_trees) {
        int sk_idx[]=new int[skill.length()];
        String temp;
        int answer=skill_trees.length;
        int currentIdx;
        for(int i=0;i<skill_trees.length;i++){
            int beforeIdx = skill_trees[i].indexOf(skill.charAt(0));
            for(int j=1;j<skill.length();j++){
                currentIdx=skill_trees[i].indexOf(skill.charAt(j));
                if((beforeIdx > currentIdx && currentIdx != -1) || (beforeIdx == -1 && currentIdx != -1)){
                    answer--;
                    break;
                }
                beforeIdx=currentIdx;
            }
        }
        return answer;
    }
}