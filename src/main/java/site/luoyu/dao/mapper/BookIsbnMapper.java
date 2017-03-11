package site.luoyu.dao.mapper;

import site.luoyu.dao.entity.BookIsbn;
import site.luoyu.dao.entity.BookIsbnWithBLOBs;

public interface BookIsbnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_isbn
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long isbnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_isbn
     *
     * @mbggenerated
     */
    int insert(BookIsbnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_isbn
     *
     * @mbggenerated
     */
    int insertSelective(BookIsbnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_isbn
     *
     * @mbggenerated
     */
    BookIsbnWithBLOBs selectByPrimaryKey(Long isbnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_isbn
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BookIsbnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_isbn
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(BookIsbnWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_isbn
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BookIsbn record);
}