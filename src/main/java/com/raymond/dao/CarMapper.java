package com.raymond.dao;

import com.raymond.domain.CarDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CarDO record);

    int insertOrUpdate(CarDO record);

    int insertOrUpdateSelective(CarDO record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CarDO record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CarDO selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CarDO record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CarDO record);

    int updateBatch(List<CarDO> list);

    int updateBatchSelective(List<CarDO> list);

    int batchInsert(@Param("list") List<CarDO> list);
}