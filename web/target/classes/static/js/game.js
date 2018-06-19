
//检测手机号是否正确
jQuery.validator.addMethod("isMobile", function(value, element) {
    var length = value.length;
    var regPhone = /^1[34578]\d{9}$/;
    return this.optional(element) || ( length == 11 && regPhone.test( value ) );
}, "请正确填写您的手机号码");

//检测密码是否正确
jQuery.validator.addMethod("isPwd", function(value, element) {
    var regPhone = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$/;
    return this.optional(element) || (regPhone.test( value ) );
}, "请正确填写您的密码");

Date.prototype.Format = function (fmt) { //将蓝括号的这段要放在调用时间的上面，
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}