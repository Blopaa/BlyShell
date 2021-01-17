package com.company;

import com.company.controllers.MainController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        MainController controller = new MainController();
        String commandLine;
        BufferedReader console = new BufferedReader
                (new InputStreamReader(System.in));
        controller.newAsnwer("Welcome to our shell https://github.com/Blopaa/BlyShell");

        while (true) {
            controller.newEntrie();
            commandLine = console.readLine();
            switch (commandLine) {
                case "exit":
                    System.exit(0);
                default:
                    if (controller.evaluate(commandLine) != null) {
                        controller.newAsnwer(controller.evaluate(commandLine));
                    } else {
                        controller.newAsnwer("error, command not found");
                    }
            }
        }

    }
}
