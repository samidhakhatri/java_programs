// Program to write a regular expression and assign a pattern such that it can be used to validate an IP address

import java.util.*;

class regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    String p="(\\d{1}|\\d{2}|0\\d{2}|1\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern=p+"\\."+p+"\\."+p+"\\."+p;
}