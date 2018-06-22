package com.dream.dao.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 所属平台
     */
    private String category;

    /**
     * 支付方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

    /**
     * 搜索方式
     */
    @Column(name = "search_method")
    private String searchMethod;

    /**
     * 搜索关键字
     */
    @Column(name = "search_keyword")
    private String searchKeyword;

    /**
     * 商品图片
     */
    private String img;

    /**
     * 商品类型
     */
    private String type;

    /**
     * 商品链接
     */
    private String url;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 店主名称
     */
    private String name;

    /**
     * 佣金
     */
    private BigDecimal expenses;

    /**
     * 确认收货时间
     */
    @Column(name = "confirmation_time")
    private String confirmationTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 任务要求
     */
    private String assignment;

    /**
     * 备注
     */
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_ime")
    private Date updateIme;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取所属平台
     *
     * @return category - 所属平台
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置所属平台
     *
     * @param category 所属平台
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取支付方式
     *
     * @return payment_method - 支付方式
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置支付方式
     *
     * @param paymentMethod 支付方式
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取搜索方式
     *
     * @return search_method - 搜索方式
     */
    public String getSearchMethod() {
        return searchMethod;
    }

    /**
     * 设置搜索方式
     *
     * @param searchMethod 搜索方式
     */
    public void setSearchMethod(String searchMethod) {
        this.searchMethod = searchMethod;
    }

    /**
     * 获取搜索关键字
     *
     * @return search_keyword - 搜索关键字
     */
    public String getSearchKeyword() {
        return searchKeyword;
    }

    /**
     * 设置搜索关键字
     *
     * @param searchKeyword 搜索关键字
     */
    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    /**
     * 获取商品图片
     *
     * @return img - 商品图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置商品图片
     *
     * @param img 商品图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取商品类型
     *
     * @return type - 商品类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置商品类型
     *
     * @param type 商品类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取商品链接
     *
     * @return url - 商品链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置商品链接
     *
     * @param url 商品链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取店主名称
     *
     * @return name - 店主名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置店主名称
     *
     * @param name 店主名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取佣金
     *
     * @return expenses - 佣金
     */
    public BigDecimal getExpenses() {
        return expenses;
    }

    /**
     * 设置佣金
     *
     * @param expenses 佣金
     */
    public void setExpenses(BigDecimal expenses) {
        this.expenses = expenses;
    }

    /**
     * 获取确认收货时间
     *
     * @return confirmation_time - 确认收货时间
     */
    public String getConfirmationTime() {
        return confirmationTime;
    }

    /**
     * 设置确认收货时间
     *
     * @param confirmationTime 确认收货时间
     */
    public void setConfirmationTime(String confirmationTime) {
        this.confirmationTime = confirmationTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取任务要求
     *
     * @return assignment - 任务要求
     */
    public String getAssignment() {
        return assignment;
    }

    /**
     * 设置任务要求
     *
     * @param assignment 任务要求
     */
    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_ime
     */
    public Date getUpdateIme() {
        return updateIme;
    }

    /**
     * @param updateIme
     */
    public void setUpdateIme(Date updateIme) {
        this.updateIme = updateIme;
    }
}