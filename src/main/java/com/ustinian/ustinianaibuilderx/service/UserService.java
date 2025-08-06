package com.ustinian.ustinianaibuilderx.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.ustinian.ustinianaibuilderx.model.dto.UserQueryRequest;
import com.ustinian.ustinianaibuilderx.model.entity.User;
import com.ustinian.ustinianaibuilderx.model.vo.LoginUserVO;
import com.ustinian.ustinianaibuilderx.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * 用户 服务层。
 *
 * @author <a href="https://github.com/Ustinian-zh">Ustinian-zh</a>
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    LoginUserVO getLoginUserVO(User user);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request       请求
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);
    //为什么要传入request对象，因为在登录的时候，需要将用户信息保存到session中，便于更新session

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);
//service层先不脱敏，返回接口的时候再脱敏

    /**
     * 获取脱敏后的用户信息
     * @param user  用户信息
     * @return
     */
    UserVO getUserVO(User user);
    /**
     * 获取脱敏后的用户信息（分页）
     * @param userList  用户列表
     * @return 脱敏后的用户列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 根据查询条件构造数据查询参数
     * @param userQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 加密
     * @param userPassword 用户Miami
     * @return 加密后的
     */
    String getEncryptPassword(String userPassword);
}
