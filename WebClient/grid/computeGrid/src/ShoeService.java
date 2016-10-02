import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import com.sun.deploy.net.protocol.ProtocolType;

/**
 * Created by gkang on 8/28/16.
 */
public class ShoeService {

    private static final String NM_SHOE_URL = "http://www.neimanmarcus.com/Shoes/All-Shoes/cat47190746_cat13030734_cat000141/c.cat";


    public static String GetNMShoes(int count) throws Exception {

        URL nmShoeUrl = new URL("http", "www.neimanmarcus.com", 80, "");
        nmShoeUrl.getPort();
        HttpURLConnection nmShoe = (HttpURLConnection) nmShoeUrl.openConnection();
        nmShoe.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
        nmShoe.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
        //String response = nmShoe.getResponseMessage();
        BufferedReader responseReader = new BufferedReader(new InputStreamReader(nmShoe.getInputStream()));
        StringBuffer stringBuffer = new StringBuffer();

        String inputLine = responseReader.readLine();
        while (inputLine != null) {
            stringBuffer.append(inputLine);
            inputLine = responseReader.readLine();
        }

        nmShoe.disconnect();
        return stringBuffer.toString();
    }
}
