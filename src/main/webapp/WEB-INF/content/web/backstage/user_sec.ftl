<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<#include "/WEB-INF/content/web/commons/depend.ftl">
<body>
This is my first freemarker page!
${session.getAttribute("OPNO")}
<br/>
<#--循环list里的内容-->
<#list list as item>
${item}
</#list>

<img src="${request.contextPath}/web/commons/authCode!createAuthCode" alt="验证码" id="authCode" onclick="changeImg()">
<a href="javascript:void(0)" onclick="changeImg()">看不清，换一张！</a>
<script type="text/javascript">
    function changeImg() {
        $("#authCode").attr("src", "${request.contextPath}/web/commons/authCode!createAuthCode?TMP="+new Date());
    }
</script>

</body>
</html>
