/**
 * Created by Administrator on 2017/12/4.
 */
/**
 * 弹出式提示框，默认1.2秒自动消失
 * @param message 提示信息
 * @param style 提示样式，有alert-success、alert-danger、alert-warning、alert-info
 * @param time 消失时间
 */
var prompt = function (message, style, time)
{
    style = (style === undefined) ? 'alert-success' : style;
    time = (time === undefined) ? 1200 : time;
    $('<div>')
        .appendTo('body')
        .addClass('alert ' + style)
        .html(html(message,style))
        .delay(time)
        .fadeOut(function(){$(this).remove();});
};

var html = function(message,style){
    if(style == 'alert-success'){
        return "<span class='glyphicon glyphicon-ok-sign'><strong> "+ message +"</strong></span>";
    }else if(style == 'alert-danger'){
        return "<span class='glyphicon glyphicon-remove-sign'><strong> "+ message +"</strong></span>";
    }else if(style == 'alert-warning'){
        return "<span class='glyphicon glyphicon-exclamation-sign'><strong> "+ message +"</strong></span>";
    }else if(style == 'alert-info'){
        return "<span class='glyphicon glyphicon-info-sign'><strong> "+ message +"</strong></span>";
    }
}

// 成功提示
var success_prompt = function(message, time)
{
    prompt(message, 'alert-success', time);
};

// 失败提示
var fail_prompt = function(message, time)
{
    prompt(message, 'alert-danger', time);
};

// 提醒
var warning_prompt = function(message, time)
{
    prompt(message, 'alert-warning', time);
};

// 信息提示
var info_prompt = function(message, time)
{
    prompt(message, 'alert-info', time);
};
