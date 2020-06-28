
import java.util.Arrays;

class Solution {
    public static void main(String [] args){
    String rid = "19534586";
    System.out.println(getParams(rid));
    }
    public static String getParams(String rid){
        String ss = "user=866174010595081&android_id=e846f77cb92a9941f&prod=kwplayer_ar_9.3.1.1&corp=kuwo&newver=2&vipver=9.3.1.1&source=kwplayer_ar_9.3.1.1_18.apk&p2p=1&notrace=0&type=convert_url2&br=2000kflac&format=mp3|aac&sig=0&rid="+rid+"&priority=bitrate&loginUid=0&network=WIFI&loginSid=0&mode=audition&uid=1371450462";
        byte[] bytes = ss.getBytes();
        byte[] a3 =d.a(bytes,bytes.length,d.f8946a,d.f8947b);
        return new String(b.a(a3,a3.length));
    }
}
