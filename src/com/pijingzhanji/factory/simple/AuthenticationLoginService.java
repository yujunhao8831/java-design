package com.pijingzhanji.factory.simple;

/**
 * @author : 披荆斩棘
 * @date : 2017/2/20
 */
public class AuthenticationLoginService implements LoginService {
    @Override
    public boolean login ( String username, String password ) {
        System.err.println( "认证成功" );
        return true;
    }
}
