package site.luoyu.dao.entity;

public class OrderDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.OrderDetailID
     *
     * @mbggenerated
     */
    private String orderdetailid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.OrderID
     *
     * @mbggenerated
     */
    private String orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.Book_ID
     *
     * @mbggenerated
     */
    private Integer bookId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.OrderDetailID
     *
     * @return the value of order_detail.OrderDetailID
     *
     * @mbggenerated
     */
    public String getOrderdetailid() {
        return orderdetailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.OrderDetailID
     *
     * @param orderdetailid the value for order_detail.OrderDetailID
     *
     * @mbggenerated
     */
    public void setOrderdetailid(String orderdetailid) {
        this.orderdetailid = orderdetailid == null ? null : orderdetailid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.OrderID
     *
     * @return the value of order_detail.OrderID
     *
     * @mbggenerated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.OrderID
     *
     * @param orderid the value for order_detail.OrderID
     *
     * @mbggenerated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.Book_ID
     *
     * @return the value of order_detail.Book_ID
     *
     * @mbggenerated
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.Book_ID
     *
     * @param bookId the value for order_detail.Book_ID
     *
     * @mbggenerated
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}