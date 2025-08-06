package com.ustinian.ustinianaibuilderx.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;
//用getter注解生成个体方法取枚举类的值

@Getter
public enum UserRoleEnum {
//    USER 和 ADMIN 是枚举常量名（通常大写）
//    括号里的是构造函数参数
//    "用户" 是显示名称（给人看的）"user" 是实际值（存储到数据库的）
    USER("用户", "user"),// 相当于调用构造函数
    ADMIN("管理员", "admin");// 人看的:"用户"，机器看的:"user"
// 等同于：new UserRoleEnum("用户", "user")


    // 2. 这些"类似对象的东西"自动存在UserRoleEnum数组里
// UserRoleEnum.values() = [USER对象, ADMIN对象]
// 1. 定义"人看的"和"机器看的"值，无法改动
    private final String text;

    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举值的value
     * @return 枚举值
     */
    public static UserRoleEnum getEnumByValue(String value) {
        // 4. 工具类判空，优雅处理
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        // 5. 增强for循环：变量anEnum，遍历UserRoleEnum数组
        for (UserRoleEnum anEnum : UserRoleEnum.values()) {
            // 6. 用传入的"机器值"匹配每个对象的"机器值"
            if (anEnum.value.equals(value)) {
                // 7. 匹配成功，返回整个"类似对象的东西"
                return anEnum;
            }
        }
        return null;
    }
}
//班级 = 枚举类 UserRoleEnum
//学生 = 枚举实例 USER, ADMIN
//名单 = values() 返回的数组
//关键区别：
//班级不是名单，但班级包含学生
//枚举类不是数组，但枚举类包含实例