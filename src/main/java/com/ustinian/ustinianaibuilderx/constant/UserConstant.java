package com.ustinian.ustinianaibuilderx.constant;

/**
 * 用户常量，在处理session 用到
 */
public interface UserConstant {
//把常量定义成一个接口， 会默认加上final，符合常量的标准
    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";
    
    // endregion
}
