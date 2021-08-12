import java.util.Locale;

public class Solution {
    public static void main(String[] args){
        String a="try hello world";
        String[] temp=a.split("");
        String answer="";
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i].equals(" ")){
                answer+=" ";
                count=0;
                continue;
            }
            if(count%2==0){
                answer+=temp[i].toUpperCase();
                count++;
            }else{
                answer+=temp[i].toLowerCase(Locale.ROOT);
                count++;
            }
        }
        System.out.print(answer);
    }
}
