package org.example;

import api.GetProject;
import org.junit.Test;

public class TestGetProject {
    @Test
    public void TestGetToken(){
        GetProject getProject = new GetProject();
        getProject.getProjectMsg();
    }

    @Test
    public void TestGetBoxId(){
        GetProject getProject = new GetProject();
        System.out.println(getProject.getBoxId());
    }

    @Test
    public void TestGetPlc(){
        GetProject getProject = new GetProject();
        System.out.println(getProject.getPlcId());
    }

    @Test
    public void TestGetVar(){
        GetProject getProject = new GetProject();
        System.out.println(getProject.getVar());
    }

    @Test
    public void TestGetData(){
        GetProject getProject = new GetProject();
        System.out.println(getProject.getData());
    }
}
