package com.dream.dao.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * QQ号
     */
    @Column(name = "QQ")
    private String qq;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private String gender;

    /**
     * 安全码
     */
    @Column(name = "security_code")
    private String securityCode;

    /**
     * 支付宝支付
     */
    @Column(name = "ali_pay")
    private String aliPay;

    /**
     * 微信支付
     */
    @Column(name = "we_chat")
    private String weChat;

    /**
     * 银行支付
     */
    private String bank;

    /**
     * 金额
     */
    private BigDecimal balance;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 淘宝账号
     */
    @Column(name = "t_name")
    private String tName;

    /**
     * 京东账号
     */
    @Column(name = "j_name")
    private String jName;

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取QQ号
     *
     * @return QQ - QQ号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ号
     *
     * @param qq QQ号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取安全码
     *
     * @return security_code - 安全码
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * 设置安全码
     *
     * @param securityCode 安全码
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * 获取支付宝支付
     *
     * @return ali_pay - 支付宝支付
     */
    public String getAliPay() {
        return aliPay;
    }

    /**
     * 设置支付宝支付
     *
     * @param aliPay 支付宝支付
     */
    public void setAliPay(String aliPay) {
        this.aliPay = aliPay;
    }

    /**
     * 获取微信支付
     *
     * @return we_chat - 微信支付
     */
    public String getWeChat() {
        return weChat;
    }

    /**
     * 设置微信支付
     *
     * @param weChat 微信支付
     */
    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    /**
     * 获取银行支付
     *
     * @return bank - 银行支付
     */
    public String getBank() {
        return bank;
    }

    /**
     * 设置银行支付
     *
     * @param bank 银行支付
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * 获取金额
     *
     * @return balance - 金额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置金额
     *
     * @param balance 金额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取淘宝账号
     *
     * @return t_name - 淘宝账号
     */
    public String gettName() {
        return tName;
    }

    /**
     * 设置淘宝账号
     *
     * @param tName 淘宝账号
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * 获取京东账号
     *
     * @return j_name - 京东账号
     */
    public String getjName() {
        return jName;
    }

    /**
     * 设置京东账号
     *
     * @param jName 京东账号
     */
    public void setjName(String jName) {
        this.jName = jName;
    }
}