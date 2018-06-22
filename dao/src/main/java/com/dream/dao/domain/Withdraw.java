package com.dream.dao.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Withdraw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户Id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 提现余额
     */
    private BigDecimal balance;

    /**
     * 提现信息
     */
    private String info;

    /**
     * 提现状态
     */
    private Integer status;

    /**
     * 提现时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取用户Id
     *
     * @return user_id - 用户Id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     *
     * @param userId 用户Id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取提现余额
     *
     * @return balance - 提现余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置提现余额
     *
     * @param balance 提现余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取提现信息
     *
     * @return info - 提现信息
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置提现信息
     *
     * @param info 提现信息
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取提现状态
     *
     * @return status - 提现状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置提现状态
     *
     * @param status 提现状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取提现时间
     *
     * @return create_time - 提现时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置提现时间
     *
     * @param createTime 提现时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}