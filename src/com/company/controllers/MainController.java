package com.company.controllers;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class MainController {

    public static final String version = "0.0.1";

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
