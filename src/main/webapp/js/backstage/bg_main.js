/**
 * Created by rgy19_000 on 2014/8/9.
 */
$(function(){
    InitLeftMenu();
})

//初始化左侧
function InitLeftMenu() {
    $("#nav").accordion({animate:false});//为id为nav的div增加手风琴效果，并去除动态滑动效果
    $.each(_menus.menus, function(i, n) {//$.each 遍历_menu中的元素
        var menulist ='';
        menulist +='<ul>';
        $.each(n.menus, function(j, o) {
            menulist += '<li><div><a ref="'+o.menuid+'" href="#" rel="' + o.url + '" ><span class="icon '+o.icon+'" >&nbsp;</span><span class="nav">' + o.menuname + '</span></a></div></li> ';
        })
        menulist += '</ul>';

        $('#nav').accordion('add', {
            title: n.menuname,
            content: menulist,
            iconCls: 'icon ' + n.icon
        });

    });

    $('.easyui-accordion li a').click(function(){//当单击菜单某个选项时，在右边出现对用的内容
        var tabTitle = $(this).children('.nav').text();//获取超链里span中的内容作为新打开tab的标题

        var url = $(this).attr("rel");
        var menuid = $(this).attr("ref");//获取超链接属性中ref中的内容
        var icon = getIcon(menuid,icon);

        addTab(tabTitle,url,icon);//增加tab
        $('.easyui-accordion li div').removeClass("selected");
        $(this).parent().addClass("selected");
    }).hover(function(){
        $(this).parent().addClass("hover");
    },function(){
        $(this).parent().removeClass("hover");
    });

    //选中第一个
    var panels = $('#nav').accordion('panels');
    var t = panels[0].panel('options').title;
    $('#nav').accordion('select', t);
}
//获取左侧导航的图标
function getIcon(menuid){
    var icon = 'icon ';
    $.each(_menus.menus, function(i, n) {
        $.each(n.menus, function(j, o) {
            if(o.menuid==menuid){
                icon += o.icon;
            }
        })
    })

    return icon;
}