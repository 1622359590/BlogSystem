package com.duan.blogos.dto.blogger;

import com.duan.blogos.entity.blogger.BloggerPicture;
import com.duan.blogos.entity.blogger.BloggerProfile;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created on 2017/12/14.
 *
 * @author DuanJiaNing
 */
public class Blogger implements Serializable {

    private static final long serialVersionUID = 4552057430001933904L;

    //id
    private int id;

    //个人资料
    private BloggerProfile profileId;

    //博主头像（需要单独从相册中查询）
    private BloggerPicture avatar;

    //用户名
    private String username;

    //密码
    private String password;

    //注册时间
    private Timestamp registerDate;

}