package pers.jol.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.jol.pojo.TbOrderShipping;
import pers.jol.pojo.TbOrderShippingExample;

public interface TbOrderShippingMapper {
    long countByExample(TbOrderShippingExample example);

    int deleteByExample(TbOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    TbOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    int updateByPrimaryKeySelective(TbOrderShipping record);

    int updateByPrimaryKey(TbOrderShipping record);
}