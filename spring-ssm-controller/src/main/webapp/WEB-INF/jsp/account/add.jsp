<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增账户信息</title>
    <style>
        table {border:1px solid #000000}
        table th{border:1px solid #000000}
        table td{border:1px solid #000000}
    </style>
</head>
<body>
<form id="accountForm"
      action="${pageContext.request.contextPath }/saveAccount"  method="post">
    新增账户信息：
    <table cellpadding="0" cellspacing="0" width="80%">
        <tr>
            <td>账户名称</td>
            <td><input type="text" name="name" value="" /></td>
        </tr>
        <tr>
            <td>金额</td>
            <td><input type="text" name="money" value="" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交" />
            </td>
        </tr>
    </table>

</form>
</body>

</html>