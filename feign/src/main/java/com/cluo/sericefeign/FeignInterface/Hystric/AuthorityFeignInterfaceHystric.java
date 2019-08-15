package com.cluo.sericefeign.FeignInterface.Hystric;

import com.cluo.sericefeign.FeignInterface.AuthorityFeignInterface;
import com.lh.VO.ResultVO;
import com.lh.utils.ResultUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthorityFeignInterfaceHystric implements AuthorityFeignInterface {
    @Override
    public ResultVO useLogOfManagerInBS(String num, String passWord) {
        return ResultUtils.error();
    }

    @Override
    public ResultVO selectMySystemNameList(String id) {
        return ResultUtils.error();
    }
}
