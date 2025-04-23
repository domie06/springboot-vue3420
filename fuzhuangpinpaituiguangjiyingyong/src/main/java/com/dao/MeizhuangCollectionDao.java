package com.dao;

import com.entity.MeizhuangCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeizhuangCollectionView;

/**
 * 商品收藏 Dao 接口
 *
 * @author 
 */
public interface MeizhuangCollectionDao extends BaseMapper<MeizhuangCollectionEntity> {

   List<MeizhuangCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
