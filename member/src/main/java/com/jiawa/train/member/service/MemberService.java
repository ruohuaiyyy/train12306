package com.jiawa.train.member.service;

import com.jiawa.train.member.mapper.MemberMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: lzj
 * @Description:
 * @Date: Created in 16:56 2024/1/9
 */
@Service
public class MemberService {

    @Resource
    private MemberMapper memberMapper;

    public int count(){
        return memberMapper.count();
    }

}
