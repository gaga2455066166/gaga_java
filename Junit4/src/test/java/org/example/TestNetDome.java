package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestNetDome {
    @Test
    public void Test1(){
        ArrayList<HashMap> hashMaps = TestNet.runRequest("http://sukon-cloud.com/api/v1/base/projects?token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI5M2Y4MjM3Y2Q0MmQ0ZTgzYTljYzNlMjk1OTdmNzZkOC03MDU2ZWY0NDUyMTc0NTFhYmFhYTBjZTE0NzkyODAzMSIsImlhdCI6MTYxMTQwMTM5Nywic3ViIjoic3ViamVjdDRhcGkiLCJpc3MiOiJzdWtvbi1jbG91ZC5jb20iLCJleHAiOjE2MTE0ODc3OTd9.f5NRH3DJcfZ-AfbC2C6Re2ntKM_Gymqb-gDU93HXOZ8");
        System.out.println(hashMaps);
    }
}
