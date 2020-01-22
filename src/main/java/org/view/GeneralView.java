package org.view;

public class GeneralView {
    public void bye() {
        System.out.println("Bye Bye");
    }

    public void allCommands(String[] cmds) {
        for (String cmd: cmds) {
            System.out.println(cmd);
        }
    }
}
