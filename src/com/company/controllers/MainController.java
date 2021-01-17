package com.company.controllers;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainController {

    public void newEntrie() {
        SimpleDateFormat format = new SimpleDateFormat("(yyyy/MM/dd HH:mm)");
        String dateString = format.format(new Date());
        System.out.print("BLY " + dateString + " > ");
    }

    public void newAsnwer(String msg){
        System.out.println("> " + msg);
    }

    public String evaluate(String expression) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result = engine.eval(expression);
            return result.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
