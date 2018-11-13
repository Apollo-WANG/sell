package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * @Author: wangzehuai
 * @Description:
 * @Date: Created in 0:55 2018/11/8
 * @Modified By:
 */
public class ResultVOUtil {
    public static ResultVO sucess(Object objects){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(objects);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
    public static ResultVO success(){
        return sucess(null);
    }
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;

    }
}
