package org.view;

import org.model.Group;

public class GroupView {

    public void listAllNames(Group[] groups) {
        for (Group group: groups) {
            System.out.println(group.getName());
        }
    }
}
