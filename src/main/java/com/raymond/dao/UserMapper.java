package com.raymond.dao;

import com.raymond.domain.UserDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UserDO record);

    int insertOrUpdate(UserDO record);

    int insertOrUpdateSelective(UserDO record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserDO record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserDO record);

    int updateBatch(List<UserDO> list);

    int updateBatchSelective(List<UserDO> list);

    int batchInsert(@Param("list") List<UserDO> list);
}