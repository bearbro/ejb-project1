package cn.edu.zjut.ejb;

import javax.ejb.Stateless;

@Stateless(name = "UserService")
public class UserSessionBean implements UserServiceRemote {
    public UserSessionBean() {
    }

    @Override
    public boolean login(String username, String password) {
        if ("zjut1".equals(username) && "zjut".equals(password))
            return true;
        return false;
    }
}
