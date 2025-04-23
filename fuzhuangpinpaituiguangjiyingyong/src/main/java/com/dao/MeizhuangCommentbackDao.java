package com.dao;

import com.entity.MeizhuangCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeizhuangCommentbackView;

/**
 * 商品评价 Dao 接口
 *
 * @author 
 */
public interface MeizhuangCommentbackDao extends BaseMapper<MeizhuangCommentbackEntity> {

   List<MeizhuangCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
