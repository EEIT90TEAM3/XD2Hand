package site.luoyu.dao.mapper;

import site.luoyu.dao.entity.Classes;

public interface ClassesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbggenerated
     */
    int insert(Classes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbggenerated
     */
    int insertSelective(Classes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbggenerated
     */
    Classes selectByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Classes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classes
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Classes record);
}