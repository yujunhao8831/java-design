package com.pijingzhanji.factory.simple;

/**
 * @author : 披荆斩棘
 * @date : 2017/2/20
 */
public class LoginManager {
    public static LoginService newInstance ( String loginType ) {
        switch ( loginType ) {
            case "1":
                return new PasswordLoginService();
            case "2":
                return new AuthenticationLoginService();
            default:
                throw new RuntimeException( "登录类型不支持" );
        }
    }
}
