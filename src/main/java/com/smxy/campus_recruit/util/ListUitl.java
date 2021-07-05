package com.smxy.campus_recruit.util;

import java.util.List;

/**
 * @author 张伟杰
 * @ClassName ListUitl.java
 * @Description TODO
 * @createTime 2021年07月05日 15:15:00
 */
public class ListUitl {

    public static <T> T First(List<T> list){
        if(list.isEmpty()){
            return null;
        }else{
            return list.get(0);
        }
    }
}
