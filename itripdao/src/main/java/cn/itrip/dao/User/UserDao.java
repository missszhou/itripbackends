package cn.itrip.dao.User;

import cn.itrip.auth.beans.pojo.ItripUser;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public ItripUser getLoginUser(String userName)throws Exception;
    public Integer insertItripUser(ItripUser itripUser)throws Exception;
    public Integer updateItripUser(ItripUser itripUser)throws Exception;
    public List<ItripUser> getItripUserListByMap(Map<String, Object> param)throws Exception;
}