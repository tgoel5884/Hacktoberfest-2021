import java.util.*;

public class StringDuplets {
    
    public static void stringDupleNumber(String str){
        StringBuffer sb = new StringBuffer();
        sb.append(str.charAt(0));
        for(int i=0;i<str.length()-1;i++){
           if(str.charAt(i)!=str.charAt(i+1)){
            sb.append(str.charAt(i+1));
           }
        }
        System.out.println(sb.toString());
    }

    public static void stringDupleRemove(String str){
        StringBuffer sb = new StringBuffer();
        sb.append(str.charAt(0));
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                sb.append(count+"");
                sb.append(str.charAt(i+1));
                count=1;
            }
            
        }
        sb.append(count+"");
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringDupleNumber(str);
        stringDupleRemove(str);
        sc.close();
    }
    
}
