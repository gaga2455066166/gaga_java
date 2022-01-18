package org.example;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import tools.JsonUtils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.methods.PostMethod;

public class TestNetDome {
    @Test
    public void Test1() {


        ArrayList<HashMap> hashMaps = TestNet.runRequest(
                "http://sukon-cloud.com/api/v1/base/projects",
                "POST",
                "[{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMTU3ODk3OCwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTE2NjUzNzh9.T70rALIk405gH2sTElKs66IKYiqVxoygWKD0ixb7uSs\"}]\n");
        System.out.println(hashMaps);
    }

//    @Test
//    public void Test1(String url, HashMap<String, String> map) throws Exception {
//        String result = "";
//        CloseableHttpClient client = null;
//        CloseableHttpResponse response = null;
//        RequestConfig defaultRequestConfig = RequestConfig.custom().setSocketTimeout(550000).setConnectTimeout(550000)
//                .setConnectionRequestTimeout(550000).setStaleConnectionCheckEnabled(true).build();
//        client = HttpClients.custom().setDefaultRequestConfig(defaultRequestConfig).build();
//        // client = HttpClients.createDefault();
//        URIBuilder uriBuilder = new URIBuilder(url);
//
//        HttpPost httpPost = new HttpPost(uriBuilder.build());
//        httpPost.setHeader("Connection", "Keep-Alive");
//        httpPost.setHeader("Charset", CHARSET_UTF8);
//        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
//        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        List<NameValuePair> params = new ArrayList<NameValuePair>();
//
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue());
//            params.add(pair);
//        }
//
//        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
//        try {
//            response = client.execute(httpPost);
//            if (response != null) {
//                HttpEntity resEntity = response.getEntity();
//                if (resEntity != null) {
//                    result = EntityUtils.toString(resEntity, CHARSET_UTF8);
//                }
//            }
//        } catch (ClientProtocolException e) {
//            throw new RuntimeException("创建连接失败" + e);
//        } catch (IOException e) {
//            throw new RuntimeException("创建连接失败" + e);
//        }
//
////        return result;
//        System.out.println(result);
//    }
//}

    @Test
    public void Test2() {
        String urlStr = "http://sukon-cloud.com/api/v1/base/projects";
        Map textMap = new HashMap();
        textMap.put("token", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMTU3ODk3OCwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTE2NjUzNzh9.T70rALIk405gH2sTElKs66IKYiqVxoygWKD0ixb7uSs");
        String res = "";
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            //conn.setReadTimeout(30000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
            OutputStream out = new DataOutputStream(conn.getOutputStream());
            String paramStr = "{}";
            if (textMap != null) {
                paramStr = JsonUtils.serialize(textMap);
            }
            out.write(paramStr.getBytes(StandardCharsets.UTF_8));
            out.flush();
            out.close();

            StringBuffer strBuf = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                strBuf.append(line).append("\n");
            }
            res = strBuf.toString();
            reader.close();
            reader = null;
        } catch (Exception e) {
            System.out.println("POST链接问题,查看原因!" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        } finally {
            if (conn != null) {
                conn.disconnect();
                conn = null;
            }
        }

        System.out.println(res);
    }

    @Test
    public void Test3() {
        String uid = "68c6089224e5496cb0b924811d7f7353";
        String sid = "f760e7b07ede4e938027c1eb6ad949a1";
        String random = "123asd";
        String timestamp = "timestamp";
        String signature = "297197A3D6C0A9C0B8C059AB2B09D0AE";
        String urlStr = "http://sukon-cloud.com/api/v1/base/projects";
        HashMap textMap = new HashMap();
        textMap.put("token", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMTg0ODM4Miwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTE5MzQ3ODJ9.bjJ-vvvqVY2-LTUlishyAFXPrI7NVuRI-XHLTY5-kek");
        String res = "";
        HttpURLConnection conn = null;
        // boundary就是request头和上传文件内容的分隔符
        String BOUNDARY = "---------------------------123821742118716";
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(30000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            // conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
            OutputStream out = new DataOutputStream(conn.getOutputStream());
            // text
            if (textMap != null) {
                StringBuffer strBuf = new StringBuffer();
                Iterator iter = textMap.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry entry = (Map.Entry) iter.next();
                    String inputName = (String) entry.getKey();
                    String inputValue = (String) entry.getValue();
                    if (inputValue == null) {
                        continue;
                    }
                    strBuf.append("\r\n").append("--").append(BOUNDARY).append("\r\n");
                    strBuf.append("Content-Disposition: form-data; name=\"" + inputName + "\"\r\n\r\n");
                    strBuf.append(inputValue);
                }
                out.write(strBuf.toString().getBytes());
            }
            byte[] endData = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();
            out.write(endData);
            out.flush();
            out.close();
            // 读取返回数据
            StringBuffer strBuf = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                strBuf.append(line).append("\n");
            }
            res = strBuf.toString();
            reader.close();
            reader = null;
        } catch (Exception e) {
            System.out.println("发送POST请求出错。" + urlStr);
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
                conn = null;
            }
        }
        System.out.println(res);
    }

}