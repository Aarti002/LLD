package SplitwiseApplication.Group;

import SplitwiseApplication.User.User;

import java.util.List;

public class GroupController {
    private List<Group> groups;

    public boolean addMember(int grpId, User newUser) {
        Group tempGrp = null;
        for(Group g:groups) {
            if(g.getGrpId() == grpId){
                tempGrp = g;
                break;
            }
        }
        if(tempGrp!=null) {
            tempGrp.setNewMember(newUser);
            return true;
        }
        System.out.println("Group not found.");
        return false;
    }

    public void updateGroupDetails(int grpId) {

    }
}
