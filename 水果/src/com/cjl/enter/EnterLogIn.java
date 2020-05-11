package com.cjl.enter;

import com.cjl.Controller.LogInController;
import com.cjl.view.LogInJFrame;

import java.awt.*;

public class EnterLogIn {
    /**
     * 进入Login的界面
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogInController logInController = new LogInController();
                    logInController.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
