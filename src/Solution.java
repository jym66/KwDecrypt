
import java.util.Arrays;

class Solution {
//    user=866174010595086&
//    android_id=e846f77cb92a994f&
//    prod=kwplayer_ar_9.3.1.1&
//    corp=kuwo&newver=2&
//    vipver=9.3.1.1&
//    source=kwplayer_ar_9.3.1.1_18.apk&
//    p2p=1&notrace=0&
//    type=convert_url2&
//    br=2000kflac&
//    format=mp3|aac&sig=0&rid="+rid+"&
//    priority=bitrate&
//    loginUid=0&
//    network=WIFI&
//    loginSid=0&
//    mode=audition&
//    uid=1371450462
    public static void main(String [] args){
        String rid = "19534586";
        String ss = "user=866174010595086&android_id=e846f77cb92a994f&prod=kwplayer_ar_9.3.1.1&corp=kuwo&newver=2&vipver=9.3.1.1&source=kwplayer_ar_9.3.1.1_18.apk&p2p=1&notrace=0&type=convert_url2&br=2000kflac&format=mp3|aac&sig=0&rid="+rid+"&priority=bitrate&loginUid=0&network=WIFI&loginSid=0&mode=audition&uid=1371450462";
        byte[] bytes = ss.getBytes();
        byte[] a2 = KuwoDES.encrypt(bytes,bytes.length,KuwoDES.SECRET_KEY,KuwoDES.SECRET_KEY.length);
        System.out.println(b.a(a2,a2.length));
        }
}