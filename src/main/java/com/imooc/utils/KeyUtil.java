package com.imooc.utils;

import java.util.Random;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 11:14 2018/11/8
 * @Modified By:
 */
public class KeyUtil {
    /**
     * 生成唯一组件
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<10;i++) {
            Integer a = random.nextInt(9999999) + 100000;
            System.out.println(a);
        }
    }
}
