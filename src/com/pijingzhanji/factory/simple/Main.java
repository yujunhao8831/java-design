package com.pijingzhanji.factory.simple;

import java.util.Scanner;

/**
 * @author : 披荆斩棘
 * @date : 2017/2/20
 */
public class Main {

    public static void main ( String[] args ) {
        Scanner      user         = new Scanner( System.in );
        LoginService loginService = LoginManager.newInstance( user.next() );

        if ( ! loginService.login( "1001", "1001" ) ) {
            System.err.println( "登录失败." );
        }
        System.err.println( "进入系统中,请稍后." );
    }
}
