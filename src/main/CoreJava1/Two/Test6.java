package Two;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;

@RunWith(JUnit4ClassRunner.class)
public class Test6 {

    public static void main(String[] args) {
     if (args.length ==0 || args[0].equals("-h")) {
         System.out.println("Hello,");
     } else if ( args[0].equals("-g")) {
         System.out.print("Goodbye,");
     }
     for (int i = 1; i < args.length; i ++) {
         System.out.print(" " + args[i]);
     }
        System.out.println("!");
     new Date();


    }

@Test
    public void test1() {
    int a[] = {13,1,2,3,4,5,6,7,8,9,10};
    System.out.println(Arrays.binarySearch(a, 0, a.length, 933));
    int[] b = Arrays.copyOfRange(a, 0, 3);
    System.out.println(Arrays.toString(b));
     Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    Arrays.fill(a,999);
    System.out.println(Arrays.toString(a));
}
@Test
    public void test2 () throws UnsupportedEncodingException {
 /*       String url = URLEncoder.encode("http://localhost:8080/todos/actiondrrr?id=123","utf-8");
    System.out.println(url);
    try {
        String fle = String.format("http://localhost:8080/todos/te?id=%s","/opt/home/a.txt");
        sendHttpPost(fle,null, false);
    } catch (IOException e) {
        e.printStackTrace();
    }*/
 ActionData actionData = new ActionData();
 actionData.setAppName("appname");
 actionData.setClusterId("ww");
    ActionParam actionParam = new ActionParam();
    actionParam.setFileName("lcc");
    actionParam.setData(actionData);
    try {
        String request = new ObjectMapper().writeValueAsString(actionParam);
        System.out.println(request);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
}
    public static String sendHttpPost(String endpoint, String request,boolean httpBasic) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String respString = null;
        try {
           /* StringEntity s = new StringEntity(request, "UTF-8");
            s.setContentEncoding("UTF-8");
            s.setContentType("application/json");
            s.setContentEncoding(new BasicHeader("qw-Type", "application/json"));*/
            HttpPost httppost = new HttpPost(endpoint);
            httppost.addHeader("Accept", "application/json");
            httppost.addHeader("Content-Type", "application/json");
            if (httpBasic){
                httppost.addHeader("Authorization", "Basic ZWJzOjEyMzQ1Njg=");
            }
            //httppost.setEntity(s);

            //SEND
            response = client.execute(httppost);
            int statusCode = response.getStatusLine().getStatusCode();
            if(statusCode >= 200 && statusCode < 300) {
                respString = EntityUtils.toString(response.getEntity());
            }else{
                throw new RuntimeException("connect failed,return code is:"+response.getStatusLine().getStatusCode());
            }

        } catch (IOException e) {
            throw e;
        } finally {
            try{
                client.close();
                if (null != response) {
                    response.close();
                }
            }catch(Exception e){}
        }

        return respString;
    }
}
