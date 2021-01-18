package com.company;

import com.company.controllers.MainController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        MainController controller = new MainController();
        String commandLine;
        BufferedReader console = new BufferedReader
                (new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("(yyyy/MM/dd HH:mm)");
        String dateString = format.format(new Date());
        System.out.println("Welcome to BLY version v" + controller.version);
        System.out.println(dateString + " https://github.com/Blopaa/BlyShell");

        while (true) {
            System.out.print("> ");
            commandLine = console.readLine();
            switch (commandLine) {
                case "exit":
                    System.exit(0);
                    break;
                default:
                    if (controller.evaluate(commandLine) != null) {
                        System.out.println(controller.evaluate(commandLine));
                    } else {
                        System.out.println("error, command not found");
                    }
            }
        }

    }
}
