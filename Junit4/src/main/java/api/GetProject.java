package api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetProject {
    public void getToken(){
        String uid = "68c6089224e5496cb0b924811d7f7353";
        String sid = "f760e7b07ede4e938027c1eb6ad949a1";
        String random = "123asd";
        String timestamp = "1613960238366";
        String signature = "C09B4103D4C06AD85966835549A1F09B";
        String urlStr = "http://sukon-cloud.com/api/v1/token/initToken";
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

    public void getProjectMsg(){
        String uid = "68c6089224e5496cb0b924811d7f7353";
        String sid = "f760e7b07ede4e938027c1eb6ad949a1";
        String random = "123asd";
        String signature = "297197A3D6C0A9C0B8C059AB2B09D0AE";
        String urlStr = "http://sukon-cloud.com/api/v1/base/projects";
        HashMap textMap = new HashMap();
        textMap.put("token", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMzk2MDc2MSwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTQwNDcxNjF9.7H1ydVQgaP1ny7KshTL4qnGBmoKiJR0YKUOt6A3g_oc");
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

    public String getBoxId(){
        String uid = "68c6089224e5496cb0b924811d7f7353";
        String sid = "f760e7b07ede4e938027c1eb6ad949a1";
        String random = "123asd";
        String timestamp = "timestamp";
        String signature = "297197A3D6C0A9C0B8C059AB2B09D0AE";
        String urlStr = "http://sukon-cloud.com/api/v1/base/projectBoxes ";
        HashMap textMap = new HashMap();
        textMap.put("token", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMzk2MDc2MSwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTQwNDcxNjF9.7H1ydVQgaP1ny7KshTL4qnGBmoKiJR0YKUOt6A3g_oc");
        textMap.put("projectId","Z8AQPvdTjc2");
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
        return res;
    }

    public String getPlcId(){
        String uid = "68c6089224e5496cb0b924811d7f7353";
        String sid = "f760e7b07ede4e938027c1eb6ad949a1";
        String random = "123asd";
        String timestamp = "timestamp";
        String signature = "297197A3D6C0A9C0B8C059AB2B09D0AE";
        String urlStr = "http://sukon-cloud.com/api/v1/base/boxPlcs";
        HashMap textMap = new HashMap();
        textMap.put("token", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMzk2MDc2MSwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTQwNDcxNjF9.7H1ydVQgaP1ny7KshTL4qnGBmoKiJR0YKUOt6A3g_oc");
        textMap.put("boxId","c085eb57c38846cf91c93a9f61966d3c");
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
        return res;
    }

    public String getVar(){
        String uid = "68c6089224e5496cb0b924811d7f7353";
        String sid = "f760e7b07ede4e938027c1eb6ad949a1";
        String random = "123asd";
        String timestamp = "timestamp";
        String signature = "297197A3D6C0A9C0B8C059AB2B09D0AE";
        String urlStr = "http://sukon-cloud.com/api/v1/base/boxVariants ";
        HashMap textMap = new HashMap();
        textMap.put("token", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMzk2MDc2MSwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTQwNDcxNjF9.7H1ydVQgaP1ny7KshTL4qnGBmoKiJR0YKUOt6A3g_oc");
        textMap.put("boxId","c085eb57c38846cf91c93a9f61966d3c");
        textMap.put("plcId","0");
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
        return res;
    }

    public String getData(){
        String uid = "68c6089224e5496cb0b924811d7f7353";
        String sid = "f760e7b07ede4e938027c1eb6ad949a1";
        String random = "123asd";
        String timestamp = "timestamp";
        String signature = "297197A3D6C0A9C0B8C059AB2B09D0AE";
        String boxId = "c085eb57c38846cf91c93a9f61966d3c";
        String urlStr = "http://sukon-cloud.com/api/v1/data/realtimeDatas";
        HashMap textMap = new HashMap();
        textMap.put("token", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2OGM2MDg5MjI0ZTU0OTZjYjBiOTI0ODExZDdmNzM1My1mNzYwZTdiMDdlZGU0ZTkzODAyN2MxZWI2YWQ5NDlhMSIsImlhdCI6MTYxMzk2MDc2MSwic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTQwNDcxNjF9.7H1ydVQgaP1ny7KshTL4qnGBmoKiJR0YKUOt6A3g_oc");
        textMap.put("variantIds","c085eb57c38846cf91c93a9f61966d3c(8:9)");
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
        return res;
    }
}
