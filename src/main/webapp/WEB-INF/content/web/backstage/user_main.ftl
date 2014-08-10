<!DOCTYPE html>
<html>
<head>
    <title>jQuery UI</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="${request.contextPath}/recourses/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${request.contextPath}/recourses/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${request.contextPath}/recourses/easyui/locale/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.contextPath}/recourses/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${request.contextPath}/recourses/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${request.contextPath}/css/backstage/bg_index.css">
</head>
<script>
</script>
<body class="easyui-layout" style="overflow-y: hidden">
<div data-options="region:'north',split:'true',minHeight:'150',border:'false'" style="height:150px;">
    <div class="easyui-layout" data-options="fit:true">
        <div style="height:70%;background-color: #0099CC">
            <div class="head">赌博网管理系统</div>
            <ul class="ulNav">
                <li>修改密码</li>
                <li>用户注销</li>
                <li>帮组中心</li>
            </ul>
        </div>
        <div style="height:30%;background-color: #a1a4d7">
            <div style="width: auto;height:100%;font-size: 16px;color: #ffffff;margin-right: 35px;line-height: 40px;float: right;">
                <span>当前用户:admin 欢迎您登录赌博网系统！</span>
                <span>今天是2014年8月10日</span>
                <span>星期日</span>
            </div>
        </div>
    </div>
</div>
<div data-options="region:'south',split:'true'" style="height:50px;background-color: #eeffff">版本号V 1.0</div>
<div data-options="region:'west',title:'系统菜单',split:'true',border:'false'" style="width:292px;">
    <div id="leftNav" class="easyui-accordion" data-options="fit:'true',border:'false'"></div>
</div>
<div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;"></div>
</body>
<script>
</script>
</html>
