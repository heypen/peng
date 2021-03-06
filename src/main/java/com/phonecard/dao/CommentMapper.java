package com.phonecard.dao;

import com.phonecard.bean.Comment;
import com.phonecard.util.PageObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> findAllComment();

    List<Comment> getCommentList(@Param("pageObject") PageObject pageObject, @Param("nickname") String nickname);

    int getCountCommentSum();
}