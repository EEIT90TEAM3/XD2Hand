package site.luoyu.dao.mapper;

import site.luoyu.dao.entity.Community;

public interface CommunityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer communityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated
     */
    int insert(Community record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated
     */
    int insertSelective(Community record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated
     */
    Community selectByPrimaryKey(Integer communityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Community record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table community
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Community record);
}