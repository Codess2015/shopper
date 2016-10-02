/**
 * Created by gkang on 8/24/16.
 */
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "landingPage", eager = true)
public class Landing {
    public Landing() {
        System.out.println("started!");
    }

    public String getMessage() {
        try {
            //return ShoeService.GetNMShoes(10);
//            int i = ShoeService.isMatch("baabbabbbbbbbbbbaaabbbabbbbbabbaaaaaaaabbabaaaabbbbaabbaa",
//                    ".b*.bb.a.b*b*a*....a*bb*a*.bba.b*..aba*.a*b.a*.a.a*bb*a*b*b*b*.ba*a*aa.a");
            //System.out.println(i);

            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3);
            list.add(9);
            list.add(10);
            list.add(7);
            list.add(2);

            ArrayList<Integer> l = ShoeService.wave(list);
            return "";
        } catch (Exception ex) {
            return "Shoe Explorer Failied";
        }
    }
}
