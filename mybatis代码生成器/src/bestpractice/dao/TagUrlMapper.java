package bestpractice.dao;

import bestpractice.model.TagUrl;

public interface TagUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TagUrl record);

    int insertSelective(TagUrl record);

    TagUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TagUrl record);

    int updateByPrimaryKey(TagUrl record);
}