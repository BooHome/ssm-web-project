package com.nanyin.services;

import com.nanyin.entity.NavBar;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: NanYin
 * @Date: 11/20/18 20:58
 * @Description:
 */
@Service
public interface NavBarService {
    List<NavBar> findNavBarByUserId(Integer userId);

    Map<String,Object> findNavTree(Integer userId);
}